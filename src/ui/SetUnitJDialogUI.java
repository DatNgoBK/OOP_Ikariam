/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Army;

/**
 *
 * @author Dat Ngo
 */
public class SetUnitJDialogUI extends JDialog{
    JTextField txtHoplite, txtSpearman, txtSwordsman, txtSlinger, txtArcher, txtSulfurCarabineer, txtSteamGiant, txtRam, txtCatapult, txtMortar, txtGyrocopter, txtBalloonBombardier;
    JSlider sldHoplite, sldSpearman, sldSwordsman, sldSlinger, sldArcher, sldSulfurCarabineer, sldSteamGiant, sldRam, sldCatapult, sldMortar, sldGyrocopter, sldBalloonBombardier;
    JButton btnOK;
    public SetUnitJDialogUI(String title){
        this.setTitle(title);
        addControls();
        addEvents();
    }
    
    public void addControls(){
        Container con = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setPreferredSize(new Dimension(600, 800));
        JScrollPane scDialog = new JScrollPane(pnMain, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pnMain.setLayout(null);
        //pnMain.setBackground(Color.BLACK);
        
        
        
        JLabel lblImage1 = new JLabel();
        lblImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hoplite.png")));
        lblImage1.setBounds(30, 10, 40, 40);
        pnMain.add(lblImage1);
        con.add(scDialog);
        
        sldHoplite = new JSlider(0, 100);
        sldHoplite.setBounds(85, 25, 350, 25);
        pnMain.add(sldHoplite);
        
        txtHoplite = new JTextField(10);
        txtHoplite.setBounds(450, 10, 40, 40);
        txtHoplite.setEnabled(false);
        pnMain.add(txtHoplite);
        
        JLabel lblImage2 = new JLabel();
        lblImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Spearman.png")));
        lblImage2.setBounds(30, 70, 40, 40);
        pnMain.add(lblImage2);
        
        sldSpearman = new JSlider(0, 100);
        sldSpearman.setBounds(85, 85, 350, 25);
        pnMain.add(sldSpearman);
        
        txtSpearman = new JTextField(10);
        txtSpearman.setBounds(450, 70, 40, 40);
        txtSpearman.setEnabled(false);
        pnMain.add(txtSpearman);
        
        JLabel lblImage3 = new JLabel();
        lblImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Swordsman.png")));
        lblImage3.setBounds(30, 130, 50, 40);
        pnMain.add(lblImage3);
        
        sldSwordsman = new JSlider(0, 100);
        sldSwordsman.setBounds(85, 145, 350, 25);
        pnMain.add(sldSwordsman);
        
        txtSwordsman = new JTextField(10);
        txtSwordsman.setBounds(450, 130, 40,40);
        txtSwordsman.setEnabled(false);
        pnMain.add(txtSwordsman);
        
        JLabel lblImage4 = new JLabel();
        lblImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Slinger.png")));
        lblImage4.setBounds(30, 190, 40, 40);
        pnMain.add(lblImage4);
        
        sldSlinger = new JSlider(0, 100);
        sldSlinger.setBounds(85, 205, 350, 25);
        pnMain.add(sldSlinger);
        
        txtSlinger = new JTextField(10);
        txtSlinger.setBounds(450, 190, 40, 40);
        txtSlinger.setEnabled(false);
        pnMain.add(txtSlinger);
        
        JLabel lblImage5 = new JLabel();
        lblImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Archer.png")));
        lblImage5.setBounds(30, 250, 40, 40);
        pnMain.add(lblImage5);
        
        sldArcher = new JSlider(0, 100);
        sldArcher.setBounds(85, 265, 350, 25);
        pnMain.add(sldArcher);
        
        txtArcher = new JTextField(10);
        txtArcher.setBounds(450, 250, 40, 40);
        txtArcher.setEnabled(false);
        pnMain.add(txtArcher);
        
        JLabel lblImage6 = new JLabel();
        lblImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sulphur_Carabineer.png")));
        lblImage6.setBounds(30, 310, 40, 40);
        pnMain.add(lblImage6);
        
        sldSulfurCarabineer = new JSlider(0, 100);
        sldSulfurCarabineer.setBounds(85, 325, 350, 25);
        pnMain.add(sldSulfurCarabineer);
        
        txtSulfurCarabineer = new JTextField(10);
        txtSulfurCarabineer.setBounds(450, 310, 40, 40);
        txtSulfurCarabineer.setEnabled(false);
        pnMain.add(txtSulfurCarabineer);
        
        JLabel lblImage7 = new JLabel();
        lblImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Steam_Giant.png")));
        lblImage7.setBounds(30, 370, 40, 40);
        pnMain.add(lblImage7);
        
        sldSteamGiant = new JSlider(0, 100);
        sldSteamGiant.setBounds(85, 385, 350, 25);
        pnMain.add(sldSteamGiant);
        
        txtSteamGiant = new JTextField(10);
        txtSteamGiant.setBounds(450, 370, 40, 40);
        txtSteamGiant.setEnabled(false);
        pnMain.add(txtSteamGiant);
        
        JLabel lblImage8 = new JLabel();
        lblImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ram.png")));
        lblImage8.setBounds(30, 430, 60, 40);
        pnMain.add(lblImage8);
        
        sldRam = new JSlider(0, 100);
        sldRam.setBounds(85, 445, 350, 25);
        pnMain.add(sldRam);
        
        txtRam = new JTextField(10);
        txtRam.setBounds(450, 430, 40, 40);
        txtRam.setEnabled(false);
        pnMain.add(txtRam);
        
        JLabel lblImage9 = new JLabel();
        lblImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Catapult.png")));
        lblImage9.setBounds(30, 490, 60, 40);
        pnMain.add(lblImage9);
        
        sldCatapult = new JSlider(0, 100);
        sldCatapult.setBounds(85, 505, 350, 25);
        pnMain.add(sldCatapult);
        
        txtCatapult = new JTextField(10);
        txtCatapult.setBounds(450, 490, 40, 40);
        txtCatapult.setEnabled(false);
        pnMain.add(txtCatapult);
        
        
        JLabel lblImage10 = new JLabel();
        lblImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mortar.png")));
        lblImage10.setBounds(30, 550, 60, 40);
        pnMain.add(lblImage10);
        
        sldMortar = new JSlider(0, 100);
        sldMortar.setBounds(85, 565, 350, 25);
        pnMain.add(sldMortar);
        
        txtMortar = new JTextField(10);
        txtMortar.setBounds(450, 550, 40, 40);
        txtMortar.setEnabled(false);
        pnMain.add(txtMortar);
     
        JLabel lblImage11 = new JLabel();
        lblImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gyrocopter.png")));
        lblImage11.setBounds(30, 610, 50, 40);
        pnMain.add(lblImage11);
        
        sldGyrocopter = new JSlider(0, 100);
        sldGyrocopter.setBounds(85, 625, 350, 25);
        pnMain.add(sldGyrocopter);
        
        txtGyrocopter = new JTextField(10);
        txtGyrocopter.setBounds(450, 610, 40, 40);
        txtGyrocopter.setEnabled(false);
        pnMain.add(txtGyrocopter);
       
        JLabel lblImage12 = new JLabel();
        lblImage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Balloon-Bombardier.png")));
        lblImage12.setBounds(30, 670, 40, 60);
        pnMain.add(lblImage12);
        
        sldBalloonBombardier = new JSlider(0, 100);
        sldBalloonBombardier.setBounds(85, 685, 350, 25);
        pnMain.add(sldBalloonBombardier);
        
        txtBalloonBombardier = new JTextField(10);
        txtBalloonBombardier.setBounds(450, 670, 40, 40);
        txtBalloonBombardier.setEnabled(false);
        pnMain.add(txtBalloonBombardier);
        
        btnOK = new JButton("OK");
        btnOK.setBounds(180, 750, 60, 40);
        pnMain.add(btnOK);
        
    }
    
    public void addEvents() {
        
        this.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                Army army = IsLandUI.currentHouse.getArmy();
                sldArcher.setValue(army.getNumberOfArcher());
                sldBalloonBombardier.setValue(army.getNumberOfBB());
                sldCatapult.setValue(army.getNumberOfCatapult());
                sldGyrocopter.setValue(army.getNumberOfGyrocopter());
                sldHoplite.setValue(army.getNumberOfHop());
                sldMortar.setValue(army.getNumberOfMotar());
                sldRam.setValue(army.getNumberOfRam());
                sldSlinger.setValue(army.getNumberOfSlinger());
                sldSpearman.setValue(army.getNumberOfSpear());
                sldSteamGiant.setValue(army.getNumberOfSteam());
                sldSulfurCarabineer.setValue(army.getNumberOfSC());
                sldSwordsman.setValue(army.getNumberOfSword());
            }
        });
        
        sldHoplite.setMaximum(1000);
        sldHoplite.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtHoplite.setText(String.valueOf(sldHoplite.getValue()));
            }
        });
        
        sldSpearman.setMaximum(1000);
        sldSpearman.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSpearman.setText(String.valueOf(sldSpearman.getValue()));
            }
        });
        
        sldSwordsman.setMaximum(1000);
        sldSwordsman.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSwordsman.setText(String.valueOf(sldSwordsman.getValue()));
            }
        });
        
        sldSlinger.setMaximum(1000);
        sldSlinger.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSlinger.setText(String.valueOf(sldSlinger.getValue()));
            }
        });
        
        sldArcher.setMaximum(1000);
        sldArcher.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtArcher.setText(String.valueOf(sldArcher.getValue()));
            }
        });
        
        sldSulfurCarabineer.setMaximum(1000);
        sldSulfurCarabineer.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSulfurCarabineer.setText(String.valueOf(sldSulfurCarabineer.getValue()));
            }
        });
        
        sldSteamGiant.setMaximum(1000);
        sldSteamGiant.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSteamGiant.setText(String.valueOf(sldSteamGiant.getValue()));
            }
        });
        
        sldRam.setMaximum(1000);
        sldRam.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtRam.setText(String.valueOf(sldRam.getValue()));
            }
        });
        
        sldCatapult.setMaximum(1000);
        sldCatapult.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtCatapult.setText(String.valueOf(sldCatapult.getValue()));
            }
        });
           
        sldMortar.setMaximum(1000);
        sldMortar.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtMortar.setText(String.valueOf(sldMortar.getValue()));
            }
        });
         
        sldGyrocopter.setMaximum(1000);
        sldGyrocopter.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtGyrocopter.setText(String.valueOf(sldGyrocopter.getValue()));
            }
        });
          
        sldBalloonBombardier.setMaximum(1000);
        sldBalloonBombardier.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtBalloonBombardier.setText(String.valueOf(sldBalloonBombardier.getValue()));
            }
        });
        
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Army army = new Army();
               army.setNumberOfArcher(sldArcher.getValue());
               army.setNumberOfBB(sldBalloonBombardier.getValue());
               army.setNumberOfCatapult(sldCatapult.getValue());
               army.setNumberOfGyrocopter(sldGyrocopter.getValue());
               army.setNumberOfHop(sldHoplite.getValue());
               army.setNumberOfMotar(sldMortar.getValue());
               army.setNumberOfRam(sldRam.getValue());
               army.setNumberOfSC(sldSulfurCarabineer.getValue());
               army.setNumberOfSlinger(sldSlinger.getValue());
               army.setNumberOfSpear(sldSpearman.getValue());
               army.setNumberOfSteam(sldSteamGiant.getValue());
               army.setNumberOfSword(sldSwordsman.getValue());
               IsLandUI.currentHouse.setArmy(army);
               getInstance().dispose();
            }
        });
        
    }
    
    private SetUnitJDialogUI getInstance(){
        return this;
    }
    
    public void showWindow(){
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setVisible(true);
    }

    
}
