package com.wlazly;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static com.wlazly.Panel1.card;
import static com.wlazly.Panel1.container;

public class Panel4 extends JPanel {
    Date data1 = new Date();

    JLabel lcustomer = new JLabel();
    JLabel ldata = new JLabel();
    JLabel lnip = new JLabel();

    JLabel ldate = new JLabel();
    JLabel lnumberbill = new JLabel();
    JLabel lsalesman = new JLabel();
    JLabel ldatasale = new JLabel();
    JLabel lnipsale = new JLabel();
    JLabel ldataa = new JLabel();

   JLabel ltotalnet = new JLabel();
    JLabel ltotalvat = new JLabel();
    JLabel ltotaltotal = new JLabel();

     JLabel ltotalnet1 = new JLabel();
    JLabel ltotalvat2 = new JLabel();
     JLabel ltotaltotal3 = new JLabel();

    JLabel ltotalnet1pln = new JLabel();
     JLabel ltotalvat2pln = new JLabel();
     JLabel ltotaltotal3pln = new JLabel();

   public static JLabel linfo11 = new JLabel();
    public static JLabel linfo12 = new JLabel();
    public static JLabel linfo13 = new JLabel();

    public static JLabel linfo21 = new JLabel();
    public static JLabel linfo22 = new JLabel();
    public static JLabel linfo23 = new JLabel();

    public JTable tpositions = new JTable();

    JButton bcloseBlill = new JButton();
    JButton bcalculatetotal = new JButton();
    JButton bback = new JButton();
    Object[] colums = {"Id","Name","Amount","Units","Vat"};


    public Panel4(){

        setLayout(null);
        lcustomer.setText("Customer");
        lcustomer.setBounds(50,100, 100,30);
        linfo11.setBounds(200,100,100,30);
        ldata.setText("Data");
        ldata.setBounds(50,130,100,30);
        linfo12.setBounds(200,100,100,30);
        ldataa.setText(MyDate.MyDate());
        ldataa.setBounds(550,100,100,30);
        lnip.setText("NIP");
        lnip.setBounds(50,160,100,30);
        linfo13.setBounds(200,160,100,30);
        ldate.setText("Date");
        ldate.setBounds(400,100,100,30);
        lnumberbill.setText("Number Bill:");
        lnumberbill.setBounds(400,130,100,30);

        lsalesman.setText("SalesMan");
        lsalesman.setBounds(400,160,100,30);
        linfo21.setBounds(550,160,100,30);
        ldatasale.setText("Data");
        ldatasale.setBounds(400,190,100,30);
        linfo22.setBounds(550,150,100,30);
        lnipsale.setText("NIP");
        lnipsale.setBounds(400,220,100,30);
        linfo23.setBounds(550,220,100,30);
        bback.setText("Back");
        bback.setBounds(650,700,100,30);

        tpositions.setBounds(50,300,500,300);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(colums);
        tpositions.setModel(model);
        tpositions.setRowHeight(30);





        add(lcustomer);
        add(ldata);
        add(lnip);
        add(ldate);
        add(ldataa);
        add(lnumberbill);
        add(lsalesman);
        add(ldatasale);
        add(lnipsale);

        add(linfo11);
        add(linfo12);
        add(linfo13);
        add(linfo21);
        add(linfo22);

        add(bback);

        add(tpositions);


        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"1");

            }
        });
            Object[] row = new Object[5];
        Panel3.baddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                row[0]= Panel3.titem.getText();
                row[1]= Panel3.tprice.getText();
                row[2]= Panel3.tamount.getText();
                row[3]= Panel3.cunit.getSelectedItem();
                row[4]= Panel3.tvat.getText();

                model.addRow(row);
            }
        });

    }


}
