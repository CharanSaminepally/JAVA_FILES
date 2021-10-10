package com.company;
import java.util.Random;

public class dice {
    Random random;
    int number;

    dice(){
        random = new Random();
        roll(random,number);

    }
    void roll(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
