package com.company;
import javax.swing.JOptionPane;
public class  Main {

    public static void main (String [] args){

        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null , " hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age?"));
        JOptionPane.showMessageDialog(null,"you are "+age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height?"));
        JOptionPane.showMessageDialog(null, "your height is "+height+" inch");
    }

}
