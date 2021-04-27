package lab6;

import javax.swing.ImageIcon;

public class jFrame1 extends javax.swing.JFrame {

    public jFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(15, 32767));
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFrame5 = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFrame2.setTitle("Юность");
        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame2.setMinimumSize(new java.awt.Dimension(450, 397));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jButton5.setText("Назад");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton5);
        jButton5.setBounds(40, 310, 135, 23);

        jButton6.setText("Вперед");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton6);
        jButton6.setBounds(260, 310, 135, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Любимая настояльная игра:");
        jLabel4.setToolTipText("");
        jFrame2.getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 230, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6/s4.png")));
        jFrame2.getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 80, 260, 170);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Монополия", "Шашки", "Шахматы", "Игра-ходилка", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 50, 140, 20);
        jFrame2.getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 260, 300, 30);

        jFrame2.setLocationRelativeTo(null);

        jFrame3.setTitle("Детство");
        jFrame3.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame3.setMinimumSize(new java.awt.Dimension(484, 348));
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton3.setText("Назад");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton3);
        jButton3.setBounds(70, 260, 135, 23);

        jButton4.setText("Вперед");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton4);
        jButton4.setBounds(280, 260, 135, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Да, Вы идёте обычно с удовольствием.");
        jRadioButton1.setActionCommand("0");
        jRadioButton1.setBorder(null);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(14, 74, 260, 15);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Школа Вас в общем-то устраивает.");
        jRadioButton2.setActionCommand("1");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(10, 100, 250, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Вы идёте без особой охоты.");
        jRadioButton3.setActionCommand("2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(10, 130, 200, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Люблю ходить только из за друзей.");
        jRadioButton4.setActionCommand("3");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(10, 160, 230, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Вам доставляет удовольствие ходить в школу?");
        jFrame3.getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 380, 17);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(filler1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Выбрано: Да");
        jToolBar1.add(jLabel6);

        jFrame3.getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 220, 400, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6/r1.png")));
        jLabel9.setToolTipText("");
        jFrame3.getContentPane().add(jLabel9);
        jLabel9.setBounds(260, 60, 190, 150);

        jFrame3.setLocationRelativeTo(null);

        jFrame4.setTitle("Отрочество");
        jFrame4.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame4.setMinimumSize(new java.awt.Dimension(553, 347));
        jFrame4.setResizable(false);
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosing(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jButton7.setText("Назад");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton7);
        jButton7.setBounds(90, 270, 135, 23);

        jButton8.setText("Вперед");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton8);
        jButton8.setBounds(330, 270, 135, 23);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Танцы");
        jCheckBox1.setActionCommand("4");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(10, 70, 130, 23);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("Рисование");
        jCheckBox2.setActionCommand("5");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(10, 100, 130, 23);

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setText("Актерское мастерство");
        jCheckBox3.setActionCommand("6");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(10, 130, 180, 23);

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setText("Музыка(пение)");
        jCheckBox4.setActionCommand("7");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(10, 160, 190, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Какие кружки вы посещали?");
        jFrame4.getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 20, 380, 17);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(filler2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Выбрано: Танцы");
        jToolBar2.add(jLabel7);

        jFrame4.getContentPane().add(jToolBar2);
        jToolBar2.setBounds(0, 220, 400, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6/w1.png")));
        jLabel10.setMaximumSize(new java.awt.Dimension(553, 347));
        jLabel10.setMinimumSize(new java.awt.Dimension(553, 347));
        jFrame4.getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 70, 180, 150);

        jFrame4.setLocationRelativeTo(null);

        jFrame5.setTitle("Результаты");
        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame5.setMinimumSize(new java.awt.Dimension(832, 399));
        jFrame5.setResizable(false);
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosing(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jButton9.setText("Назад");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(200, 290, 135, 23);

        jButton10.setText("ВЫХОД");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(530, 290, 135, 23);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Вопросы", "Ваши ответы"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jFrame5.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 800, 150);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<p align=\"center\">\nСпасибо что воспользовались\nнашей системой!\n</p>");
        jLabel5.setToolTipText("");
        jFrame5.getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 10, 250, 70);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Приветствие");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("<html> <p align=\"center\">  <h1>Быстрое анкетирование</h1>  <br> <br> <br> <h3><cite><p align=\"center\">Тема - Периоды жизни</cite></h3> </p> ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 310, 190);

        jButton1.setText("Начать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 230, 135, 23);

        jButton2.setText("ВЫХОД");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 230, 135, 23);

        setSize(new java.awt.Dimension(357, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
    }//GEN-LAST:event_formPropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame4.setVisible(false);
        jFrame3.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame4.setVisible(true);
        jFrame5.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame2.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame4.setVisible(false);
        jFrame5.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame4WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosing

    private void jFrame5WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosing

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jLabel7.setText("Выбрано: Танцы");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w1.png")));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jLabel7.setText("Выбрано: Рисование");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w2.png")));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jLabel7.setText("Выбрано: Актерское мастерство");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w3.png")));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        jLabel7.setText("Выбрано: Музыка(пение)");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("w4.png")));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
        jTable2.setValueAt("Вам доставляет удовольствие ходить в школу?", 0, 0);
        switch (buttonGroup1.getSelection().getActionCommand()) {
            case "0":
                jTable2.setValueAt("Да, Вы идёте обычно с удовольствием.", 0, 1);
                break;
            case "1":
                jTable2.setValueAt("Школа Вас в общем-то устраивает.", 0, 1);
                break;
            case "2":
                jTable2.setValueAt("Вы идёте без особой охоты.", 0, 1);
                break;
            case "3":
                jTable2.setValueAt("Люблю ходить только из за друзей.", 0, 1);
                break;
        }

        jTable2.setValueAt("Какие кружки вы посещали?", 1, 0);
        switch (buttonGroup2.getSelection().getActionCommand()) {
            case "4":
                jTable2.setValueAt("Танцы", 1, 1);
                break;
            case "5":
                jTable2.setValueAt("Рисование", 1, 1);
                break;
            case "6":
                jTable2.setValueAt("Актерское мастерство", 1, 1);
                break;
            case "7":
                jTable2.setValueAt("Музыка(пение)", 1, 1);
                break;
        }
        jTable2.setValueAt("Любимая настояльная игра:", 2, 0);
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                jTable2.setValueAt("Монополия", 2, 1);
                break;
            case 1:
                jTable2.setValueAt("Шашки", 2, 1);
                break;
            case 2:
                jTable2.setValueAt("Шахматы", 2, 1);
                break;
            case 3:
                jTable2.setValueAt("Игра-ходилка", 2, 1);
                break;
            default:
                jTable2.setValueAt("", 2, 1);
        }
       
    }//GEN-LAST:event_jFrame5WindowActivated

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jLabel6.setText("Выбрано: Люблю ходить только из за друзей.");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("r4.png")));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jLabel6.setText("Выбрано: Вы идёте без особой охоты.");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("r3.png")));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel6.setText("Выбрано: Школа Вас в общем-то устраивает.");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("r2.png")));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel6.setText("Выбрано: Да, Вы идёте обычно с удовольствием.");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("r1.png")));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jFrame3.setVisible(false);
        jFrame4.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jFrame3.setVisible(false);
        jFrame2.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedIndex()) {

            case 0:
                jLabel8.setText("Выбранно: Монополия");
                jLabel11.setIcon(new ImageIcon(getClass().getResource("s1.png")));
                break;
            case 1:
                jLabel8.setText("Выбранно: Шашки");
                jLabel11.setIcon(new ImageIcon(getClass().getResource("s2.png")));
                break;
            case 2:
                jLabel8.setText("Выбранно: Шахматы");
                jLabel11.setIcon(new ImageIcon(getClass().getResource("s3.png")));
                break;
            case 3:
                jLabel8.setText("Выбранно: Игра-ходилка");
                jLabel11.setIcon(new ImageIcon(getClass().getResource("s4.png")));
                break;
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
