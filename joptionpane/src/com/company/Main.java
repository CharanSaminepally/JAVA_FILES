package com.company;
import javax.swing.*;

public class Main{

    public static void main(String[] args) {

       /* JOptionPane.showMessageDialog(null,"hello , how are you?","MYTITLE",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello , how are you?","MYTITLE",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello , how are you?","MYTITLE",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello , how are you?","MYTITLE",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"hello , how are you?","MYTITLE",JOptionPane.QUESTION_MESSAGE);
       */

        //JOptionPane.showConfirmDialog(null,"do you code?","HELLO",JOptionPane.YES_NO_CANCEL_OPTION);
        String [] responses = {"NICE","OHH!"};
        JOptionPane.showInputDialog(
                null,
                "HELLO, HOW ARE YOU?",
                "MYTITLE",
                JOptionPane.YES_NO_CANCEL_OPTION,
                null,
                responses,
                0);

    }
}
