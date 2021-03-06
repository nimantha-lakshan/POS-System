
package GUI;

import Model.Access_Denied;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ProductsPopup extends javax.swing.JFrame {

    private Main menu;
    private String user_Type;

    public ProductsPopup() {
        initComponents();
    }

    public ProductsPopup(Main m, String type) {
        this();
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
        btn_products = new javax.swing.JButton();
        btn_types = new javax.swing.JButton();
        btn_brands = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 57, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_products.setBackground(new java.awt.Color(38, 57, 75));
        btn_products.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_products.setForeground(new java.awt.Color(204, 204, 204));
        btn_products.setText("Products");
        btn_products.setBorder(null);
        btn_products.setBorderPainted(false);
        btn_products.setContentAreaFilled(false);
        btn_products.setFocusPainted(false);
        btn_products.setOpaque(true);
        btn_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_productsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_productsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_productsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_productsMouseReleased(evt);
            }
        });
        btn_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        btn_types.setBackground(new java.awt.Color(38, 57, 75));
        btn_types.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_types.setForeground(new java.awt.Color(204, 204, 204));
        btn_types.setText("Product Types");
        btn_types.setBorder(null);
        btn_types.setBorderPainted(false);
        btn_types.setContentAreaFilled(false);
        btn_types.setFocusPainted(false);
        btn_types.setOpaque(true);
        btn_types.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_typesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_typesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_typesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_typesMouseReleased(evt);
            }
        });
        btn_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_typesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_types, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 50));

        btn_brands.setBackground(new java.awt.Color(38, 57, 75));
        btn_brands.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn_brands.setForeground(new java.awt.Color(204, 204, 204));
        btn_brands.setText("Brands");
        btn_brands.setBorder(null);
        btn_brands.setBorderPainted(false);
        btn_brands.setContentAreaFilled(false);
        btn_brands.setFocusPainted(false);
        btn_brands.setOpaque(true);
        btn_brands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_brandsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_brandsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_brandsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_brandsMouseReleased(evt);
            }
        });
        btn_brands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_brandsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_brands, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_productsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMouseEntered
        btn_products.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_productsMouseEntered

    private void btn_productsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMouseExited
        btn_products.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_productsMouseExited

    private void btn_productsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMousePressed
        btn_products.setForeground(new Color(0, 204, 204));
        btn_products.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_productsMousePressed

    private void btn_productsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productsMouseReleased
        btn_products.setForeground(new Color(204, 204, 204));
        btn_products.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_productsMouseReleased

    private void btn_typesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_typesMouseEntered
        btn_types.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_typesMouseEntered

    private void btn_typesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_typesMouseExited
        btn_types.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_typesMouseExited

    private void btn_typesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_typesMousePressed
        btn_types.setForeground(new Color(0, 204, 204));
        btn_types.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_typesMousePressed

    private void btn_typesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_typesMouseReleased
        btn_types.setForeground(new Color(204, 204, 204));
        btn_types.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_typesMouseReleased

    private void btn_brandsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brandsMouseEntered
        btn_brands.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_brandsMouseEntered

    private void btn_brandsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brandsMouseExited
        btn_brands.setBackground(new Color(38, 57, 75));
    }//GEN-LAST:event_btn_brandsMouseExited

    private void btn_brandsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brandsMousePressed
        btn_brands.setForeground(new Color(0, 204, 204));
        btn_brands.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_brandsMousePressed

    private void btn_brandsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_brandsMouseReleased
        btn_brands.setForeground(new Color(204, 204, 204));
        btn_brands.setBackground(new Color(52, 73, 94));
    }//GEN-LAST:event_btn_brandsMouseReleased

    private void btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productsActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {

            Products pro = new Products(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) pro.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_productsActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
        System.gc();
    }//GEN-LAST:event_formWindowLostFocus

    private void btn_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_typesActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            ProductsTypes protypes = new ProductsTypes(menu, user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) protypes.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_typesActionPerformed

    private void btn_brandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_brandsActionPerformed

        if (user_Type.equals("Admin") | user_Type.equals("Manager") | user_Type.equals("DataEntry")) {
            ProductsBrands proBrands = new ProductsBrands(menu,user_Type);
            menu.view.removeAll();
            menu.view.revalidate();
            menu.view.repaint();
            menu.view.add((JPanel) proBrands.panel);
            this.dispose();

        } else if (user_Type.equals("Cashier")) {
            Access_Denied ad = new Access_Denied();
            JOptionPane.showMessageDialog(menu, ad.panel, "Acess Denied", JOptionPane.PLAIN_MESSAGE);

        }
    }//GEN-LAST:event_btn_brandsActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_brands;
    private javax.swing.JButton btn_products;
    private javax.swing.JButton btn_types;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
