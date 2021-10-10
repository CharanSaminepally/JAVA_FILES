package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class  Main {

    public static void main (String [] args){

        String day = "sunday";

        switch(day) {
            case "sunday":
                System.out.println("enjoy the day !!!");
                break;
            case "monday" :
                System.out.println("uhh!! boring day !!");
                break;
            case "thursday" :
                System.out.println("nothing much just wait for Sunday !!!");
                break;
            case "saturday":
                System.out.println("just relax for sunday !!!");
                break;
            case "tuesday":
                System.out.println("nothing much !");
                break;
            case "wednesday":
                System.out.println("nothing really much!!");
                break;
            case "friday":
                System.out.println("just wait patiently for sunday!!!");
                break;
            default:
                System.out.println("that's not a day");
        }

    }

}
