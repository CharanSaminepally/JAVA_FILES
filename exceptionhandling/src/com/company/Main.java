package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("enter a number to divide : ");
            int x = scanner.nextInt();
            System.out.println("enter a number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("the result is : " + z);
        }
        catch(Exception anything ){
            System.out.println("enter only a interger except zero*");
        }
        finally {
            System.out.println("process finished !!sheeshh!!");
        }


    }
}
