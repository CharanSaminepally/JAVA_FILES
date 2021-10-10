package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myframe extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton();
    ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Desktop\\button.JPG");
    JLabel label = new JLabel();

    myframe() {

        //labels
        label.setVisible(false);
        label.setBounds(180, 250, 150, 150);
        label.setIcon(icon);

        //buttons

        button.setBounds(50, 50, 300, 150);
        button.addActionListener(this);
        button.setText("hi there! i am a button!!");
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("comic sans", Font.ITALIC, 20));
        button.setIconTextGap(5);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.DARK_GRAY);
        button.setEnabled(true);

        //frames

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.add(button);
        frame.setLayout(null);
        //frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("MYFRAME");
        frame.setIconImage(icon.getImage());
        frame.add(label);

    }



    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
            System.out.println("HELLO ");
            label.setVisible(true);


        }
    }
}
