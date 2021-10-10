package com.company;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    DragPanel dragpanel = new DragPanel();


    MyFrame() {

        this.add(dragpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Drag & Drop");
        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}
