package com.company;
import java.io.File;
public class Main{

    public static void main(String [] args){

        File file = new File("C:\\Users\\DELL\\Desktop\\testdoc.txt");

        if (file.exists()){

            System.out.println("the file exists :-)");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.exists());
            System.out.println(file.getTotalSpace());
            //System.out.println(file.delete());


        }
        else {
            System.out.println("the file doesn't exists :(");
        }
    }
}
