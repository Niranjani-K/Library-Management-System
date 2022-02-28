/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoginandRegister;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
/*
 *
 * @author 91861
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    boolean admin = false;
    boolean studeent = false;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginForm = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        loginForm1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        registerLink = new javax.swing.JLabel();
        studentradio = new javax.swing.JRadioButton();
        adminradio = new javax.swing.JRadioButton();
        loginButton = new javax.swing.JButton();
        enterPassword = new javax.swing.JPasswordField();
        enterUsername = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(132, 140, 207));

        loginForm.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        loginForm.setForeground(new java.awt.Color(255, 255, 255));
        loginForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginForm.setText("LOGIN");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(loginForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(loginForm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 10, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        loginForm1.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        loginForm1.setForeground(new java.awt.Color(255, 255, 255));
        loginForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginForm1.setText("LOGIN");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(66, 66, 66)
                .add(loginForm1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginForm1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        passwordLabel.setText("Password:");

        registerLink.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        registerLink.setForeground(new java.awt.Color(0, 0, 204));
        registerLink.setText("Click here to create a new student account");
        registerLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLinkMouseClicked(evt);
            }
        });

        studentradio.setText("Student");
        studentradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentradioActionPerformed(evt);
            }
        });

        adminradio.setText("Admin");
        adminradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminradioActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(102, 0, 102));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        enterPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPasswordActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(registerLink))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(loginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(usernameLabel)
                            .add(passwordLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(adminradio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(studentradio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(enterPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .add(enterUsername)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(usernameLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(enterUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(passwordLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(enterPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .add(7, 7, 7)))
                .add(10, 10, 10)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(studentradio)
                    .add(adminradio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(loginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(registerLink)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseClicked
        // TODO add your handling code here:
        Registration r = new Registration();
        r.setVisible(true);
    }//GEN-LAST:event_registerLinkMouseClicked

    private void studentradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentradioActionPerformed
       
    }//GEN-LAST:event_studentradioActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String userName = enterUsername.getText();
        String psswd = new String(enterPassword.getPassword());
         if(userName.equals("")) //If username is null
        {
            JOptionPane.showMessageDialog(null,"Please enter username"); //Display dialog box with the message
        } 
        else if(psswd.equals("")) //If password is null
        {
            JOptionPane.showMessageDialog(null,"Please enter password"); //Display dialog box with the message
        }
        if(adminradio.isSelected() && !studentradio.isSelected()){
            
            if(userName.equals("admin")&&psswd.equals("admin123")){
                Admin a = new Admin();
                a.setVisible(true);
                this.dispose();
            }
	else{
               JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                enterUsername.setText("");
                enterPassword.setText("");
            }
        }
        else if (!adminradio.isSelected() && studentradio.isSelected()){

        PreparedStatement ps;
        ResultSet rs;

        String query = "SELECT * FROM `student` WHERE `RollNo` =? AND `Password` =?";

        try {
            ps = myConnection.getConnection().prepareStatement(query);

            ps.setString(1, userName);
            ps.setString(2,  psswd);

            rs = ps.executeQuery();

            if(rs.next())
            {
                Student s=new Student(userName);
                
                s.setVisible(true);
                
                this.dispose();
            }
            else{
                System.out.println();
                JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
                enterUsername.setText("");
                enterPassword.setText("");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
           }
        }   
    else{
        JOptionPane.showMessageDialog(null, "Select either admin or student", "Login Failed", 2);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void adminradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminradioActionPerformed
        // TODO add your handling code here:
        if(adminradio.isSelected()){
            admin = true;
        }
    }//GEN-LAST:event_adminradioActionPerformed

    private void enterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPasswordActionPerformed
    
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
    private javax.swing.JRadioButton adminradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField enterPassword;
    private javax.swing.JTextField enterUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginForm;
    private javax.swing.JLabel loginForm1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerLink;
    private javax.swing.JRadioButton studentradio;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
