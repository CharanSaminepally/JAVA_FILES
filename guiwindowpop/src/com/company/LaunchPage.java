package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton();

    LaunchPage(){

        button.setBounds(100,100,200,50);
        button.setText("Click to open new window!");
        button.setFocusable(false);

        button.addActionListener(this);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(button);

    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button){
            // to only open one window
            //frame.dispose();
            NewWindow mywindow = new NewWindow();
        }
    }
}
