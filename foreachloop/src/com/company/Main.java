package com.company;
import java.util.ArrayList;

public class Main{

    public static void main (String[]  args){

        ArrayList<String> animals  = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");

        for (String i : animals ){
            System.out.println(i);
        }
    }
}
