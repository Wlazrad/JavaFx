package com.wlazly;

import javax.swing.*;

public class panel4 extends JPanel {
    JLabel lcustomer = new JLabel();
    JLabel ldata = new JLabel();
    JLabel lnip = new JLabel();

    JLabel ldate = new JLabel();
    JLabel lnumberbill = new JLabel();
    JLabel lsalesman = new JLabel();
    JLabel ldatasale = new JLabel();
    JLabel lnipsale = new JLabel();

    JLabel ltotalnet = new JLabel();
    JLabel ltotalvat = new JLabel();
    JLabel ltotaltotal = new JLabel();

    JLabel ltotalnet1 = new JLabel();
    JLabel ltotalvat2 = new JLabel();
    JLabel ltotaltotal3 = new JLabel();

    JLabel ltotalnet1pln = new JLabel();
    JLabel ltotalvat2pln = new JLabel();
    JLabel ltotaltotal3pln = new JLabel();

    JLabel linfo11 = new JLabel();
    JLabel linfo12 = new JLabel();
    JLabel linfo13 = new JLabel();

    JLabel linfo21 = new JLabel();
    JLabel linfo22 = new JLabel();
    JLabel linfo23 = new JLabel();

    JTable tpositions = new JTable();

    JButton bcloseBlill = new JButton();
    JButton bcalculatetotal = new JButton();

    public panel4(){
        setLayout(null);
        lcustomer.setText("Customer");
        lcustomer.setBounds(50,100, 100,30);
        ldata.setText("Data");
        ldata.setBounds(50,130,100,30);
        lnip.setText("NIP");
        lnip.setBounds(50,160,100,30);
        ldate.setText("Date");
        ldate.setBounds(400,100,100,30);
        lnumberbill.setText("Number Bill:");
        lnumberbill.setBounds(400,130,100,30);
        lsalesman.setText("SalesMan");
        lsalesman.setBounds(400,160,100,30);
        ldatasale.setText("Data");
        ldatasale.setBounds(400,190,100,30);
        lnipsale.setText("NIP");

        tpositions.setBounds(50,600,600,600);


    }


}
