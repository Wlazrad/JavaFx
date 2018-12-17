package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Menu.*;


public class panel2 extends JPanel implements ActionListener{
    JButton button2 = new JButton();
    JLabel l2customer = new JLabel();
    JLabel l2data = new JLabel();
    JLabel l2NIP = new JLabel();
    JLabel l2amount = new JLabel();
    JLabel l2amountgross = new JLabel();
    JLabel l2VAT = new JLabel();



    JPanel panel2 = new JPanel();
    JButton button3 = new JButton();


    public static JTextField tnrbill = new JTextField();
    public static JTextField tdate = new JTextField();
    public static JTextField tcustomer = new JTextField();
    public static JTextField tamount = new JTextField();
    public static JTextField tquantity = new JTextField();




    public static  JButton btnAdd = new JButton("Add");
    public static  JButton btnDelete = new JButton("Clear");
    public static  JButton btnUpdate = new JButton("Update");


    String[] sctype={"szt.","l","kg",};
    public static JComboBox ctype;





    JTable table = new JTable();
        JTextField Billl = new JTextField();


    double number;

    public panel2(){

        ctype = new JComboBox(sctype);




        setLayout(null);
        setBackground(Color.white);
        button2.setText("Back");
        button3.setText("Add");

        l2customer.setText("Customer");
        l2data.setText("Data");
        l2NIP.setText("NIP");

        l2amount.setText("Amount");
        l2amountgross.setText("AmountGross");
        l2VAT.setText("VAT");
        tnrbill.setText("write something in");


        button2.setBounds(450,500,100,30);
        button3.setBounds(350,500,100,30);
        l2customer.setBounds(50,50,100,30);
        l2data.setBounds(50,80,100,30);
        l2NIP.setBounds(50,110,100,30);
        l2amount.setBounds(50,140,100,30);
        l2amountgross.setBounds(50,170,100,30);
        l2VAT.setBounds(50,200,100,30);
        ctype.setBounds(50,230,100,30);



        tnrbill.setBounds(130,50,100,30);
        tdate.setBounds(130,80,100,30);
        tcustomer.setBounds(130,110,100,30);
        tamount.setBounds(130,140,100,30);


        btnAdd.setBounds(200,200,100,30);
        btnDelete.setBounds(200,230,100,30);
        btnUpdate.setBounds(200,260,100,30);
        btnAdd.setVisible(true);





        add(tnrbill);
        add(l2customer);
        add(l2data);
        add(l2NIP);
        add(l2amount);
        add(l2amountgross);
        add(l2VAT);
        add(ctype);
        add(ctype);

        add(button2);
        add(button3);
        add(tnrbill);
        add(tdate);
        add(tdate);
        add(tcustomer);
        add(tamount);


        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);

        Object[] row = new Object[6];

        // button add row
        button2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                panel3.row[0] = com.wlazly.panel2.tnrbill.getText();
                panel3.row[1] = com.wlazly.panel2.tdate.getText();
                panel3.row[2] = com.wlazly.panel2.tcustomer.getText();
                panel3.row[3] = com.wlazly.panel2.tamount.getText();
                panel3.row[4] = Integer.valueOf(tamount.getText())*1.23;
                panel3.row[5] = Integer.valueOf(tamount.getText())*0.23;

                // add row to the model
                panel3.model.addRow(row);

            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


       button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               card.show(container,"1");
            }
        });





    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = new Object();
        if (source==tnrbill){
            number = Double.parseDouble(tnrbill.getText());
            Bills.BILL1.setNumber((int) number);


        }

    }


}
