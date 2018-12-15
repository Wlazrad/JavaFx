package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Menu.*;

public class panel2 extends JPanel implements ActionListener{
    JButton button2 = new JButton();
    JLabel l2customer = new JLabel();
    JLabel l2data = new JLabel();
    JLabel l2NIP = new JLabel();
    JPanel panel2 = new JPanel();
    JButton button3 = new JButton();
    JTextField tcustomer = new JTextField();
    JTable table = new JTable();


    double number;

    public panel2(){
        setLayout(null);
        setBackground(Color.white);
        button2.setText("Back");
        button3.setText("Add");
        l2customer.setText("Customer");
        l2data.setText("Data");
        tcustomer.setText("write something in");

        button2.setBounds(450,500,100,30);
        button3.setBounds(350,500,100,30);
        l2customer.setBounds(50,50,100,30);
        l2data.setBounds(50,80,100,30);
        tcustomer.setBounds(130,50,100,30);


        add(tcustomer);
        add(l2customer);
        add(l2data);
        add(l2NIP);
        add(button2);
        add(button3);
       button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               card.show(container,"1");
            }
        });





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = new Object();
        if (source==tcustomer){
            number = Double.parseDouble(tcustomer.getText());
            Bills.BILL1.setNumber((int) number);


        }

    }
}
