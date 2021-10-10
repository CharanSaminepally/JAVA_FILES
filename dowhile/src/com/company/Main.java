package com.company;
import java.util.Scanner;
public class  Main {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        String name ="";

        while(name.isBlank()){
            System.out.println("enter a name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello "+name);
    }
}
