

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.Date;



import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ticket extends javax.swing.JInternalFrame {

    /**
     * Creates new form ticket
     */
    public ticket() {
        initComponents();
        autoID();
    }

     Connection con;
    PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtsource = new javax.swing.JComboBox<>();
        txtdeparture = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtticketno = new javax.swing.JLabel();
        Date = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JLabel();
        txtPassportID = new javax.swing.JLabel();
        txtcustomerid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtflightno = new javax.swing.JLabel();
        txtflightname = new javax.swing.JLabel();
        txtdeparturetime = new javax.swing.JLabel();
        txtclass = new javax.swing.JComboBox<>();
        txtprice = new javax.swing.JTextField();
        txtseats = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txttotal = new javax.swing.JLabel();

        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "SouthKorea", "Japan", "America", "Africa", "Autralia", "Europe", "Russia", " " }));

        txtdeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "SouthKorea", "Japan", "America", "Africa", "Autralia", "Europe", "Russia" }));

        jLabel2.setText("Source");

        jLabel3.setText("Departure");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(txtdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Select Country");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight No", "Flight Name", "Source", "Departure", "Departure Time", "Arrival Time", "Charge"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Ticket No");

        txtticketno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtticketno.setForeground(new java.awt.Color(255, 0, 51));
        txtticketno.setText("Ticket No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtticketno)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(txtticketno)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jLabel4.setText("Customer Id");

        jLabel5.setText("First Name");

        jLabel8.setText("Last Name");

        jLabel9.setText("Passport No");

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(255, 51, 51));
        txtFirstName.setText("jLabel10");

        txtLastName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(255, 0, 51));
        txtLastName.setText("jLabel11");

        txtPassportID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassportID.setForeground(new java.awt.Color(255, 0, 51));
        txtPassportID.setText("jLabel12");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Date");

        javax.swing.GroupLayout DateLayout = new javax.swing.GroupLayout(Date);
        Date.setLayout(DateLayout);
        DateLayout.setHorizontalGroup(
            DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DateLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DateLayout.createSequentialGroup()
                        .addComponent(txtFirstName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DateLayout.createSequentialGroup()
                        .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(txtLastName)
                    .addComponent(txtPassportID))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        DateLayout.setVerticalGroup(
            DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DateLayout.createSequentialGroup()
                        .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(17, 17, 17)
                        .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFirstName)
                            .addComponent(jLabel7)))
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DateLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(DateLayout.createSequentialGroup()
                        .addComponent(txtLastName)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassportID)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jLabel13.setText("Flight No");

        jLabel14.setText("Flight Name");

        jLabel15.setText("Depart Time");

        jLabel16.setText("Class");

        jLabel17.setText("Price");

        jLabel18.setText("Seats");

        txtflightno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtflightno.setForeground(new java.awt.Color(255, 0, 51));
        txtflightno.setText("jLabel19");

        txtflightname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtflightname.setForeground(new java.awt.Color(255, 0, 51));
        txtflightname.setText("jLabel20");

        txtdeparturetime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtdeparturetime.setForeground(new java.awt.Color(255, 0, 51));
        txtdeparturetime.setText("jLabel21");

        txtclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "VIP special" }));

        txtseats.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtseatsStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)))
                    .addComponent(jLabel16)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)))
                .addGap(82, 82, 82)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtflightname)
                    .addComponent(txtdeparturetime)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtprice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtseats, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtflightno))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtflightname))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtdeparturetime))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txttotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 51, 51));
        txttotal.setText("PRICE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2)
                                        .addGap(95, 95, 95)
                                        .addComponent(txttotal))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttotal))
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           String ticketid=txtticketno.getText();
          String flightid=txtflightno.getText();
        String customerid=txtcustomerid.getText();
        String flightclass=txtclass.getSelectedItem().toString().trim();
        String seats=txtseats.getValue().toString();
        String price =txtprice.getText();

      Date dateValue = txtdate.getDate();

    if (dateValue != null) {
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(dateValue);

     
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/flight","root","");
          pst =con.prepareStatement("insert into ticket(id,flightid,customerid,class,price,seats,date)values(?,?,?,?,?,?,?)");
        pst.setString(1,ticketid);
        pst.setString(2,flightid);
        pst.setString(3,customerid);
       pst.setString(4,flightclass);
        pst.setString(5,price);
        pst.setString(6,seats);
        pst.setString(7,date);
       
        
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Ticket Booked.....");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addflight2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addflight2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    }                                 

    

    {   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String source=txtsource.getSelectedItem().toString().trim();
        String departure=txtdeparture.getSelectedItem().toString().trim();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/flight","root","");
             pst=con.prepareStatement("SELECT*FROM flight WHERE source=? AND departure=?");
             pst.setString(1, source);
             pst.setString(2,departure);
             ResultSet rs= pst.executeQuery();
             
             ResultSetMetaData rsm =(ResultSetMetaData) rs.getMetaData();
             int c;
             c= rsm.getColumnCount();
             DefaultTableModel Df= (DefaultTableModel) jTable1.getModel();
             Df.setRowCount(0);
             
             while(rs.next()){
                 Vector v2 = new Vector();
                 
                 for(int i=1; i<=c;i++){
                     v2.add(rs.getString("flightid"));
                     v2.add(rs.getString("flightname"));
                     v2.add(rs.getString("source"));
                     v2.add(rs.getString("departure"));
                     v2.add(rs.getString("departuretime"));
                     v2.add(rs.getString("arrivaltime"));
                     v2.add(rs.getString("Flightcharge"));
                 }
                 Df.addRow(v2);
             }
             
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
     public void autoID(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/flight","root","");
           
            java.sql.Statement s= con.createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(id) FROM ticket");
            rs.next();
            rs.getString("MAX(id)");
            if(rs.getString("MAX(id)") == null){
                txtticketno.setText("T0001");
                
            }
            else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
                id++;
                 txtticketno.setText("T0"+ String.format("%03d",id) );
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    
    
    
    
    
    
    
     }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String id= txtcustomerid.getText();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/flight","root","");
            pst =con.prepareStatement("select* from customer where id = ?");
            pst.setString(1, id);
            ResultSet rs =pst.executeQuery();
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this,"Record not Found");
            }
            else {
                String fname= rs.getString("FirstName");
                 String lname= rs.getString("LastName");
                  String Passport =rs.getString("PassportID");
                 
                  txtFirstName.setText(fname.trim());
                  txtLastName.setText(lname.trim());
                  txtPassportID.setText(Passport.trim());
                 
                  
        } 
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectIndex= jTable1.getSelectedRow();
        
        
       txtflightno.setText(Df.getValueAt(selectIndex, 0).toString());
              txtflightname.setText(Df.getValueAt(selectIndex, 1).toString());
                     txtdeparturetime.setText(Df.getValueAt(selectIndex, 3).toString());
                     txtprice.setText(Df.getValueAt(selectIndex,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtseatsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtseatsStateChanged
        // TODO add your handling code here:
        int price = Integer.parseInt(txtprice.getText());
        int qty = Integer.parseInt(txtseats.getValue().toString());
        
        int tot = price*qty;
        txttotal.setText(String.valueOf(tot));
    }//GEN-LAST:event_txtseatsStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtFirstName;
    private javax.swing.JLabel txtLastName;
    private javax.swing.JLabel txtPassportID;
    private javax.swing.JComboBox<String> txtclass;
    private javax.swing.JTextField txtcustomerid;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JComboBox<String> txtdeparture;
    private javax.swing.JLabel txtdeparturetime;
    private javax.swing.JLabel txtflightname;
    private javax.swing.JLabel txtflightno;
    private javax.swing.JTextField txtprice;
    private javax.swing.JSpinner txtseats;
    private javax.swing.JComboBox<String> txtsource;
    private javax.swing.JLabel txtticketno;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
