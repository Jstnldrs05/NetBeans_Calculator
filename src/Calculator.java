/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justine
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    
    //for variables
    double plusminus;
    double firstDouble;
    double secondDouble;
    double totalDouble;
    
    //to click button
    int add_bttnClick;
    int sub_bttnClick;
    int multi_bttnClick;
    int dec_bttnClick;
    int div_bttnClick;
    
    public Calculator() {
        initComponents();
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
        display = new javax.swing.JTextField();
        one_bttn = new javax.swing.JButton();
        four_bttn = new javax.swing.JButton();
        seven_bttn = new javax.swing.JButton();
        zero_bttn = new javax.swing.JButton();
        clr_bttn = new javax.swing.JButton();
        eight_bttn = new javax.swing.JButton();
        five_bttn = new javax.swing.JButton();
        two_bttn = new javax.swing.JButton();
        dec_bttn = new javax.swing.JButton();
        nine_bttn = new javax.swing.JButton();
        six_bttn = new javax.swing.JButton();
        three_bttn = new javax.swing.JButton();
        div_bttn = new javax.swing.JButton();
        multi_bttn = new javax.swing.JButton();
        sub_bttn = new javax.swing.JButton();
        add_bttn = new javax.swing.JButton();
        equals_bttn = new javax.swing.JButton();
        pos_neg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        display.setEditable(false);
        display.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        one_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        one_bttn.setText("1");
        one_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_bttnActionPerformed(evt);
            }
        });

        four_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        four_bttn.setText("4");
        four_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_bttnActionPerformed(evt);
            }
        });

        seven_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        seven_bttn.setText("7");
        seven_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_bttnActionPerformed(evt);
            }
        });

        zero_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        zero_bttn.setText("0");
        zero_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_bttnActionPerformed(evt);
            }
        });

        clr_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clr_bttn.setText("C");
        clr_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_bttnActionPerformed(evt);
            }
        });

        eight_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        eight_bttn.setText("8");
        eight_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_bttnActionPerformed(evt);
            }
        });

        five_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        five_bttn.setText("5");
        five_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_bttnActionPerformed(evt);
            }
        });

        two_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        two_bttn.setText("2");
        two_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_bttnActionPerformed(evt);
            }
        });

        dec_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        dec_bttn.setText(".");
        dec_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dec_bttnActionPerformed(evt);
            }
        });

        nine_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nine_bttn.setText("9");
        nine_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_bttnActionPerformed(evt);
            }
        });

        six_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        six_bttn.setText("6");
        six_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_bttnActionPerformed(evt);
            }
        });

        three_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        three_bttn.setText("3");
        three_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_bttnActionPerformed(evt);
            }
        });

        div_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        div_bttn.setText("/");
        div_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_bttnActionPerformed(evt);
            }
        });

        multi_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        multi_bttn.setText("x");
        multi_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_bttnActionPerformed(evt);
            }
        });

        sub_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sub_bttn.setText("-");
        sub_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_bttnActionPerformed(evt);
            }
        });

        add_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        add_bttn.setText("+");
        add_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bttnActionPerformed(evt);
            }
        });

        equals_bttn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        equals_bttn.setText("=");
        equals_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equals_bttnActionPerformed(evt);
            }
        });

        pos_neg.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pos_neg.setText("+/-");
        pos_neg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_negActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(display)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(one_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(four_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seven_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(five_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(two_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eight_bttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nine_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(three_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(six_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(multi_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(sub_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zero_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clr_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dec_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(div_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pos_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(equals_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(four_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seven_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eight_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sub_bttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five_bttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(six_bttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(multi_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zero_bttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clr_bttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dec_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(div_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pos_neg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(equals_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Created by Justine B. Ladores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+one_bttn.getText());
    }//GEN-LAST:event_one_bttnActionPerformed

    private void four_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+four_bttn.getText());
    }//GEN-LAST:event_four_bttnActionPerformed

    private void seven_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+seven_bttn.getText());
    }//GEN-LAST:event_seven_bttnActionPerformed

    private void zero_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+zero_bttn.getText());
    }//GEN-LAST:event_zero_bttnActionPerformed

    private void clr_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_bttnActionPerformed
        //clear screen
        display.setText("");
        dec_bttnClick=0;
    }//GEN-LAST:event_clr_bttnActionPerformed

    private void eight_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+eight_bttn.getText());
    }//GEN-LAST:event_eight_bttnActionPerformed

    private void five_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+five_bttn.getText());
    }//GEN-LAST:event_five_bttnActionPerformed

    private void two_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_bttnActionPerformed
       // pressing  the button:
        display.setText(display.getText()+two_bttn.getText());      
    }//GEN-LAST:event_two_bttnActionPerformed

    private void dec_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dec_bttnActionPerformed
        // pressing  the button:
        if(dec_bttnClick==0)
        {
        display.setText(display.getText()+dec_bttn.getText());
        dec_bttnClick=1;
        }
    }//GEN-LAST:event_dec_bttnActionPerformed

    private void nine_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+nine_bttn.getText());
    }//GEN-LAST:event_nine_bttnActionPerformed

    private void six_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+six_bttn.getText());
    }//GEN-LAST:event_six_bttnActionPerformed

    private void three_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_bttnActionPerformed
        // pressing  the button:
        display.setText(display.getText()+three_bttn.getText());
    }//GEN-LAST:event_three_bttnActionPerformed

    private void div_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_bttnActionPerformed
        // pressing  the button:
        firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        div_bttnClick=1;
        dec_bttnClick=0;
    }//GEN-LAST:event_div_bttnActionPerformed

    private void multi_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_bttnActionPerformed
        // pressing  the button:
        firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        multi_bttnClick=1;
        dec_bttnClick=0;
    }//GEN-LAST:event_multi_bttnActionPerformed

    private void sub_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_bttnActionPerformed
        /// pressing  the button:
        firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        sub_bttnClick=1;
        dec_bttnClick=0;
    }//GEN-LAST:event_sub_bttnActionPerformed

    private void add_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bttnActionPerformed
        // pressing  the button:
        firstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        add_bttnClick=1;
        dec_bttnClick=0;
    }//GEN-LAST:event_add_bttnActionPerformed

    private void equals_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equals_bttnActionPerformed
        // pressing  the button:
        secondDouble=(Double.parseDouble(String.valueOf(display.getText())));
         if(add_bttnClick>0)
         {
             totalDouble=firstDouble+secondDouble;
             display.setText((String.valueOf(totalDouble)));
             firstDouble=0;
             secondDouble=0;
             add_bttnClick=0;
         }
         
         if(sub_bttnClick>0)
         
         {
             totalDouble=firstDouble-secondDouble;
             display.setText(String.valueOf(totalDouble));
             firstDouble=0;
             secondDouble=0;
             sub_bttnClick=0;
         }
         
         if(multi_bttnClick>0)
         
         {
             totalDouble=firstDouble*secondDouble;
             display.setText(String.valueOf(totalDouble));
             firstDouble=0;
             secondDouble=0;
             multi_bttnClick=0;
         }
         if(div_bttnClick>0)
         {
             totalDouble=firstDouble/secondDouble;
             display.setText(String.valueOf(totalDouble));
             firstDouble=0;
             secondDouble=0;
             div_bttnClick=0;
         }
         
    }//GEN-LAST:event_equals_bttnActionPerformed

    private void pos_negActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_negActionPerformed
        plusminus=(Double.parseDouble(String.valueOf(display.getText())));
        plusminus=plusminus*(-1);
        display.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_pos_negActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bttn;
    private javax.swing.JButton clr_bttn;
    private javax.swing.JButton dec_bttn;
    private javax.swing.JTextField display;
    private javax.swing.JButton div_bttn;
    private javax.swing.JButton eight_bttn;
    private javax.swing.JButton equals_bttn;
    private javax.swing.JButton five_bttn;
    private javax.swing.JButton four_bttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multi_bttn;
    private javax.swing.JButton nine_bttn;
    private javax.swing.JButton one_bttn;
    private javax.swing.JButton pos_neg;
    private javax.swing.JButton seven_bttn;
    private javax.swing.JButton six_bttn;
    private javax.swing.JButton sub_bttn;
    private javax.swing.JButton three_bttn;
    private javax.swing.JButton two_bttn;
    private javax.swing.JButton zero_bttn;
    // End of variables declaration//GEN-END:variables
}
