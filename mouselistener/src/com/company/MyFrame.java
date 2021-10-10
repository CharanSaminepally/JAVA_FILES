package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label ;
    ImageIcon smile ;
    ImageIcon nervous ;
    ImageIcon pain ;
    ImageIcon dizzy ;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("C:\\Users\\DELL\\Desktop\\smile.PNG");
        nervous = new ImageIcon("C:\\Users\\DELL\\Desktop\\nervous.PNG");
        pain = new ImageIcon("C:\\Users\\DELL\\Desktop\\pain.PNG");
        dizzy = new ImageIcon("C:\\Users\\DELL\\Desktop\\dizzy.PNG");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //label.setIcon(dizzy);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(smile);

    }
}
