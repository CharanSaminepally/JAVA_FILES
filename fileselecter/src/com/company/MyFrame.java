package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton("select file");

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){

            JFileChooser filechooser = new JFileChooser();

            //filechooser.setCurrentDirectory("FILE PATH");

            int response = filechooser.showOpenDialog(null);
            //int response = filechooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){

                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);

            }
        }

    }
}
