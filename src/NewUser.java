import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Chetan
 */
public class NewUser extends javax.swing.JFrame implements KeyListener{
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
//    Statement pst = null;
    public NewUser() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("New User Registration");
        dbConnect();
        new_btn.setEnabled(false);
        getContentPane().setBackground(new Color(102,0,102));
        jPanel1.setBackground(new Color(0,0,0,30));
        
        fname_txt.addKeyListener(this);
        mname_txt.addKeyListener(this);
        lname_txt.addKeyListener(this);
        username_txt.addKeyListener(this);
        pass_txt1.addKeyListener(this);
        pass_txt2.addKeyListener(this);
                
    }
    void dbConnect()
    {
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "D:\\NetBeans _Java_Applications\\foodOrderSystemdb.accdb";
            String url = "jdbc:ucanaccess://"+path;
            con = DriverManager.getConnection(url);                                    
        } catch (Exception ex) 
        {
            System.out.println(ex);
        }       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lname_txt1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mname_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        new_btn = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        pass_txt1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        pass_txt2 = new javax.swing.JPasswordField();
        username_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Last Name");

        lname_txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname_txt1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setMinimumSize(new java.awt.Dimension(700, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("First Name");

        fname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Middle Name");

        mname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mname_txtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Last Name");

        lname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname_txtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("Password");

        new_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_btn.setForeground(new java.awt.Color(102, 0, 102));
        new_btn.setText("New");
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        submit_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(102, 0, 102));
        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        cancel_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(102, 0, 102));
        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        pass_txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Confirm Password");

        pass_txt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        username_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(mname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(93, 93, 93)
                                            .addComponent(pass_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 43, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(85, 85, 85)
                                            .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(93, 93, 93)
                                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(pass_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 560, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_txtActionPerformed

    private void mname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mname_txtActionPerformed

    private void lname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname_txtActionPerformed

    private void lname_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname_txt1ActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        String user = username_txt.getText(),
        fname = fname_txt.getText(),
        sname = mname_txt.getText(),
        lname = lname_txt.getText(),
        pass = pass_txt1.getText();
        
        try
        {
            String sql = "select username from login_tabel where username = '"+user+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            
            if(fname_txt.getText().equals(""))
                JOptionPane.showMessageDialog(this,"First Name Required");            
            else if(mname_txt.getText().equals(""))
                JOptionPane.showMessageDialog(this,"Middle Name Required");
            else if(lname_txt.getText().equals(""))
                JOptionPane.showMessageDialog(this,"Last Name Required");                        
            else if(pass_txt1.getText().equals(""))
                JOptionPane.showMessageDialog(this,"Password Required");                        
            else if(pass_txt2.getText().equals(""))
                JOptionPane.showMessageDialog(this,"Confirm Password");
            else if(!pass_txt1.getText().equals(pass_txt2.getText()))
                JOptionPane.showMessageDialog(this,"Password Should Be Match");        
            else if(rs.next())
                JOptionPane.showMessageDialog(this,"Username Already Exist","Error",JOptionPane.ERROR_MESSAGE);
            else
            {
                String query = "insert into login_tabel(first_name,middle_name,last_name,username,password)values('"+fname+"','"+sname+"','"+lname+"','"+user+"','"+pass+"')";
                pst = con.prepareStatement(query);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Registration Succesful");
                dispose();
            }
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_submit_btnActionPerformed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        fname_txt.setText(null);
        mname_txt.setText(null);
        lname_txt.setText(null);
        username_txt.setText(null);
        pass_txt1.setText(null);
        pass_txt2.setText(null);        
        new_btn.setEnabled(false);
        
    }//GEN-LAST:event_new_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JTextField lname_txt1;
    private javax.swing.JTextField mname_txt;
    private javax.swing.JButton new_btn;
    private javax.swing.JPasswordField pass_txt1;
    private javax.swing.JPasswordField pass_txt2;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTextField username_txt;
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
        if(source.getText().equals(""))        
            new_btn.setEnabled(false);                    
        else 
            new_btn.setEnabled(true);        
    }
}
