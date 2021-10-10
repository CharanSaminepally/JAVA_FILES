package com.company;
import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    NewWindow(){

        // LABELS

        label.setVisible(true);
        label.setFont(new Font("mv boli",Font.BOLD,20));
        label.setText("HELLO THIS IS NEW WINDOW !");
        label.setBounds(20,20,450,150);

        // FRAMES

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

    }
}
