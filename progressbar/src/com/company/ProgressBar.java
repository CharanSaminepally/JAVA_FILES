package com.company;
import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame ;
    JProgressBar bar;

    ProgressBar(){

        frame = new JFrame();
        bar = new JProgressBar(0,500);

        bar.setBounds(5,5,500,50);
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        bar.setFont(new Font("chiller",Font.BOLD,30));

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(530,500);
        frame.setTitle("ProgressBar");

        fill();

    }
    public void fill(){

        int counter=500;

        while(counter>0){

            bar.setValue(counter);
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            counter -=1;
        }
        bar.setString("Done!  :)");
    }
}
