package com.wlazly;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Panel1.card;
import static com.wlazly.Panel1.container;

public class Panel3 extends JPanel {
    public static int countclose=0;
     private static int numberscount = 1;

    public static int getNumberscount() {
        return numberscount;
    }

    public void setNumberscount(int numberscount) {
        this.numberscount = numberscount;
    }

    JLabel litem = new JLabel();
    JLabel lprice = new JLabel();
    JLabel lamount = new JLabel();
    JLabel lunit = new JLabel();
    JLabel lvat = new JLabel();

    public static JTextField titem = new JTextField();
    public static JTextField tprice = new JTextField();
    public static JTextField tamount = new JTextField();
    public static JComboBox cunit = new JComboBox();
    public static JTextField tvat = new JTextField();

    public static JButton baddItem = new JButton();
    JButton bupdate = new JButton();
    JButton bdelete = new JButton();
    public static JButton bopen = new JButton();
    public static JButton bclose = new JButton();
    JButton bback = new JButton();

    JLabel lpickBill = new JLabel();

    public static JList<Bill> tbill = new JList<Bill>();

    public Panel3() {
        setLayout(null);
        litem.setText("Item name");
        litem.setBounds(50, 50, 100, 30);
        lprice.setText("Price");
        lprice.setBounds(50, 80, 100, 30);
        lamount.setText("Amount");
        lamount.setBounds(50, 110, 100, 30);
        lunit.setText("Unit");
        lunit.setBounds(50, 140, 100, 30);
        lvat.setText("Vat");
        lvat.setBounds(50, 170, 100, 30);

        titem.setBounds(200, 50, 100, 30);
        tprice.setBounds(200, 80, 100, 30);
        tamount.setBounds(200, 110, 100, 30);
        cunit.setBounds(200, 140, 100, 30);
        tvat.setBounds(200, 170, 100, 30);

        baddItem.setText("Add Item");
        baddItem.setBounds(50, 210, 100, 30);
        bupdate.setText("Update");
        bupdate.setBounds(200, 210, 100, 30);
        bdelete.setText("Delete");
        bdelete.setBounds(320, 210, 100, 30);
        bopen.setText("Open Bill");
        bopen.setBounds(50, 600, 100, 30);
        bclose.setText("Close");
        bclose.setBounds(200, 600, 100, 30);
        bback.setText("Back");
        bback.setBounds(650, 700, 100, 30);

        tbill.setBounds(50, 250, 200, 200);

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
        add(bback);
        add(tbill);

        add(bopen);
        add(bclose);

        DefaultListModel DLM2 = new DefaultListModel();
        baddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbill.getSelectedValue().close== false) {
                    tbill.getSelectedValue().billlist.add(new Position(titem.getText(),
                            tprice.getText(), tamount.getText(), cunit.getSelectedItem().toString(), tvat.getText()));
                }
                else
                    baddItem.setEnabled(true);
            }
        });
        bdelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DLM2.removeElement(tbill.getSelectedValue());
            }
        });

        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container, "1");
            }
        });

        bclose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel3.tbill.getSelectedValue().setClose(true);

                repaint();
            }
        });




    }


}
