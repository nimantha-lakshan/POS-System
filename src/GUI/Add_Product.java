package GUI;

import Database.DB;
import Model.Save;
import Model.Validation;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Add_Product extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Main menu;
    private Products productz;
    private String productBrand;
    private String productCategory;

    public Add_Product() {
        initComponents();
        ok.setVisible(false);
        loadProductBrand();
        loadProductType();
    }

    public Add_Product(Main mMenu, Products pro) {
        this();
        this.menu = mMenu;
        this.productz = pro;
        menu.setEnabled(false);
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
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        product_Code = new javax.swing.JTextField();
        product_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        unit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        product_Category = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_Cancel = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        brand = new javax.swing.JComboBox<>();
        warningMsg = new javax.swing.JLabel();
        ok = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit1.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 1, 34, 32));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 57, 75));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Product ");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 73, 73));
        jLabel2.setText("Product Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 73, 73));
        jLabel3.setText("Brand Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 25));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 73, 73));
        jLabel4.setText("Unit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 73, 73));
        jLabel5.setText("Discription");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 25));

        product_Code.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        product_Code.setForeground(new java.awt.Color(39, 55, 70));
        product_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                product_CodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                product_CodeKeyTyped(evt);
            }
        });
        jPanel1.add(product_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, 25));

        product_Name.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        product_Name.setForeground(new java.awt.Color(39, 55, 70));
        product_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                product_NameKeyTyped(evt);
            }
        });
        jPanel1.add(product_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 490, 25));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        description.setForeground(new java.awt.Color(39, 55, 70));
        description.setLineWrap(true);
        description.setRows(5);
        description.setPreferredSize(new java.awt.Dimension(310, 100));
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 320, 110));

        unit.setEditable(true);
        unit.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select -", "NOS", "Centimeter", "Inch", "Meter" }));
        unit.setFocusable(false);
        jPanel1.add(unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 25));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 73, 73));
        jLabel6.setText("Product Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 25));

        product_Category.setEditable(true);
        product_Category.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        product_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Category -" }));
        product_Category.setFocusable(false);
        product_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_CategoryActionPerformed(evt);
            }
        });
        jPanel1.add(product_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 180, 25));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 73, 73));
        jLabel7.setText("Category");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, 25));

        btn_Cancel.setBackground(new java.awt.Color(179, 182, 183));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.setBorder(null);
        btn_Cancel.setBorderPainted(false);
        btn_Cancel.setContentAreaFilled(false);
        btn_Cancel.setFocusPainted(false);
        btn_Cancel.setOpaque(true);
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_CancelMouseReleased(evt);
            }
        });
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 90, 30));

        btn_Add.setBackground(new java.awt.Color(41, 128, 185));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.setBorder(null);
        btn_Add.setBorderPainted(false);
        btn_Add.setContentAreaFilled(false);
        btn_Add.setFocusPainted(false);
        btn_Add.setOpaque(true);
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_AddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_AddMouseReleased(evt);
            }
        });
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 90, 30));

        header.setBackground(new java.awt.Color(250, 251, 250));
        header.setOpaque(true);
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 697, 30));

        brand.setEditable(true);
        brand.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Brand -" }));
        brand.setFocusable(false);
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });
        jPanel1.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, 25));

        warningMsg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        warningMsg.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(warningMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 280, 25));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/tick.png"))); // NOI18N
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 80, 25, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(new Color(179, 182, 183));
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        btn_Cancel.setBackground(new Color(98, 101, 103));
    }//GEN-LAST:event_btn_CancelMousePressed

    private void btn_CancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseReleased
        btn_Cancel.setBackground(new Color(144, 148, 151));
    }//GEN-LAST:event_btn_CancelMouseReleased

    private void btn_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseEntered
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseEntered

    private void btn_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseExited
        btn_Add.setBackground(new Color(41, 128, 185));
    }//GEN-LAST:event_btn_AddMouseExited

    private void btn_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMousePressed
        btn_Add.setBackground(new Color(21, 67, 96));
    }//GEN-LAST:event_btn_AddMousePressed

    private void btn_AddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseReleased
        btn_Add.setBackground(new Color(31, 97, 141));
    }//GEN-LAST:event_btn_AddMouseReleased

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        menu.setEnabled(true);
        productz.loadTableData();
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void descriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyTyped
        Validation.setLength(evt, description.getText(), 250);
    }//GEN-LAST:event_descriptionKeyTyped

    private void product_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_NameKeyTyped
        Validation.setLength(evt, product_Name.getText(), 80);
    }//GEN-LAST:event_product_NameKeyTyped

    private void product_CodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_CodeKeyTyped
        Validation.setLength(evt, product_Code.getText(), 15);
    }//GEN-LAST:event_product_CodeKeyTyped

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        if (product_Code.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Product Code", "Please Check Product Code", JOptionPane.WARNING_MESSAGE);
        } else {
            if (warningMsg.getText() != null) {
                JOptionPane.showMessageDialog(this, "Already used this Product Code", "Please Check Product Code", JOptionPane.WARNING_MESSAGE);
            } else {
                if (brand.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Plaese Select A Brand", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (product_Category.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(this, "Plaese Product Category", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (unit.getSelectedIndex() == 0) {
                            JOptionPane.showMessageDialog(this, "Please Select the Unit of Product", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            if (product_Name.getText().equals("")) {
                                JOptionPane.showMessageDialog(this, "Plaese enter the product name before save", "Warning", JOptionPane.WARNING_MESSAGE);
                            } else {
                                try {
                                    DB.iud("INSERT INTO product VALUES('" + product_Code.getText() + "','" + productBrand + "','" + productCategory
                                            + "','" + product_Name.getText() + "','" + unit.getSelectedItem().toString() + "','" + description.getText() + "','1')");
                                    new Save().setVisible(true);
                                    clear();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void product_CodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_CodeKeyReleased
        try {
            ResultSet rs = DB.search("SELECT id_product FROM product");
            while (rs.next()) {
                if (rs.getString(1).equals(product_Code.getText())) {
                    warningMsg.setText(" Already used this Product Code");
                    ok.setVisible(false);
                } else {
                    warningMsg.setText(null);
                    ok.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_product_CodeKeyReleased

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        try {
            ResultSet rs = DB.search(" SELECT id FROM product_brand WHERE brand='" + brand.getSelectedItem().toString().trim() + "' ");
            if (rs.next()) {
                productBrand = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_brandActionPerformed

    private void product_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_CategoryActionPerformed
        try {
            ResultSet rs = DB.search(" SELECT id FROM product_type WHERE type ='" + product_Category.getSelectedItem().toString().trim() + "' ");
            if (rs.next()) {
                productCategory = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_product_CategoryActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        clear();
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brand;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JTextArea description;
    private javax.swing.JButton exit;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ok;
    private javax.swing.JComboBox<String> product_Category;
    private javax.swing.JTextField product_Code;
    private javax.swing.JTextField product_Name;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JLabel warningMsg;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        product_Code.setText(null);
        brand.setSelectedIndex(0);
        product_Category.setSelectedIndex(0);
        product_Name.setText(null);
        unit.setSelectedIndex(0);
        description.setText(null);
        ok.setVisible(false);
        warningMsg.setText(null);
    }

    private void loadProductBrand() {
        try {
            ResultSet rs = DB.search("SELECT brand FROM product_brand");
            while (rs.next()) {
                brand.addItem(" " + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadProductType() {
        try {
            ResultSet rs = DB.search("SELECT type FROM product_type");
            while (rs.next()) {
                product_Category.addItem(" " + rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
