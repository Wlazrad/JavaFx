package com.wlazly;

import java.awt.Color;
        import java.awt.Font;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JScrollPane;
        import javax.swing.JTable;
        import javax.swing.JTextField;
        import javax.swing.table.DefaultTableModel;

public class JTableRow {

    public static void main(String[] args){

        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable();

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

        // create JTextFields
        JTextField NrBill = new JTextField();
        JTextField Date = new JTextField();
        JTextField Customer = new JTextField();
        JTextField Amount = new JTextField();
        JTextField AmountGross = new JTextField();
        JTextField VAT = new JTextField();

        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        NrBill.setBounds(20, 220, 100, 25);
        Date.setBounds(20, 250, 100, 25);
        Customer.setBounds(20, 280, 100, 25);
        Amount.setBounds(20, 310, 100, 25);
        AmountGross.setBounds(20, 340, 100, 25);
        VAT.setBounds(20, 370, 100, 25);

        btnAdd.setBounds(150, 220, 100, 25);
        btnUpdate.setBounds(150, 265, 100, 25);
        btnDelete.setBounds(150, 310, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);

        frame.setLayout(null);

        frame.add(pane);

        // add JTextFields to the jframe
        frame.add(NrBill);
        frame.add(Date);
        frame.add(Customer);
        frame.add(Amount);
        frame.add(AmountGross);
        frame.add(VAT);

        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);

        // create an array of objects to set the row data
        Object[] row = new Object[6];

        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                row[0] = NrBill.getText();
                row[1] = Date.getText();
                row[2] = Customer.getText();
                row[3] = Amount.getText();
                row[4] = AmountGross.getText();
                row[5] = VAT.getText();

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

                NrBill.setText(model.getValueAt(i, 0).toString());
                Date.setText(model.getValueAt(i, 1).toString());
                Customer.setText(model.getValueAt(i, 2).toString());
                Amount.setText(model.getValueAt(i, 3).toString());
                AmountGross.setText(model.getValueAt(i, 4).toString());
                VAT.setText(model.getValueAt(i, 5).toString());
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
                    model.setValueAt(NrBill.getText(), i, 0);
                    model.setValueAt(Date.getText(), i, 1);
                    model.setValueAt(Customer.getText(), i, 2);
                    model.setValueAt(Amount.getText(), i, 3);
                    model.setValueAt(AmountGross.getText(), i, 4);
                    model.setValueAt(VAT.getText(), i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });

        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}