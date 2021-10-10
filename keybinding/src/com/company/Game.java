package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame =new JFrame("GAME");
    JLabel label = new JLabel();

    Action upAction;
    Action downAction;
    Action leftAction ;
    Action rightAction;


    Game(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label.setBounds(100,100,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upaction");
        label.getActionMap().put("upaction",upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downaction");
        label.getActionMap().put("downaction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftaction");
        label.getActionMap().put("leftaction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightaction");
        label.getActionMap().put("rightaction",rightAction);



        frame.add(label);
        frame.setVisible(true);





    }


    public class UpAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }

    public class RightAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
        }
    }




}
