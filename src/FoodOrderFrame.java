import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chetan
 */
public class FoodOrderFrame extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form FoodOrderFrame
     */
    private int balance_value = 1000;
    private String wallet_pass;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    String first_name;
    CardLayout cardlayout;
    
    private final SimpleDateFormat sdf  = new SimpleDateFormat("hh:mm");
    private int currentSecond;
    private Calendar calendar;    
    
    
    public FoodOrderFrame(String fname) 
    {
        initComponents();
        setTitle("Main Frame");
        getContentPane().setBackground(new Color(102,102,0));
        setLocationRelativeTo(this);
        cardlayout = (CardLayout)(base_card.getLayout());
        back_image();
        dbconnect();
        first_name = fname;
        fname_label.setText(fname);
        edit_fname_txt.setEnabled(false);
        edit_mname_txt.setEnabled(false);
        edit_lname_txt.setEnabled(false);
        edit_uname_txt.setEnabled(false);
        edit_pass_txt.setEnabled(false);
        profile_panel_data();
        
        edit_save_btn.setEnabled(false);
        edit_fname_txt.addKeyListener(this);
        edit_mname_txt.addKeyListener(this);
        edit_lname_txt.addKeyListener(this);
        edit_uname_txt.addKeyListener(this);
        edit_pass_txt.addKeyListener(this);
        
        below_arrow_image();
        order_summary_arrow.setVisible(false);
        
        data_table.setVisible(false);
        date_format();
        start();
        
    }
    //Methods For To Show Time and Date.
    private void reset(){
        calendar = Calendar.getInstance();
        currentSecond = calendar.get(Calendar.SECOND);
    }    
    public void start(){
        reset();
        Timer timer = new Timer(1000, new ActionListener(){
        public void actionPerformed( ActionEvent e ) {
                if( currentSecond == 60 ) {
                    reset();
                }
                time_label.setText( String.format("%s:%02d", sdf.format(calendar.getTime()), currentSecond ));
                currentSecond++;
            }
        });
        timer.start();
    }    
    public void date_format()
    {
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        date_label.setText(timeStamp);
    }
    
    //Showing arrow icon for order summary.
    public void below_arrow_image()
    {
        ImageIcon icon = new ImageIcon("./images/below_arrow.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(order_summary_arrow.getWidth(),order_summary_arrow.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        order_summary_arrow.setIcon(scaledimg);
        
    }
    //backdround image setter.
    public void back_image()
    {
        ImageIcon icon = new ImageIcon("./images/rcpit.png");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(icon_label.getWidth(),icon_label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        icon_label.setIcon(scaledimg);
    }
    //User's data fetching from databse on profile panel.
    public void profile_panel_data()
    {
        try{
        String query = "select * from login_tabel where first_name ='"+first_name+"'";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        if(rs.next())
        {
            wallet_pass = rs.getString("password");
            edit_fname_label.setText(first_name);
            edit_mname_label.setText(rs.getString("middle_name"));
            edit_lname_label.setText(rs.getString("last_name"));
            edit_username_label.setText(rs.getString("username"));
            edit_password_label.setText(rs.getString("password"));
        }
        }catch(SQLException e)
        {
            System.err.println(e);
        }
    }
    public void dbconnect()
    {
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "db/foodOrderSystemdb.accdb";
            String url = "jdbc:ucanaccess://"+path;
            con = DriverManager.getConnection(url);
        }
        catch (Exception ex) 
        {
            System.out.println(ex);
        }              
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        dashboard_panel = new javax.swing.JPanel();
        icon_label = new javax.swing.JLabel();
        hm_panel = new javax.swing.JPanel();
        home_label = new javax.swing.JLabel();
        wlt_panel = new javax.swing.JPanel();
        wallet_label = new javax.swing.JLabel();
        pro_panel = new javax.swing.JPanel();
        profile_label = new javax.swing.JLabel();
        log_panel = new javax.swing.JPanel();
        wallet_label1 = new javax.swing.JLabel();
        order_panel = new javax.swing.JPanel();
        wallet_label2 = new javax.swing.JLabel();
        base_card = new javax.swing.JPanel();
        home_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        profile_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edit_fname_label = new javax.swing.JLabel();
        edit_mname_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edit_lname_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edit_username_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit_password_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edit_fname_txt = new javax.swing.JTextField();
        edit_mname_txt = new javax.swing.JTextField();
        edit_lname_txt = new javax.swing.JTextField();
        edit_uname_txt = new javax.swing.JTextField();
        edit_pass_txt = new javax.swing.JTextField();
        edit_profile_label = new javax.swing.JLabel();
        edit_save_btn = new javax.swing.JButton();
        edit_cancel_btn = new javax.swing.JButton();
        wallet_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        wallet_pass_txt = new javax.swing.JPasswordField();
        check_balance_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        order_summary_arrow = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        order_food_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard_panel.setBackground(new java.awt.Color(153, 153, 0));

        hm_panel.setBackground(new java.awt.Color(204, 204, 0));
        hm_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hm_panelMouseClicked(evt);
            }
        });

        home_label.setBackground(new java.awt.Color(204, 204, 0));
        home_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        home_label.setText("                     Home");

        javax.swing.GroupLayout hm_panelLayout = new javax.swing.GroupLayout(hm_panel);
        hm_panel.setLayout(hm_panelLayout);
        hm_panelLayout.setHorizontalGroup(
            hm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hm_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hm_panelLayout.setVerticalGroup(
            hm_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hm_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        wlt_panel.setBackground(new java.awt.Color(204, 204, 0));
        wlt_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wlt_panelMouseClicked(evt);
            }
        });

        wallet_label.setBackground(new java.awt.Color(204, 204, 0));
        wallet_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        wallet_label.setText("                   Wallet");

        javax.swing.GroupLayout wlt_panelLayout = new javax.swing.GroupLayout(wlt_panel);
        wlt_panel.setLayout(wlt_panelLayout);
        wlt_panelLayout.setHorizontalGroup(
            wlt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wlt_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        wlt_panelLayout.setVerticalGroup(
            wlt_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wlt_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wallet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pro_panel.setBackground(new java.awt.Color(204, 204, 0));
        pro_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pro_panelMouseClicked(evt);
            }
        });

        profile_label.setBackground(new java.awt.Color(204, 204, 0));
        profile_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        profile_label.setText("                   Profile");

        javax.swing.GroupLayout pro_panelLayout = new javax.swing.GroupLayout(pro_panel);
        pro_panel.setLayout(pro_panelLayout);
        pro_panelLayout.setHorizontalGroup(
            pro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pro_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(profile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pro_panelLayout.setVerticalGroup(
            pro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pro_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        log_panel.setBackground(new java.awt.Color(204, 204, 0));
        log_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_panelMouseClicked(evt);
            }
        });

        wallet_label1.setBackground(new java.awt.Color(204, 204, 0));
        wallet_label1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        wallet_label1.setText("                  Logout");

        javax.swing.GroupLayout log_panelLayout = new javax.swing.GroupLayout(log_panel);
        log_panel.setLayout(log_panelLayout);
        log_panelLayout.setHorizontalGroup(
            log_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(log_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(wallet_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        log_panelLayout.setVerticalGroup(
            log_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, log_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wallet_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        order_panel.setBackground(new java.awt.Color(204, 204, 0));
        order_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_panelMouseClicked(evt);
            }
        });

        wallet_label2.setBackground(new java.awt.Color(204, 204, 0));
        wallet_label2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        wallet_label2.setText("             Order Food");

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(wallet_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wallet_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_label, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hm_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wlt_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(log_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pro_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_label, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pro_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(wlt_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(order_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(log_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(dashboard_panel);

        base_card.setLayout(new java.awt.CardLayout());

        home_panel.setBackground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome : ");

        fname_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        date_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        time_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fname_label, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(date_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(764, Short.MAX_VALUE))
        );

        base_card.add(home_panel, "home_panel");

        profile_panel.setBackground(new java.awt.Color(204, 204, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Profile");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("First Name : ");

        edit_fname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        edit_mname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Middle Name : ");

        edit_lname_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Last Name : ");

        edit_username_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Username : ");

        edit_password_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Password : ");

        edit_fname_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edit_mname_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edit_lname_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edit_uname_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edit_pass_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_mname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edit_lname_label, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                .addComponent(edit_fname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit_mname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edit_fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edit_lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit_username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edit_pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edit_uname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_fname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_mname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_mname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_lname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_uname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        edit_profile_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_profile_label.setText("   Edit Profile");
        edit_profile_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        edit_profile_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_profile_labelMouseClicked(evt);
            }
        });

        edit_save_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit_save_btn.setText("Save");
        edit_save_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));

        edit_cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edit_cancel_btn.setText("Cancel");
        edit_cancel_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        edit_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profile_panelLayout = new javax.swing.GroupLayout(profile_panel);
        profile_panel.setLayout(profile_panelLayout);
        profile_panelLayout.setHorizontalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(profile_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(edit_profile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, profile_panelLayout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(profile_panelLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(edit_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(edit_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        profile_panelLayout.setVerticalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(edit_profile_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        base_card.add(profile_panel, "profile_panel");

        wallet_panel.setBackground(new java.awt.Color(204, 204, 0));
        wallet_panel.setPreferredSize(new java.awt.Dimension(944, 819));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("   Wallet");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 15, 106, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Enter Password (Same As Login Password.)");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 63, -1, 33));
        jPanel2.add(wallet_pass_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 103, 159, 34));

        check_balance_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_balance_btn.setText("Check Balance");
        check_balance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_balance_btnActionPerformed(evt);
            }
        });
        jPanel2.add(check_balance_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 103, -1, 34));

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel10.setText("Balance : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 182, 97, 25));

        balance_label.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel2.add(balance_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 182, 131, 25));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setText("Order Summary");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 0, 51), new java.awt.Color(255, 51, 51)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 241, 522, 30));

        order_summary_arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_summary_arrowMouseClicked(evt);
            }
        });
        jPanel2.add(order_summary_arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 241, 25, 30));

        data_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date/Time", "Balance", "Order Price"
            }
        ));
        data_table.setGridColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(data_table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 278, 550, 111));

        javax.swing.GroupLayout wallet_panelLayout = new javax.swing.GroupLayout(wallet_panel);
        wallet_panel.setLayout(wallet_panelLayout);
        wallet_panelLayout.setHorizontalGroup(
            wallet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wallet_panelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        wallet_panelLayout.setVerticalGroup(
            wallet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wallet_panelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        base_card.add(wallet_panel, "wallet_panel");

        order_food_panel.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout order_food_panelLayout = new javax.swing.GroupLayout(order_food_panel);
        order_food_panel.setLayout(order_food_panelLayout);
        order_food_panelLayout.setHorizontalGroup(
            order_food_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        order_food_panelLayout.setVerticalGroup(
            order_food_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );

        base_card.add(order_food_panel, "order_food_panel");

        jSplitPane1.setRightComponent(base_card);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hm_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hm_panelMouseClicked
        cardlayout.show(base_card,"home_panel");
        fname_label.setText(first_name);
    }//GEN-LAST:event_hm_panelMouseClicked

    private void pro_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pro_panelMouseClicked
        cardlayout.show(base_card,"profile_panel");
    }//GEN-LAST:event_pro_panelMouseClicked

    private void wlt_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wlt_panelMouseClicked
        cardlayout.show(base_card,"wallet_panel");
    }//GEN-LAST:event_wlt_panelMouseClicked

    private void log_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_panelMouseClicked
        new LoginPage().show();
        dispose();
    }//GEN-LAST:event_log_panelMouseClicked
    String fname,mname,lname,uname,pass;
    private void edit_profile_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_profile_labelMouseClicked
        edit_fname_txt.setEnabled(true);
        edit_mname_txt.setEnabled(true);
        edit_lname_txt.setEnabled(true);
        edit_uname_txt.setEnabled(true);
        edit_pass_txt.setEnabled(true);
        
        fname = edit_fname_txt.getText();
        mname = edit_mname_txt.getText();
        lname = edit_lname_txt.getText();
        uname = edit_uname_txt.getText();
        pass = edit_pass_txt.getText();
        
        String query = "insert into login_table(first_name,middle_name,last_name,username,password)"
                + "values('"+fname+"','"+mname+"','"+lname+"','"+uname+"','"+pass+"')";                
    }//GEN-LAST:event_edit_profile_labelMouseClicked

    private void edit_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_cancel_btnActionPerformed
        edit_fname_txt.setText("");
        edit_mname_txt.setText("");
        edit_lname_txt.setText("");
        edit_uname_txt.setText("");
        edit_pass_txt.setText("");
         
        edit_fname_txt.setEnabled(false);
        edit_mname_txt.setEnabled(false);
        edit_lname_txt.setEnabled(false);
        edit_uname_txt.setEnabled(false);
        edit_pass_txt.setEnabled(false);        
    }//GEN-LAST:event_edit_cancel_btnActionPerformed

    private void order_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_panelMouseClicked
        cardlayout.show(base_card,"order_food_panel");
    }//GEN-LAST:event_order_panelMouseClicked

    private void order_summary_arrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_summary_arrowMouseClicked
        String query = "select * from ";
//        pst = con.prepareStatement()
        data_table.setVisible(true);
    }//GEN-LAST:event_order_summary_arrowMouseClicked

    private void check_balance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_balance_btnActionPerformed
        if(wallet_pass_txt.getText().equals(wallet_pass))
        {
            balance_label.setText(""+balance_value);
            order_summary_arrow.setVisible(true);
        }
        else
        {
            order_summary_arrow.setVisible(false);
            balance_label.setText("");
        }
    }//GEN-LAST:event_check_balance_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodOrderFrame("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_label;
    private javax.swing.JPanel base_card;
    private javax.swing.JButton check_balance_btn;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JTable data_table;
    private javax.swing.JLabel date_label;
    private javax.swing.JButton edit_cancel_btn;
    private javax.swing.JLabel edit_fname_label;
    private javax.swing.JTextField edit_fname_txt;
    private javax.swing.JLabel edit_lname_label;
    private javax.swing.JTextField edit_lname_txt;
    private javax.swing.JLabel edit_mname_label;
    private javax.swing.JTextField edit_mname_txt;
    private javax.swing.JTextField edit_pass_txt;
    private javax.swing.JLabel edit_password_label;
    private javax.swing.JLabel edit_profile_label;
    private javax.swing.JButton edit_save_btn;
    private javax.swing.JTextField edit_uname_txt;
    private javax.swing.JLabel edit_username_label;
    private javax.swing.JLabel fname_label;
    private javax.swing.JPanel hm_panel;
    private javax.swing.JLabel home_label;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel icon_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel log_panel;
    private javax.swing.JPanel order_food_panel;
    private javax.swing.JPanel order_panel;
    private javax.swing.JLabel order_summary_arrow;
    private javax.swing.JPanel pro_panel;
    private javax.swing.JLabel profile_label;
    private javax.swing.JPanel profile_panel;
    private javax.swing.JLabel time_label;
    private javax.swing.JLabel wallet_label;
    private javax.swing.JLabel wallet_label1;
    private javax.swing.JLabel wallet_label2;
    private javax.swing.JPanel wallet_panel;
    private javax.swing.JPasswordField wallet_pass_txt;
    private javax.swing.JPanel wlt_panel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JTextField source = (JTextField)e.getSource();
        if(source.getText().isEmpty())
            edit_save_btn.setEnabled(false);
        else
            edit_save_btn.setEnabled(true);

    }

}

