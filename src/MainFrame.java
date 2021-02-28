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
         back_img_set();
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
    public void back_image()
    {
        ImageIcon icon = new ImageIcon("./images/food_back.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
        jLabel2.setIcon(scaledimg);
    }
    public MainFrame(String user)
    {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Main Frame");
        back_img_set();        
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
        ImageIcon icon = new ImageIcon("./images/fd_img.jpg");
        Image img = icon.getImage();
        Image imgscale = img.getScaledInstance(back_formain_label.getWidth(),back_formain_label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledimg = new ImageIcon(imgscale);
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
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        breakfst_panel = new javax.swing.JPanel();
        breakfst1 = new javax.swing.JLabel();
        breakfst2 = new javax.swing.JLabel();
        check_5 = new javax.swing.JCheckBox();
        check_6 = new javax.swing.JCheckBox();
        breakfst3 = new javax.swing.JLabel();
        breakfst4 = new javax.swing.JLabel();
        check_7 = new javax.swing.JCheckBox();
        check_8 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

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
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dish_4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dish_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        meal_panelLayout.setVerticalGroup(
            meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meal_panelLayout.createSequentialGroup()
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(dish_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(check_1))
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dish_2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_2)))
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(meal_panelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meal_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dish_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dish_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(meal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_3)
                    .addComponent(check_4))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meal_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
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
        meal_label.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                meal_labelFocusGained(evt);
            }
        });
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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        drink_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        check_9.setText("ColdCoffee");
        check_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_9ActionPerformed(evt);
            }
        });

        check_10.setText("Tea");
        check_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_10ActionPerformed(evt);
            }
        });

        check_11.setText("Thumsup");
        check_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_11ActionPerformed(evt);
            }
        });

        check_12.setText("RedBull");
        check_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_12ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel6.setText("D");

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel7.setText("R");

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel8.setText("I");

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel9.setText("N");

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel10.setText("S");

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel13.setText("L");

        back_formain_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout drink_panelLayout = new javax.swing.GroupLayout(drink_panel);
        drink_panel.setLayout(drink_panelLayout);
        drink_panelLayout.setHorizontalGroup(
            drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drink_panelLayout.createSequentialGroup()
                .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drink_panelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(drink_panelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(check_10))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drink_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(check_12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(drink_panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drink_panelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drink_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check_11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drink_panelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89)
                .addComponent(back_formain_label, javax.swing.GroupLayout.PREFERRED_SIZE, 1510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        drink_panelLayout.setVerticalGroup(
            drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drink_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(drink1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_10)
                .addGap(30, 30, 30)
                .addComponent(drink3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_12))
            .addGroup(drink_panelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(drink_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drink_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(drink_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(drink2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_9)
                .addGap(34, 34, 34)
                .addComponent(drink4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_11))
            .addComponent(back_formain_label, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel23.setText("S");

        jLabel24.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel24.setText("N");

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel25.setText("A");

        jLabel26.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel26.setText("K");

        jLabel27.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel27.setText("S");

        javax.swing.GroupLayout snacks_panelLayout = new javax.swing.GroupLayout(snacks_panel);
        snacks_panel.setLayout(snacks_panelLayout);
        snacks_panelLayout.setHorizontalGroup(
            snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacks_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snack1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snack2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snack3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check_16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snacks_panelLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(snack4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(snacks_panelLayout.createSequentialGroup()
                    .addGap(0, 153, Short.MAX_VALUE)
                    .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 153, Short.MAX_VALUE)))
        );
        snacks_panelLayout.setVerticalGroup(
            snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacks_panelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(snack1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(check_14))
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addComponent(snack2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(check_13)))
                .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(snacks_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snack4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snack3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_15)
                            .addComponent(check_16))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, snacks_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
            .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(snacks_panelLayout.createSequentialGroup()
                    .addGap(0, 46, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addGroup(snacks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(snacks_panelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(5, 5, 5)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 96, Short.MAX_VALUE)))
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

        jLabel14.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel14.setText("B");

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel15.setText("R");

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel16.setText("E");

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel17.setText("A");

        jLabel18.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel18.setText("K");

        jLabel19.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel19.setText("T");

        jLabel20.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel20.setText("S");

        jLabel21.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel21.setText("A");

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel22.setText("F");

        javax.swing.GroupLayout breakfst_panelLayout = new javax.swing.GroupLayout(breakfst_panel);
        breakfst_panel.setLayout(breakfst_panelLayout);
        breakfst_panelLayout.setHorizontalGroup(
            breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfst_panelLayout.createSequentialGroup()
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(check_6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(breakfst1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(breakfst3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(check_8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakfst4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakfst2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        breakfst_panelLayout.setVerticalGroup(
            breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakfst_panelLayout.createSequentialGroup()
                .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(breakfst_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(breakfst_panelLayout.createSequentialGroup()
                                .addComponent(breakfst1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_6))
                            .addGroup(breakfst_panelLayout.createSequentialGroup()
                                .addComponent(breakfst2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(check_5)))
                        .addGroup(breakfst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(breakfst_panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(breakfst4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(check_7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(breakfst_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(breakfst3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_8)
                                .addGap(21, 21, 21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breakfst_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(menu_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(meal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(breakfst_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drink_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snacks_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drink_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snacks_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(meal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(breakfst_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void meal_labelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_meal_labelFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_meal_labelFocusGained

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
    private javax.swing.JLabel back_formain_label;
    private javax.swing.JLabel breakfst1;
    private javax.swing.JLabel breakfst2;
    private javax.swing.JLabel breakfst3;
    private javax.swing.JLabel breakfst4;
    private javax.swing.JLabel breakfst_label;
    private javax.swing.JPanel breakfst_panel;
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
    private javax.swing.JLabel dish_1;
    private javax.swing.JLabel dish_2;
    private javax.swing.JLabel dish_3;
    private javax.swing.JLabel dish_4;
    private javax.swing.JLabel drink1;
    private javax.swing.JLabel drink2;
    private javax.swing.JLabel drink3;
    private javax.swing.JLabel drink4;
    private javax.swing.JPanel drink_panel;
    private javax.swing.JLabel drinks_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel meal_label;
    private javax.swing.JPanel meal_panel;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel snack1;
    private javax.swing.JLabel snack2;
    private javax.swing.JLabel snack3;
    private javax.swing.JLabel snack4;
    private javax.swing.JLabel snacks_label;
    private javax.swing.JPanel snacks_panel;
    // End of variables declaration//GEN-END:variables
}
