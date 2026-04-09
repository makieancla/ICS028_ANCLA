import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        try { 
            Connection();
        } catch (SQLException ex) {
            System.getLogger(Login.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

     Connection con;
    Statement st;
    PreparedStatement pst;
    
    
    private static String DbName = "waterstation";
    private static String DbDriver = "com.mysql.cj.jdbc.Driver";
    private static String DbUrl = "jdbc:mysql://localhost:3306/" + DbName;
    private static String DbUserName = "root"; 
    private static String DbPassword = "";
    
    public void Connection() throws SQLException{
        try {
            Class.forName(DbDriver);
            con = DriverManager.getConnection(DbUrl, DbUserName, DbPassword);
            st = con.createStatement();
            if (con !=null) {
                System.out.print("Connected naka sa Database" + " ");
            }
        } catch (ClassNotFoundException ex) {
            System.getLogger(Registration.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        useremail = new javax.swing.JLabel();
        JuserEmailField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        JPasswordField = new javax.swing.JPasswordField();
        LOGIN = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Login2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(192, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(153, 204, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 0));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel20.setText("Login");

        useremail.setText("UserEmail");

        JuserEmailField.addActionListener(this::JuserEmailFieldActionPerformed);

        password.setText("Password");

        JPasswordField.addActionListener(this::JPasswordFieldActionPerformed);

        LOGIN.setBackground(new java.awt.Color(0, 255, 255));
        LOGIN.setText("Login");
        LOGIN.addActionListener(this::LOGINActionPerformed);

        jLabel25.setText("Wala pakay account?");

        Login2.setBackground(new java.awt.Color(204, 255, 255));
        Login2.setText("Register");
        Login2.addActionListener(this::Login2ActionPerformed);

        jCheckBox1.setText("Remember me");
        jCheckBox1.addActionListener(this::jCheckBox1ActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(useremail, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JuserEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login2)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addGap(42, 42, 42)
                .addComponent(useremail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JuserEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Login2))
                .addGap(64, 64, 64))
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(0, 0, 400, 500);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME SAPA TUBIG");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(450, 10, 420, 50);

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Log in goys!");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(740, 140, 140, 40);

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("pwede naka mag ");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(680, 100, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8680622.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        String useremail, passwords;
        useremail = JuserEmailField.getText();
        passwords = JPasswordField.getText();
        String queryLogin = "SELECT * FROM users where userEmail = '" + useremail + 
                " ' AND userPassword = '"+ passwords +"' ";
              
        try {
            pst = con.prepareStatement(queryLogin);
              ResultSet rs =pst.executeQuery();
              if (!rs.next()){
                  JOptionPane.showMessageDialog(null, "Invalid Credentials");
              }
              else {
                   JOptionPane.showMessageDialog(null, "Account Matched");
                   new Dashboard().setVisible(true); 
    this.dispose(); 
              }
        } catch (SQLException ex) {
            System.getLogger(Login.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
      
    }//GEN-LAST:event_LOGINActionPerformed

    private void Login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login2ActionPerformed
        new Registration().setVisible(true); 
    this.dispose(); 
    }//GEN-LAST:event_Login2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void JuserEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuserEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JuserEmailFieldActionPerformed

    private void JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPasswordFieldActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordField;
    private javax.swing.JTextField JuserEmailField;
    private javax.swing.JButton LOGIN;
    private javax.swing.JButton Login2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel password;
    private javax.swing.JLabel useremail;
    // End of variables declaration//GEN-END:variables
}
