package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main{

    public static void main(String [] args){

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\Desktop\\icon.JPG");
        Border border = BorderFactory.createLineBorder(Color.black,30);

        JLabel label = new JLabel();
        label.setText("Hola How's the label!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00));
        label.setBackground(new Color(165,55,155));
        label.setIconTextGap(25);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(100,100,300,300);
        label.setFont(new Font("cambria",Font.BOLD,50));



        JFrame frame = new JFrame();
        //frame.setSize(500,500);
        frame.setTitle("MyFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setIconImage(image.getImage());
        //frame.setLayout(null);
        frame.pack();
        //ADD ALL THE COMPONENTS BEFORE PACK FUNCTION

    }
}
