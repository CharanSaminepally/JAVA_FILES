package com.company;

import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String [] args){


        JFrame frame = new JFrame();

        frame.setSize(420,420);
        frame.setTitle("NewFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(10,50,250));
        frame.setVisible(true);

        ImageIcon imageicon = new ImageIcon("C:\\Users\\DELL\\Desktop\\icon.JPG");
        frame.setIconImage(imageicon.getImage());
    }
}
