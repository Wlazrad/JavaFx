package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Menu.*;

public class panel4 extends JPanel {
    JButton button2 = new JButton();
    JLabel label2 = new JLabel();
    JPanel panel2 = new JPanel();


    public panel4(){
        setLayout(null);
        setBackground(Color.white);
        button2.setText("Back");
        label2.setVisible(true);
        button2.setBounds(450,500,100,30);
        label2.setBounds(50,50,100,50);
        add(label2);
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"1");
            }
        });



    }
}