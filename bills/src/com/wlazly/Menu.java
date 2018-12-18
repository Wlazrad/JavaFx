package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
   Bills b1 = Bills.BILL1;


    public static CardLayout card = new CardLayout();

    public JButton bback = new JButton("Back");
   public static JPanel panel1 = new JPanel();


    public static JPanel container = new JPanel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JFrame frame = new JFrame("BIll");



    public Menu(){

        container.setLayout(card);
        panel1.setLayout(null);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);


        button1.setBounds(100,100,100,30);
        button1.setText("New Bill");
        button2.setBounds(100,150,100,30);
        button2.setText("Customers");
        button3.setBounds(100,200,100,30);
        button3.setText("List Bill");
        button4.setBounds(100,250,100,30);
        button4.setText("Add Bill");
        button5.setBounds(100,300,100,30);
        button5.setText("Show BIll");

        panel1.setBackground(Color.CYAN);


        container.add(panel1, "1");
        container.add(new panel2(),"2");
        container.add(new panel3(),"3");
        container.add(new panel4(),"4");
        container.add(new panel5(),"5");

        card.show(container,"1");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"2");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"3");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"4");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"5");
            }
        });






        frame.add(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(800,800);
    }

    public static void main(String[] args) {
    Menu win = new Menu();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
