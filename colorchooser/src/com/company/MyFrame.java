package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("Choose a Colour");
    JLabel label = new JLabel("Hello , This Is Some Text :)");

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setFont(new Font("chiller",Font.BOLD,60));
        button.addActionListener(this);



        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){

            JColorChooser colorchooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick A Color",Color.black);

            label.setForeground(color);
            //label.setBackground(color);
        }


    }
}
