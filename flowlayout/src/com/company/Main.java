package com.company;
import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("MYFRAME");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel =new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.black);
        panel.setLayout(new FlowLayout());
        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
    }
}
