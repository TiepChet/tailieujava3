/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;
import model.TheLoai;
import service.impl.SachServiceImpl;
import service.impl.TheLoaiServiceImpl;

/**
 *
 * @author admin
 */
public class ViewLoaiSach extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultComboBoxModel dcbmTen = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmMa = new DefaultComboBoxModel();
    private List<TheLoai> listTheLoai = new ArrayList<>();
    private List<Sach> listSach = new ArrayList<>();
    private TheLoaiServiceImpl theLoaiServiceImpl = new TheLoaiServiceImpl();
    private SachServiceImpl sachServiceImpl = new SachServiceImpl();

    /**
     * Creates new form ViewLoaiSach
     */
    public ViewLoaiSach() {
        initComponents();
        tblHienThi.setModel(dtm);
        cboTenLoai.setModel(dcbmTen);
        cboMaLoai.setModel(dcbmMa);
        String[] header = {"Ma", "Ten", "Nha Xuat Ban", "So Luong", "Gia", "Ten Loai"};
        dtm.setColumnIdentifiers(header);
        listTheLoai = theLoaiServiceImpl.getAll();
        listSach = sachServiceImpl.getAll();

        for (TheLoai tl : listTheLoai) {
            dcbmTen.addElement(tl.getTenLoai());
        }
        for (TheLoai tl : listTheLoai) {
            cboMaLoai.addItem(tl.getMaLoai());
        }

        TheLoai tl = theLoaiServiceImpl.getOne(cboTenLoai.getSelectedItem().toString());
        lblTenLoai.setText(tl.getTenLoai());
        showDataTable(listSach);
        fillData(0);
    }

    public void showDataTable(List<Sach> list) {
        dtm.setRowCount(0);
        for (Sach s : list) {
            dtm.addRow(s.toDataRow());
        }
    }

    private void fillData(int index) {
        Sach sach = listSach.get(index);
        txtMa.setText(sach.getMaSach());
        txtTen.setText(sach.getTenSach());
        txtNhaXuatBan.setText(sach.getNhaXuatBan());
        txtSoLuong.setText(String.valueOf(sach.getSoLuong()));
        txtGiaTien.setText(String.valueOf(sach.getGiaTien()));
        cboTenLoai.setSelectedItem(sach.getTenLoai().getTenLoai());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboTenLoai = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboMaLoai = new javax.swing.JComboBox<>();
        lblTenLoai = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNhaXuatBan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnTop5 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search By Tên Loại");

        cboTenLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTenLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenLoaiActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Loại");

        cboMaLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTenLoai.setText("jLabel3");

        jLabel4.setText("Mã Sách");

        jLabel5.setText("Tên Sách");

        jLabel6.setText("Nhà Xuất Bản");

        jLabel7.setText("Giá Tiền");

        jLabel8.setText("Số Lượng");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnTop5.setText("Top 5 SL Nhỏ Nhất");
        btnTop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTop5ActionPerformed(evt);
            }
        });

        btnClear.setText("CLear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Nhà Xuất Bản", "Số Lượng", "Giá ", "Tên Loại"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(lblTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(38, 38, 38)
                        .addComponent(btnUpdate)
                        .addGap(55, 55, 55)
                        .addComponent(btnRemove)
                        .addGap(64, 64, 64)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTop5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenLoai))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove)
                    .addComponent(btnSort)
                    .addComponent(btnTop5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboTenLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenLoaiActionPerformed
        TheLoai tl = theLoaiServiceImpl.getOne(cboTenLoai.getSelectedItem().toString());
        lblTenLoai.setText(tl.getTenLoai());
    }//GEN-LAST:event_cboTenLoaiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String tenLoai = (String) cboTenLoai.getSelectedItem();
        List<Sach> searchTen = sachServiceImpl.searchTen(tenLoai);
        showDataTable(searchTen);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtGiaTien.setText(" ");
        txtMa.setText(" ");
        txtNhaXuatBan.setText(" ");
        txtSoLuong.setText(" ");
        txtTen.setText(" ");
        cboMaLoai.setSelectedIndex(0);
        cboTenLoai.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTop5ActionPerformed
        // TODO add your handling code here:
        List<Sach> top5 = sachServiceImpl.top5();
        showDataTable(top5);
    }//GEN-LAST:event_btnTop5ActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        List<Sach> sort = sachServiceImpl.sortGia();
        showDataTable(sort);
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Trống Mã");
        } else if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Trống Tên");
        } else if (txtNhaXuatBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Trống NXB");
        } else if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Trống SL");
        } else if (txtGiaTien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Trống Giá Tiền");
        } else if (!txtMa.getText().matches("[\\d]+")) {
            JOptionPane.showMessageDialog(rootPane, "Mã đúng Định Dạng");
        } else if (!txtTen.getText().matches("^[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "Tên Đúng Định Dạng");
        } else if (!txtNhaXuatBan.getText().matches("^[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "NXB đúng định dạng");
        } else if (!txtSoLuong.getText().matches("[\\d]+")) {
            JOptionPane.showMessageDialog(rootPane, " SL đúng định dạng");
        } else if (!txtGiaTien.getText().matches("[\\d]+")) {
            JOptionPane.showMessageDialog(rootPane, " Giá Tiền Đúng Định Dạng");
        } else {
            String ma = txtMa.getText();
            String ten = txtTen.getText();
            String nhaXuatBan = txtNhaXuatBan.getText();
            int soLuong = Integer.valueOf(txtSoLuong.getText());
            int gia = Integer.valueOf(txtGiaTien.getText());
            TheLoai tl = theLoaiServiceImpl.getOne(cboTenLoai.getSelectedItem().toString());
            Sach sach = new Sach(ma, ten, nhaXuatBan, soLuong, gia, tl);
            JOptionPane.showMessageDialog(this, sachServiceImpl.addSach(sach));
            listTheLoai = theLoaiServiceImpl.getAll();
            listSach = sachServiceImpl.getAll();
            showDataTable(listSach);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        listSach.clear();
        String ma = txtMa.getText();
        String delete = sachServiceImpl.deleteSach(ma);
        JOptionPane.showMessageDialog(this, delete);
        listSach = sachServiceImpl.getAll();
        showDataTable(listSach);
        txtGiaTien.setText(" ");
        txtMa.setText(" ");
        txtNhaXuatBan.setText(" ");
        txtSoLuong.setText(" ");
        txtTen.setText(" ");
        cboMaLoai.setSelectedIndex(0);
        cboTenLoai.setSelectedIndex(0);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        int row = tblHienThi.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        String nhaXuatBan = txtNhaXuatBan.getText();
        int soLuong = Integer.valueOf(txtSoLuong.getText());
        int gia = Integer.valueOf(txtGiaTien.getText());
        String tenLoai = (String) cboTenLoai.getSelectedItem();
        String maLoai = (String) cboMaLoai.getSelectedItem();
        TheLoai tl = theLoaiServiceImpl.getOne(cboTenLoai.getSelectedItem().toString());
        Sach sach = new Sach(ma, ten, nhaXuatBan, soLuong, gia, tl);
        JOptionPane.showMessageDialog(this, sachServiceImpl.updateSach(sach, ma));
        listSach = sachServiceImpl.getAll();
        showDataTable(listSach);
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoaiSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoaiSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnTop5;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboMaLoai;
    private javax.swing.JComboBox<String> cboTenLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNhaXuatBan;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}