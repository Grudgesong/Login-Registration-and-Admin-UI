/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.lra.UI.Admin.USDE;

import com.sangraj.lra.UI.Admin.AdministratorUI;
import com.sangraj.lra.UI.Admin.USDE.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Song Grudge Ranjit
 */
public class UsersUI extends javax.swing.JFrame {

    private Pattern regexPattern;
    private Matcher regMatcher;

    /**
     * Creates new form AdministratorUI
     */
    public UsersUI() {
        initComponents();
        Update_Table();
        initComponentsw();
    }

    private void Update_Table() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", null);
            String sql = "SELECT user_id,username,firstname,middlename,lastname,email FROM tbl_registered";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData r = rs.getMetaData();
            int c = r.getColumnCount();
            Vector column = new Vector(c);
            for (int i = 1; i <= c; i++) {
                column.add(r.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while (rs.next()) {
                row = new Vector(c);
                for (int j = 1; j <= c; j++) {
                    row.add(rs.getString(j));
                }
                data.add(row);
            }
            tblUsers.setModel(new DefaultTableModel(data, column));
            jScrollPane1.setViewportView(tblUsers);
            tblUsers.setEnabled(false);
        } catch (ClassNotFoundException | SQLException cs) {
            JOptionPane.showMessageDialog(null, cs.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMiddlename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnadduser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jscrollpane3 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtRemove = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsers);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setText("SET USERNAME ");

        jLabel2.setText("MIDDLE NAME");

        jLabel3.setText("FIRST NAME");

        jLabel4.setText("LAST NAME");

        jLabel6.setText("EMAIL");

        jLabel7.setText("SET PASSWORD");

        btnadduser.setText("ADD USER");
        btnadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnadduser)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMiddlename, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnadduser)
                .addContainerGap())
        );

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backClick(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchMouseClicked(evt);
            }
        });
        jscrollpane3.setViewportView(tblSearch);

        btnRemove.setText("REMOVE USER");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonClick(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonClick(evt);
            }
        });

        jLabel5.setText("User Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscrollpane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addGap(185, 185, 185))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove))
                .addContainerGap())
        );

        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonClick(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backClick
        AdministratorUI ui = new AdministratorUI();
        ui.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backClick

    private void addUserClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserClick
        try {
            //                int i=6;
            regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\.)]+@[(gmail||yahoo||hotmail||outlook||live)]+\\.[(com?)]{2,3}$");
            regMatcher = regexPattern.matcher(txtEmail.getText());
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", null);
            String sql = "INSERT INTO tbl_registered(username,firstname,middlename,lastname,email,password) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM tbl_registered where email=?");
            stm.setString(1, txtEmail.getText());
            ResultSet rs = stm.executeQuery();
            PreparedStatement st = conn.prepareStatement("SELECT * FROM tbl_registered where username=?");
            st.setString(1, txtUsername.getText());
            ResultSet r = st.executeQuery();
            stmt.setString(1, txtUsername.getText());
            stmt.setString(2, txtFirstname.getText());
            stmt.setString(3, txtMiddlename.getText());
            stmt.setString(4, txtLastname.getText());
            stmt.setString(5, txtEmail.getText());
            stmt.setString(6, txtPassword.getText());
            if (txtUsername.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Username");
            } else if (txtFirstname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter your First Name");
            } else if (txtLastname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter your Last Name");
            } else if (txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter your Email Address");
            } else if (txtPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password Required");
//                }else if (txtPassword.getText().equals(i)) {
//                    JOptionPane.showMessageDialog(null, "Password must be 6 letters/character");
            } else if (txtEmail.getText() != null && r.next()) {
                JOptionPane.showMessageDialog(null, "Username not available");
                txtPassword.setText("");
            } else if (txtEmail.getText() != null && !regMatcher.matches()) {
                JOptionPane.showMessageDialog(null, "Email Address is not correct");
                txtEmail.setText("");
                txtPassword.setText("");
            } else if (txtEmail.getText() != null && rs.next()) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                txtEmail.setText("");
                txtPassword.setText("");
            } else if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "USER ADDED");
                txtUsername.setText("");
                txtFirstname.setText("");
                txtMiddlename.setText("");
                txtLastname.setText("");
                txtEmail.setText("");
                txtPassword.setText("");
            }
            Update_Table();
        } catch (ClassNotFoundException | SQLException ce) {
            JOptionPane.showMessageDialog(null, ce.getMessage());
        }
    }//GEN-LAST:event_addUserClick
    private void initComponentsw() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"User id", "Username", "FirstName","MiddleName","LastName", "Email"});
        tblSearch.setModel(model);
        jscrollpane3.setViewportView(tblSearch);
    }
    private void searchButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonClick
        findUsers();
    }//GEN-LAST:event_searchButtonClick

    private void removeUserButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonClick
        try {
//            int i=tblSearch.getSelectedRow();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", null);
            String sql = "DELETE FROM tbl_registered where user_id=?";
            PreparedStatement p = conn.prepareStatement(sql);
            int ch = JOptionPane.showOptionDialog(null, "Do you really want to remove the user?", "REMOVE USER", JOptionPane.YES_NO_OPTION, WIDTH, null, null, "yes");
            if (ch == 0) {
                p.setString(1, txtRemove.getText());
                p.execute();
                Update_Table();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_removeUserButtonClick
//EDITS THE SELECTED ROW DATA IN EDITUI-------------------------------------------------------------------------------------------------------------------
    private void tblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchMouseClicked
        int i = tblSearch.getSelectedRow();
        TableModel model = tblSearch.getModel();
        String id =model.getValueAt(i, 0).toString();
        String username = model.getValueAt(i, 1).toString();
        String firstName = model.getValueAt(i, 2).toString();
        String middleName = model.getValueAt(i, 3).toString();
        String lastName = model.getValueAt(i, 4).toString();
        String email = model.getValueAt(i, 5).toString();
        EditUI ui=new EditUI();
        ui.setVisible(true);
        ui.pack();
        ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ui.txtId.setText(id);
        ui.txtUsername.setText(username);
        ui.txtFirstname.setText(firstName);
        ui.txtMiddlename.setText(middleName);
        ui.txtLastname.setText(lastName);
        ui.txtEmail.setText(email);
    }//GEN-LAST:event_tblSearchMouseClicked

    private void refreshButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonClick
        Update_Table();
    }//GEN-LAST:event_refreshButtonClick
//--------------------------------------------------------------------------------------------------------------------------------------------------------
// FUNCTION TO CONNECT TO DATABASE------------------------------------------------------------------------------------------------------------------------

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------
    // RETURNS USERS ARRAY LIST WITH PARTICULAR DATA-------------------------------------------------------------------------------------------------

    public ArrayList<Users> ListUsers(String ValToSearch) {
        ArrayList<Users> usersList = new ArrayList<Users>();

        Statement st;
        ResultSet rs;

        try {
            Connection con = getConnection();
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `tbl_registered` WHERE CONCAT(`user_id`,`username`, `firstname`,`middlename`, `lastname`, `email`)LIKE '%" + ValToSearch + "%'";
            rs = st.executeQuery(searchQuery);

            Users user;

            while (rs.next()) {
                user = new Users(
                        rs.getString("username"),
                        rs.getString("firstname"),
                        rs.getString("middlename"),
                        rs.getString("lastname"),
                        rs.getString("email"),
                        rs.getInt("user_id"));
                usersList.add(user);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return usersList;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------
    // DISPLAYS DATA IN JTABLE----------------------------------------------------------------------------------------------------------------------

    public void findUsers() {
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter then name of the person you want to Search");
        } else {
            ArrayList<Users> users = ListUsers(txtSearch.getText());
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"User id", "Username", "FirstName","MiddleName","LastName", "Email"});
            Object[] row = new Object[6];

            for (int i = 0; i < users.size(); i++) {
                row[0] = users.get(i).user_id;
                row[1] = users.get(i).username;
                row[2] = users.get(i).firstname;
                row[3] = users.get(i).middlename;
                row[4] = users.get(i).lastname;
                row[5] = users.get(i).email;
                model.addRow(row);
            }
            tblSearch.setModel(model);
            jscrollpane3.setViewportView(tblSearch);
            tblSearch.setRowSelectionAllowed(true);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnadduser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jscrollpane3;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMiddlename;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRemove;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
