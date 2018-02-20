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
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Danushka
 */
public class AddInvoice extends javax.swing.JFrame {

    /**
     * Creates new form Sample
     */
    private static String bookno;

    public AddInvoice() {
        initComponents();
        date_time();
        genInv();

        setCus();

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
        jLabel5 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        invid = new javax.swing.JLabel();
        booking = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Hilro - Balalngoda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 450, 540));

        days.setEditable(false);
        days.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daysKeyTyped(evt);
            }
        });
        getContentPane().add(days, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Days");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 20));

        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 70, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Invoice");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 27));

        invid.setBackground(new java.awt.Color(0, 0, 0));
        invid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invid.setText("INV");
        getContentPane().add(invid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 20));

        booking.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Bed", "Double Bed" }));
        booking.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bookingPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("RoomRate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 20));

        rate.setEditable(false);
        rate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rateKeyTyped(evt);
            }
        });
        getContentPane().add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Total");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 20));

        total.setEditable(false);
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Paid");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 20));

        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paidKeyTyped(evt);
            }
        });
        getContentPane().add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 200, 30));

        balance.setEditable(false);
        balance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                balanceKeyTyped(evt);
            }
        });
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Balance");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Customer");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String inv = invid.getText();
        String cs = booking.getSelectedItem().toString().split("-")[1];
        String bk = booking.getSelectedItem().toString().split("-")[0];
        String day = days.getText();
        String ra = rate.getText();
        String to = total.getText();
        String date = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

        if (!(total.getText().isEmpty())) {

            try {

                DB.idu("INSERT INTO `hotel`.`invoice` (`invID`, `booking`, `roomrate`, `days`, `total`, `CusName`, `date`) VALUES ('"+
                        inv+"', '"+bk+"', '"+ra+"', '"+day+"', '"+to+"', '"+cs+"', '"+date+"')");
                
                days.setText(null);
                rate.setText(null);
                total.setText(null);
                paid.setText(null);
                balance.setText(null);
                
                booking.grabFocus();
                genInv();
                
            } catch (Exception ex) {
            
                Logger.getLogger(AddInvoice.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        } else {

            JOptionPane.showMessageDialog(null, "Fill all feilds");

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void daysKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daysKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_PERIOD)) {

            evt.consume();

        }
    }//GEN-LAST:event_daysKeyTyped

    private void rateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rateKeyTyped

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_totalKeyTyped

    private void paidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_paidKeyTyped

    private void balanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_balanceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceKeyTyped

    private void bookingPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bookingPopupMenuWillBecomeInvisible

        try {
            ResultSet rs = DB.search("SELECT * from bookingtable where book_id = '" + booking.getSelectedItem() + "'");
            if (rs.next()) {

                ResultSet search = DB.search("SELECT * from roomdetail WHERE room_no = '" + rs.getString("room_no") + "'");
                search.next();
                rate.setText(search.getString("room_rate"));

                days.setText(rs.getString("no_of_day"));

                double d1 = search.getDouble("room_rate");
                double d2 = rs.getDouble("no_of_day");

                double d = d1 * d2;
                total.setText("" + d);
                paid.grabFocus();

            }
        } catch (Exception ex) {
            Logger.getLogger(AddInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bookingPopupMenuWillBecomeInvisible

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased

        double d1 = Double.parseDouble(total.getText());
        double d2 = Double.parseDouble(paid.getText());

        double d = d2 - d1;

        balance.setText("" + d);

    }//GEN-LAST:event_paidKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField balance;
    private static javax.swing.JComboBox booking;
    private static javax.swing.JTextField days;
    private javax.swing.JLabel invid;
    private static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField paid;
    private static javax.swing.JTextField rate;
    private static javax.swing.JTextField total;
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

    public static void updateroom(String bookno1) {

    }

    private void setCus() {
        try {
            ResultSet rs = DB.search("SELECT bookingtable.book_id, custdetail.Cust_name FROM bookingtable INNER JOIN custdetail ON bookingtable.cus_no = custdetail.Cust_id_no");

            DefaultComboBoxModel dcm = new DefaultComboBoxModel();
            dcm.removeAllElements();

            while (rs.next()) {

                dcm.addElement(rs.getString("book_id") + "-" + rs.getString("Cust_name"));

            }

            booking.setModel(dcm);

        } catch (Exception ex) {
            Logger.getLogger(AddInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void genInv() {
        int i = 0;
        DecimalFormat dc = new DecimalFormat("0000");
        try {
            ResultSet rs = DB.search("SELECT COUNT(*) FROM invoice");
            rs.next();
            i = Integer.parseInt(rs.getString("COUNT(*)"));
            i++;
            invid.setText("INV-" + dc.format(i));
        } catch (Exception ex) {
            Logger.getLogger(AddInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
