package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

@SuppressWarnings("serial")
public class cardlayout extends JFrame implements MouseListener {
    public static CardLayout card = new CardLayout();

    public static JFrame window = new JFrame();
    public static JPanel container = new JPanel();
    public static JPanel panel1 = new JPanel();
    public static JPanel panel2 = new JPanel();
    public static JPanel panel3 = new JPanel();
    public static JPanel panel4 = new JPanel();
    public static JButton bback= new JButton("Back");

    private static JButton bt[] = new JButton[4];

    private String[] text = {"PANEL 1","PANEL 2","PANEL 3","PANEL 4"};



    public cardlayout(){

        container.setLayout(card);

        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);


        for (int i = 0 ; i <bt.length; i++){
            bt[i] = new JButton(""+text[i]);
            bt[i].setBounds(100,150,100,40);
            bt[i].addMouseListener(this);

        }
        panel1.add(bt[0]);
        panel2.add(bt[1]);
        panel3.add(bt[2]);
        panel4.add(bt[3]);

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.DARK_GRAY);
        panel4.setBackground(Color.green);



        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.add(panel1,"2");
        container.add(panel2,"3");
        container.add(panel3,"4");
        container.add(panel4,"5");

        card.show(container,"1");











    }


    public static void main(String[] args) {
        cardlayout c = new cardlayout();

        c.add(container);
        c.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==bt[0]){
            card.show(container,""+3);
        }

        if (e.getSource()==bt[1]){
            card.show(container,""+4);
        }
        if (e.getSource()==bt[2]){
            card.show(container,""+5);
        }
        if (e.getSource()==bt[3]){
            card.show(container,""+2);
        }

    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
