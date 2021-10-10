package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main{

    public static void main(String [] args){

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\Desktop\\icon.JPG");

        //LABEL COMMANDS

        JLabel label = new JLabel();
        label.setText("Hello this is charan");
        label.setIcon(image);
        label.setFont(new Font("cambria" , Font.BOLD,10));
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);



        //PANEL COMMANDS

        JPanel redpanel = new JPanel();
        JPanel greenpanel = new JPanel();
        JPanel bluepanel = new JPanel();
        JPanel yellowpanel = new JPanel();


        redpanel.setBackground(Color.red);
        greenpanel.setBackground(Color.green);
        bluepanel.setBackground(Color.blue);
        yellowpanel.setBackground(Color.yellow);

        redpanel.setBounds(0,0,200,200);
        greenpanel.setBounds(200,0,200,200);
        bluepanel.setBounds(0,200,200,200);
        yellowpanel.setBounds(200,200,200,200);

        greenpanel.setLayout(null);


        //FRAME COMMANDS
        JFrame frame = new JFrame();
        frame.setTitle("MyFrame");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setBackground(Color.BLUE);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(bluepanel);
        frame.add(yellowpanel);
        greenpanel.add(label);
    }
}
