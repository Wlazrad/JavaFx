package com.wlazly;
/*
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class JavaLesson22 extends JFrame {

    JButton button1;
    JLabel label1, label2, label3;
    JTextField textField1, textField2;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton addNums, substractNums, multNums, divideNums;
    JSlider howManyTimes;

    double number1, number2, number3;


    public static void main(String[] args) {
        new JavaLesson22();

    }

    public JavaLesson22() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Third Frame");
        JPanel thePanel = new JPanel();

        button1 = new JButton("Calculate");
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        thePanel.add(button1);
        label1 = new JLabel("Number 1");
        thePanel.add(label1);

        textField1 = new JTextField("", 5);
        thePanel.add(textField1);
//-----------------
        label2 = new JLabel("Number 2");
        thePanel.add(label2);

        textField2 = new JTextField("", 5);
        thePanel.add(textField1);
//-----------------
        dollarSign = new JCheckBox("Dollars");
        commaSeparator = new JCheckBox("Commas");

        thePanel.add(dollarSign);
        thePanel.add(commaSeparator, true);

        addNums = new JRadioButton("Add");
        substractNums = new JRadioButton("Subtract");
        multNums = new JRadioButton("Multiply");
        divideNums = new JRadioButton("Divide");

        ButtonGroup operation = new ButtonGroup();


        operation.add(addNums);
        operation.add(substractNums);
        operation.add(multNums);
        operation.add(divideNums);


        JPanel operPanel = new JPanel();

        Border operBorder = BorderFactory.createTitledBorder("Operation");
        operPanel.setBorder(operBorder);

        ((TitledBorder) operBorder).setBorder(operBorder);

        operation.add(addNums);
        operation.add(substractNums);
        operation.add(multNums);
        operation.add(divideNums);

        addNums.setSelected(true);

        thePanel.add(operPanel);

        label3 = new JLabel("Perform How Many Times");
        thePanel.add(label3);
        howManyTimes = new JSlider(0, 99, 1);

        howManyTimes.setMinorTickSpacing(1);
        howManyTimes.setMajorTickSpacing(10);
        howManyTimes.setPaintTicks(true);
        howManyTimes.setPaintLabels(true);
        ListenForSlider listenForSlider = new ListenForSlider();
        howManyTimes.addChangeListener(listenForSlider);
        thePanel.add(howManyTimes);
        this.add(thePanel);
        this.setVisible(true);
        textField1.requestFocus();

    }

    private class ListenForButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                try {
                    number1 = Double.parseDouble(textField1.getText());
                    number2 = Double.parseDouble(textField2.getText());
                } catch (NumberFormatException excep) {
                    JOptionPane.showMessageDialog(JavaLesson22.this, "Please Enter the Right Info"
                            , "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);

                }
                if (addNums.isSelected()) {
                    totalCalc = addNumbers(number1, number2, howManyTimes.getValue());
                } else if (substractNums.isSelected()) {
                    totalCalc = subtractNumbers(number1, number2, howManyTimes.getValue());

                } else if (multNums.isSelected()) {
                    totalCalc = multiplyNumbers(number1, number2, howManyTimes.getValue());

                } else {
                    totalCalc = divideNumbers(number1, number2, howManyTimes.getValue());


                }
                if(dollar.isSelected()){
                    NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                    JOptionPane.showMessageDialog(JavaLesson22.this, numFormat(totalCalc),"Solution",JOptionPane.INFORMATION_MESSAGE);


                }else if(commaSeparator.isSelected()){
                    NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                    JOptionPane.showMessageDialog(JavaLesson22.this, numFormat(totalCalc),"Solution",JOptionPane.INFORMATION_MESSAGE);

                }else{

                    JOptionPane.showMessageDialog(JavaLesson22.this, totalcalc,"Solution",JOptionPane.INFORMATION_MESSAGE);

                }

            }
        }
    }

    private class ListenForSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            if (e.getSource() == howManyTimes){
                label3.setText("Perform How Many Times? "+howManyTimes.getValue());
            }
        }
    }

    public static double addNumbers(double number1, double number2, int howMany) {
    double total = 0 ;
    int i =1;
    while(i<=howMany)
    {
        total = total + (number1 + number2);
        i++;
    }
    return total;
    }
    public static double substractNumbers(double number1, double number2, int howMany) {
        double total = 0 ;
        int i =1;
        while(i<=howMany)
        {
            total = total + (number1 - number2);
            i++;
        }
        return total;

    }
    public static double multiplyNumbers(double number1, double number2, int howMany) {
        double total = 0 ;
        int i =1;
        while(i<=howMany)
        {
            total = total + (number1 * number2);
            i++;
        }
        return total;

    }
    public static double divideNumbers(double number1, double number2, int howMany) {
        double total = 0 ;
        int i =1;
        while(i<=howMany)
        {
            total = total + (number1 / number2);
            i++;
        }
        return total;

    }


}*/