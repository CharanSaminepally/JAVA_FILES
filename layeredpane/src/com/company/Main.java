package com.company;
import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String[] args) {

        //LABELS

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,150,150);

        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,150,150);

        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,150,150);

        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,500,500);

        pane.add(label1, Integer.valueOf(0));
        pane.add(label2, Integer.valueOf(1));
        pane.add(label3, Integer.valueOf(2));

        // FRAME COMMANDS

        JFrame frame = new JFrame();
        frame.setTitle("LAYEREDFRAME");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(pane);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

    }
}
