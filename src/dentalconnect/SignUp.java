/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.regex.*;
/**
 *
 * @author admin
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    String db_url="jdbc:mysql://localhost:3306/dentalappointmentsdb";
    String db_username="root";
    String db_passwd ="Auca@2020";
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gender = new javax.swing.ButtonGroup();
        SginUp_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        goToLoginBtn = new javax.swing.JButton();
        confirmPass1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SginUp_Panel.setBackground(new java.awt.Color(236, 241, 246));
        SginUp_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 109, 229));
        jLabel1.setText("REGISTER");
        SginUp_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 29, -1, 25));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel2.setText("First Name");
        SginUp_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel3.setText("Last Name");
        SginUp_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        SginUp_Panel.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 118, -1));
        SginUp_Panel.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 118, -1));

        signupBtn.setBackground(new java.awt.Color(8, 109, 229));
        signupBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Signup");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        SginUp_Panel.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel5.setText("Confirm Password");
        SginUp_Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 184, -1, 20));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel4.setText("Email");
        SginUp_Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 45, -1));

        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        SginUp_Panel.add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 118, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel6.setText("Password");
        SginUp_Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 63, 10));
        SginUp_Panel.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 118, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 11)); // NOI18N
        jLabel7.setText("Phone Number");
        SginUp_Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        SginUp_Panel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 118, -1));

        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        SginUp_Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 322, 190, -1));

        goToLoginBtn.setForeground(new java.awt.Color(0, 51, 204));
        goToLoginBtn.setText("Already have an account? Login");
        goToLoginBtn.setBorderPainted(false);
        goToLoginBtn.setContentAreaFilled(false);
        goToLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToLoginBtnActionPerformed(evt);
            }
        });
        SginUp_Panel.add(goToLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        confirmPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPass1ActionPerformed(evt);
            }
        });
        SginUp_Panel.add(confirmPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 118, -1));

        getContentPane().add(SginUp_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 440, 430));

        jPanel2.setBackground(new java.awt.Color(8, 109, 229));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalconnect/tooth-drill.png"))); // NOI18N
        jLabel8.setText("DentalConnect");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentalconnect/newTeeth (2).jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToLoginBtnActionPerformed
        // TODO add your handling code here:
        Login page = new Login();
        dispose();
        page.setVisible(true);
    }//GEN-LAST:event_goToLoginBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:

        if(
            firstNameTxt.getText().trim().isEmpty()||
            phonetxt.getText().trim().isEmpty()||
            emailTxt.getText().trim().isEmpty()||
            lastNameTxt.getText().trim().isEmpty()||
            passField.getPassword().length==0||
            passField.getPassword().length==0
        ){
            JOptionPane.showMessageDialog(this,"Pease fill all the input fields!","Data required",JOptionPane.WARNING_MESSAGE);
        }else{
            String regexPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

            Pattern pattern = Pattern.compile(regexPattern);
            String email = emailTxt.getText().trim();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
                emailTxt.requestFocus(); // Set focus to the email field
                return;
            }else{
                if(phonetxt.getText().length()==10){
                if(passField.getPassword().length>=8 && passField.getPassword().length<=16){
                    if(String.valueOf(passField.getPassword()).equals(String.valueOf(passField.getPassword())))
                    {
                        try{
                            // create connection
                            String role = "user";
                            Connection con = DriverManager.getConnection
                            (db_url,db_username,db_passwd);
                            // create statement
                            PreparedStatement statement = con.prepareStatement("insert into users(first_name,last_name,email,phone_number,role,password) values(?,?,?,?,?,?)");
                            statement.setString(1,firstNameTxt.getText());
                            statement.setString(2, lastNameTxt.getText());
                            statement.setString(3, emailTxt.getText());
                            statement.setString(4, phonetxt.getText());
                            statement.setString(5, role);
                            statement.setString(6, String.valueOf(passField.getPassword()));

                            int rowsAffected = statement.executeUpdate();
                            if(rowsAffected>=1){
                                JOptionPane.showMessageDialog(this,"Registration successful");
                                Login page = new Login();
                                dispose();
                                page.setVisible(true);
                            }else{
                                JOptionPane.showMessageDialog(this,"Registation Failed. Try again!");
                            }
                        }
                        catch(Exception ex){
                            ex.printStackTrace();
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Please confirm your password","Data required",JOptionPane.ERROR_MESSAGE);
                        passField.requestFocus(); // Set focus to the confirm password field
                        return;
                    }}
                    else{
                        JOptionPane.showMessageDialog(this,"Password length should be between 8 and 16 characters","Data required",JOptionPane.ERROR_MESSAGE);
                        passField.requestFocus(); // Set focus to the password field
                        return;
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Phone number should be equal to 10 digits","Data required",JOptionPane.ERROR_MESSAGE);
                        phonetxt.requestFocus(); // Set focus to the password field
                        return;
                }

                }

            }

    }//GEN-LAST:event_signupBtnActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void confirmPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPass1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SginUp_Panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmPass1;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton goToLoginBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
