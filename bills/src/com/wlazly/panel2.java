package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.wlazly.Menu.*;
import static com.wlazly.panel3.*;


public class panel2 extends JPanel implements ActionListener{
   JLabel lcustomer = new JLabel();
   JLabel ldata = new JLabel();
   JLabel lNIP = new JLabel();

   JLabel lpickcustomer = new JLabel();
   JLabel lpicksalesman = new JLabel();

   JTextField tcustomer = new JTextField();
   JTextField tdata = new JTextField();
   JTextField tNIP = new JTextField();

   JButton baddCustomer = new JButton();
   JButton bshowCustomer = new JButton();
   JButton bdeleteCustomer = new JButton();
   JButton bnewBill = new JButton();


    public panel2(){



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
