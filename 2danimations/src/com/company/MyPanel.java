package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyPanel extends JPanel implements ActionListener {

    final int PANELWIDTH = 500;
    final int PANELHEIGHT = 500;
    Image enemy;
    Image space;
    Timer timer ;
    int xVelocity = 1;
    int yVelocity = 1;

    int x = 10;
    int y = 10;

    MyPanel(){

        this.setPreferredSize(new Dimension(PANELWIDTH,PANELHEIGHT));
        this.setBackground(Color.black);
        space = new ImageIcon("C:\\Users\\DELL\\Desktop\\space.PNG").getImage();
        enemy = new ImageIcon("C:\\Users\\DELL\\Desktop\\enemy.PNG").getImage();
        timer = new Timer(10,this);
        timer.start();


    }
    public void paint(Graphics g){

        super.paint(g); //paint background

        Graphics2D gd = (Graphics2D) g;

        gd.drawImage(space ,0,0,null);
        gd.drawImage(enemy ,x,y,null);

    }

    public void actionPerformed(ActionEvent e){

        if (x >= PANELWIDTH - enemy.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity ;

        if (y >= PANELHEIGHT - enemy.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity ;


        repaint();
    }
}
