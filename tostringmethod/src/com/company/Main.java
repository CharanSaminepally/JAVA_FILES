package com.company;

public class Main{

    public static void main(String[] args){

        car mycar = new car();

        System.out.println(mycar);

    }

    public static class car {

        String company = "audi";
        String model = "r8";
        int year = 2020;
        double price = 2000000;

        public String toString(){

            return company+"\n"+model+"\n"+year+"\n"+price;
        }


    }

}
