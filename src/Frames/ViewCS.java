/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danushka
 */
public class ViewCS extends javax.swing.JFrame {

    /**
     * Creates new form Sample
     */
    DecimalFormat dcf = new DecimalFormat("#######.00");

    public ViewCS() {
        initComponents();
        loadcs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        csname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableroom = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Hilro - Balalngoda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tasks.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 300, 540));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("View Customer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 27));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 80, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 70, -1));

        csname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                csnameKeyReleased(evt);
            }
        });
        getContentPane().add(csname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 30));

        tableroom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NIC", "Name", "City", "Counrty", "Gests", "Phone"
            }
        ));
        jScrollPane1.setViewportView(tableroom);
        if (tableroom.getColumnModel().getColumnCount() > 0) {
            tableroom.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 520, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {

            DB.idu("DELETE FROM custdetail WHERE Cust_id_no = '" + tableroom.getValueAt(tableroom.getSelectedRow(), 0) + "'");
            loadcs();
        } catch (Exception ex) {
            Logger.getLogger(ViewCS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new AddCS().setVisible(true);
        AddCS.updatecs(tableroom.getValueAt(tableroom.getSelectedRow(), 0).toString());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            tableroom.print(JTable.PrintMode.NORMAL);
        } catch (PrinterException ex) {
            Logger.getLogger(ViewCS.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void csnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csnameKeyReleased
        try {
            ResultSet rs = DB.search("SELECT * FROM custdetail WHERE Cust_name LIKE '" + csname.getText() + "%'");
            DefaultTableModel dtm = (DefaultTableModel) tableroom.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("Cust_id_no"), rs.getString("Cust_NIC"), rs.getString("Cust_name"), rs.getString("Cust_city"), rs.getString("Cust_country"), rs.getString("Geusts"), rs.getString("Cust_ph")});

            }
        } catch (Exception ex) {
            Logger.getLogger(ViewCS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_csnameKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       WebLookAndFeel.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    public static javax.swing.JTextField csname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableroom;
    // End of variables declaration//GEN-END:variables

    public void date_time() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date date = new java.util.Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MMM/dd - h:mm:ss a");
//                txtDate.setText(simpleDateFormat.format(date));

            }
        });
        t.start();

    }

    private void loadcs() {

        try {
            ResultSet rs = DB.search("SELECT * FROM custdetail");
            DefaultTableModel dtm = (DefaultTableModel) tableroom.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                dtm.addRow(new Object[]{rs.getString("Cust_id_no"), rs.getString("Cust_NIC"), rs.getString("Cust_name"), rs.getString("Cust_city"), rs.getString("Cust_country"), rs.getString("Geusts"), rs.getString("Cust_ph")});

            }
        } catch (Exception ex) {
            Logger.getLogger(ViewCS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
