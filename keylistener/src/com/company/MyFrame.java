package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Desktop\\rocket.PNG");

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label.setBounds(0,0,100,100);
        label.setIcon(icon);

        this.add(label);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
        this.addKeyListener(this);
        this.setTitle("Key Listener");

    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a' : label.setLocation(label.getX()-10 , label.getY() );
                break;
            case 'w' : label.setLocation(label.getX() , label.getY()-10 );
                break;
            case 'd' : label.setLocation(label.getX()+10 , label.getY() );
                break;
            case 's' : label.setLocation(label.getX() , label.getY()+10 );
                break;

        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37 : label.setLocation(label.getX()-10 , label.getY() );
                break;
            case 38 : label.setLocation(label.getX() , label.getY()-10 );
                break;
            case 39 : label.setLocation(label.getX()+10 , label.getY() );
                break;
            case 40 : label.setLocation(label.getX() , label.getY()+10 );
                break;

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("you pressed the key: "+e.getKeyChar());
        System.out.println("you pressed the keycode: "+e.getKeyCode());

    }
}
