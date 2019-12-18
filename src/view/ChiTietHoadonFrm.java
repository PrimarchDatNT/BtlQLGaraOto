/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ChitietHoadonDAO;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DVLKSudung;
import model.KhachHang;
import model.Oto;

/**
 *
 * @author admin
 */
public class ChiTietHoadonFrm extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietHoadonFrm
     */
    private ArrayList<DVLKSudung> listDVLKSudung;
    private final DefaultTableModel tableModel;
    private final ChitietHoadonDAO chitietHoadonDAO;
    private KhachHang thongtinKH;
    private final Oto oto;

    public ChiTietHoadonFrm(String maHD, String maKH, String ngayNhan) {
        initComponents();
        chitietHoadonDAO = new ChitietHoadonDAO();
        listDVLKSudung = new ArrayList<>();
        listDVLKSudung = chitietHoadonDAO.getListDVLKDadung(maHD);
        tableModel = (DefaultTableModel) tblDVLK.getModel();
        tblDVLK.getTableHeader().setFont(new Font("courier new", Font.PLAIN, 12));
        tableModel.getDataVector().removeAllElements();

           for (DVLKSudung dvlkSudung : listDVLKSudung) {
            tableModel.addRow(dvlkSudung.toObject());

        }
        long tongTien = 0L;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            tongTien += Long.parseLong(tableModel.getValueAt(i, 4).toString());
        }
        oto = new Oto();
        thongtinKH = new KhachHang(oto);
        thongtinKH = chitietHoadonDAO.getThongTinKH(maKH);
        tfTenKH.setText(thongtinKH.getTenKH());
        tfSDT.setText(thongtinKH.getSdt());
        tfDiaChi.setText(thongtinKH.getDiaChi());
        tfTenXe.setText(thongtinKH.getOto().getDongXe());
        tfMaHD.setText(maHD);
        tfNgayNhan.setText(ngayNhan);
        tfTongTien.setText(tongTien + "");
        
        setGaravity();

    }

    private void setGaravity() {
        this.pack();
        this.setLocationRelativeTo(null);
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
        tblDVLK = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfTenKH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNgayNhan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTenXe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfMaHD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTongTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDVLK.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        tblDVLK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã DVLK", "Tên DVLK", "Số Lượng", "Giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDVLK);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Đóng");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel1.setText("Tên Khách hàng");

        tfTenKH.setEditable(false);
        tfTenKH.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel2.setText("Số điện thoại");

        tfSDT.setEditable(false);
        tfSDT.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel3.setText("Địa chỉ");

        tfDiaChi.setEditable(false);
        tfDiaChi.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setText("Ngày nhận");

        tfNgayNhan.setEditable(false);
        tfNgayNhan.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setText("Chi tiết dịch vụ/ linh kiện sử dụng");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setText("Tên xe");

        tfTenXe.setEditable(false);
        tfTenXe.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel7.setText("Mã hóa đơn");

        tfMaHD.setEditable(false);
        tfMaHD.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setText("Tổng tiền");

        tfTongTien.setEditable(false);
        tfTongTien.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(317, 317, 317))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTenKH)
                            .addComponent(tfSDT)
                            .addComponent(tfDiaChi)
                            .addComponent(tfNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTenXe)
                            .addComponent(tfMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTongTien))
                .addGap(34, 34, 34)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDVLK;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMaHD;
    private javax.swing.JTextField tfNgayNhan;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenKH;
    private javax.swing.JTextField tfTenXe;
    private javax.swing.JTextField tfTongTien;
    // End of variables declaration//GEN-END:variables
}
