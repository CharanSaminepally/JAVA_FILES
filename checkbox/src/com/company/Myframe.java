package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {


    JButton button = new JButton();
    JCheckBox checkbox = new JCheckBox();
    ImageIcon xicon = new ImageIcon("C:\\Users\\DELL\\Desktop\\wrong.PNG");
    ImageIcon selectedicon = new ImageIcon("C:\\Users\\DELL\\Desktop\\right.PNG");

    Myframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setText("submit");
        button.setSize(10,15);
        button.addActionListener(this);

        checkbox.setText("I'M NOT A ROBOT");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("chiller",Font.BOLD,35));
        checkbox.setIcon(xicon);
        checkbox.setSelectedIcon(selectedicon);

        this.add(checkbox);
        this.add(button);
        this.pack();
        this.setVisible(true);
        this.setTitle("checkbox function");

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());

        }
    }
}
