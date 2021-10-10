package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class  Main {

    public static void main (String [] args){


        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);

        System.out.println("enter x :");
        x = input.nextDouble();
        System.out.println("enter y :");
        y = input.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("your hypotenuse is :"+z);

    }

}
