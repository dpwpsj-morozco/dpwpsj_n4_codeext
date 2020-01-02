import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.*;
import de.re.easymodbus.modbusclient.*;
public class CraneWeightWatcher {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private final int DELAY = 2000;
    private Timer timer;
    private int x;
    private int y;
    private String dbServer = null;
    private String dbPort = null;
    private String dbName = null;
    private String dbUser = null;
    private String dbPassword = null;
    private String cheId = null;
    private String plcIP = null;
    private int plcPort;
    private int plcStartingRegister;
    private int plcCountRegister;
    private int plcWeightFactor;
    private CustomPanelWeight contentPane;
    private ActionListener timerAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            x = 10;
            y = 10;
            int weight = getPLCWeight();
            contentPane.setValues(x, y, String.valueOf(weight));
        }
    };
    public CraneWeightWatcher() {
        x = y = 10;
        this.loadSettings();
    }
    private void constructGUI() {
        JFrame watchForm = new JFrame("DpWorld Posorja Pesaje RTG");
        //watchForm.setSize(WIDTH, HEIGHT);
        watchForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        watchForm.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        contentPane = new CustomPanelWeight(WIDTH, HEIGHT);
        watchForm.setContentPane(contentPane);
        watchForm.pack();
        //watchForm.setLocationByPlatform(true);
        watchForm.setVisible(true);
        timer = new Timer(DELAY, timerAction);
        timer.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run(){
                        new CraneWeightWatcher().constructGUI();
                    }
                }
        );
    }
    private void loadSettings(){
        Properties prop = new Properties();
        InputStream input  = null;
        try{
            input  = new FileInputStream("CraneWeightWatcher.properties");
            prop.load(input);
            dbServer = prop.getProperty("DBhost");
            dbPort = prop.getProperty("DBport");
            dbName = prop.getProperty("DBname");
            dbUser = prop.getProperty("DBuser");
            dbPassword = prop.getProperty("DBpassword");
            cheId = prop.getProperty("CHEId");
            plcIP = prop.getProperty("PLCIP");
            plcPort = Integer.parseInt(prop.getProperty("PLCPort"));
            plcStartingRegister = Integer.parseInt(prop.getProperty("PLCStartRegister"));
            plcCountRegister = Integer.parseInt(prop.getProperty("PLCCountRegister"));
            plcWeightFactor = Integer.parseInt(prop.getProperty("PLCWeightFactor"));
        } catch (FileNotFoundException fne){
            fne.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private int getPLCWeight(){
        int currentWeight = 0;
        System.out.println(plcIP);
        System.out.println(plcPort);
        ModbusClient modbusClient = new ModbusClient(plcIP, plcPort);
        try
        {
            modbusClient.Connect();
           // System.out.println(plcStartingRegister);
           // System.out.println(plcCountRegister);
            int[] weightHR = modbusClient.ReadHoldingRegisters(plcStartingRegister, plcCountRegister);
            boolean[] flagDR = modbusClient.ReadDiscreteInputs(plcStartingRegister, plcCountRegister);
            //System.out.println("Bandera: " + weightHR[1] + " || Peso: " + weightHR[0] );
            System.out.println("Bandera: " + flagDR[0] + " || Peso: " + weightHR[0] );
            /*if (weightHR[1] > 0) {
                this.saveWeight(weightHR[0]);
            }*/
            if (flagDR[0] == true) {
                this.saveWeight(weightHR[0]);
            }
            currentWeight = weightHR[0] * 10;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if (modbusClient != null) {
                    modbusClient.Disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return currentWeight;
    }
    private void saveWeight(int p_weight){
        String connectionUrl;
        Connection dbConnection = null;
        Statement dbUpdateQuery = null;
        String sqlUpdateWeightStatement;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connectionUrl = "jdbc:sqlserver://" + dbServer + ":" + dbPort +
                    ";databaseName=" + dbName +
                    ";user="+dbUser+";password="+dbPassword+";";
            dbConnection = DriverManager.getConnection(connectionUrl);
            sqlUpdateWeightStatement = "update Cranes set LatestWeightRaw = " + String.valueOf(p_weight) + " , LatestCapture = GETDATE(), Submitted = 0 where CHEid = '" + cheId + "'";
            dbUpdateQuery = dbConnection.createStatement();
            dbUpdateQuery.executeUpdate(sqlUpdateWeightStatement);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (dbUpdateQuery != null) {
                    dbUpdateQuery.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
            try {
                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (SQLException se){
                se.printStackTrace();
            }
        }
    }
}
class CustomPanelWeight extends JPanel
{
    private final int GAP = 10;
    private int width;
    private int height;
    private int x;
    private int y;
    private String message = "";
    JLabel valuePesoCapturado = new JLabel("0");

    public CustomPanelWeight(int w, int h)
    {

        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel lblpesoCapturado = new JLabel("Peso Capturado (Kg.):");
        lblpesoCapturado.setFont (lblpesoCapturado.getFont ().deriveFont (32.0f));
        this.add(lblpesoCapturado);
        valuePesoCapturado.setFont (valuePesoCapturado.getFont ().deriveFont (128.0f));
        this.add(valuePesoCapturado);
    }

    public void setValues(int x, int y, String msg)
    {
        this.x = x;
        this.y = y;
        message = msg;
        repaint();
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        /*
         * Below line is used to draw the JPanel
         * in the usual Java way first.
         */
        super.paintComponent(g);
        /*
         * This line is used to draw the dynamic
         * String at the given location.
         */
        //g.drawString(message, x, y);
        valuePesoCapturado.setText(message);
    }
}