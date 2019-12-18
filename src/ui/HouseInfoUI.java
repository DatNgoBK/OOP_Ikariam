/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author GBlue
 */
public class HouseInfoUI extends javax.swing.JDialog {

    /**
     * Creates new form NewJFrame
     */
    public HouseInfoUI(String title) {
        this.setTitle(title);
        initComponents();
        addEvents();
    }

    public void addEvents(){
        this.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                sldLevelHouse.setValue(IsLandUI.currentHouse.getLevelOfHouse());
                sldLevelWall.setValue(IsLandUI.currentHouse.getLevelOfWall());
                cbo.setSelectedIndex(IsLandUI.currentHouse.getTypeOfHouse());
                if (IsLandUI.currentHouse.getTypeOfHouse() == 2) {
                    btnPillage.setEnabled(true);
                    btnPillage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pillage_Enabled.PNG")));
                } else {
                    btnPillage.setEnabled(false);
                    btnPillage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pillage_Disabled.PNG")));
                }
            }
        });

        sldLevelHouse.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                txtLevelHouse.setText(String.valueOf(sldLevelHouse.getValue()));
            }
        });

        txtLevelHouse.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                String StringVal = txtLevelHouse.getText();
                Integer IntVal = 0;
                try {
                    IntVal = Integer.valueOf(StringVal);
                } catch (NumberFormatException e) {
                    txtLevelHouse.setText("0");
                }
                if (IntVal < 0) {
                    txtLevelHouse.setText("0");
                } else if (IntVal >= 40) {
                    txtLevelHouse.setText("40");
                }
                sldLevelHouse.setValue(Integer.valueOf(txtLevelHouse.getText()));
            }
        });

        sldLevelWall.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                txtLevelWall.setText(String.valueOf(sldLevelWall.getValue()));
            }
        });

        txtLevelWall.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                String StringVal = txtLevelWall.getText();
                Integer IntVal = 0;
                try {
                    IntVal = Integer.valueOf(StringVal);
                } catch (NumberFormatException e) {
                    txtLevelWall.setText("0");
                }
                if (IntVal < 0) {
                    txtLevelWall.setText("0");
                } else if (IntVal >= 40) {
                    txtLevelWall.setText("40");
                }
                sldLevelHouse.setValue(Integer.valueOf(txtLevelWall.getText()));
            }
        });

        cbo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                if (cbo.getSelectedIndex() == 3) {
                    sldLevelHouse.setValue(0);
                    sldLevelHouse.setValue(0);
                    sldLevelWall.setEnabled(false);
                    sldLevelHouse.setEnabled(false);
                    txtLevelHouse.setEnabled(false);
                    txtLevelWall.setEnabled(false);
                    btnBarrack.setEnabled(false);
                } else {
                    sldLevelHouse.setMinimum(1);
                    sldLevelWall.setMinimum(1);
                    sldLevelWall.setEnabled(true);
                    sldLevelHouse.setEnabled(true);
                    txtLevelHouse.setEnabled(true);
                    txtLevelWall.setEnabled(true);
                    btnBarrack.setEnabled(true);
                }
                if (cbo.getSelectedIndex() == 2) {
                    btnPillage.setEnabled(true);
                    btnPillage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pillage_Enabled.PNG")));
                } else {
                    btnPillage.setEnabled(false);
                    btnPillage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pillage_Disabled.PNG")));
                }
            }
        });
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setHouseInfo();
                
            }
        });
        btnPillage.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnPillage.setBorder(new BevelBorder(BevelBorder.RAISED));
            }

            public void mouseExited(MouseEvent evt) {
                btnPillage.setBorder(null);
            }

            public void mouseClicked(MouseEvent evt) {
                if(IsLandUI.myHouse == null)
                    JOptionPane.showMessageDialog(null, "Chưa có các thông số của My house");
                else
                    new BattleFieldUI("Details").showWindow();
            }
        });
        btnBarrack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setBarrackInfo();
            }
        });
    }

    protected void setBarrackInfo() {
        SetUnitJDialogUI ui = new SetUnitJDialogUI("Set the barrack");
        ui.showWindow();
    }

    //Set house's attributes
    protected void setHouseInfo() {
        IsLandUI.currentHouse.setLevelOfHouse(Integer.parseInt(txtLevelHouse.getText()));
        IsLandUI.currentHouse.setLevelOfWall(Integer.parseInt(txtLevelWall.getText()));

        //BattleField battleField = new BattleFieldUI();
        //battleField.setBattleField(houseCurrent);
        //houseCurrent.setBattleField(battleField);
        String type = cbo.getSelectedItem().toString();
        if (type.equals("My House")) {
            IsLandUI.currentHouse.setTypeOfHouse(0);
            setIconHouse();
            IsLandUI.myHouse = IsLandUI.currentHouse;
        } else if (type.equals("My Ally")) {
            IsLandUI.currentHouse.setTypeOfHouse(1);
            setIconHouse();
        } else if (type.equals("Enemy")) {
            IsLandUI.currentHouse.setTypeOfHouse(2);
            setIconHouse();
        } else {
            IsLandUI.currentHouse.setTypeOfHouse(3);
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/flag.PNG")));
        }
        this.dispose();

    }

    private void setIconHouse() {
        if (IsLandUI.currentHouse.getLevelOfHouse() == 1) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv1.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 2 && IsLandUI.currentHouse.getLevelOfHouse() <= 3) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv2.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 4 && IsLandUI.currentHouse.getLevelOfHouse() <= 6) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv4.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 7 && IsLandUI.currentHouse.getLevelOfHouse() <= 9) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv7.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 10 && IsLandUI.currentHouse.getLevelOfHouse() <= 12) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv10.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 13 && IsLandUI.currentHouse.getLevelOfHouse() <= 15) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv13.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() == 16 || IsLandUI.currentHouse.getLevelOfHouse() == 17) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv15.PNG")));
        }
        if (IsLandUI.currentHouse.getLevelOfHouse() >= 18) {
            IsLandUI.currentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/House/houseLv18+.PNG")));
        }
    }
    //Show the HouseInfoUI dialog
    public void showWindow() {
        setLocationRelativeTo(null);
        this.setModal(true);
        setVisible(true);
        
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
        btnBarrack = new javax.swing.JButton();
        btnPillage = new javax.swing.JButton();
        pnTitle = new javax.swing.JPanel();
        pnLvHou = new javax.swing.JPanel();
        lblLevelHou = new javax.swing.JLabel();
        sldLevelHouse = new javax.swing.JSlider();
        txtLevelHouse = new javax.swing.JTextField();
        pnLvWall = new javax.swing.JPanel();
        lblLevelWall = new javax.swing.JLabel();
        txtLevelWall = new javax.swing.JTextField();
        sldLevelWall = new javax.swing.JSlider();
        pnTypeHou = new javax.swing.JPanel();
        cbo = new javax.swing.JComboBox<>();
        lblTypeHou = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(253, 247, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBarrack.setBackground(new java.awt.Color(248, 222, 164));
        btnBarrack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBarrack.setForeground(new java.awt.Color(51, 51, 51));
        btnBarrack.setText("Set Barrack");
        btnBarrack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBarrack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBarrackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBarrackMouseExited(evt);
            }
        });
        jPanel1.add(btnBarrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 30));
        jPanel1.add(btnPillage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, 35));

        pnTitle.setBackground(new java.awt.Color(215, 172, 116));
        pnTitle.setPreferredSize(new java.awt.Dimension(600, 20));

        javax.swing.GroupLayout pnTitleLayout = new javax.swing.GroupLayout(pnTitle);
        pnTitle.setLayout(pnTitleLayout);
        pnTitleLayout.setHorizontalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        pnTitleLayout.setVerticalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(pnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 601, -1));

        pnLvHou.setBackground(new java.awt.Color(251, 232, 193));
        pnLvHou.setPreferredSize(new java.awt.Dimension(600, 50));
        pnLvHou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLvHouMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLvHouMouseExited(evt);
            }
        });
        pnLvHou.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevelHou.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLevelHou.setForeground(new java.awt.Color(51, 51, 51));
        lblLevelHou.setText("Level of House");
        lblLevelHou.setPreferredSize(new java.awt.Dimension(90, 20));
        pnLvHou.add(lblLevelHou, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 15, -1, 20));

        sldLevelHouse.setBackground(new java.awt.Color(251, 232, 193));
        sldLevelHouse.setMaximum(40);
        sldLevelHouse.setPreferredSize(new java.awt.Dimension(300, 20));
        pnLvHou.add(sldLevelHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 15, -1, -1));

        txtLevelHouse.setColumns(2);
        txtLevelHouse.setPreferredSize(new java.awt.Dimension(20, 20));
        pnLvHou.add(txtLevelHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, -1, -1));

        jPanel1.add(pnLvHou, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        pnLvWall.setBackground(new java.awt.Color(251, 232, 193));
        pnLvWall.setPreferredSize(new java.awt.Dimension(600, 50));
        pnLvWall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLvWallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLvWallMouseExited(evt);
            }
        });
        pnLvWall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevelWall.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLevelWall.setForeground(new java.awt.Color(51, 51, 51));
        lblLevelWall.setText("Level Of Wall");
        pnLvWall.add(lblLevelWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 15, -1, -1));

        txtLevelWall.setColumns(2);
        txtLevelWall.setForeground(new java.awt.Color(51, 51, 51));
        txtLevelWall.setPreferredSize(new java.awt.Dimension(20, 20));
        txtLevelWall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelWallActionPerformed(evt);
            }
        });
        pnLvWall.add(txtLevelWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 15, -1, -1));

        sldLevelWall.setBackground(new java.awt.Color(251, 232, 193));
        sldLevelWall.setMaximum(40);
        sldLevelWall.setPreferredSize(new java.awt.Dimension(300, 20));
        pnLvWall.add(sldLevelWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 15, -1, -1));

        jPanel1.add(pnLvWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        pnTypeHou.setBackground(new java.awt.Color(251, 232, 193));
        pnTypeHou.setPreferredSize(new java.awt.Dimension(600, 50));
        pnTypeHou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnTypeHouMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnTypeHouMouseExited(evt);
            }
        });
        pnTypeHou.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbo.setBackground(new java.awt.Color(253, 247, 221));
        cbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "My House", "My Ally", "Enemy", "Moor" }));
        cbo.setPreferredSize(new java.awt.Dimension(200, 20));
        pnTypeHou.add(cbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 15, -1, -1));

        lblTypeHou.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTypeHou.setForeground(new java.awt.Color(51, 51, 51));
        lblTypeHou.setText("Type of House");
        pnTypeHou.add(lblTypeHou, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel1.add(pnTypeHou, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        btnOK.setBackground(new java.awt.Color(248, 222, 164));
        btnOK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOK.setForeground(new java.awt.Color(51, 51, 51));
        btnOK.setText("OK");
        btnOK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKMouseExited(evt);
            }
        });
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HouseInfo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLevelWallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelWallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelWallActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseExited

    private void btnBarrackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarrackMouseEntered
        // TODO add your handling code here:
        btnBarrack.setBackground(new Color(215, 172, 116));
    }//GEN-LAST:event_btnBarrackMouseEntered

    private void btnBarrackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBarrackMouseExited
        // TODO add your handling code here:
        btnBarrack.setBackground(new Color(248,222,164));
    }//GEN-LAST:event_btnBarrackMouseExited

    private void btnOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseEntered
        // TODO add your handling code here:
        btnOK.setBackground(new Color(215, 172, 116));
    }//GEN-LAST:event_btnOKMouseEntered

    private void btnOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseExited
        // TODO add your handling code here:
        btnOK.setBackground(new Color(248,222,164));
    }//GEN-LAST:event_btnOKMouseExited

    private void pnLvHouMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLvHouMouseEntered
        // TODO add your handling code here:
        pnLvHou.setBackground(new Color(239, 212, 169));
        sldLevelHouse.setBackground(new Color(239, 212, 169));
    }//GEN-LAST:event_pnLvHouMouseEntered

    private void pnLvWallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLvWallMouseEntered
        // TODO add your handling code here:
        pnLvWall.setBackground(new Color(239, 212, 169));
        sldLevelWall.setBackground(new Color(239, 212, 169));
    }//GEN-LAST:event_pnLvWallMouseEntered

    private void pnTypeHouMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTypeHouMouseEntered
        // TODO add your handling code here:
        pnTypeHou.setBackground(new Color(239, 212, 169));
    }//GEN-LAST:event_pnTypeHouMouseEntered

    private void pnLvHouMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLvHouMouseExited
        // TODO add your handling code here:
        pnLvHou.setBackground(new Color(251,232,193));
        sldLevelHouse.setBackground(new Color(251,232,193));
    }//GEN-LAST:event_pnLvHouMouseExited

    private void pnLvWallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLvWallMouseExited
        // TODO add your handling code here:
        pnLvWall.setBackground(new Color(251,232,193));
        sldLevelWall.setBackground(new Color(251,232,193));
    }//GEN-LAST:event_pnLvWallMouseExited

    private void pnTypeHouMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTypeHouMouseExited
        // TODO add your handling code here:
        pnTypeHou.setBackground(new Color(251,232,193));
    }//GEN-LAST:event_pnTypeHouMouseExited

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarrack;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPillage;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLevelHou;
    private javax.swing.JLabel lblLevelWall;
    private javax.swing.JLabel lblTypeHou;
    private javax.swing.JPanel pnLvHou;
    private javax.swing.JPanel pnLvWall;
    private javax.swing.JPanel pnTitle;
    private javax.swing.JPanel pnTypeHou;
    private javax.swing.JSlider sldLevelHouse;
    private javax.swing.JSlider sldLevelWall;
    private javax.swing.JTextField txtLevelHouse;
    private javax.swing.JTextField txtLevelWall;
    // End of variables declaration//GEN-END:variables
}
