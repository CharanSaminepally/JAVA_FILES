package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem loaditem;
    JMenuItem saveitem;
    JMenuItem exititem;

    ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Desktop\\FILES FOR JAVA\\button.JPG");

    MyFrame(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("MENU");

        menubar = new JMenuBar();

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        helpmenu = new JMenu("Help");

        loaditem = new JMenuItem("Load");
        saveitem = new JMenuItem("Save");
        exititem = new JMenuItem("Exit");

        loaditem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);

        loaditem.setIcon(icon);
        saveitem.setIcon(icon);
        exititem.setIcon(icon);

        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);

        filemenu.add(loaditem);
        filemenu.add(saveitem);
        filemenu.add(exititem);

        this.setJMenuBar(menubar);

        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loaditem){
            System.out.println("Your File Is Loading.........");
        }
        else if(e.getSource()==saveitem){
            System.out.println("You Saved The File!");
        }
        else if(e.getSource()==exititem){
            System.exit(0);
        }

    }
}
