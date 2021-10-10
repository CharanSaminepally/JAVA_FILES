package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image = new ImageIcon("C:\\Users\\DELL\\Desktop\\cloud.PNG").getImage();


    MyPanel(){

        this.setPreferredSize(new Dimension(500,500));
        this.setOpaque(true);
    }
    public void paint(Graphics g){

        Graphics2D gd = (Graphics2D) g;

        gd.setPaint(Color.RED);
        gd.setStroke(new BasicStroke(5));

        //gd.drawLine(0,0,500,500);
        //gd.drawOval(10,10,100,150);
        //gd.drawOval(400,10,100,150);

        //gd.setPaint(Color.black);
        //gd.fillOval(175,200,150,100);

        gd.setFont(new Font("chiller",Font.BOLD,30));

        gd.drawImage(image,0,0,null);
        gd.drawString("THIS IS CHARAN",175,50);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        gd.drawPolygon(xPoints,yPoints,3);
        gd.fillPolygon(xPoints,yPoints,3);

    }
}
