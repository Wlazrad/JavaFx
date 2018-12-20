package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JFrame {

    public static CardLayout card = new CardLayout();
    public static JPanel container = new JPanel();

    public static JPanel panel1 = new JPanel();

    public static JButton baddCustomer = new JButton();
    public static JButton baddItem = new JButton();
    public static JButton baddBill = new JButton();
    public static JButton bexit = new JButton();


    public Panel1(){
        container.setLayout(card);
        panel1.setLayout(null);

        panel1.add(baddCustomer);
        panel1.add(baddItem);
        panel1.add(baddBill);
        panel1.add(bexit);

        baddCustomer.setText("Add Customer");
        baddItem.setText("Add Item");
        baddBill.setText("Add Bill");
        bexit.setText("Exit");


        baddCustomer.setBounds(200,100,120,30);
        baddItem.setBounds(200,140,120,30);
        baddBill.setBounds(200,180,120,30);
        bexit.setBounds(200,220,120,30);




        container.add(panel1,"1");
        container.add(new Panel2(),"2");
        container.add(new Panel3(),"3");
        container.add(new Panel4(),"4");

        card.show(container,"1");

        add(container);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800,800);

        baddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"2");
            }
        });

        baddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"3");
            }
        });

        baddBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"4");
            }
        });

        bexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }
}
