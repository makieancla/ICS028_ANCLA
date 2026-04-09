import java.awt.Component;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Registration.class.getName());


    public Registration() {
        initComponents();
        try {
            Connection();
        } catch (SQLException ex) {
            System.getLogger(Registration.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
       
    }

    Connection con;
    Statement st;
    
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

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        txtfirstName = new javax.swing.JTextField();
        txtlastName = new javax.swing.JTextField();
        userEmail = new javax.swing.JTextField();
        pas = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Register = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(192, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Register");

        jLabel3.setText("FirstName:");

        jLabel4.setText("LastName:");

        username.setText("UserEmail:");

        txtfirstName.addActionListener(this::txtfirstNameActionPerformed);

        txtlastName.addActionListener(this::txtlastNameActionPerformed);

        pas.setText("Password");

        password.addActionListener(this::passwordActionPerformed);

        Register.setBackground(new java.awt.Color(0, 255, 255));
        Register.setText("Register");
        Register.addActionListener(this::RegisterActionPerformed);

        jLabel7.setText("Naa nakay account?");

        Login.setBackground(new java.awt.Color(204, 255, 255));
        Login.setText("Login");
        Login.addActionListener(this::LoginActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(username)
                .addGap(4, 4, 4)
                .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(pas)
                .addGap(4, 4, 4)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Login)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(492, 2, 400, 500);

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("wala pakay account!");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 210, 240, 60);

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME SAPA TUBIG");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 10, 430, 60);

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pag register sa goys kung ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(190, 170, 310, 60);

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8680622.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(2, 2, 890, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastNameActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
           new Login().setVisible(true); 
    this.dispose();
    
        String firstName, lastName, useremail, passwords;
        if ("".equals(txtfirstName.getText())) {
    JOptionPane.showMessageDialog(new JFrame(), "Required FirstName");
}
            if ("".equals(txtlastName.getText())){
           JOptionPane.showMessageDialog(new JFrame(), "Required latName");
        }
            if ("".equals(userEmail.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Required userEmail");
        }
            if ("".equals(password.getText())){
            JOptionPane.showMessageDialog(new JFrame(), "Required password");
        }
            else {
                firstName = txtfirstName.getText();
                lastName = txtlastName.getText();
                useremail = userEmail.getText();
                passwords = password.getText();
                
               String queryRegister = "INSERT INTO users(firstName, lastName, userEmail, userPassword) " +
                           "VALUES ('" + firstName + "', '" + lastName + "', '" + useremail + "', '" + passwords + "')";

                try {
                    st.execute(queryRegister);
                } catch (SQLException ex) {
                    System.getLogger(Registration.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
         
            
    }//GEN-LAST:event_RegisterActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
         new Login().setVisible(true); // open login form
    this.dispose(); // close register form
    }//GEN-LAST:event_LoginActionPerformed

    private void txtfirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Registration().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton Register;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel pas;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtfirstName;
    private javax.swing.JTextField txtlastName;
    private javax.swing.JTextField userEmail;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

 
    }

