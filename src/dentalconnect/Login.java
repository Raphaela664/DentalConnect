/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    String db_url="jdbc:mysql://localhost:3306/dentalappointmentsdb";
    String db_username="root";
    String db_passwd ="Auca@2020";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        goToLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(8, 109, 229));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalconnect/tooth-drill.png"))); // NOI18N
        jLabel8.setText("DentalConnect");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalconnect/newTeeth (2).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 280));

        jPanel1.setBackground(new java.awt.Color(236, 241, 246));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 109, 229));
        jLabel1.setText("LOGIN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email address");

        emailTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTxt.setText("joe@gmail.com");
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTxtFocusGained(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        PassField.setText("jPasswordField1");

        loginBtn.setBackground(new java.awt.Color(8, 109, 229));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        goToLoginBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        goToLoginBtn.setForeground(new java.awt.Color(0, 51, 204));
        goToLoginBtn.setText("Don't have an account? Register");
        goToLoginBtn.setBorderPainted(false);
        goToLoginBtn.setContentAreaFilled(false);
        goToLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(loginBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goToLoginBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(PassField)))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(26, 26, 26)
                .addComponent(goToLoginBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

        if(
            
            emailTxt.getText().trim().isEmpty() ||
            PassField.getPassword().length==0
        ){
            JOptionPane.showMessageDialog(this,"Pease fill all the input fields!","Data required",JOptionPane.WARNING_MESSAGE);
        }else{
                            try{
                                Connection con = DriverManager.getConnection
                                (db_url,db_username,db_passwd);
                                PreparedStatement statement = con.prepareStatement("select id,password,role from users where email=?");
                                statement.setString(1, String.valueOf(emailTxt.getText()));
                                ResultSet rs = statement.executeQuery();
                                if(rs.next()){
                                    if(String.valueOf(rs.getString(2)).equals(String.valueOf(PassField.getPassword()))){
                                        if(String.valueOf(rs.getString("role")).equals("admin")){
                                         JOptionPane.showMessageDialog(this,"Login successful");
                                         AdminDashborard page = new AdminDashborard();
                                         dispose();
                                         page.setVisible(true);
                                        }else{
                                            JOptionPane.showMessageDialog(this,"Login successful");
                                         int userId = Integer.parseInt(rs.getString(1));
                                         UserDashboard page = new UserDashboard(userId);
                                         dispose();
                                         page.setVisible(true);
                                        }
                                         
                                    }else{
                                         JOptionPane.showMessageDialog(this,"Wrong password","Data required",JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                     JOptionPane.showMessageDialog(this,"User not found","Data required",JOptionPane.ERROR_MESSAGE);
                                }
                              
                            }
                            catch(Exception ex){
                                ex.printStackTrace();
                            }

            }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void goToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginBtnActionPerformed

         SignUp page = new SignUp();
         dispose();
         page.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_goToLoginBtnActionPerformed

    private void emailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusGained
        // TODO add your handling code here:
        emailTxt.setText("");
    }//GEN-LAST:event_emailTxtFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton goToLoginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
