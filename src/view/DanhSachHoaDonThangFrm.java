/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DanhSachHoaDonThangDAO;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.HoaDonTrongThang;

/**
 *
 * @author admin
 */
public class DanhSachHoaDonThangFrm extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachHoaDonThangFrm
     */
    private ArrayList<HoaDonTrongThang> listHoadon;
    private final DanhSachHoaDonThangDAO dsHdDAO;
    private DefaultTableModel tableModel;
//    public ArrayList<String> listMaKH;
//    public ArrayList<String> listTenXe;

    public DanhSachHoaDonThangFrm(String numQuery) {
        initComponents();
        listHoadon = new ArrayList<>();
        dsHdDAO = new DanhSachHoaDonThangDAO();
        listHoadon = dsHdDAO.getDanhSachHoaDonThang(numQuery);
        tableModel = (DefaultTableModel) tblDanhSachHDThang.getModel();
        tblDanhSachHDThang.getTableHeader().setFont(new Font("courier new", Font.PLAIN, 12));
        tableModel.getDataVector().removeAllElements();
        for (HoaDonTrongThang dsHd : listHoadon) {
            tableModel.addRow(dsHd.toObject());
//            listMaKH.add(dsHd.getMaKH());
//            listTenXe.add(dsHd.getDongXe());
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
        tblDanhSachHDThang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDanhSachHDThang.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tblDanhSachHDThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày thanh toán", "Mã Khách Hàng", "Tên Khách Hàng", "Tên xe", "Tổng Dv/Lk", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachHDThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachHDThangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachHDThang);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách chi tiết hóa đơn trong tháng");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Trở lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThongKeDoanhThuThangFrm tkDoanhThuFrm = new ThongKeDoanhThuThangFrm();
        tkDoanhThuFrm.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblDanhSachHDThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachHDThangMouseClicked
        // TODO add your handling code here:
        tableModel = (DefaultTableModel) tblDanhSachHDThang.getModel();
        int check = tblDanhSachHDThang.getSelectedRow();

        String maHD = tableModel.getValueAt(check, 0).toString();
        String maKH = tableModel.getValueAt(check,2).toString();
        String tenXe = tableModel.getValueAt(check,4).toString();
        String ngayNhan = tableModel.getValueAt(check, 1).toString();
        ChiTietHoadonFrm chiTietHoadonFrm = new ChiTietHoadonFrm(maHD,maKH, tenXe, ngayNhan);
    
        chiTietHoadonFrm.setVisible(true);

    }//GEN-LAST:event_tblDanhSachHDThangMouseClicked

    /**
     * @param args the command line arguments //
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhSachHDThang;
    // End of variables declaration//GEN-END:variables
}