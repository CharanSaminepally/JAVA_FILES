package com.company;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String [] args)  {


        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("hello this is charan saminepally \ni am from sathyabama university  ");
            writer.write("i am studying btech , cse");
            writer.append("\na note by Charan");
            writer.close();
        }
        catch(IOException e ){
            e.printStackTrace();

        }

    }
}
