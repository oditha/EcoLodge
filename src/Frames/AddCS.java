/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.DB;
import com.alee.laf.WebLookAndFeel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danushka
 */
public class AddCS extends javax.swing.JFrame {

    /**
     * Creates new form Sample
     */
    private static String csid;
    boolean txtValidate = false;

    public AddCS() {
        initComponents();
        date_time();
        jButton1.setEnabled(false);
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
        csname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        counrty = new javax.swing.JTextField();
        geust = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Hilro - Balalngoda");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NIC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boy.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 460, 540));
        getContentPane().add(csname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, 20));

        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityKeyTyped(evt);
            }
        });
        getContentPane().add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("City");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Country");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 20));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 70, -1));

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 70, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Add Customer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 27));
        getContentPane().add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 270, 30));

        counrty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                counrtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                counrtyKeyTyped(evt);
            }
        });
        getContentPane().add(counrty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));

        geust.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                geustKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                geustKeyTyped(evt);
            }
        });
        getContentPane().add(geust, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 270, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("no Of geuest");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 80, 20));

        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 270, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Phone No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 70, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cityKeyReleased

    private void cityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyTyped

    }//GEN-LAST:event_cityKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        validateTxtFeilds();

        if (txtValidate == false) {
            try {
                DB.idu("INSERT INTO `hotel`.`custdetail` (`Cust_name`, `Cust_NIC`, `Cust_city`, `Geusts`, `Cust_country`, `Cust_ph`) VALUES ('"
                        + csname.getText() + "', '" + nic.getText() + "', '" + city.getText() + "', '" + geust.getText() + "', '" + counrty.getText() + "', '" + phone.getText() + "')");

                clearfeilds();

            } catch (Exception ex) {
                Logger.getLogger(AddCS.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Fill all text");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            DB.idu("UPDATE `hotel`.`custdetail` SET `Cust_name`='" + csname.getText() + "', `Cust_NIC`='" + nic.getText() + "', `Cust_city`='"
                    + city.getText() + "', `Geusts`='" + geust.getText() + "', `Cust_country`='" + counrty.getText() + "', `Cust_ph`='" + phone.getText() + "' WHERE (`Cust_id_no`='" + csid + "')");
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(AddCS.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void counrtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_counrtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_counrtyKeyReleased

    private void counrtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_counrtyKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_counrtyKeyTyped

    private void geustKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_geustKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_geustKeyReleased

    private void geustKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_geustKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_PERIOD)) {

            evt.consume();

        }
    }//GEN-LAST:event_geustKeyTyped

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyReleased

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_PERIOD)) {

            evt.consume();

        }
    }//GEN-LAST:event_phoneKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
         WebLookAndFeel.install();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField city;
    private static javax.swing.JTextField counrty;
    private static javax.swing.JTextField csname;
    private static javax.swing.JTextField geust;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JTextField nic;
    private static javax.swing.JTextField phone;
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

    public static void updatecs(String csno) {

        try {
            ResultSet rs = DB.search("SELECT * FROM custdetail WHERE Cust_id_no = '" + csno + "' ");

            if (rs.next()) {
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);

                csid = csno;

                csname.setText(rs.getString("Cust_name"));
                nic.setText(rs.getString("Cust_NIC"));
                city.setText(rs.getString("Cust_city"));
                geust.setText(rs.getString("Geusts"));
                counrty.setText(rs.getString("Cust_country"));
                phone.setText(rs.getString("Cust_ph"));

            }
        } catch (Exception ex) {
            Logger.getLogger(ViewCS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void validateTxtFeilds() {

        Component[] cp = jPanel1.getComponents();
        for (Component c : cp) {

            if (c instanceof JTextField) {

                if (((JTextField) c).getText().isEmpty()) {

                    txtValidate = true;

                    System.out.println(txtValidate);
                    break;

                } else {

                    txtValidate = false;

                }

            }

        }
    }

    private void clearfeilds() {

        csname.setText(null);
        nic.setText(null);
        city.setText(null);
        counrty.setText(null);
        geust.setText(null);
        phone.setText(null);

        csname.grabFocus();
    }

}
