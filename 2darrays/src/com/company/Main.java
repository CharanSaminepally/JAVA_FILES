package com.company;

public class Main {

    public static void main(String[] args) {


        String[][] cars = new String[3][3];

        cars[0][0] = "bmw";
        cars[0][1] = "benz";
        cars[1][1] = "ford";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars.length; j++) {
                System.out.println(cars[i][j] + "");
            }
        }
    }
}