package com.company;
import java.util.Scanner;
public class  Main {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("what is your name");
        String name = input.nextLine();
        System.out.println("what is your age");
        int age = input.nextInt();
        System.out.println("hello "+name);
        System.out.println("you are "+age +" years old ");

    }

}
