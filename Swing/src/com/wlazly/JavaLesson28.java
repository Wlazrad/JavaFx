package com.wlazly;

import javax.swing.*;
import java.awt.*;

public class JavaLesson28 extends JFrame {
    JButton button1, button2, button3, button4, button5;

    public static void main(String[] args) {
        new JavaLesson28();

    }
    public JavaLesson28(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Seventh Frame");

        //FLOW LAYOUT
//        JPanel thePanel = new JPanel();
//        thePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 20));
//        button1 = new JButton("Button 1");
//        button2 = new JButton("Button 2");
//
//        thePanel.add(button1);
//        thePanel.add(button2);



        // BORDER LAYOUT
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new BorderLayout());

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");

        thePanel.add(button1, BorderLayout.NORTH);
        thePanel.add(button2, BorderLayout.SOUTH);
        thePanel.add(button3, BorderLayout.EAST);
        thePanel.add(button4, BorderLayout.WEST);
        thePanel.add(button5, BorderLayout.CENTER);



        //BOX LAYOUT

        this.add(thePanel);
        this.setVisible(true);
    }
}
