package com.wlazly;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.wlazly.Menu.*;
import static com.wlazly.panel2.*;

public class panel3 extends JPanel {
    public static JButton button2 = new JButton();
    public static JLabel label2 = new JLabel();
    public static  JPanel panel2 = new JPanel();


    // create JFrame and JTable
    public static   JFrame frame = new JFrame();
    public static   JTable table = new JTable();


    // create JTextFields
//    public static   JTextField NrBill = new JTextField();
//    public static   JTextField Date = new JTextField();
//    public static  JTextField Customer = new JTextField();
//    public static   JTextField Amount = new JTextField();
//    public static  JTextField AmountGross = new JTextField();
//    public static  JTextField VAT = new JTextField();

    // create JButtons
   public static  JButton btnAdd = new JButton("Add");
   public static  JButton btnDelete = new JButton("Delete");
    public static  JButton btnUpdate = new JButton("Update");


    // create a table model and set a Column Identifiers to this model
    Object[] columns = {"NrBill","Date","Customer","Amount","AmountGross","VAT"};
    public static DefaultTableModel model = new DefaultTableModel();
    public static Object[] row = new Object[6];


    public panel3(){
        setLayout(null);
        setBackground(Color.yellow);
        button2.setText("Back");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                card.show(container,"1");}

        });
        label2.setVisible(true);
        button2.setBounds(450,500,100,30);
        label2.setBounds(50,50,100,50);
        add(label2);
        add(button2);



        // create a table model and set a Column Identifiers to this model
        Object[] columns = {"NrBill","Date","Customer","Amount","AmountGross","VAT"};
       DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);





//        NrBill.setBounds(20, 220, 100, 25);
//        Date.setBounds(20, 250, 100, 25);
//        Customer.setBounds(20, 280, 100, 25);
//        Amount.setBounds(20, 310, 100, 25);
//        AmountGross.setBounds(20, 340, 100, 25);
//        VAT.setBounds(20, 370, 100, 25);


       btnAdd.setBounds(150, 220, 100, 25);
       btnUpdate.setBounds(150, 265, 100, 25);
        btnDelete.setBounds(150, 310, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 600, 200);

        setLayout(null);

        add(pane);

        // add JTextFields to the jframe
//        add(NrBill);
//        add(Date);
//        add(Customer);
//        add(Amount);
//        add(AmountGross);
//        add(VAT);

        // add JButtons to the jframe
        add(btnAdd);
        add(btnDelete);
        add(btnUpdate);

        // create an array of objects to set the row data


        // button add row

// zadzialalo
        com.wlazly.panel2.btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = com.wlazly.panel2.tnrbill.getText();
                row[1] = com.wlazly.panel2.tdate.getText();
                row[2] = com.wlazly.panel2.tcustomer.getText();
                row[3] = com.wlazly.panel2.tamount.getText();
                row[4] = Integer.valueOf(tamount.getText())*1.23;
                row[5] = Integer.valueOf(tamount.getText())*0.23;

                // add row to the model
                model.addRow(row);
            }
        });

        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });

        // get selected row data From table to textfields
        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();

                tnrbill.setText(model.getValueAt(i, 0).toString());
                tdate.setText(model.getValueAt(i, 1).toString());
                tcustomer.setText(model.getValueAt(i, 2).toString());
                tamount.setText(model.getValueAt(i, 3).toString());
                tamount.setText(model.getValueAt(i, 4).toString());
                tamount.setText(model.getValueAt(i, 5).toString());
            }
        });

        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if(i >= 0)
                {
                    model.setValueAt(tnrbill.getText(), i, 0);
                    model.setValueAt(tdate.getText(), i, 1);
                    model.setValueAt(tcustomer.getText(), i, 2);
                    model.setValueAt(tamount.getText(), i, 3);
                    model.setValueAt(tamount.getText(), i, 4);
                    model.setValueAt(tamount.getText(), i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });


    }




    }