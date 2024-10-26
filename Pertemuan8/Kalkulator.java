package Pertemuan8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author rafai
 */
public class Kalkulator extends javax.swing.JFrame {

    static void run() {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
    }

    private double angkaPertama = 0;
    private double angkaKedua = 0;
    private String operator = "";
    private boolean isOperatorPressed = false;
    
    public Kalkulator() {
        initComponents();
        tambahActionListener();
    }
   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        InputField = new javax.swing.JTextField();
        angka1 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        Titik = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        SamaDengan = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Modulus = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Pangkat = new javax.swing.JButton();
        Backspace = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(153, 255, 153));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("KALKULATOR");

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        InputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFieldActionPerformed(evt);
            }
        });

        angka1.setText("1");

        angka4.setText("4");

        angka7.setText("7");

        Titik.setText(".");

        angka2.setText("2");

        angka5.setText("5");

        angka8.setText("8");

        angka0.setText("0");

        angka3.setText("3");

        angka6.setText("6");

        angka9.setText("9");

        Clear.setText("C");

        Tambah.setText("+");

        Bagi.setText("/");

        SamaDengan.setText("=");

        Kurang.setText("-");

        Modulus.setText("%");

        Kali.setText("*");

        LogOut.setText("LOG OUT");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        Pangkat.setText("^");
        Pangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PangkatActionPerformed(evt);
            }
        });

        Backspace.setBackground(new java.awt.Color(255, 0, 51));
        Backspace.setForeground(new java.awt.Color(255, 255, 255));
        Backspace.setText("<-- Backspace");
        Backspace.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 0), 3, true));
        Backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titik, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(angka5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(angka8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(angka0, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(angka2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Kali, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31))
                                    .addComponent(Bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(210, 210, 210))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kali, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pangkat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Titik, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(385, 385, 385))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionListener() {
        // Tambah event untuk tombol angka
        angka1.addActionListener(new AngkaActionListener("1"));
        angka2.addActionListener(new AngkaActionListener("2"));
        angka3.addActionListener(new AngkaActionListener("3"));
        angka4.addActionListener(new AngkaActionListener("4"));
        angka5.addActionListener(new AngkaActionListener("5"));
        angka6.addActionListener(new AngkaActionListener("6"));
        angka7.addActionListener(new AngkaActionListener("7"));
        angka8.addActionListener(new AngkaActionListener("8"));
        angka9.addActionListener(new AngkaActionListener("9"));
        angka0.addActionListener(new AngkaActionListener("0"));
        Titik.addActionListener(new AngkaActionListener("."));
        
        // Tambah event untuk operator
        Tambah.addActionListener(new OperatorActionListener("+"));
        Kurang.addActionListener(new OperatorActionListener("-"));
        Kali.addActionListener(new OperatorActionListener("*"));
        Pangkat.addActionListener(new OperatorActionListener("^"));
        Bagi.addActionListener(new OperatorActionListener("/"));
        Modulus.addActionListener(new OperatorActionListener("%"));
        
        // Tombol "=" untuk kalkulasi
        SamaDengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (InputField.getText().isEmpty()) {
                    return; // Jika tidak ada input, exit
                }

                String[] parts = InputField.getText().trim().split(" ");
                if (parts.length < 3) {
                    return; // Jika tidak ada input, exit
                }

                try {
                    angkaKedua = Double.parseDouble(parts[2]); 
                } catch (NumberFormatException e) {
                    InputField.setText("Error");
                    return;
                }

                double hasil = 0;

                switch (operator) {
                    case "+":
                        hasil = angkaPertama + angkaKedua;
                        break;
                    case "-":
                        hasil = angkaPertama - angkaKedua;
                        break;
                    case "*":
                        hasil = angkaPertama * angkaKedua;
                        break;
                    case "^":
                        hasil = Math.pow(angkaPertama, angkaKedua);
                        break;
                    case "/":
                        if (angkaKedua != 0) {
                            hasil = angkaPertama / angkaKedua;
                        } else {
                            InputField.setText("Error");
                            return;
                        }
                        break;
                    case "%":
                        hasil = angkaPertama % angkaKedua;
                        break;
                    default:
                        return;
                }

                InputField.setText(String.valueOf(hasil)); // Menampilkan hasil
                angkaPertama = hasil; 
                angkaKedua = 0;
                operator = "";
                isOperatorPressed = false;
            }
        });

        // "C" button for clear
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                InputField.setText("");
                angkaPertama = 0;
                angkaKedua = 0;
                operator = "";
                isOperatorPressed = false;
            }
        });

        // Backspace button untuk menghapus karakter didalm input field
        Backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String currentText = InputField.getText(); 
                if (!currentText.isEmpty()) {
                    currentText = currentText.substring(0, currentText.length() - 1);
                    InputField.setText(currentText);
                }
            }
        });
    }
    
    private class AngkaActionListener implements ActionListener {
        private final String angka;
        
        public AngkaActionListener(String angka) {
            this.angka = angka;
        }
        
        @Override
        public void actionPerformed(ActionEvent evt) {
            InputField.setText(InputField.getText() + angka);
            isOperatorPressed = false;
        }
    }
    
    private class OperatorActionListener implements ActionListener {
        private final String op;

        public OperatorActionListener(String op) {
            this.op = op;
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
            if (!isOperatorPressed) {
                try {
                    angkaPertama = Double.parseDouble(InputField.getText());
                    operator = op;

                    // Menampilkan karakter didalam input field
                    InputField.setText(InputField.getText() + " " + operator + " ");
                    isOperatorPressed = true;
                } catch (NumberFormatException e) {
                    InputField.setText("Error");
                }
            }
        }
    }

    private void InputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputFieldActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void PangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PangkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PangkatActionPerformed

    private void BackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackspaceActionPerformed
        String currentText = InputField.getText(); // Untuk mendapatkan karakter dari input field
        if (!currentText.isEmpty()) {
            // MEnghapus karekter terakhir dari input field
            currentText = currentText.substring(0, currentText.length() - 1);
            InputField.setText(currentText);
        }
    }//GEN-LAST:event_BackspaceActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backspace;
    private javax.swing.JButton Bagi;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField InputField;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Modulus;
    private javax.swing.JButton Pangkat;
    private javax.swing.JButton SamaDengan;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton Titik;
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
