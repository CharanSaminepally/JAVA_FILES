package com.company;
import java.util.Scanner;
public class  Main {

    public static void main (String [] args){

        int rows;
        int columns;
        String symbol = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter #  of rows: ");
        rows = scanner.nextInt();
        System.out.println("enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("enter symbol u would like to use: ");
        symbol = scanner.next();



        for (int i=1; i<=rows; i++ ){
            System.out.println();
            for (int j =1 ; j<=columns ; j++){
                System.out.println(symbol);
            }
        }

    }
}
