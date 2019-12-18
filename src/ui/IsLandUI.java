/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.House;

/**
 *
 * @author Dat Ngo
 */
public class IsLandUI extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17;
    JLabel lblIsLand;
    public static JButton currentButton;
    public static House currentHouse;
    public HouseInfoUI houseInfoUI;
    public static House[] house;
    public static House myHouse;
    
    public IsLandUI(String title){
        super(title);
        house = new House[18];
        currentHouse = new House();
        currentButton = new JButton();
        for(int i=1; i<18; i++)
            house[i] = new House();
        houseInfoUI = new HouseInfoUI("set quan");
        addControls();
        addEvents();
    }
    
    public void addControls(){
        Container con = getContentPane();
        
        JPanel pnMain = new JPanel();
        pnMain.setLayout(null);
        con.add(pnMain);
        
        btn1 = new MyJButtonFlagUI();
        btn1.setBounds(175, 225, 30, 30);
        pnMain.add(btn1);
        
        btn2 = new MyJButtonFlagUI();
        btn2.setBounds(270, 235, 30 ,30);
        pnMain.add(btn2);
        
        btn3 = new MyJButtonFlagUI();
        btn3.setBounds(370, 190, 30 ,30);
        pnMain.add(btn3);
        
        btn4 = new MyJButtonFlagUI();
        btn4.setBounds(470, 135, 30 ,30);
        pnMain.add(btn4);
        
        btn5 = new MyJButtonFlagUI();
        btn5.setBounds(770, 165, 30 ,30);
        pnMain.add(btn5);
        
        btn6 = new MyJButtonFlagUI();
        btn6.setBounds(650, 125, 30 ,30);
        pnMain.add(btn6);
        
        btn7 = new MyJButtonFlagUI();
        btn7.setBounds(145, 300, 30 ,30);
        pnMain.add(btn7);
        
        btn8 = new MyJButtonFlagUI();
        btn8.setBounds(125, 450, 30 ,30);
        pnMain.add(btn8);
        
        btn9 = new MyJButtonFlagUI();
        btn9.setBounds(345, 455, 30 ,30);
        pnMain.add(btn9);
        
        btn10 = new MyJButtonFlagUI();
        btn10.setBounds(240, 480, 30 ,30);
        pnMain.add(btn10);
        
        btn11 = new MyJButtonFlagUI();
        btn11.setBounds(370, 550, 30 ,30);
        pnMain.add(btn11);
        
        btn12 = new MyJButtonFlagUI();
        btn12.setBounds(585, 530, 30 ,30);
        pnMain.add(btn12);
        
        btn13 = new MyJButtonFlagUI();
        btn13.setBounds(700, 475, 30 ,30);
        pnMain.add(btn13);
        
        btn14 = new MyJButtonFlagUI();
        btn14.setBounds(835, 450, 30 ,30);
        pnMain.add(btn14);
        
        btn15 = new MyJButtonFlagUI();
        btn15.setBounds(835, 370, 30 ,30);
        pnMain.add(btn15);
        
        btn16 = new MyJButtonFlagUI();
        btn16.setBounds(815, 275, 30 ,30);
        pnMain.add(btn16);
        
        btn17 = new MyJButtonFlagUI();
        btn17.setBounds(670, 280, 30 ,30);
        pnMain.add(btn17);
        
        lblIsLand = new JLabel();
        lblIsLand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/island.jpg")));
        pnMain.add(lblIsLand);
        lblIsLand.setBounds(0, 10, 1000, 665);
        
    }
    
    public void addEvents(){
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[1];
                currentButton = btn1;
                houseInfoUI.showWindow();
            }
        });
        
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[2];
                currentButton = btn2;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[3];
                currentButton = btn3;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[4];
                currentButton = btn4;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[5];
                currentButton = btn5;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[6];
                currentButton = btn6;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[7];
                currentButton = btn7;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[8];
                currentButton = btn8;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[9];
                currentButton = btn9;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[10];
                currentButton = btn10;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[11];
                currentButton = btn11;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[12];
                currentButton = btn12;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[13];
                currentButton = btn13;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[14];
                currentButton = btn14;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[15];
                currentButton = btn15;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[16];
                currentButton = btn16;
                new HouseInfoUI("House Information").showWindow();
            }
        });
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[17];
                currentButton = btn17;
                new HouseInfoUI("House Information").showWindow();
            }
        });
    }
    
    public void showWindow(){
        setSize(1000, 665);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }          
}
