package com.wlazly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaLesson21 extends JFrame {
    JButton button1;
    JTextField textField1;
    JTextArea textArea1;
    int buttonClicked;


    public JavaLesson21(){


        this.setSize(400,400);
        this.setLocationRelativeTo(null);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width/2)-(this.getWidth()/2);
        int yPos = (dim.height/2)-(this.getHeight()/2);
        this.setLocation(xPos, yPos);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My First Frame");
        JPanel thePanel = new JPanel();
        button1= new JButton("Click Here");

        ListenForButton lForButton = new ListenForButton();

        button1.addActionListener(lForButton);
        thePanel.add(button1);
        textField1 = new JTextField("", 15);

        ListenForKeys lForKeys = new ListenForKeys();
        textField1.addKeyListener(lForKeys);
        thePanel.add(textField1);
        textArea1 = new JTextArea(15,20);
        textArea1.setText("Tracking Events\n");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        JScrollPane scrolbar1 = new JScrollPane(textArea1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrolbar1);

        this.add(thePanel);
        ListenForWindow lForWindow = new ListenForWindow();
        this.addWindowListener(lForWindow);
        this.setVisible(true);

        ListenForMouse lForMouse = new ListenForMouse();
        thePanel.addMouseListener(lForMouse);



    }

    //Implements Listeners


    private class ListenForButton implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            if (e.getSource()== button1){
                buttonClicked++;
                textArea1.append("Button clicked" + buttonClicked+
                        "times\n");

            }
        }
    }

    private class ListenForKeys implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            textArea1.append("Key Hit: " +e.getKeyChar()+ "\n");
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    private class ListenForWindow implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            textArea1.append("Window Created");
        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

       // this.dispose();

        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            textArea1.append("Window is No Active");
        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    private class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            textArea1.append("Mouse Panel pos: "+ e.getX()+" "+e.getY()+ "\n");
            textArea1.append("Mouse Screen pos: "+ e.getXOnScreen()+" "+e.getYOnScreen()+ "\n");
            textArea1.append("Mouse Button: "+ e.getButton());
            textArea1.append("Mouse Clicks:  "+ e.getClickCount());



        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }



}
