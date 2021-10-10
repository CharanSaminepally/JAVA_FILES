package com.company;
import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel = new MyPanel();

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

    }
}
