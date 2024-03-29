/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DLL.DLL_Login;
import DLL.DLL_Shift;
import Entity.ByUser;
import Entity.Login;
import Entity.Shift;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win 8 32bit VS7
 */
public class frmAccount extends javax.swing.JPanel {

    /**
     * Creates new form frmAccount
     */
    DLL_Login login = new DLL_Login();
    DLL_Shift shift = new DLL_Shift();
    ArrayList<Login> listCode = new ArrayList<>();
    ArrayList<Login> listFullname = new ArrayList<>();
    ArrayList<Login> listAccountAll = new ArrayList<>();
    ArrayList<Shift> listShift = new ArrayList<>();
    ArrayList<Shift> listShiftname = new ArrayList<>();
    ArrayList<Shift> listTime = new ArrayList<>();

    public frmAccount() {
        initComponents();
        showAccount();
        showCode();
        showShiftname();

    }

    public void showAccount() {
        listShift = login.showShift();
        Vector clums = new Vector();
        clums.add("Mã nhân viên");
        clums.add("Tên ca làm ");
        clums.add("Thời gian bắt đầu");
        clums.add("Thời gian kết thúc");

        Vector data = new Vector();
        for (Shift lg : listShift) {
            Vector row = new Vector();
            row.add(lg.getCode());
            row.add(lg.getShiftname());
            row.add(lg.getTimestart());
            row.add(lg.getTimestop());
            data.add(row);

            tblAccount.setModel(new DefaultTableModel(data, clums));
        }

    }

    public void showCode() {
        listCode = login.showCode();
        for (Login lg : listCode) {
            cbbCode.addItem(lg.getCode());
        }
    }

    public void showShiftname() {
        listShiftname = shift.showShiftname();
        for (Shift sf : listShiftname) {
            cbbCa.addItem(sf.getShiftname());
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

        jPanel6 = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbbCode = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbbCa = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStop = new javax.swing.JTextField();
        btnSerachaccount = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLaName = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-icon.png"))); // NOI18N
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setLayout(new java.awt.GridLayout(11, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lựa chọn mã nhân viên:");
        jPanel8.add(jLabel6);

        cbbCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbCodeMouseClicked(evt);
            }
        });
        cbbCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCodeActionPerformed(evt);
            }
        });
        jPanel8.add(cbbCode);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tên nhân viên:");
        jPanel8.add(jLabel7);

        txtFullname.setEditable(false);
        txtFullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(txtFullname);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lựa chọn Ca làm việc");
        jPanel8.add(jLabel8);

        cbbCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbCaMouseClicked(evt);
            }
        });
        cbbCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCaActionPerformed(evt);
            }
        });
        jPanel8.add(cbbCa);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Giờ bắt đầu:");
        jPanel8.add(jLabel9);

        txtStart.setEditable(false);
        txtStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(txtStart);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Giờ kết thúc:");
        jPanel8.add(jLabel10);

        txtStop.setEditable(false);
        txtStop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(txtStop);

        btnSerachaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconadd.png"))); // NOI18N
        btnSerachaccount.setText("Thêm mới");
        btnSerachaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerachaccountActionPerformed(evt);
            }
        });
        jPanel8.add(btnSerachaccount);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-emp.jpg"))); // NOI18N
        jPanel9.add(jLabel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLaName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLaName.setText("Bảng quản lí giờ làm ");
        jPanel5.add(jLaName);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        tblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAccount);

        jPanel7.add(jScrollPane1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("  Tìm kiếm", new javax.swing.ImageIcon(getClass().getResource("/Images/iconseacrh.png")), jPanel3); // NOI18N

        jPanel1.add(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRemove)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRemove)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        frmManagement.as.cancelEmp();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSerachaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerachaccountActionPerformed
        int code = Integer.parseInt((String) cbbCode.getSelectedItem());
        String codes = (String) cbbCode.getSelectedItem();
        String fullname = txtFullname.getText();
        String shiftname = (String) cbbCa.getSelectedItem();
        String timestart = txtStart.getText();
        String timestop = txtStop.getText();
        boolean check = true;
        if (timestart.equals("")) {
            check = false;
            JOptionPane.showMessageDialog(this, "Chưa đủ dữ liệu để thêm !");
        } else if (timestop.equals("")) {
            check = false;
            JOptionPane.showMessageDialog(this, "Chưa đủ dữ liệu để thêm !");
        }
        if (shift.getCode(codes, shiftname)) {
            JOptionPane.showMessageDialog(this, "Đã tồn tại nhân viên " + fullname + " ở " + shiftname);
        } else if (check) {
            if (login.insertShift(code, shiftname, timestart, timestop)) {
                JOptionPane.showMessageDialog(this, fullname + " được thêm thành công vào " + shiftname);
                showAccount();
            } else {
                JOptionPane.showMessageDialog(this, "Có lỗi trong quá trình thực hiện !");
            }
        }

    }//GEN-LAST:event_btnSerachaccountActionPerformed

    private void tblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountMouseClicked
        int a = tblAccount.getSelectedRow();
        String userName = (String) tblAccount.getValueAt(a, 0);
        String shiftname = (String) tblAccount.getValueAt(a, 1);
        cbbCode.setSelectedItem(userName);
        cbbCa.setSelectedItem(shiftname);

    }//GEN-LAST:event_tblAccountMouseClicked

    private void cbbCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbCodeMouseClicked
        int code = Integer.parseInt((String) cbbCode.getSelectedItem());
        listFullname = login.showFull(code);
        for (Login lg : listFullname) {
            txtFullname.setText(lg.getFullname());
        }
    }//GEN-LAST:event_cbbCodeMouseClicked

    private void cbbCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCodeActionPerformed
        int code = Integer.parseInt((String) cbbCode.getSelectedItem());
        listFullname = login.showFull(code);
        for (Login lg : listFullname) {
            txtFullname.setText(lg.getFullname());
        }
    }//GEN-LAST:event_cbbCodeActionPerformed

    private void cbbCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbCaMouseClicked
        String shifname = (String) cbbCa.getSelectedItem();
        listTime = login.showtime(shifname);
        for (Shift tf : listTime) {
            txtStart.setText(tf.getTimestart());
            txtStop.setText(tf.getTimestop());
        }

    }//GEN-LAST:event_cbbCaMouseClicked

    private void cbbCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCaActionPerformed
        String shifname = (String) cbbCa.getSelectedItem();
        listTime = login.showtime(shifname);
        for (Shift tf : listTime) {
            txtStart.setText(tf.getTimestart());
            txtStop.setText(tf.getTimestop());
        }
    }//GEN-LAST:event_cbbCaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSerachaccount;
    private javax.swing.JComboBox<String> cbbCa;
    private javax.swing.JComboBox<String> cbbCode;
    private javax.swing.JLabel jLaName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtStart;
    private javax.swing.JTextField txtStop;
    // End of variables declaration//GEN-END:variables

}
