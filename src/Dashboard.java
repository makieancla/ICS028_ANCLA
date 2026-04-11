
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Dashboard extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());


    public Dashboard() {
        initComponents();
        jTable1.setDefaultEditor(Object.class, null);
       jTable1.setRowSelectionAllowed(true);
    jTable1.setColumnSelectionAllowed(false);
    jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

    try { 
        Connection();
        loadTable(); 
    } catch (SQLException ex) {
        System.getLogger(Login.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
    }

   
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = jTable1.getSelectedRow();

            firstname.setText(jTable1.getValueAt(row, 1).toString());
            lastname.setText(jTable1.getValueAt(row, 2).toString());
            email.setText(jTable1.getValueAt(row, 3).toString());
            password.setText(jTable1.getValueAt(row, 4).toString());
        }
    });
    }
    Connection con;
    Statement st;
    PreparedStatement pst;
    
    public void loadTable() {
    try {
        String sql = "SELECT * FROM users";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("userID"),
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getString("userEmail"),
                rs.getString("userPassword")
            });
        }
         

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}
    
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Logout3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        readbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        createbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel2.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("bundle"); // NOI18N
        jLabel1.setText(bundle.getString("Dashboard.jLabel1.text")); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(250, -10, 410, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("Dashboard.jLabel2.text")); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(310, 40, 300, 20);

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8680622.jpg"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 70);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(1, 1, 900, 70);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(bundle.getString("Dashboard.jLabel3.text")); // NOI18N

        Logout3.setBackground(new java.awt.Color(0, 255, 255));
        Logout3.setText(bundle.getString("Dashboard.Logout3.text")); // NOI18N
        Logout3.addActionListener(this::Logout3ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(Logout3)
                .addGap(60, 60, 60))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout3)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(1, 77, 153, 410);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setText(bundle.getString("Dashboard.jLabel4.text")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 255, 255));
        jLabel5.setText(bundle.getString("Dashboard.jLabel5.text")); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 255, 255));
        jLabel6.setText(bundle.getString("Dashboard.jLabel6.text")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setText(bundle.getString("Dashboard.jLabel7.text")); // NOI18N

        firstname.setText(bundle.getString("Dashboard.firstname.text")); // NOI18N
        firstname.addActionListener(this::firstnameActionPerformed);

        lastname.setText(bundle.getString("Dashboard.lastname.text")); // NOI18N
        lastname.addActionListener(this::lastnameActionPerformed);

        email.setText(bundle.getString("Dashboard.email.text")); // NOI18N
        email.addActionListener(this::emailActionPerformed);

        password.setText(bundle.getString("Dashboard.password.text")); // NOI18N
        password.addActionListener(this::passwordActionPerformed);

        readbutton.setBackground(new java.awt.Color(255, 204, 204));
        readbutton.setText(bundle.getString("Dashboard.readbutton.text")); // NOI18N
        readbutton.addActionListener(this::readbuttonActionPerformed);

        updatebutton.setBackground(new java.awt.Color(0, 102, 255));
        updatebutton.setText(bundle.getString("Dashboard.updatebutton.text")); // NOI18N
        updatebutton.addActionListener(this::updatebuttonActionPerformed);

        deletebutton.setBackground(new java.awt.Color(255, 51, 102));
        deletebutton.setText(bundle.getString("Dashboard.deletebutton.text")); // NOI18N
        deletebutton.addActionListener(this::deletebuttonActionPerformed);

        createbutton.setBackground(new java.awt.Color(51, 252, 0));
        createbutton.setText(bundle.getString("Dashboard.createbutton.text")); // NOI18N
        createbutton.addActionListener(this::createbuttonActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(createbutton)
                        .addGap(64, 64, 64)
                        .addComponent(readbutton)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebutton)
                        .addGap(65, 65, 65)
                        .addComponent(deletebutton)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readbutton)
                    .addComponent(updatebutton)
                    .addComponent(deletebutton)
                    .addComponent(createbutton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(160, 230, 720, 250);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "LastName", "Email", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("Dashboard.jTable1.columnModel.title0_1")); // NOI18N
            jTable1.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("Dashboard.jTable1.columnModel.title1_1")); // NOI18N
            jTable1.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("Dashboard.jTable1.columnModel.title2_1")); // NOI18N
            jTable1.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("Dashboard.jTable1.columnModel.title3_1")); // NOI18N
            jTable1.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("Dashboard.jTable1.columnModel.title4_2")); // NOI18N
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(160, 80, 720, 150);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Logout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout3ActionPerformed
        new Login().setVisible(true); // open login form
    this.dispose();// TODO add your handling e:
    }//GEN-LAST:event_Logout3ActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void readbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readbuttonActionPerformed
      try {
    int row = jTable1.getSelectedRow();

    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row first!");
        return;
    }

    String id = jTable1.getValueAt(row, 0).toString();
    String fname = jTable1.getValueAt(row, 1).toString();
    String lname = jTable1.getValueAt(row, 2).toString();
    String mail = jTable1.getValueAt(row, 3).toString();
    String pass = jTable1.getValueAt(row, 4).toString();

    JOptionPane.showMessageDialog(this,
        "User Information:\n\n" +
        "ID: " + id + "n" +
        "First Name: " + fname + "n" +
        "Last Name: " + lname + "\n" +
        "Email: " + mail + "\n" +
        "Password: " + pass
    );

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }//GEN-LAST:event_readbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
    try {
    int row = jTable1.getSelectedRow();
    int id = (int) jTable1.getValueAt(row, 0);

    String sql = "DELETE FROM users WHERE userID=?";

    pst = con.prepareStatement(sql);
    pst.setInt(1, id);

    pst.executeUpdate();

    JOptionPane.showMessageDialog(this, "Deleted!");
    loadTable();

    } catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Select a row first!");
}
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void createbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbuttonActionPerformed
       try {
    String sql = "INSERT INTO users (firstName, lastName, userEmail, userPassword) VALUES (?, ?, ?, ?)";

    pst = con.prepareStatement(sql);
    pst.setString(1, firstname.getText());
    pst.setString(2, lastname.getText());
    pst.setString(3, email.getText());
    pst.setString(4, password.getText());

    pst.executeUpdate();

    JOptionPane.showMessageDialog(this, "Saved!");
    loadTable();

} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }//GEN-LAST:event_createbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
      try {
    int row = jTable1.getSelectedRow();
    int id = (int) jTable1.getValueAt(row, 0);

    String sql = "UPDATE users SET firstName=?, lastName=?, userEmail=?, userPassword=? WHERE userID=?";

    pst = con.prepareStatement(sql);
    pst.setString(1, firstname.getText());
    pst.setString(2, lastname.getText());
    pst.setString(3, email.getText());
    pst.setString(4, password.getText());
    pst.setInt(5, id);

    pst.executeUpdate();

    JOptionPane.showMessageDialog(this, "Updated!");
    loadTable();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Select a row first!");
}
    }//GEN-LAST:event_updatebuttonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout3;
    private javax.swing.JButton createbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField password;
    private javax.swing.JButton readbutton;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables

   
}
