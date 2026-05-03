package com.mycompany.praktikum_gui;

/**
 *
 * @author Fikrah Fathoni Siregar
 * NIM: 2507411015
 */
public class UI_praktikum extends javax.swing.JFrame {
    
    String bil = "";
    double jumlah, bil1, bil2;
    int pilih;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UI_praktikum.class.getName());

    public UI_praktikum() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        input_field = new javax.swing.JTextField();
        backspace_btn = new javax.swing.JButton();
        seven_btn = new javax.swing.JButton();
        eight_btn = new javax.swing.JButton();
        nine_btn = new javax.swing.JButton();
        addition_btn = new javax.swing.JButton();
        four_btn = new javax.swing.JButton();
        five_btn = new javax.swing.JButton();
        six_btn = new javax.swing.JButton();
        subtraction_btn = new javax.swing.JButton();
        one_btn = new javax.swing.JButton();
        two_btn = new javax.swing.JButton();
        three_btn = new javax.swing.JButton();
        multiplication_btn = new javax.swing.JButton();
        zero_btn = new javax.swing.JButton();
        point_btn = new javax.swing.JButton();
        equals_btn = new javax.swing.JButton();
        division_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        persen_btn = new javax.swing.JButton();
        modulus_btn = new javax.swing.JButton();
        pangkat2_btn = new javax.swing.JButton();
        pangkat3_btn = new javax.swing.JButton();
        akarkuadrat_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input_field.setEditable(false);
        input_field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        input_field.setText("0");

        backspace_btn.setBackground(new java.awt.Color(0, 0, 0));
        backspace_btn.setForeground(new java.awt.Color(255, 255, 255));
        backspace_btn.setText("<");
        backspace_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backspace_btnMouseClicked(evt);
            }
        });

        seven_btn.setText("7");
        seven_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seven_btnMouseClicked(evt);
            }
        });

        eight_btn.setText("8");
        eight_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eight_btnMouseClicked(evt);
            }
        });

        nine_btn.setText("9");
        nine_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nine_btnMouseClicked(evt);
            }
        });

        addition_btn.setBackground(new java.awt.Color(0, 0, 0));
        addition_btn.setForeground(new java.awt.Color(255, 255, 255));
        addition_btn.setText("+");
        addition_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addition_btnMouseClicked(evt);
            }
        });

        four_btn.setText("4");
        four_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                four_btnMouseClicked(evt);
            }
        });

        five_btn.setText("5");
        five_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                five_btnMouseClicked(evt);
            }
        });

        six_btn.setText("6");
        six_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                six_btnMouseClicked(evt);
            }
        });

        subtraction_btn.setBackground(new java.awt.Color(0, 0, 0));
        subtraction_btn.setForeground(new java.awt.Color(255, 255, 255));
        subtraction_btn.setText("-");
        subtraction_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtraction_btnMouseClicked(evt);
            }
        });

        one_btn.setText("1");
        one_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                one_btnMouseClicked(evt);
            }
        });

        two_btn.setText("2");
        two_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                two_btnMouseClicked(evt);
            }
        });

        three_btn.setText("3");
        three_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                three_btnMouseClicked(evt);
            }
        });

        multiplication_btn.setBackground(new java.awt.Color(0, 0, 0));
        multiplication_btn.setForeground(new java.awt.Color(255, 255, 255));
        multiplication_btn.setText("x");
        multiplication_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplication_btnMouseClicked(evt);
            }
        });

        zero_btn.setText("0");
        zero_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zero_btnMouseClicked(evt);
            }
        });

        point_btn.setText(".");
        point_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                point_btnMouseClicked(evt);
            }
        });

        equals_btn.setBackground(new java.awt.Color(153, 153, 255));
        equals_btn.setForeground(new java.awt.Color(255, 255, 255));
        equals_btn.setText("=");
        equals_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equals_btnMouseClicked(evt);
            }
        });

        division_btn.setBackground(new java.awt.Color(0, 0, 0));
        division_btn.setForeground(new java.awt.Color(255, 255, 255));
        division_btn.setText("/");
        division_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                division_btnMouseClicked(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(255, 102, 102));
        clear_btn.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("C");
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
        });

        persen_btn.setBackground(new java.awt.Color(0, 0, 0));
        persen_btn.setForeground(new java.awt.Color(255, 255, 255));
        persen_btn.setText("%");
        persen_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                persen_btnMouseClicked(evt);
            }
        });

        modulus_btn.setBackground(new java.awt.Color(0, 0, 0));
        modulus_btn.setFont(new java.awt.Font("Liberation Sans", 1, 8)); // NOI18N
        modulus_btn.setForeground(new java.awt.Color(255, 255, 255));
        modulus_btn.setText("mod");
        modulus_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modulus_btnMouseClicked(evt);
            }
        });

        pangkat2_btn.setBackground(new java.awt.Color(0, 0, 0));
        pangkat2_btn.setForeground(new java.awt.Color(255, 255, 255));
        pangkat2_btn.setText("x^2");
        pangkat2_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pangkat2_btnMouseClicked(evt);
            }
        });

        pangkat3_btn.setBackground(new java.awt.Color(0, 0, 0));
        pangkat3_btn.setForeground(new java.awt.Color(255, 255, 255));
        pangkat3_btn.setText("x^3");
        pangkat3_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pangkat3_btnMouseClicked(evt);
            }
        });

        akarkuadrat_btn.setBackground(new java.awt.Color(0, 0, 0));
        akarkuadrat_btn.setForeground(new java.awt.Color(255, 255, 255));
        akarkuadrat_btn.setText("√");
        akarkuadrat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                akarkuadrat_btnMouseClicked(evt);
            }
        });

        jLabel1.setText("Simple Calculator by Fikrah");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_field, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backspace_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(zero_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(one_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(four_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(persen_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(point_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(five_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(two_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modulus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(six_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(three_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nine_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(equals_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(subtraction_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addition_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(multiplication_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(division_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pangkat2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pangkat3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(akarkuadrat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtraction_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplication_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(point_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(division_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pangkat2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pangkat3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(persen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modulus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akarkuadrat_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }

    private void backspace_btnMouseClicked(java.awt.event.MouseEvent evt) {
        String nilaiBaru;
        nilaiBaru = input_field.getText().substring(0, input_field.getText().length() - 1);
        bil = nilaiBaru;
        input_field.setText(nilaiBaru);
        if (input_field.getText().length() == 0) {
            input_field.setText("0");
            bil = "";
        }
    }

    private void seven_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "7";
        input_field.setText(bil);
    }

    private void eight_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "8";
        input_field.setText(bil);
    }

    private void nine_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "9";
        input_field.setText(bil);
    }

    private void four_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "4";
        input_field.setText(bil);
    }

    private void five_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "5";
        input_field.setText(bil);
    }

    private void six_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "6";
        input_field.setText(bil);
    }

    private void one_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "1";
        input_field.setText(bil);
    }

    private void two_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "2";
        input_field.setText(bil);
    }

    private void three_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil += "3";
        input_field.setText(bil);
    }

    private void addition_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(input_field.getText());
        bil = "";
        pilih = 1;
    }

    private void subtraction_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(input_field.getText());
        bil = "";
        pilih = 2;
    }

    private void multiplication_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(input_field.getText());
        bil = "";
        pilih = 3;
    }

    private void division_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(input_field.getText());
        bil = "";
        pilih = 4;
    }

    private void zero_btnMouseClicked(java.awt.event.MouseEvent evt) {
        if (!input_field.getText().equals("0")) {
            bil += "0";
            input_field.setText(bil);
        }
    }

    private void point_btnMouseClicked(java.awt.event.MouseEvent evt) {
        if (!input_field.getText().contains(".")) {
            bil += input_field.getText().equals("0") ? "0." : ".";
            input_field.setText(bil);
        }
    }

    private void equals_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil2 = Double.parseDouble(input_field.getText());
        double hasil = 0;
        
        switch (pilih) {
            case 1:
                hasil = bil1 + bil2;
                break;
            case 2:
                hasil = bil1 - bil2;
                break;
            case 3:
                hasil = bil1 * bil2;
                break;
            case 4:
                hasil = bil1 / bil2;
                break;
            case 5:
                hasil = bil1 % bil2;
                break;
        }
        
        bil = "";
        input_field.setText(String.valueOf(hasil));
    }

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {
        double hasil;
        bil = "";
        bil1 = 0.0;
        bil2 = 0.0;
        hasil = 0.0;
        input_field.setText("0");
    }

    private void persen_btnMouseClicked(java.awt.event.MouseEvent evt) {
        double nilai = Double.parseDouble(input_field.getText());
        double hasilPersen = nilai / 100;
        bil = ""; 
        input_field.setText(String.valueOf(hasilPersen));
    }

    private void modulus_btnMouseClicked(java.awt.event.MouseEvent evt) {
        bil1 = Double.parseDouble(input_field.getText());
        bil = "";
        pilih = 5;
    }

    private void pangkat2_btnMouseClicked(java.awt.event.MouseEvent evt) {
        double nilai = Double.parseDouble(input_field.getText());
        double hasilKuadrat = Math.pow(nilai, 2);
        bil = "";
        input_field.setText(String.valueOf(hasilKuadrat));
    }

    private void pangkat3_btnMouseClicked(java.awt.event.MouseEvent evt) {
        double nilai = Double.parseDouble(input_field.getText());
        double hasilKuadrat = Math.pow(nilai, 3);
        bil = "";
        input_field.setText(String.valueOf(hasilKuadrat));
    }

    private void akarkuadrat_btnMouseClicked(java.awt.event.MouseEvent evt) {
        double nilai = Double.parseDouble(input_field.getText());
        double hasilAkar = Math.sqrt(nilai);
        bil = "";
        input_field.setText(String.valueOf(hasilAkar));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable () { 
            public void run() {
                new UI_praktikum().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addition_btn;
    private javax.swing.JButton akarkuadrat_btn;
    private javax.swing.JButton backspace_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton division_btn;
    private javax.swing.JButton eight_btn;
    private javax.swing.JButton equals_btn;
    private javax.swing.JButton five_btn;
    private javax.swing.JButton four_btn;
    private javax.swing.JTextField input_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modulus_btn;
    private javax.swing.JButton multiplication_btn;
    private javax.swing.JButton nine_btn;
    private javax.swing.JButton one_btn;
    private javax.swing.JButton pangkat2_btn;
    private javax.swing.JButton pangkat3_btn;
    private javax.swing.JButton persen_btn;
    private javax.swing.JButton point_btn;
    private javax.swing.JButton seven_btn;
    private javax.swing.JButton six_btn;
    private javax.swing.JButton subtraction_btn;
    private javax.swing.JButton three_btn;
    private javax.swing.JButton two_btn;
    private javax.swing.JButton zero_btn;
}
