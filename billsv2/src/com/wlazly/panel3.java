package com.wlazly;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel3 extends JPanel{
    JLabel litem = new JLabel();
    JLabel lprice = new JLabel();
    JLabel lamount = new JLabel();
    JLabel lunit = new JLabel();
    JLabel lvat = new JLabel();

    JTextField titem = new JTextField();
    JTextField tprice = new JTextField();
    JTextField tamount = new JTextField();
    JComboBox cunit = new JComboBox();
    JTextField tvat = new JTextField();

    JButton baddItem = new JButton();
    JButton bupdate = new JButton();
    JButton bdelete = new JButton();
    JButton bopen = new JButton();
    JButton bclose = new JButton();

    JLabel lpickBill = new JLabel();

    JList tbill = new JList();

    public panel3(){
        setLayout(null);
        litem.setText("Item name");
        litem.setBounds(50,50,100,30);
        lprice.setText("Price");
        lprice.setBounds(50,80,100,30);
        lamount.setText("Amount");
        lamount.setBounds(50,110,100,30);
        lunit.setText("Unit");
        lunit.setBounds(50,140,100,30);
        lvat.setText("Vat");
        lvat.setBounds(50,170,100,30);

        titem.setBounds(200,50,100,30);
        tprice.setBounds(200,80,100,30);
        tamount.setBounds(200,110,100,30);
        cunit.setBounds(200,140,100,30);
        tvat.setBounds(200,170,100,30);

        baddItem.setText("Add Item");
        baddItem.setBounds(50,210,100,30);
        bupdate.setText("Update");
        bupdate.setBounds(200,210,100,30);
        bdelete.setText("Delete");
        bdelete.setBounds(320,210,100,30);
        bopen.setText("Open Bill");
        bopen.setBounds(50,600,100,30);
        bclose.setText("Close");
        bclose.setBounds(200,600,100,30);
        tbill.setBounds(50,250,200,200);

        cunit.addItem("szt");
        cunit.addItem("kg");


        bdelete.setText("Delete");

        add(litem);
        add(lprice);
        add(lamount);
        add(lunit);
        add(lvat);

        add(titem);
        add(tprice);
        add(tamount);
        add(cunit);
        add(tvat);

        add(baddItem);
        add(bupdate);
        add(bdelete);
        add(tbill);

        add(bopen);
        add(bclose);

        DefaultListModel DLM = new DefaultListModel();
        baddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DLM.addElement(new Position(titem.getText(),
                        Integer.parseInt(tprice.getText()),
                        Integer.parseInt(tamount.getText()),
                        (String) cunit.getSelectedItem(),
                        Integer.parseInt(tvat.getText())));
                tbill.setModel(DLM);
            }
        });
        bdelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DLM.removeElement(tbill.getSelectedValue());
            }
        });




    }


}
