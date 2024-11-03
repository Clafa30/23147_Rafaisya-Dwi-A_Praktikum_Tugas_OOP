/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas9;

import java.util.ArrayList;

/**
 *
 * @author rafai
 */
public class ManagementMahasiswa extends javax.swing.JFrame {
    private final ArrayList<ManagementMahasiswa> mahasiswaList = new ArrayList<>();

    private String nim;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private double nilaiAkhir;
    
    public ManagementMahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nama = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        Mk = new javax.swing.JTextField();
        Nilai1 = new javax.swing.JTextField();
        Nilai2 = new javax.swing.JTextField();
        Nilai3 = new javax.swing.JTextField();
        Nilai4 = new javax.swing.JTextField();
        Nilai5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        Simpan = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Nim = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Nilai6 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 104, 221, -1));
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 159, 221, -1));
        getContentPane().add(Mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 213, 221, -1));
        getContentPane().add(Nilai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 48, 190, -1));
        getContentPane().add(Nilai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 104, 190, -1));
        getContentPane().add(Nilai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 159, 190, -1));
        getContentPane().add(Nilai4, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 213, 190, -1));
        getContentPane().add(Nilai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 266, 190, -1));

        Tabel.setAutoCreateRowSorter(true);
        Tabel.setBackground(new java.awt.Color(204, 204, 204));
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "NAMA", "ALAMAT", "MATA KULIAH", "NILAI AKHIR"
            }
        ));
        jScrollPane1.setViewportView(Tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1010, 253));

        Simpan.setText("SIMPAN");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel1.setText("NILAI Absen [10%]");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 51, -1, -1));

        jLabel2.setText("NILAI Tugas [15%]");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 107, -1, -1));

        jLabel3.setText("NILAI UTS [25%]");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 162, -1, -1));

        jLabel4.setText("NILAI Quiz [15%]");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 216, -1, -1));

        jLabel5.setText("NILAI UAS [35%]");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 269, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NILAI AKHIR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 317, -1, -1));

        jLabel7.setText("NIM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 51, -1, -1));

        jLabel8.setText("NAMA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 107, -1, -1));

        jLabel9.setText("ALAMAT");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 162, -1, -1));

        jLabel10.setText("MATA KULIAH");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 216, -1, -1));
        getContentPane().add(Nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 48, 221, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 360, 220));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 460, 260));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        Nilai6.setBackground(new java.awt.Color(153, 153, 153));
        Nilai6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(Nilai6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Nilai6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 460, 30));

        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public ManagementMahasiswa(String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
     
    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        try {
            // Validasi input agar tidak ada field kosong
            if (Nim.getText().isEmpty() || Nama.getText().isEmpty() || Alamat.getText().isEmpty() || Mk.getText().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Semua field harus diisi.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {// validasi jika nim bukan angka
                Long.parseLong(Nim.getText());
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "NIM harus berupa angka.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Validasi nilai harus angka dan tidak kosong
            if (Nilai1.getText().isEmpty() || Nilai2.getText().isEmpty() || Nilai3.getText().isEmpty() || Nilai4.getText().isEmpty() || Nilai5.getText().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Semua nilai harus diisi.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            double nilai1 = Double.parseDouble(Nilai1.getText());
            double nilai2 = Double.parseDouble(Nilai2.getText());
            double nilai3 = Double.parseDouble(Nilai3.getText());
            double nilai4 = Double.parseDouble(Nilai4.getText());
            double nilai5 = Double.parseDouble(Nilai5.getText());

            // Validasi nilai harus dalam rentang 0 - 100
            if (!isValidNilai(nilai1) || !isValidNilai(nilai2) || !isValidNilai(nilai3) || !isValidNilai(nilai4) || !isValidNilai(nilai5)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nilai harus berada dalam rentang 0 - 100.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            nim = Nim.getText();
            nama = Nama.getText();
            alamat = Alamat.getText();
            mataKuliah = Mk.getText();

            nilaiAkhir = (nilai1 * 0.10) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
            String nilaiAkhirFormatted = String.format("%.2f", nilaiAkhir); // format agar nilai akhir nilainya 2 angka dibelakang koma
            
            ManagementMahasiswa mhs = new ManagementMahasiswa(nim, nama, alamat, mataKuliah, nilaiAkhir);
            mahasiswaList.add(mhs);

            // Untuk menambahkan data ke dalam tabel
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Tabel.getModel();
            model.addRow(new Object[]{nim, nama, alamat, mataKuliah, nilaiAkhirFormatted});

            // Method clear input field setelah simpan
            clearInputFields();

        } catch (NumberFormatException e) {
            // pesan kesalahan jika field nilai mengandung huruf atau karakter non-numerik
            javax.swing.JOptionPane.showMessageDialog(this, "Tidak Bisa Input Huruf Pada Field Nilai", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
        // Method untuk validasi range nilai
        private boolean isValidNilai(double nilai) {
            return nilai >= 0 && nilai <= 100;
    }//GEN-LAST:event_SimpanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        int selectedRow = Tabel.getSelectedRow();
    
        // Untuk mengecek apakah ada baris yang dipilih
        if (selectedRow != -1) {
            // Jika ada, akan menghapus baris yang dipilih
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) Tabel.getModel();
            model.removeRow(selectedRow);
            
            mahasiswaList.remove(selectedRow);// Sekaligus menghapus nilai dalam array list
        } else {
            // Jika tidak ada, akan menampilkan pesan berikut ini
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih Barisan Yang Ingin Dihapus!");
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void clearInputFields() {
        Nim.setText("");
        Nama.setText("");
        Alamat.setText("");
        Mk.setText("");
        Nilai1.setText("");
        Nilai2.setText("");
        Nilai3.setText("");
        Nilai4.setText("");
        Nilai5.setText("");
        Nilai6.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Mk;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai1;
    private javax.swing.JTextField Nilai2;
    private javax.swing.JTextField Nilai3;
    private javax.swing.JTextField Nilai4;
    private javax.swing.JTextField Nilai5;
    private javax.swing.JLabel Nilai6;
    private javax.swing.JTextField Nim;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
