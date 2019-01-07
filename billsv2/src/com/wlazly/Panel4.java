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
    JLabel lnumberbill1= new JLabel();
    JLabel lsalesman = new JLabel();
    JLabel ldatasale = new JLabel();
    JLabel lnipsale = new JLabel();
    JLabel ldataa = new JLabel();

    JLabel ltotalnet = new JLabel();
    JLabel ltotalvat = new JLabel();
    JLabel ltotaltotal = new JLabel();

    JLabel ltotalnet1 = new JLabel();
    JLabel ltotalvat1 = new JLabel();
    JLabel ltotaltotal1 = new JLabel();


    public static JLabel linfo11 = new JLabel();
    public static JLabel linfo12 = new JLabel();
    public static JLabel linfo13 = new JLabel();

    public static JLabel linfo21 = new JLabel();
    public static JLabel linfo22 = new JLabel();
    public static JLabel linfo23 = new JLabel();

    JTable tpositions = new JTable();

    JButton bcloseBlill = new JButton();
    JButton bclosebill = new JButton();
    JButton bback = new JButton();
    Object[] columns = {"Id", "Name", "Amount", "Price", "Netto", "Brutto", "Vat"};

    public Panel4() {

        setLayout(null);
        lcustomer.setText("Customer");
        lcustomer.setBounds(50, 100, 100, 30);
        linfo11.setBounds(200, 100, 100, 30);
        ldata.setText("Data");
        ldata.setBounds(50, 130, 100, 30);
        linfo12.setBounds(200, 130, 100, 30);
        ldataa.setText(MyDate.MyDate());
        ldataa.setBounds(550, 100, 100, 30);
        lnip.setText("NIP");
        lnip.setBounds(50, 160, 100, 30);
        linfo13.setBounds(200, 160, 100, 30);
        ldate.setText("Date");
        ldate.setBounds(400, 100, 100, 30);
        lnumberbill.setText("Number Bill:");
        lnumberbill.setBounds(400, 130, 100, 30);
        lnumberbill1.setText("Number Bill:");
        lnumberbill1.setBounds(550, 130, 100, 30);

        lsalesman.setText("SalesMan");
        lsalesman.setBounds(400, 160, 100, 30);
        linfo21.setBounds(550, 160, 100, 30);
        ldatasale.setText("Data");
        ldatasale.setBounds(400, 190, 100, 30);
        linfo22.setBounds(550, 190, 100, 30);
        lnipsale.setText("NIP");
        lnipsale.setBounds(400, 220, 100, 30);
        linfo23.setBounds(550, 220, 100, 30);
        bclosebill.setText("Close");
        bclosebill.setBounds(300, 700, 100, 30);
        ltotalnet.setText("Total Netto");
        ltotalnet.setBounds(300, 630, 100, 30);
        ltotalnet1.setBounds(400, 630, 100, 30);
        ltotaltotal.setText("Total Brutto");
        ltotaltotal.setBounds(300, 650, 100, 30);
        ltotaltotal1.setBounds(400, 650, 100, 30);
        ltotalvat.setText("Total Vat");
        ltotalvat.setBounds(300, 670, 100, 30);
        ltotalvat1.setBounds(400, 670, 100, 30);
        bback.setText("Back");
        bback.setBounds(650, 700, 100, 30);

        tpositions.setBounds(50, 300, 500, 300);

        add(lcustomer);
        add(ldata);
        add(lnip);
        add(ldate);
        add(ldataa);
        add(lnumberbill);
        add(lnumberbill1);
        add(lsalesman);
        add(ldatasale);
        add(lnipsale);

        add(linfo11);
        add(linfo12);
        add(linfo13);
        add(linfo21);
        add(linfo22);
        add(linfo23);

        add(ltotalnet);
        add(ltotalnet1);
        add(ltotaltotal);
        add(ltotaltotal1);
        add(ltotalvat);
        add(ltotalvat1);
        add(bclosebill);
        add(bback);

        add(tpositions);


        bback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container, "1");

            }
        });

        Panel3.bopen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel4.linfo11.setText(Panel3.tbill.getSelectedValue().name1);
                Panel4.linfo12.setText(Panel3.tbill.getSelectedValue().data1);
                Panel4.linfo13.setText(Panel3.tbill.getSelectedValue().nip1);

                Panel4.linfo21.setText(Panel3.tbill.getSelectedValue().name2);
                Panel4.linfo22.setText(Panel3.tbill.getSelectedValue().data2);
                Panel4.linfo23.setText(Panel3.tbill.getSelectedValue().nip2);


                DefaultTableModel model = new DefaultTableModel();
                Object[] row = new Object[7];
                double sum4 = 0;
                double sum5 = 0;
                double sum6 = 0;
                model.setColumnIdentifiers(columns);
                tpositions.setModel(model);
                tpositions.setRowHeight(20);

                for (int i = 0; i < Panel3.tbill.getSelectedValue().billlist.size(); i++) {
                    row[0] = Panel3.tbill.getSelectedValue().billlist.get(i).nameposition;
                    row[1] = Panel3.tbill.getSelectedValue().billlist.get(i).price;
                    row[2] = Panel3.tbill.getSelectedValue().billlist.get(i).amount;
                    row[3] = Panel3.tbill.getSelectedValue().billlist.get(i).units;
                    row[4] = Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                            Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount);
                    row[5] = (Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                            Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount))
                            * (((Double.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).vat)) + 100) / 100);
                    row[6] =
                            ((Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                                    Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount))
                                    * (((Double.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).vat)) + 100) / 100))
                                    - (Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                                    Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount));
                    model.addRow(row);

                    sum4 = sum4 + Double.valueOf(Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                            Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount));
                    ltotalnet1.setText(String.valueOf(sum4));

                    sum5 = sum5 + Double.valueOf(model.getValueAt(i, 5).toString());
                    ltotaltotal1.setText(String.valueOf(sum5));

                    sum6 = sum6 + Double.valueOf(((Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                            Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount))
                            * (((Double.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).vat)) + 100) / 100))
                            - (Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).price) *
                            Integer.valueOf(Panel3.tbill.getSelectedValue().billlist.get(i).amount)));

                    ltotalvat1.setText((String.valueOf(sum6)));


                }


            }
        });

        bclosebill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel3.tbill.getSelectedValue().setClose(true);

                repaint();


            }
        });


    }


}
