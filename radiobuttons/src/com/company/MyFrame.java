package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button = new JButton();
    JCheckBox checkbox = new JCheckBox();
    ImageIcon pizzaicon = new ImageIcon("C:\\Users\\DELL\\Desktop\\pizza.PNG");
    ImageIcon burgericon = new ImageIcon("C:\\Users\\DELL\\Desktop\\burger.PNG");
    ImageIcon hotdogicon = new ImageIcon("C:\\Users\\DELL\\Desktop\\hotdog.PNG");

    JRadioButton pizzabutton = new JRadioButton("pizza");
    JRadioButton burgerbutton = new JRadioButton("burger");
    JRadioButton hotdogbutton = new JRadioButton("hotdog");

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(burgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        burgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        pizzabutton.setIcon(pizzaicon);
        burgerbutton.setIcon(burgericon);
        hotdogbutton.setIcon(hotdogicon);

        this.add(pizzabutton);
        this.add(burgerbutton);
        this.add(hotdogbutton);
        this.pack();
        this.setVisible(true);
        this.setTitle(" radio buttons ");
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==pizzabutton){
            System.out.println("you ordered pizza");
        }
        else if(e.getSource()==burgerbutton){
            System.out.println("you ordered burger");
        }
        else if(e.getSource()==hotdogbutton){
            System.out.println("you ordered hotdog");
        }
    }
}
