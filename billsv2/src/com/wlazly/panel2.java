package com.wlazly;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class panel2 extends JPanel {
    JLabel lcustomer = new JLabel();
    JLabel ldata = new JLabel();
    JLabel lnip = new JLabel();

    JLabel lpickcustomer = new JLabel();
    JLabel lpicksalesman = new JLabel();

    JButton baddCustomer = new JButton();
    JButton bdeleteCustomer = new JButton();
    JButton bshowCustomer = new JButton();
    JButton bnewBill = new JButton();

    JList pickCustomer = new JList();
    JList pickSalesman = new JList();

    JTextField tcustomer = new JTextField();
    JTextField tdane = new JTextField();
    JTextField tnip = new JTextField();





    public panel2(){
        setLayout(null);
        lcustomer.setText("Customer");
        lcustomer.setBounds(50,50,100,30);
        ldata.setText("Data");
        ldata.setBounds(50,80,100,30);
        lnip.setText("NIP");
        lnip.setBounds(50,110,100,30);

        tcustomer.setBounds(200,50,100,30);
        tdane.setBounds(200,80,100,30);
        tnip.setBounds(200,110,100,30);

        baddCustomer.setText("AddCustomer");
        baddCustomer.setBounds(50,150,100,30);
        bdeleteCustomer.setText("DeleteCustomer");
        bdeleteCustomer.setBounds(50,200,100,30);
        bshowCustomer.setText("ShowCustomer");
        bshowCustomer.setBounds(200,150,100,30);
        bnewBill.setText("New Bill");
        bnewBill.setBounds(200,200,100,30);

        lpickcustomer.setText("Pick Customer");
        lpickcustomer.setBounds(50,300,150,30);
        lpicksalesman.setText("Pick Salesman");
        lpicksalesman.setBounds(300,300,150,30);

        pickCustomer.setBounds(50,400,200,200);
        pickSalesman.setBounds(400,400,200,200);



        add(lcustomer);
        add(ldata);
        add(lnip);

        add(tcustomer);
        add(tdane);
        add(tnip);

        add(baddCustomer);
        add(bdeleteCustomer);
        add(bshowCustomer);
        add(bnewBill);

        add(lpickcustomer);
        add(lpicksalesman);

        add(pickCustomer);
        add(pickSalesman);
        DefaultListModel DLM = new DefaultListModel();
        baddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               DLM.addElement(new Obiekty(tcustomer.getText(),
                       Integer.parseInt(tdane.getText()),
                       Integer.parseInt(tnip.getText())));

               pickCustomer.setModel(DLM);
               pickSalesman.setModel(DLM);

            }
        });
        bdeleteCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = pickCustomer.getSelectedIndex();
                int j = pickSalesman.getSelectedIndex();

                DLM.removeElementAt(i);
                DLM.removeElementAt(j);
            }
        });
        bnewBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
