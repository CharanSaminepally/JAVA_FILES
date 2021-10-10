package com.company;

import java.util.Scanner;

public class  Main {

    public static void main (String [] args){

        Scanner input = new Scanner (System.in);

        System.out.println("press 'q' or 'Q' to quit the game");
        String response = input.nextLine();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("you quit the game!!!");
        }
        else {
            System.out.println("keep playing !!!h");

        }

    }

}
