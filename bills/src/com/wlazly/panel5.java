package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Menu.card;
import static com.wlazly.Menu.container;

public class panel5 extends JPanel {
    JButton button2 = new JButton();
    JLabel label2 = new JLabel();
    JPanel panel5 = new JPanel();

    public panel5(){
        setLayout(null);
        setBackground(Color.white);
        label2.setText("Back5");
        label2.setVisible(true);
        button2.setBounds(100,100,100,30);
        label2.setBounds(50,50,100,50);
        add(label2);
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"2");
            }
        });



    }
}
