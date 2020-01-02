package com.navis.extension.dpwpsj

import com.navis.argo.business.api.ArgoUtils
import com.navis.argo.extension.ArgoExtensionTypes
import com.navis.billing.business.atoms.PaymentTypeEnum
import com.navis.billing.business.model.Customer
import com.navis.billing.business.model.Invoice
import com.navis.billing.business.model.Payment
import com.navis.billing.business.model.PaymentItem
import com.navis.billing.business.model.Currency
import com.navis.external.argo.AbstractGroovyWSCodeExtension
import com.navis.external.util.ArgoExtensionUtils
import com.navis.framework.util.BizFailure
import com.navis.framework.util.BizViolation
import org.apache.log4j.Logger

/*
<groovy class-name="DpwpsjProcessERPPaymentReceivedReq" class-location="code-extension">
    <parameters>
        <parameter id="invDraftNbr" value="2323"/>
    </parameters>
</groovy>
 */
class DpwpsjProcessERPPaymentReceivedReq extends AbstractGroovyWSCodeExtension{
    @Override
    public String execute(Map<String, String> inParameters) {
        LOGGER.warn(String.format("At start of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        String invoiceDraftNbr;
        try {
            for (Map.Entry<String, Object> entry : inParameters.entrySet()) {
                if (entry.getValue() instanceof String) {
                    if (WS_DRAFT_NBR.equals(entry.getKey())) {
                        invoiceDraftNbr = entry.getValue();
                    }
                }
            }
            if (invoiceDraftNbr == null || invoiceDraftNbr.isEmpty()) {
                LOGGER.error("Invalid input for invDraftNbr. Hence returning!");
                throw BizViolation.create(BizFailure.create("Invalid input for invDraftNbr. Hence returning!"));
            }

            Invoice invoice = Invoice.findInvoiceByDraftNbr(invoiceDraftNbr);
            if (invoice == null) {
                String errorMsg = String.format("No invoice exist matching draft number: %s", invoiceDraftNbr);
                LOGGER.error(errorMsg);
                throw BizViolation.create(BizFailure.create(errorMsg));
            }
            if (!invoice.isFinalized()) {
                String errorMsg = String.format("Invoice[DraftNbr:%s] is not yet finalized. Cannot process payment.", invoiceDraftNbr);
                LOGGER.error(errorMsg);
                throw BizViolation.create(BizFailure.create(errorMsg));
            }

            Customer customer = invoice.getInvoicePayeeCustomer() != null ? invoice.getInvoicePayeeCustomer() : invoice.getInvoiceContractCustomer();
            Currency currency = invoice.getInvoiceCurrency();

            if(invoice.getInvoiceTotalOwed() > 0) {
                Payment payment = Payment.createPayment(ArgoUtils.timeNow(), customer, PaymentTypeEnum.CASH, currency, invoice.getInvoiceTotalOwed());
                PaymentItem paymentItem = PaymentItem.createPaymentItem(invoice, payment, invoice.getInvoiceTotalOwed());
                AbstractGroovyWSCodeExtension groovy = (AbstractGroovyWSCodeExtension) ArgoExtensionUtils.getExtension(getUserContext(), "DpwpPaymentCallbackHandler", ArgoExtensionTypes.GROOVY_WS_CODE_EXTENSION);
                groovy.executeOnInvoicePagadoEnFusion(invoice);
                return "OK";
            } else {
                String errorMsg = String.format("Invoice[DraftNbr:%s] does not owed for payment. Cannot process payment.", invoiceDraftNbr);
                LOGGER.error(errorMsg);
                throw BizViolation.create(BizFailure.create(errorMsg));
            }
            LOGGER.info(String.format("ERP received Payment for invoice(draftNbr: %s), hence created a Payment in N4Billing" +
                    "and released the payment hold.", invoiceDraftNbr));

        } catch (BizViolation inBizViolation) {
            getMessageCollector().registerExceptions(inBizViolation);
        }

        LOGGER.warn(String.format("At end of %s.execute at %s", getClass().getName(), ArgoUtils.timeNow()));
        return getMessageCollector().getMessages().toString();
    }
    private final String WS_DRAFT_NBR = "invDraftNbr";
    private final Logger LOGGER = Logger.getLogger(DpwpsjProcessERPPaymentReceivedReq.class);
}