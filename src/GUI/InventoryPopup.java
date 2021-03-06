package GUI;

import Model.Access_Denied;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InventoryPopup extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public InventoryPopup() {
        initComponents();
    }

    public InventoryPopup(Main m, String type) {
        initComponents();
        this.menu = m;
        this.user_Type = type;
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
        btn_stock = new javax.swing.JButton();
        btn_GRN = new javax.swing.JButton();
        btn_Suppliers = new javax.swing.JButton();
        btn_payments = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(38, 57, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_stock.setBackground(new java.awt.Color(38, 57, 75));
        btn_stock.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_stock.setForeground(new java.awt.Color(204, 204, 204));
        btn_stock.setText("Stock");
        btn_stock.setBorder(null);
        btn_stock.setBorderPainted(false);
        btn_stock.setContentAreaFilled(false);
        btn_stock.setFocusPainted(false);
        btn_stock.setOpaque(true);
        btn_stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_stockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_stockMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_stockMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_stockMouseReleased(evt);
            }
        });
        btn_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stockActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        btn_GRN.setBackground(new java.awt.Color(38, 57, 75));
        btn_GRN.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_GRN.setForeground(new java.awt.Color(204, 204, 204));
        btn_GRN.setText("GRN");
        btn_GRN.setBorder(null);
        btn_GRN.setBorderPainted(false);
        btn_GRN.setContentAreaFilled(false);
        btn_GRN.setFocusPainted(false);
        btn_GRN.setOpaque(true);
        btn_GRN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_GRNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_GRNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_GRNMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_GRNMouseReleased(evt);
            }
        });
        btn_GRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GRNActionPerformed(evt);
            }
        });
        jPanel1.add(btn_GRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 50));

        btn_Suppliers.setBackground(new java.awt.Color(38, 57, 75));
        btn_Suppliers.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_Suppliers.setForeground(new java.awt.Color(204, 204, 204));
        btn_Suppliers.setText("Suppliers");
        btn_Suppliers.setBorder(null);
        btn_Suppliers.setBorderPainted(false);
        btn_Suppliers.setContentAreaFilled(false);
        btn_Suppliers.setFocusPainted(false);
        btn_Suppliers.setOpaque(true);
        btn_Suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_SuppliersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_SuppliersMouseReleased(evt);
            }
        });
        btn_Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuppliersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 50));

        btn_payments.setBackground(new java.awt.Color(38, 57, 75));
        btn_payments.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_payments.setForeground(new java.awt.Color(204, 204, 204));
        btn_payments.setText("Payments");
        btn_payments.setBorder(null);
        btn_payments.setBorderPainted(false);
        btn_payments.setContentAreaFilled(false);
        btn_payments.setFocusPainted(false);
        btn_payments.setOpaque(true);
        btn_payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_paymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_paymentsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_paymentsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_paymentsMouseReleased(evt);
            }
        });
        btn_payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseEntered
        btn_stock.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_stockMouseEntered

    private void btn_stockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseExited
        btn_stock.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_stockMouseExited

    private void btn_stockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMousePressed
        btn_stock.setForeground(new Color(0, 204, 204));
        btn_stock.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_stockMousePressed

    private void btn_stockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stockMouseReleased
        btn_stock.setForeground(new Color(204, 204, 204));
        btn_stock.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_stockMouseReleased

    private void btn_GRNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GRNMouseEntered
        btn_GRN.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_GRNMouseEntered

    private void btn_GRNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GRNMouseExited
        btn_GRN.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_GRNMouseExited

    private void btn_GRNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GRNMousePressed
        btn_GRN.setForeground(new Color(0, 204, 204));
        btn_GRN.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_GRNMousePressed

    private void btn_GRNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GRNMouseReleased
        btn_GRN.setForeground(new Color(204, 204, 204));
        btn_GRN.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_GRNMouseReleased

    private void btn_SuppliersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseEntered
        btn_Suppliers.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_SuppliersMouseEntered

    private void btn_SuppliersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseExited
        btn_Suppliers.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_SuppliersMouseExited

    private void btn_SuppliersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMousePressed
        btn_Suppliers.setForeground(new Color(0, 204, 204));
        btn_Suppliers.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_SuppliersMousePressed

    private void btn_SuppliersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuppliersMouseReleased
        btn_Suppliers.setForeground(new Color(204, 204, 204));
        btn_Suppliers.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_SuppliersMouseReleased

    private void btn_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stockActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("Cashier")) {
            Product_Stock ps = new Product_Stock(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) ps.panel);
            this.dispose();

        } else if (user_Type.equals("DataEntry")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_stockActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void btn_GRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GRNActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            Product_GRN grn = new Product_GRN(menu);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) grn.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_GRNActionPerformed

    private void btn_paymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paymentsMouseEntered
        btn_payments.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_paymentsMouseEntered

    private void btn_paymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paymentsMouseExited
        btn_payments.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_paymentsMouseExited

    private void btn_paymentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paymentsMousePressed
        btn_payments.setForeground(new Color(0, 204, 204));
        btn_payments.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_paymentsMousePressed

    private void btn_paymentsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paymentsMouseReleased
        btn_payments.setForeground(new Color(204, 204, 204));
        btn_payments.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_paymentsMouseReleased

    private void btn_SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuppliersActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            Suppliers supp = new Suppliers(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) supp.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_SuppliersActionPerformed

    private void btn_paymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentsActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            Supplier_Payments suppPay = new Supplier_Payments(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) suppPay.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_paymentsActionPerformed

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
            java.util.logging.Logger.getLogger(InventoryPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_GRN;
    private javax.swing.JButton btn_Suppliers;
    private javax.swing.JButton btn_payments;
    private javax.swing.JButton btn_stock;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
