/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hikigaya
 */
public class balikbuku extends javax.swing.JFrame {
String kembali;
String pulang;
    /**
     * Creates new form balikbuku
     */
    public balikbuku() {
        initComponents();
        tampil();
        kosong();
    }
private void kosong(){
    txttelat.setEditable(true);
    txtdenda.setEditable(true);
    txtbayar.setEditable(true);
    txtkembalian.setEditable(true);
    tglkembali.setDate(null);
    tglkembali.setEnabled(false);  
    
    txtid.setText("ID Peminjaman");
    txtpinjam.setText("Tanggal Peminjaman");
    txtblk.setText("Tanggal Balik");
    txttelat.setText("Keterlambatan");
    txtdenda.setText("Denda");
    txtbayar.setText("Bayar");
    txtkembalian.setText("Kembali"); 
    txtkembalian.setEditable(false);
       txtid.setEditable(false);
       txtpinjam.setEditable(false);
       txtblk.setEditable(false);
       txttelat.setEditable(false);
       txtdenda.setEditable(false);
    tglkembali.setEnabled(false);
    btnhitung.setEnabled(false);
  btnbatal.setEnabled(false);
  btnproses.setEnabled(false);
  
       
}    
private void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Npm");
        model.addColumn("Nama");
        model.addColumn("Id_buku");
        model.addColumn("judul");
        model.addColumn("Jumlah");
        model.addColumn("Tgl Pinjam");
        model.addColumn("Tgl Kembali");
        model.addColumn("Denda");
        model.addColumn("Status");
        try{
            String status = "Belum Kembali";
            String query = "select*from pinjaman where status = '"+status+"'";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);
            
            while(data.next()){
                model.addRow(new Object [] {data.getString(1),data.getString(2),
                data.getString(3),data.getString(4),data.getString(5),data.getString(6),
                data.getString(7),data.getString(8),data.getString(9),data.getString(10)});
            }
            tblpinjam.setModel(model);
        }
        catch(Exception b){
            
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

        txtsrc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpinjam = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtpinjam = new javax.swing.JTextField();
        txtblk = new javax.swing.JTextField();
        tglkembali = new com.toedter.calendar.JDateChooser();
        txttelat = new javax.swing.JTextField();
        txtdenda = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        btnproses = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtsrc.setText("Search NPM");
        txtsrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsrcMouseClicked(evt);
            }
        });
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        txtsrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsrcKeyReleased(evt);
            }
        });

        tblpinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblpinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpinjam);

        tglkembali.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglkembaliPropertyChange(evt);
            }
        });
        tglkembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tglkembaliKeyPressed(evt);
            }
        });

        txtdenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdendaActionPerformed(evt);
            }
        });

        txtbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbayarMouseClicked(evt);
            }
        });
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        txtbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbayarKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbayarKeyPressed(evt);
            }
        });

        txtkembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtkembalianMouseClicked(evt);
            }
        });

        btnhitung.setText("Hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        btnproses.setText("Proses");
        btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprosesActionPerformed(evt);
            }
        });

        btnbatal.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(575, Short.MAX_VALUE)
                .addComponent(btnbatal)
                .addGap(145, 145, 145))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(650, 650, 650)
                            .addComponent(txtsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txttelat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(btnproses, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtblk, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(btnhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(btnbatal)
                .addGap(125, 125, 125))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttelat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnproses)))
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(txtblk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txtdenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(7, 7, 7)
                    .addComponent(btnhitung)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsrcMouseClicked
        txtsrc.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcMouseClicked

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    private void txtsrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsrcKeyReleased
        if(txtsrc.getText().equals("")){
            tampil();
        }
        else{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Npm");
            model.addColumn("Nama");
            model.addColumn("Id_buku");
            model.addColumn("judul");
            model.addColumn("Jumlah");
            model.addColumn("Tgl Pinjam");
            model.addColumn("Tgl Kembali");
            model.addColumn("Denda");
            model.addColumn("Status");
            try{
                String status="Belum Kembali";
                String query = "select * from pinjaman where npm = '"+txtsrc.getText()+"'"
                + "&& status = '"+status+"'";
                java.sql.Connection kon = (Connection) koneksi.koneksi();
                java.sql.Statement stm = kon.createStatement();
                java.sql.ResultSet data = stm.executeQuery(query);

                while(data.next()){
                    model.addRow(new Object [] {data.getString(1),data.getString(2),
                        data.getString(3),data.getString(4),data.getString(5),data.getString(6),
                        data.getString(7),data.getString(8),data.getString(9),data.getString(10)});
            }
            tblpinjam.setModel(model);
        }
        catch(Exception b){

        }
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtsrcKeyReleased

    private void tblpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpinjamMouseClicked
        btnbatal.setEnabled(true);
        tglkembali.setEnabled(true);
        txtbayar.setEditable(true);
        try{

            int baris = tblpinjam.getSelectedRow();
            String id= tblpinjam.getValueAt(baris, 0).toString();

            String query = "select*from pinjaman where id_pinjam = '"+id+"'";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);

            while(data.next()){

                txtid.setText(data.getString(1));
                txtpinjam.setText(data.getString(7));
                txtblk.setText(data.getString(8));
                kembali = data.getString(8);
            }

        }
        catch(Exception b){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblpinjamMouseClicked

    private void tglkembaliPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglkembaliPropertyChange
        if (tglkembali.getDate() != null) {
            SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
            pulang = FormatTanggal.format(tglkembali.getDate());
        }
        try {
            DateFormat format = new SimpleDateFormat("dd MMMM yyyy");
            Date tanggalpinjam = format.parse(kembali);
            Date tanggalkembali = format.parse(pulang);
            long tanggalpinjam1 = tanggalpinjam.getTime();
            long tanggalkembali1 = tanggalkembali.getTime();
            long diff = tanggalkembali1 - tanggalpinjam1;
            long lama = diff / (24 * 60 * 60 * 1000);
            txttelat.setText(Long.toString(lama) + "");

            int denda;
            int telat = Integer.parseInt(txttelat.getText());
            denda = telat*1000;
            String tlt;
            tlt = String.valueOf(denda);
            if(telat<0){
                txttelat.setText("Keterlambatan");
                txtdenda.setText("Denda");
                txtbayar.setText("Bayar");
                txtkembalian.setText("Kembali");
                btnhitung.setEnabled(false);
                btnproses.setEnabled(false);
                btnbatal.setEnabled(true);
            }
            else if(tlt.equals("0")){
                txtbayar.setText("0");
                txtdenda.setText("0");
                txtkembalian.setText("0");
                txtbayar.setEditable(false);
                btnhitung.setEnabled(false);
                btnproses.setEnabled(true);
                btnbatal.setEnabled(true);
            }
            else{
                txtbayar.setEditable(true);
                txtbayar.setText("Bayar");
                txtkembalian.setText("Kembali");
                btnhitung.setEnabled(true);
                btnproses.setEnabled(true);
                btnbatal.setEnabled(true);
                txtdenda.setText(tlt);
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_tglkembaliPropertyChange

    private void tglkembaliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tglkembaliKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglkembaliKeyPressed

    private void txtdendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdendaActionPerformed

    private void txtbayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbayarMouseClicked
        txtbayar.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarMouseClicked

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtbayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyTyped
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))
        )
        )
        {
            evt.consume();
        }            // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarKeyTyped

    private void txtbayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbayarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarKeyPressed

    private void txtkembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtkembalianMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txtkembalianMouseClicked

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        int bayar = Integer.parseInt(txtbayar.getText());
        int denda = Integer.parseInt(txtdenda.getText());

        if(bayar<denda){
            JOptionPane.showMessageDialog(null,"Tidak Boleh Kurang!");
        }
        else{
            int total = bayar-denda;
            String ttl;
            ttl = String.valueOf(total);
            txtkembalian.setText(ttl);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
        try {
            String status = "Sudah Kembali";
            String sql ="UPDATE pinjaman SET denda = '"+txtdenda.getText()
            +"',status = '"+status
            +"' WHERE id_pinjam = '"+txtid.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan data Gagal"+e.getMessage());
        }
        try{

            String id= txtid.getText();

            String query = "select id_buku from pinjaman where id_pinjam = '"+id+"'";
            java.sql.Connection kon = (Connection) koneksi.koneksi();
            java.sql.Statement stm = kon.createStatement();
            java.sql.ResultSet data = stm.executeQuery(query);

            while(data.next()){
                String aidi = data.getString("id_buku");
                try{
                    String query1 = "select*from buku where id_buku = '"+aidi+"'";
                    java.sql.Connection kon1 = (Connection) koneksi.koneksi();
                    java.sql.Statement st = kon1.createStatement();
                    java.sql.ResultSet data1 = st.executeQuery(query1);

                    while(data1.next()){
                        int baris = tblpinjam.getSelectedRow();
                        String jmlh= tblpinjam.getValueAt(baris, 5).toString();
                        int jumlah= Integer.parseInt(data1.getString(7));
                        int jumlahpinjam = Integer.parseInt(jmlh);
                        int total = jumlah+jumlahpinjam;
                        try {
                            String sql1 ="UPDATE buku SET stok = '"+total
                            +"' WHERE id_buku = '"+aidi+"'";
                            java.sql.Connection conn1=(Connection)koneksi.koneksi();
                            java.sql.PreparedStatement pst=conn1.prepareStatement(sql1);
                            pst.execute();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
                        }

                    }
                }
                catch(Exception b){
                    JOptionPane.showMessageDialog(null, b.getMessage());
                }
            }

        }
        catch(Exception b){

        }
        tampil();
        kosong();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprosesActionPerformed

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
            java.util.logging.Logger.getLogger(balikbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(balikbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(balikbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(balikbuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new balikbuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnproses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpinjam;
    private com.toedter.calendar.JDateChooser tglkembali;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtblk;
    private javax.swing.JTextField txtdenda;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtpinjam;
    private javax.swing.JTextField txtsrc;
    private javax.swing.JTextField txttelat;
    // End of variables declaration//GEN-END:variables
}
