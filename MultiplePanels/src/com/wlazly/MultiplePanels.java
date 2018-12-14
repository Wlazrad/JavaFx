package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplePanels implements ActionListener {

    JFrame window = new JFrame("Multiple Panels");
    JPanel panel01 = new JPanel();
    JPanel panel02 = new JPanel();
    JButton click = new JButton("Click");
    JLabel text = new JLabel("Button is clicked");

    MultiplePanels(){
        panel01.setBackground(Color.CYAN);
        panel02.setBackground(Color.green);
        panel02.add(click);
        text.setForeground(Color.BLUE);
        panel01.add(text);
        text.setVisible(false);


        click.addActionListener(this);

        window.add(panel01,BorderLayout.CENTER);
        window.add(panel02, BorderLayout.PAGE_END);

        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }





    @Override
    public void actionPerformed(ActionEvent e) {
            text.setVisible(true);
            panel01.setBackground(Color.YELLOW);
            panel02.setBackground(Color.green);
    }
}
