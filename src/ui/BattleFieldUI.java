package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Army;

public class BattleFieldUI extends JDialog {

    JTextField txtHoplite, txtSpearman, txtSwordsman, txtSlinger, txtArcher, txtSulfurCarabineer, txtSteamGiant, txtRam, txtCatapult, txtMortar, txtGyrocopter, txtBalloonBombardier;
    JSlider sldHoplite, sldSpearman, sldSwordsman, sldSlinger, sldArcher, sldSulfurCarabineer, sldSteamGiant, sldRam, sldCatapult, sldMortar, sldGyrocopter, sldBalloonBombardier;
    JButton btnOK;
    JTextField txtHoplite1, txtSpearman1, txtSwordsman1, txtSlinger1, txtArcher1, txtSulfurCarabineer1, txtSteamGiant1, txtRam1, txtCatapult1, txtMortar1, txtGyrocopter1, txtBalloonBombardier1;
    public BattleFieldUI(String chanvl) {
        setTitle(chanvl);
        addControls();
        addEvents();
    }

    public void addControls() {
        Container con = getContentPane();
        //con.setPreferredSize(new Dimension(600, 1200));
        JPanel pnMain = new JPanel();
        pnMain.setPreferredSize(new Dimension(600, 1400));
        pnMain.setLayout(null);
        JScrollPane scDialog = new JScrollPane(pnMain, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        con.add(scDialog);
        JPanel pnMain1 = new JPanel();
        pnMain.add(pnMain1);
        pnMain1.setBounds(100, 0, 800, 800);
        pnMain1.setPreferredSize(new Dimension(800, 800));
        scDialog.getVerticalScrollBar().setUnitIncrement(15);
        pnMain1.setLayout(null);
        
        txtHoplite1 = new JTextField(10);
        txtHoplite1.setBounds(25, 10, 40, 40);
        txtHoplite1.setEnabled(false);
        pnMain1.add(txtHoplite1);
        
        JLabel lblImage1 = new JLabel();
        lblImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hoplite.png")));
        lblImage1.setBounds(80, 10, 40, 40);
        pnMain1.add(lblImage1);

        sldHoplite = new JSlider(0, 100);
        sldHoplite.setBounds(135, 25, 450, 25);
        pnMain1.add(sldHoplite);

        txtHoplite = new JTextField(10);
        txtHoplite.setBounds(600, 10, 40, 40);
        txtHoplite.setEnabled(false);
        pnMain1.add(txtHoplite);
        
        txtSpearman1 = new JTextField(10);
        txtSpearman1.setBounds(25, 70, 40, 40);
        txtSpearman1.setEnabled(false);
        pnMain1.add(txtSpearman1);
        
        JLabel lblImage2 = new JLabel();
        lblImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Spearman.png")));
        lblImage2.setBounds(80, 70, 40, 40);
        pnMain1.add(lblImage2);

        sldSpearman = new JSlider(0, 100);
        sldSpearman.setBounds(135, 85, 450, 25);
        pnMain1.add(sldSpearman);

        txtSpearman = new JTextField(10);
        txtSpearman.setBounds(600, 70, 40, 40);
        txtSpearman.setEnabled(false);
        pnMain1.add(txtSpearman);
        
        txtSwordsman1 = new JTextField(10);
        txtSwordsman1.setBounds(25, 130, 40, 40);
        txtSwordsman1.setEnabled(false);
        pnMain1.add(txtSwordsman1);
        
        JLabel lblImage3 = new JLabel();
        lblImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Swordsman.png")));
        lblImage3.setBounds(80, 130, 50, 40);
        pnMain1.add(lblImage3);

        sldSwordsman = new JSlider(0, 100);
        sldSwordsman.setBounds(135, 145, 450, 25);
        pnMain1.add(sldSwordsman);

        txtSwordsman = new JTextField(10);
        txtSwordsman.setBounds(600, 130, 40, 40);
        txtSwordsman.setEnabled(false);
        pnMain1.add(txtSwordsman);
        
        txtSlinger1 = new JTextField(10);
        txtSlinger1.setBounds(25, 190, 40, 40);
        txtSlinger1.setEnabled(false);
        pnMain1.add(txtSlinger1);
        
        JLabel lblImage4 = new JLabel();
        lblImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Slinger.png")));
        lblImage4.setBounds(80, 190, 40, 40);
        pnMain1.add(lblImage4);

        sldSlinger = new JSlider(0, 100);
        sldSlinger.setBounds(135, 205, 450, 25);
        pnMain1.add(sldSlinger);

        txtSlinger = new JTextField(10);
        txtSlinger.setBounds(600, 190, 40, 40);
        txtSlinger.setEnabled(false);
        pnMain1.add(txtSlinger);
        
        txtArcher1 = new JTextField(10);
        txtArcher1.setBounds(25, 250, 40, 40);
        txtArcher1.setEnabled(false);
        pnMain1.add(txtArcher1);
        
        JLabel lblImage5 = new JLabel();
        lblImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Archer.png")));
        lblImage5.setBounds(80, 250, 40, 40);
        pnMain1.add(lblImage5);

        sldArcher = new JSlider(0, 100);
        sldArcher.setBounds(135, 265, 450, 25);
        pnMain1.add(sldArcher);

        txtArcher = new JTextField(10);
        txtArcher.setBounds(600, 250, 40, 40);
        txtArcher.setEnabled(false);
        pnMain1.add(txtArcher);

        txtSulfurCarabineer1 = new JTextField(10);
        txtSulfurCarabineer1.setBounds(25, 310, 40, 40);
        txtSulfurCarabineer1.setEnabled(false);
        pnMain1.add(txtSulfurCarabineer1);
        
        JLabel lblImage6 = new JLabel();
        lblImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sulphur_Carabineer.png")));
        lblImage6.setBounds(80, 310, 40, 40);
        pnMain1.add(lblImage6);

        sldSulfurCarabineer = new JSlider(0, 100);
        sldSulfurCarabineer.setBounds(135, 325, 450, 25);
        pnMain1.add(sldSulfurCarabineer);

        txtSulfurCarabineer = new JTextField(10);
        txtSulfurCarabineer.setBounds(600, 310, 40, 40);
        txtSulfurCarabineer.setEnabled(false);
        pnMain1.add(txtSulfurCarabineer);
        
        txtSteamGiant1 = new JTextField(10);
        txtSteamGiant1.setBounds(25, 370, 40, 40);
        txtSteamGiant1.setEnabled(false);
        pnMain1.add(txtSteamGiant1);
        
        JLabel lblImage7 = new JLabel();
        lblImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Steam_Giant.png")));
        lblImage7.setBounds(80, 370, 40, 40);
        pnMain1.add(lblImage7);

        sldSteamGiant = new JSlider(0, 100);
        sldSteamGiant.setBounds(135, 385, 450, 25);
        pnMain1.add(sldSteamGiant);

        txtSteamGiant = new JTextField(10);
        txtSteamGiant.setBounds(600, 370, 40, 40);
        txtSteamGiant.setEnabled(false);
        pnMain1.add(txtSteamGiant);

        txtRam1 = new JTextField(10);
        txtRam1.setBounds(25, 430, 40, 40);
        txtRam1.setEnabled(false);
        pnMain1.add(txtRam1);
        
        JLabel lblImage8 = new JLabel();
        lblImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ram.png")));
        lblImage8.setBounds(80, 430, 60, 40);
        pnMain1.add(lblImage8);

        sldRam = new JSlider(0, 100);
        sldRam.setBounds(135, 445, 450, 25);
        pnMain1.add(sldRam);

        txtRam = new JTextField(10);
        txtRam.setBounds(600, 430, 40, 40);
        txtRam.setEnabled(false);
        pnMain1.add(txtRam);

        txtCatapult1 = new JTextField(10);
        txtCatapult1.setBounds(25, 490, 40, 40);
        txtCatapult1.setEnabled(false);
        pnMain1.add(txtCatapult1);
        
        JLabel lblImage9 = new JLabel();
        lblImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Catapult.png")));
        lblImage9.setBounds(80, 490, 60, 40);
        pnMain1.add(lblImage9);

        sldCatapult = new JSlider(0, 100);
        sldCatapult.setBounds(135, 505, 450, 25);
        pnMain1.add(sldCatapult);

        txtCatapult = new JTextField(10);
        txtCatapult.setBounds(600, 490, 40, 40);
        txtCatapult.setEnabled(false);
        pnMain1.add(txtCatapult);

        txtMortar1 = new JTextField(10);
        txtMortar1.setBounds(25, 550, 40, 40);
        txtMortar1.setEnabled(false);
        pnMain1.add(txtMortar1);
        
        JLabel lblImage10 = new JLabel();
        lblImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mortar.png")));
        lblImage10.setBounds(80, 550, 60, 40);
        pnMain1.add(lblImage10);

        sldMortar = new JSlider(0, 100);
        sldMortar.setBounds(135, 565, 450, 25);
        pnMain1.add(sldMortar);

        txtMortar = new JTextField(10);
        txtMortar.setBounds(600, 550, 40, 40);
        txtMortar.setEnabled(false);
        pnMain1.add(txtMortar);

        txtGyrocopter1 = new JTextField(10);
        txtGyrocopter1.setBounds(25, 610, 40, 40);
        txtGyrocopter1.setEnabled(false);
        pnMain1.add(txtGyrocopter1);
        
        JLabel lblImage11 = new JLabel();
        lblImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gyrocopter.png")));
        lblImage11.setBounds(80, 610, 50, 40);
        pnMain1.add(lblImage11);

        sldGyrocopter = new JSlider(0, 100);
        sldGyrocopter.setBounds(135, 625, 450, 25);
        pnMain1.add(sldGyrocopter);

        txtGyrocopter = new JTextField(10);
        txtGyrocopter.setBounds(600, 610, 40, 40);
        txtGyrocopter.setEnabled(false);
        pnMain1.add(txtGyrocopter);

        txtBalloonBombardier1 = new JTextField(10);
        txtBalloonBombardier1.setBounds(25, 670, 40, 40);
        txtBalloonBombardier1.setEnabled(false);
        pnMain1.add(txtBalloonBombardier1);
        
        JLabel lblImage12 = new JLabel();
        lblImage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Balloon-Bombardier.png")));
        lblImage12.setBounds(80, 670, 40, 60);
        pnMain1.add(lblImage12);

        sldBalloonBombardier = new JSlider(0, 100);
        sldBalloonBombardier.setBounds(135, 685, 450, 25);
        pnMain1.add(sldBalloonBombardier);

        txtBalloonBombardier = new JTextField(10);
        txtBalloonBombardier.setBounds(600, 670, 40, 40);
        txtBalloonBombardier.setEnabled(false);
        pnMain1.add(txtBalloonBombardier);

      /*  btnOK = new JButton("OK");
        btnOK.setBounds(180, 750, 60, 40);
        pnMain1.add(btnOK);*/

        JPanel pnMain2 = new JPanel();
        pnMain2.setBounds(50, 800, 800, 600);
        pnMain.add(pnMain2);
        pnMain2.setPreferredSize(new Dimension(800, 600));
        pnMain2.setLayout(null);

        Border border = BorderFactory.createLineBorder(Color.blue);

        JPanel pn1 = new JPanel();
        pn1.setBorder(border);
        pn1.setPreferredSize(new Dimension(750, 60));
        pn1.setBounds(10, 10, 750, 60);
        pn1.setLayout(null);
        JButton btnRun = new JButton();
        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/smallPlay.png")));
        btnRun.setPreferredSize(new Dimension(50, 50));
        btnRun.setBounds(650, 5, 50, 50);
        pn1.add(btnRun);
        pnMain2.add(pn1);

        JPanel pn2 = new JPanel();
        pn2.setBorder(border);
        pn2.setPreferredSize(new Dimension(750, 60));
        pn2.setBounds(10, 80, 750, 60);
        pn2.setLayout(null);
        JLabel lblWasatch = new JLabel("Wasatch (Shini)");
        lblWasatch.setPreferredSize(new Dimension(100, 50));
        lblWasatch.setBounds(10, 5, 100, 50);
        pn2.add(lblWasatch);

        JLabel lblupkeep = new JLabel("Additional upkeep: 0 per Hour");
        lblupkeep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IconUpkeep.gif")));
        lblupkeep.setPreferredSize(new Dimension(100, 50));
        lblupkeep.setBounds(200, 5, 200, 50);
        pn2.add(lblupkeep);
        pnMain2.add(pn2);

        JPanel pnField = new JPanel();
        pnField.setBorder(border);
        pnField.setPreferredSize(new Dimension(750, 400));
        pnField.setBounds(10, 150, 750, 400);
        pnField.setLayout(null);

        JLabel lblPreView = new JLabel("Preview of Battlefield");
        Font fontPreview = new Font("arial", Font.BOLD, 15);
        lblPreView.setFont(fontPreview);
        lblPreView.setForeground(Color.DARK_GRAY);
        lblPreView.setPreferredSize(new Dimension(240, 50));
        lblPreView.setBounds(300, 10, 240, 50);
        pnField.add(lblPreView);

        JLabel lblSoldiers = new JLabel();
        lblSoldiers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hoplite.png")));
        lblSoldiers.setPreferredSize(new Dimension(37, 37));
        lblSoldiers.setBounds(24, 98, 37, 37);
        pnField.add(lblSoldiers);

        JLabel lblImageField = new JLabel();
        lblImageField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Field.PNG")));
        lblImageField.setPreferredSize(new Dimension(720, 200));
        lblImageField.setBounds(10, 70, 720, 200);
        pnField.add(lblImageField);

        JLabel lblReserve = new JLabel("Reserve:");
        lblReserve.setPreferredSize(new Dimension(100, 50));
        lblReserve.setBounds(10, 300, 100, 50);
        pnField.add(lblReserve);
        pnMain2.add(pnField);

    }

    public void addEvents() {
        
        this.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent evt) {
                Army army = IsLandUI.myHouse.getArmy();
                sldArcher.setMaximum(army.getNumberOfArcher());
                sldBalloonBombardier.setMaximum(army.getNumberOfBB());
                sldCatapult.setMaximum(army.getNumberOfCatapult());
                sldGyrocopter.setMaximum(army.getNumberOfGyrocopter());
                sldHoplite.setMaximum(army.getNumberOfHop());
                sldMortar.setMaximum(army.getNumberOfMotar());
                sldRam.setMaximum(army.getNumberOfRam());
                sldSlinger.setMaximum(army.getNumberOfSlinger());
                sldSpearman.setMaximum(army.getNumberOfSpear());
                sldSteamGiant.setMaximum(army.getNumberOfSteam());
                sldSulfurCarabineer.setMaximum(army.getNumberOfSC());
                sldSwordsman.setMaximum(army.getNumberOfSword());
                sldArcher.setValue(0);
                sldBalloonBombardier.setValue(0);
                sldCatapult.setValue(0);
                sldGyrocopter.setValue(0);
                sldHoplite.setValue(0);
                sldMortar.setValue(0);
                sldRam.setValue(0);
                sldSlinger.setValue(0);
                sldSpearman.setValue(0);
                sldSteamGiant.setValue(0);
                sldSulfurCarabineer.setValue(0);
                sldSwordsman.setValue(0);
            }
        });
        
        sldHoplite.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtHoplite.setText(String.valueOf(sldHoplite.getValue()));
                txtHoplite1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfHop() - sldHoplite.getValue()));
            }
        });

        sldSpearman.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSpearman.setText(String.valueOf(sldSpearman.getValue()));
                txtSpearman1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfSpear() - sldSpearman.getValue()));
            }
        });
        

        sldSwordsman.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSwordsman.setText(String.valueOf(sldSwordsman.getValue()));
                txtSwordsman1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfSword()- sldSwordsman.getValue()));

            }
        });

        sldSlinger.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSlinger.setText(String.valueOf(sldSlinger.getValue()));
                txtSlinger1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfSlinger()- sldSlinger.getValue()));
            }
        });

        sldArcher.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtArcher.setText(String.valueOf(sldArcher.getValue()));
                txtArcher1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfArcher()- sldArcher.getValue()));
            }
        });

        sldSulfurCarabineer.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSulfurCarabineer.setText(String.valueOf(sldSulfurCarabineer.getValue()));
                txtSulfurCarabineer1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfSC()- sldSulfurCarabineer.getValue()));
            }
        });

        sldSteamGiant.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtSteamGiant.setText(String.valueOf(sldSteamGiant.getValue()));
                txtSteamGiant1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfSteam()- sldSteamGiant.getValue()));
            }
        });

        sldRam.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtRam.setText(String.valueOf(sldRam.getValue()));
                txtRam1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfRam()- sldRam.getValue()));
            }
        });

        sldCatapult.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtCatapult.setText(String.valueOf(sldCatapult.getValue()));
                txtCatapult1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfCatapult()- sldCatapult.getValue()));
            }
        });

        sldMortar.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtMortar.setText(String.valueOf(sldMortar.getValue()));
                txtMortar1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfMotar()- sldMortar.getValue()));
            }
        });

        sldGyrocopter.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtGyrocopter.setText(String.valueOf(sldGyrocopter.getValue()));
                txtGyrocopter1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfGyrocopter()- sldGyrocopter.getValue()));
            }
        });

        sldBalloonBombardier.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txtBalloonBombardier.setText(String.valueOf(sldBalloonBombardier.getValue()));
                txtBalloonBombardier1.setText(String.valueOf(IsLandUI.myHouse.getArmy().getNumberOfBB()- sldBalloonBombardier.getValue()));
            }
        });

    }

    public void showWindow() {
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setVisible(true);
    }

}
