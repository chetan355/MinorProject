import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chetan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Main Frame");
//         back_img_set();
        tab_no.setEnabled(false);
        bill_pay.setEnabled(false);
        logout_item.setEnabled(false);
        for (Component c : meal_panel.getComponents()) c.setEnabled(false);
        for (Component c : breakfst_panel.getComponents()) c.setEnabled(false);
        for (Component c : drink_panel.getComponents()) c.setEnabled(false);
        for (Component c : snacks_panel.getComponents()) c.setEnabled(false);
        
        meal_1();
        meal_2();
        meal_3();
        meal_4();
        breakfst_1();
        breakfst_2();
        breakfst_3();
        breakfst_4();
        drinks_1();
        drinks_2();
        drinks_3();
        drinks_4();
        s1();
        s2();
        s3();
        s4();
    }    
    public MainFrame(String user)
    {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Main Frame");
        back_img_set();        
        if(user=="cust")
        {
            customer.setEnabled(false);
            chef.setEnabled(false);
            admin.setEnabled(false);
        }
        if(user=="chef")
        {
            customer.setEnabled(false);
            chef.setEnabled(false);
            admin.setEnabled(false); 
            
        }
        if(user=="admin")
        {
            customer.setEnabled(false);
            chef.setEnabled(false);
            admin.setEnabled(false);            
        }
    }
    public void meal_1()
    {
        ImageIcon icon = new ImageIcon("./images/dal_tadka.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(dish_1.getWidth(),dish_1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        dish_1.setIcon(scaledimg);
    }
    public void meal_2()
    {
        ImageIcon icon = new ImageIcon("./images/chhole_bhaji.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(dish_2.getWidth(),dish_2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        dish_2.setIcon(scaledimg);
    }
    public void meal_3()
    {
        ImageIcon icon = new ImageIcon("./images/paneer_masala.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(dish_3.getWidth(),dish_3.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        dish_3.setIcon(scaledimg);
    }
    public void meal_4()
    {
        ImageIcon icon = new ImageIcon("./images/kaju-curry.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(dish_4.getWidth(),dish_4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        dish_4.setIcon(scaledimg);
    } 
    
    public void breakfst_1()
    {
        ImageIcon icon = new ImageIcon("./images/poha.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(breakfst1.getWidth(),breakfst1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        breakfst1.setIcon(scaledimg);
    }
    public void breakfst_2()
    {
        ImageIcon icon = new ImageIcon("./images/samosa.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(breakfst2.getWidth(),breakfst2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        breakfst2.setIcon(scaledimg);
    }
    public void breakfst_3()
    {
        ImageIcon icon = new ImageIcon("./images/aaloo_paratha.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(breakfst3.getWidth(),breakfst3.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        breakfst3.setIcon(scaledimg);
    }
    public void breakfst_4()
    {
        ImageIcon icon = new ImageIcon("./images/kachori.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(breakfst4.getWidth(),breakfst4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        breakfst4.setIcon(scaledimg);
    } 
    public void drinks_1()
    {
        ImageIcon icon = new ImageIcon("./images/tea.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(drink1.getWidth(),drink1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        drink1.setIcon(scaledimg);
    }
    public void drinks_2()
    {
        ImageIcon icon = new ImageIcon("./images/cold_coffee.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(drink2.getWidth(),drink2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        drink2.setIcon(scaledimg);
    }
    public void drinks_3()
    {
        ImageIcon icon = new ImageIcon("./images/red_bull.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(drink3.getWidth(),drink3.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        drink3.setIcon(scaledimg);
    }
    public void drinks_4()
    {
        ImageIcon icon = new ImageIcon("./images/thumsup.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(drink4.getWidth(),drink4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        drink4.setIcon(scaledimg);
    } 
         public void s1()
    {
        ImageIcon icon = new ImageIcon("./images/kurkure.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(snack1.getWidth(),snack1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        snack1.setIcon(scaledimg);
    }
      public void s2()
    {
        ImageIcon icon = new ImageIcon("./images/buiscuit.jpeg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(snack2.getWidth(),snack2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        snack2.setIcon(scaledimg);
    }
       public void s3()
    {
        ImageIcon icon = new ImageIcon("./images/paneer_roll.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(snack3.getWidth(),snack3.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        snack3.setIcon(scaledimg);
    }
        public void s4()
    {
        ImageIcon icon = new ImageIcon("./images/popcorn.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(snack4.getWidth(),snack4.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        snack4.setIcon(scaledimg);
    }

    
    public void back_img_set()
    {
        ImageIcon icon = new ImageIcon("./images/food_back.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(back_formain_label.getWidth(),back_formain_label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        back_formain_label.setIcon(scaledimg);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meal_panel = new javax.swing.JPanel();
        dish_1 = new javax.swing.JLabel();
        dish_2 = new javax.swing.JLabel();
        check_2 = new javax.swing.JCheckBox();
        check_1 = new javax.swing.JCheckBox();
        dish_4 = new javax.swing.JLabel();
        dish_3 = new javax.swing.JLabel();
        check_4 = new javax.swing.JCheckBox();
        check_3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        breakfst_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drinks_label = new javax.swing.JLabel();
        snacks_label = new javax.swing.JLabel();
        meal_label = new javax.swing.JLabel();
        drink_panel = new javax.swing.JPanel();
        drink2 = new javax.swing.JLabel();
        drink1 = new javax.swing.JLabel();
        check_9 = new javax.swing.JCheckBox();
        check_10 = new javax.swing.JCheckBox();
        drink3 = new javax.swing.JLabel();
        drink4 = new javax.swing.JLabel();
        check_11 = new javax.swing.JCheckBox();
        check_12 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        back_formain_label = new javax.swing.JLabel();
        snacks_panel = new javax.swing.JPanel();
        snack1 = new javax.swing.JLabel();
        snack2 = new javax.swing.JLabel();
        check_13 = new javax.swing.JCheckBox();
        check_14 = new javax.swing.JCheckBox();
        snack3 = new javax.swing.JLabel();
        snack4 = new javax.swing.JLabel();
        check_15 = new javax.swing.JCheckBox();
        check_16 = new javax.swing.JCheckBox();
        breakfst_panel = new javax.swing.JPanel();
        breakfst1 = new javax.swing.JLabel();
        breakfst2 = new javax.swing.JLabel();
        check_5 = new javax.swing.JCheckBox();
        check_6 = new javax.swing.JCheckBox();
        breakfst3 = new javax.swing.JLabel();
        breakfst4 = new javax.swing.JLabel();
        check_7 = new javax.swing.JCheckBox();
        check_8 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout_item = new javax.swing.JMenuItem();
        exit_item = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        meal_fd_item = new javax.swing.JMenuItem();
        drink_fd_item = new javax.swing.JMenuItem();
        brekfst_fd_item = new javax.swing.JMenuItem();
        snacks_fd_item = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        customer = new javax.swing.JMenu();
        cu_login_item = new javax.swing.JMenuItem();
        cu_newuser_item = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        chef = new javax.swing.JMenu();
        chef_login_item = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();
        admin_login_item = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        tab_no = new javax.swing.JMenu();
        tble_item = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        bill_pay = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        meal_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        check_2.setText("Chhole-Bhaji");
        check_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_2ActionPerformed(evt);
            }
        });

        check_1.setText("Dal-Tadka");
        check_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_1ActionPerformed(evt);
            }
        });

        check_4.setText("Paneer Masala");
        check_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_4ActionPerformed(evt);
            }
        });

        check_3.setText("Kaju-Curry");
        check_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setText("M");

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setText("E");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel4.setText("A");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel5.setText("L");

        javax.swing.GroupLayout meal_panelLayout = new javax.swing.GroupLayout(meal_panel);
        meal_panel.setLayout(meal_panelLayout);
        meal_panelLayout.setHorizontalGroup(
            meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meal_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addComponent(check_3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(check_4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(meal_panelLayout.createSequentialGroup()
                                .addComponent(check_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(meal_panelLayout.createSequentialGroup()
                                .addComponent(dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(meal_panelLayout.createSequentialGroup()
                                .addComponent(dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(meal_panelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(check_2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meal_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dish_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dish_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        meal_panelLayout.setVerticalGroup(
            meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meal_panelLayout.createSequentialGroup()
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dish_2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_1)
                    .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(meal_panelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meal_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dish_3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_3)
                            .addComponent(check_4)))
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        breakfst_label.setBackground(new java.awt.Color(255, 255, 0));
        breakfst_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        breakfst_label.setText("       Breakfast");
        breakfst_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        breakfst_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breakfst_labelMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel2.setText("   Select Items...");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        drinks_label.setBackground(new java.awt.Color(255, 255, 0));
        drinks_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        drinks_label.setText("       Drinks");
        drinks_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drinks_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinks_labelMouseClicked(evt);
            }
        });

        snacks_label.setBackground(new java.awt.Color(255, 255, 0));
        snacks_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        snacks_label.setText("       Snacks");
        snacks_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        snacks_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snacks_labelMouseClicked(evt);
            }
        });

        meal_label.setBackground(new java.awt.Color(255, 255, 0));
        meal_label.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        meal_label.setText("        Meal");
        meal_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        meal_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meal_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menu_panelLayout = new javax.swing.GroupLayout(menu_panel);
        menu_panel.setLayout(menu_panelLayout);
        menu_panelLayout.setHorizontalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(meal_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakfst_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinks_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snacks_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        menu_panelLayout.setVerticalGroup(
            menu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(meal_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(breakfst_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(drinks_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(snacks_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drink_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drink_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        drink_panel.add(drink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 14, 89, 78));
        drink_panel.add(drink1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, 98, 78));

        check_9.setText("ColdCoffee");
        check_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_9ActionPerformed(evt);
            }
        });
        drink_panel.add(check_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 110, 101, -1));

        check_10.setText("Tea");
        check_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_10ActionPerformed(evt);
            }
        });
        drink_panel.add(check_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 110, -1, -1));
        drink_panel.add(drink3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 153, 98, 78));
        drink_panel.add(drink4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 153, 81, 76));

        check_11.setText("Thumsup");
        check_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_11ActionPerformed(evt);
            }
        });
        drink_panel.add(check_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 238, 101, -1));

        check_12.setText("RedBull");
        check_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_12ActionPerformed(evt);
            }
        });
        drink_panel.add(check_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 240, 98, -1));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel6.setText("M");
        drink_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 1, 20, 35));

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel7.setText("E");
        drink_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 37, 20, 35));

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel8.setText("A");
        drink_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 74, 20, 35));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel9.setText("L");
        drink_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 116, 20, 35));

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel10.setText("M");
        drink_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 158, 20, 35));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel11.setText("E");
        drink_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 196, 20, 35));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel12.setText("A");
        drink_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 232, 20, 35));

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel13.setText("L");
        drink_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 295, 20, 35));

        back_formain_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drink_panel.add(back_formain_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-570, -105, 2490, 1180));

        snacks_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        check_13.setText("Biscuit");
        check_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_13ActionPerformed(evt);
            }
        });

        check_14.setText("Kurkure");
        check_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_14ActionPerformed(evt);
            }
        });

        check_15.setText("Chips");
        check_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_15ActionPerformed(evt);
            }
        });

        check_16.setText("Popcorn");
        check_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout snacks_panelLayout = new javax.swing.GroupLayout(snacks_panel);
        snacks_panel.setLayout(snacks_panelLayout);
        snacks_panelLayout.setHorizontalGroup(
            snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacks_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(snack1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(snack2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(check_14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(check_13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(snack3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(snack4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(check_16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(check_15, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        snacks_panelLayout.setVerticalGroup(
            snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacks_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snack1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(snack2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_14)
                    .addComponent(check_13))
                .addGap(27, 27, 27)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snack3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(snack4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_16)
                    .addComponent(check_15)))
        );

        breakfst_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        check_5.setText("Samosa");
        check_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_5ActionPerformed(evt);
            }
        });

        check_6.setText("Poha");
        check_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_6ActionPerformed(evt);
            }
        });

        check_7.setText("Paratha");
        check_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_7ActionPerformed(evt);
            }
        });

        check_8.setText("Kachori");
        check_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout breakfst_panelLayout = new javax.swing.GroupLayout(breakfst_panel);
        breakfst_panel.setLayout(breakfst_panelLayout);
        breakfst_panelLayout.setHorizontalGroup(
            breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfst_panelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addComponent(breakfst1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(breakfst2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addComponent(check_6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(check_5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addComponent(breakfst3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(breakfst4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addComponent(check_8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(check_7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        breakfst_panelLayout.setVerticalGroup(
            breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfst_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfst1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakfst2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_6)
                    .addComponent(check_5))
                .addGap(27, 27, 27)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfst3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(breakfst4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_8)
                    .addComponent(check_7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Home");
        jMenu1.setToolTipText("");

        logout_item.setText("Logout");
        logout_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_itemActionPerformed(evt);
            }
        });
        jMenu1.add(logout_item);

        exit_item.setText("Exit");
        exit_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_itemActionPerformed(evt);
            }
        });
        jMenu1.add(exit_item);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu7);

        jMenu8.setText("               ");
        jMenuBar1.add(jMenu8);

        jMenu9.setText("FoodMenus");
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        meal_fd_item.setText("Meal");
        meal_fd_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal_fd_itemActionPerformed(evt);
            }
        });
        jMenu9.add(meal_fd_item);

        drink_fd_item.setText("Drinks");
        drink_fd_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drink_fd_itemActionPerformed(evt);
            }
        });
        jMenu9.add(drink_fd_item);

        brekfst_fd_item.setText("Breakfast");
        brekfst_fd_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brekfst_fd_itemActionPerformed(evt);
            }
        });
        jMenu9.add(brekfst_fd_item);

        snacks_fd_item.setText("Snacks");
        snacks_fd_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacks_fd_itemActionPerformed(evt);
            }
        });
        jMenu9.add(snacks_fd_item);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("                ");
        jMenuBar1.add(jMenu10);

        customer.setText("Customers");

        cu_login_item.setText("Login");
        cu_login_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cu_login_itemActionPerformed(evt);
            }
        });
        customer.add(cu_login_item);

        cu_newuser_item.setText("New User");
        cu_newuser_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cu_newuser_itemActionPerformed(evt);
            }
        });
        customer.add(cu_newuser_item);

        jMenuBar1.add(customer);

        jMenu12.setText("                 ");
        jMenuBar1.add(jMenu12);

        chef.setText("Chef");

        chef_login_item.setText("Login");
        chef_login_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chef_login_itemActionPerformed(evt);
            }
        });
        chef.add(chef_login_item);

        jMenuBar1.add(chef);

        jMenu14.setText("                 ");
        jMenuBar1.add(jMenu14);

        admin.setText("Admin");

        admin_login_item.setText("Login");
        admin_login_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_login_itemActionPerformed(evt);
            }
        });
        admin.add(admin_login_item);

        jMenuBar1.add(admin);

        jMenu2.setText("              ");
        jMenuBar1.add(jMenu2);

        tab_no.setText("Table no ");
        tab_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_noActionPerformed(evt);
            }
        });

        tble_item.setText("Tables");
        tble_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tble_itemActionPerformed(evt);
            }
        });
        tab_no.add(tble_item);

        jMenuBar1.add(tab_no);

        jMenu4.setText("              ");
        jMenuBar1.add(jMenu4);

        bill_pay.setText("Bill Payment");
        jMenuBar1.add(bill_pay);

        jMenu3.setText("              ");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Orders");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(meal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(breakfst_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drink_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snacks_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(breakfst_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(snacks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brekfst_fd_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brekfst_fd_itemActionPerformed
    }//GEN-LAST:event_brekfst_fd_itemActionPerformed

    private void cu_login_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cu_login_itemActionPerformed
        new LoginPage("cust").show();
        dispose();
    }//GEN-LAST:event_cu_login_itemActionPerformed

    private void cu_newuser_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cu_newuser_itemActionPerformed
        new NewUser().show();
    }//GEN-LAST:event_cu_newuser_itemActionPerformed

    private void chef_login_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chef_login_itemActionPerformed
        new LoginPage("chef").show();
        dispose();
    }//GEN-LAST:event_chef_login_itemActionPerformed

    private void admin_login_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_login_itemActionPerformed
        new LoginPage("admin").show();
        dispose();
    }//GEN-LAST:event_admin_login_itemActionPerformed

    private void exit_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_itemActionPerformed
        dispose();
    }//GEN-LAST:event_exit_itemActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ActionPerformed

    private void meal_fd_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal_fd_itemActionPerformed
    }//GEN-LAST:event_meal_fd_itemActionPerformed

    private void logout_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_itemActionPerformed
        new LoginPage().show();
        dispose();
    }//GEN-LAST:event_logout_itemActionPerformed

    private void drink_fd_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drink_fd_itemActionPerformed
    }//GEN-LAST:event_drink_fd_itemActionPerformed

    private void snacks_fd_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacks_fd_itemActionPerformed
    }//GEN-LAST:event_snacks_fd_itemActionPerformed

    private void tab_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_noActionPerformed
    }//GEN-LAST:event_tab_noActionPerformed

    private void tble_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tble_itemActionPerformed
    }//GEN-LAST:event_tble_itemActionPerformed

    private void check_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_2ActionPerformed

    private void check_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_1ActionPerformed

    private void check_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_4ActionPerformed

    private void check_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_3ActionPerformed

    private void meal_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_labelMouseClicked
        for (Component c : meal_panel.getComponents()) c.setEnabled(true);
        for (Component c : breakfst_panel.getComponents()) c.setEnabled(false);
        for (Component c : drink_panel.getComponents()) c.setEnabled(false);
        for (Component c : snacks_panel.getComponents()) c.setEnabled(false);
    }//GEN-LAST:event_meal_labelMouseClicked

    private void breakfst_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breakfst_labelMouseClicked
        for (Component c : meal_panel.getComponents()) c.setEnabled(false);
        for (Component c : breakfst_panel.getComponents()) c.setEnabled(true);
        for (Component c : drink_panel.getComponents()) c.setEnabled(false);
        for (Component c : snacks_panel.getComponents()) c.setEnabled(false);
    }//GEN-LAST:event_breakfst_labelMouseClicked

    private void drinks_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinks_labelMouseClicked
        for (Component c : meal_panel.getComponents()) c.setEnabled(false);
        for (Component c : breakfst_panel.getComponents()) c.setEnabled(false);
        for (Component c : drink_panel.getComponents()) c.setEnabled(true);
        for (Component c : snacks_panel.getComponents()) c.setEnabled(false);
    }//GEN-LAST:event_drinks_labelMouseClicked

    private void snacks_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snacks_labelMouseClicked
        for (Component c : meal_panel.getComponents()) c.setEnabled(false);
        for (Component c : breakfst_panel.getComponents()) c.setEnabled(false);
        for (Component c : drink_panel.getComponents()) c.setEnabled(false);
        for (Component c : snacks_panel.getComponents()) c.setEnabled(true);        
    }//GEN-LAST:event_snacks_labelMouseClicked

    private void check_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_5ActionPerformed

    private void check_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_6ActionPerformed

    private void check_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_7ActionPerformed

    private void check_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_8ActionPerformed

    private void check_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_9ActionPerformed

    private void check_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_10ActionPerformed

    private void check_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_11ActionPerformed

    private void check_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_12ActionPerformed

    private void check_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_13ActionPerformed

    private void check_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_14ActionPerformed

    private void check_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_15ActionPerformed

    private void check_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_16ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu admin;
    private javax.swing.JMenuItem admin_login_item;
    private javax.swing.JLabel back_formain_label;
    private javax.swing.JMenu bill_pay;
    private javax.swing.JLabel breakfst1;
    private javax.swing.JLabel breakfst2;
    private javax.swing.JLabel breakfst3;
    private javax.swing.JLabel breakfst4;
    private javax.swing.JLabel breakfst_label;
    private javax.swing.JPanel breakfst_panel;
    private javax.swing.JMenuItem brekfst_fd_item;
    private javax.swing.JCheckBox check_1;
    private javax.swing.JCheckBox check_10;
    private javax.swing.JCheckBox check_11;
    private javax.swing.JCheckBox check_12;
    private javax.swing.JCheckBox check_13;
    private javax.swing.JCheckBox check_14;
    private javax.swing.JCheckBox check_15;
    private javax.swing.JCheckBox check_16;
    private javax.swing.JCheckBox check_2;
    private javax.swing.JCheckBox check_3;
    private javax.swing.JCheckBox check_4;
    private javax.swing.JCheckBox check_5;
    private javax.swing.JCheckBox check_6;
    private javax.swing.JCheckBox check_7;
    private javax.swing.JCheckBox check_8;
    private javax.swing.JCheckBox check_9;
    private javax.swing.JMenu chef;
    private javax.swing.JMenuItem chef_login_item;
    private javax.swing.JMenuItem cu_login_item;
    private javax.swing.JMenuItem cu_newuser_item;
    private javax.swing.JMenu customer;
    private javax.swing.JLabel dish_1;
    private javax.swing.JLabel dish_2;
    private javax.swing.JLabel dish_3;
    private javax.swing.JLabel dish_4;
    private javax.swing.JLabel drink1;
    private javax.swing.JLabel drink2;
    private javax.swing.JLabel drink3;
    private javax.swing.JLabel drink4;
    private javax.swing.JMenuItem drink_fd_item;
    private javax.swing.JPanel drink_panel;
    private javax.swing.JLabel drinks_label;
    private javax.swing.JMenuItem exit_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout_item;
    private javax.swing.JMenuItem meal_fd_item;
    private javax.swing.JLabel meal_label;
    private javax.swing.JPanel meal_panel;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel snack1;
    private javax.swing.JLabel snack2;
    private javax.swing.JLabel snack3;
    private javax.swing.JLabel snack4;
    private javax.swing.JMenuItem snacks_fd_item;
    private javax.swing.JLabel snacks_label;
    private javax.swing.JPanel snacks_panel;
    private javax.swing.JMenu tab_no;
    private javax.swing.JMenuItem tble_item;
    // End of variables declaration//GEN-END:variables
}
