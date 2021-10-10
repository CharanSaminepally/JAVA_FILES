package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        animal animal;

        System.out.println("type 1 for dog // 2 for a cat");
        System.out.println("what animal do you want : ");
        int  choice = scanner.nextInt();

        if (choice == 1) {
            animal = new dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new cat();
            animal.speak();
        }
        else {
            animal = new animal();
            System.out.println("the number you entered was invalid");
            animal.speak();
        }

    }
    public static class animal{

        public void speak(){

            System.out.println("the animal says *blahhhh blahhhh*");
        }


    }
    public static class dog extends animal{
        public  void speak(){

            System.out.println("the dog is barking---*bark*---");
        }


    }
    public static class cat extends animal{
        public void speak(){

            System.out.println("the cat says ****meow*******");

        }

    }
}
