package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JTextField textfield = new JTextField();
    JButton button = new JButton();

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setText("submit");
        button.setSize(10,15);
        button.addActionListener(this);

        textfield.setPreferredSize(new Dimension(200,50));
        textfield.setFont(new Font("chiller",Font.BOLD,25));
        textfield.setForeground(Color.BLUE);
        textfield.setBackground(Color.DARK_GRAY);
        textfield.setCaretColor(Color.WHITE);
        textfield.setText("enter something!");
        textfield.setEditable(true);

        this.add(textfield);
        this.add(button);
        this.pack();
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //button.setEnabled(true);
            System.out.println("welcome "+textfield.getText());
        }
    }
}
