package com.wlazly;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RownanieGUI extends JFrame implements ActionListener {

    private JTextField tA, tB, tC, tWynik;
    private JLabel lA, lB, lC;
    private JButton bWyjscie, bRozwiaz;
    public RownanieGUI(){
        setSize(400,400);
        setTitle("Rozwiazanie rownania kwadratowego");
        setLayout(null);
        lA = new JLabel("a",JLabel.RIGHT);
        lA.setBounds(10,50,30,20);
        tA = new JTextField();
        tA.setBounds(50,50,50,20);
        tA.setToolTipText("Podaj współczynik a");

        lB = new JLabel("b",JLabel.RIGHT);
        lB.setBounds(100,50,30,20);
        tB = new JTextField();
        tB.setBounds(150,50,50,20);
        tB.setToolTipText("Podaj współczynik b");

        lC = new JLabel("c",JLabel.RIGHT);
        lC.setBounds(210,50,30,20);
        tC = new JTextField();
        tC.setBounds(250,50,50,20);
        tC.setToolTipText("Podaj współczynik c");

        add(tA);
        add(lA);
        add(tB);
        add(lB);
        add(tC);
        add(lC);

        bRozwiaz = new JButton("Rozwiaz rownanie");
        bRozwiaz.setBounds(50,150,150,20);
        bRozwiaz.addActionListener(this);
        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(250,150,100,20);
        bWyjscie.addActionListener(this);

        add(bRozwiaz);
        add(bWyjscie);
        tWynik = new JTextField();
        tWynik.setBounds(50,200,250,20);
        add(tWynik);






    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo==bWyjscie);
        {
            dispose();
        }
         if (zrodlo==bRozwiaz)
        {
            int a = Integer.parseInt(tA.getText());
            int b = Integer.parseInt(tB.getText());
            int c = Integer.parseInt(tC.getText());


        }
    }




    public static void main(String[] args) {
	RownanieGUI app = new RownanieGUI();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setVisible(true);
    }


}
