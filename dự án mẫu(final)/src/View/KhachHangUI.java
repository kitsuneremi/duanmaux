/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.DomainModels.KhachHangModel;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.ViewModel.KhachHangViewModel;
import khungproject.ViewModel.KhachHangViewModelx;
import khungproject.service.impl.KhachHangService;

/**
 *
 * @author Binh
 */
public class KhachHangUI extends javax.swing.JFrame {
    private KhachHangService ser = new KhachHangService();
    /** Creates new form KhachHangUI */
    public KhachHangUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblkhachhang = new javax.swing.JTable();
        txtma = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtho = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        txttendem = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtthanhpho = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtquocgia = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblkhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã", "họ và tên", "ngày sinh", "sdt", "adress"
            }
        ));
        tblkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkhachhang);

        txtma.setEditable(false);

        jButton1.setText("show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel1.setText("ma");

        jLabel2.setText("ho");

        jLabel3.setText("ngay sinh");

        jLabel4.setText("ten dem");

        jLabel5.setText("ten");

        jLabel6.setText("dia chi");

        jLabel7.setText("pass word");

        jLabel8.setText("tp");

        jLabel9.setText("qg");

        jLabel10.setText("sdt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(btninsert)
                        .addGap(32, 32, 32)
                        .addComponent(btnupdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttendem, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtten)
                                .addComponent(txtho)
                                .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdiachi)
                    .addComponent(txtngaysinh)
                    .addComponent(txtthanhpho)
                    .addComponent(txtquocgia)
                    .addComponent(txtsdt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtthanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtquocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btninsert)
                    .addComponent(btnupdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblkhachhang.getModel();
        dtm.setRowCount(0);
        ArrayList<KhachHangViewModelx> list = ser.getlistkh();
        for (KhachHangViewModelx k : list) {
            Object[] rowData = {
                k.getMa(),
                k.getHo() + " " + k.getTendem() + " " + k.getTen(),
                k.getNgaySinh(),
                k.getSdt(),
                k.getDiachi() + "," + k.getThanhpho() + "," + k.getQuocgia(),
                    
            };
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        KhachHangModel khmd = getdata();
        if(khmd == null){
            return ;
        }
        khmd.setMa(rdn());
        int slt = JOptionPane.showConfirmDialog(this, "ban muon them ko", "them", JOptionPane.YES_NO_OPTION);
        if(slt == JOptionPane.YES_OPTION){
            ser.insert(khmd);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void tblkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhachhangMouseClicked
        int row = tblkhachhang.getSelectedRow();
        ArrayList<String> list1 = tachten(tblkhachhang.getValueAt(row, 1).toString());
        ArrayList<String> list2 = tachdiachi(tblkhachhang.getValueAt(row, 4).toString());
        txtma.setText(tblkhachhang.getValueAt(row, 0).toString());
        txtho.setText(list1.get(0));
        txttendem.setText(list1.get(1));
        txtten.setText(list1.get(2));
        
//        txtdiachi.setText(list2.get(0));
//        txtthanhpho.setText(list2.get(1));
//        txtquocgia.setText(list2.get(2));
        
        txtpassword.setText("");
        txtngaysinh.setText(tblkhachhang.getValueAt(row, 2).toString());
        txtsdt.setText(tblkhachhang.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_tblkhachhangMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        KhachHangModel khmd = getdata();
        if(txtma.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "ko dc de trong ma");
            return ;
        }
        if(khmd == null){
            return ;
        }
        int slt = JOptionPane.showConfirmDialog(this, "ban muon update ko", "update", JOptionPane.YES_NO_OPTION);
        if(slt == JOptionPane.YES_OPTION){
            ser.update(khmd);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private KhachHangModel getdata(){
        KhachHangModel khmd = new KhachHangModel();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(txtho.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "ho ko dc de trong");
            return null;
        }else if(txttendem.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "tendem ko dc de trong");
            return null;
        }else if(txtten.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "ten ko dc de trong");
            return null;
        }else if(String.valueOf(txtpassword.getPassword()).equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "mat khau ko dc de trong");
            return null;
        }else if(txtngaysinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "ngaysinh ko dc de trong");
            return null;
        }else if(txtdiachi.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "diachi ko dc de trong");
            return null;
        }else if(txtthanhpho.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "thanh pho ko dc de trong");
            return null;
        }else if(txtquocgia.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "quocgia ko dc de trong");
            return null;
        }else if(txtsdt.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "sdt ko dc de trong");
            return null;
        }
        if(txtsdt.getText().matches("[0]+[0-9]*") == false){
            JOptionPane.showMessageDialog(this, "sdt bat dau = so 0");
            return null;
        }else if(txtsdt.getText().length() != 10){
            JOptionPane.showMessageDialog(this, "sdt co 10 so");
            return null;
        }
        khmd.setMa(txtma.getText());
        khmd.setHo(txtho.getText());
        khmd.setTendem(txttendem.getText());
        khmd.setTen(txtten.getText());
        khmd.setDiachi(txtdiachi.getText());
        try {
            khmd.setNgaySinh(sdf.parse(txtngaysinh.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "sai dinh dang ngay sinh");
            return null;
        }
        khmd.setThanhpho(txtthanhpho.getText());
        khmd.setQuocgia(txtquocgia.getText());
        khmd.setMatkhau(String.valueOf(txtpassword.getPassword()));
        khmd.setSdt(txtsdt.getText());
        return khmd;
    }
    
    private static String rdn() {
        StringBuilder sb = new StringBuilder();
        String b = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            int index = (int) (b.length() * Math.random());
            sb.append(b.charAt(index));
        }
        return sb.toString();
    }
    
    private ArrayList<String> tachten(String fullname){
        ArrayList<String> list = new ArrayList<>();
        String ho = "", tendem ="",ten = "";
        int a = 0,b = 0;
        for(int i = 0;i < fullname.length();i++){
            if(fullname.substring(i, i+1).equals(" ")){
                a = i;
                ho = fullname.substring(0, i);
                break;
            }
        }
        
        for(int i = fullname.length();i > 0;i--){
            if(fullname.substring(i, i+1).equals(" ")){
                b = i;
                ten = fullname.substring(i-1, fullname.length()-1);
                break;
            }
        }
        tendem = fullname.substring(a -1, b -1);
        list.add(ho);
        list.add(tendem);
        list.add(ten);
        return list;
    }
    

    
    
    
    private ArrayList<String> tachdiachi(String address){
        ArrayList<String> list = new ArrayList<>();
        String diachi = "", thanhpho ="",quocgia = "";
        int a = 0,b = 0;
        for(int i = 0;i< address.length();i++){
            if(address.substring(i, i+1).equals(",")){
                a = i;
                diachi = address.substring(0, i);
                break;
            }
        }
        
        for(int i = address.length();i > 0;i--){
            if(address.substring(i, i+1).equals(",")){
                b = i;
                quocgia = address.substring(i, address.length());
                break;
            }
        }
        thanhpho = address.substring(a, b-1);
        list.add(diachi);
        list.add(thanhpho);
        list.add(quocgia);
        return list;
    }
    
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
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkhachhang;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtho;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtquocgia;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttendem;
    private javax.swing.JTextField txtthanhpho;
    // End of variables declaration//GEN-END:variables

}
