package com.wlazly;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Panel1.card;
import static com.wlazly.Panel1.container;

public class Panel2 extends JPanel {
    JLabel lcustomer = new JLabel();
    JLabel ldata = new JLabel();
    JLabel lnip = new JLabel();

    JLabel lpickcustomer = new JLabel();
    JLabel lpicksalesman = new JLabel();

    JButton baddCustomer = new JButton();
    JButton bdeleteCustomer = new JButton();
    JButton bshowCustomer = new JButton();
    JButton bnewBill = new JButton();
    JButton bback = new JButton();


    JList<Obiekty> pickCustomer = new JList();
    JList<Obiekty> pickSalesman = new JList();

    JTextField tcustomer = new JTextField();
    JTextField tdane = new JTextField();
    JTextField tnip = new JTextField();





    public Panel2(){
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
        bback.setText("Back");
        bback.setBounds(650,700,100,30);

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
        add(bback);

        add(lpickcustomer);
        add(lpicksalesman);

        add(pickCustomer);
        add(pickSalesman);
        DefaultListModel DLM = new DefaultListModel();
        baddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               DLM.addElement(new Obiekty(tcustomer.getText(),
                       tdane.getText(),
                       tnip.getText()));

               pickCustomer.setModel(DLM);
               pickSalesman.setModel(DLM);


            }
        });

        bshowCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               String str = pickCustomer.getSelectedValue().toString();
                String[] arrOfStr = str.split(",",20);
                tcustomer.setText(pickCustomer.getSelectedValue().getNazwa());
                tdane.setText(pickCustomer.getSelectedValue().getData());
                tnip.setText(pickCustomer.getSelectedValue().getNip());

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
        DefaultListModel DLM1 = new DefaultListModel();
        bnewBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                DLM1.addElement(new Bill(pickCustomer.getSelectedValue().getNazwa(),pickCustomer.getSelectedValue()
                .getData(), pickCustomer.getSelectedValue().getNip(),pickSalesman.getSelectedValue().getNazwa(),
                        pickSalesman.getSelectedValue().getData(), pickSalesman.getSelectedValue().getNip(),false));

                Panel3.tbill.setModel(DLM1);


            }
        });

        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"1");

            }
        });

    }
}
