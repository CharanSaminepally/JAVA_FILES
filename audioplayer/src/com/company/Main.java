package com.company;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Main{

    public static void main (String [] args) throws UnsupportedAudioFileException, IOException , LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\DELL\\IdeaProjects\\filecharan\\src\\com\\company\\URL Melt - Unicorn Heads.wav");
        AudioInputStream audiofile = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiofile);


        String response = "";

        while (response != "q") {
            System.out.println(" char p to play , s to stop , r to reset , q to quit");
            System.out.println("Enter a character : ");

            response = scanner.next();

            switch (response) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("q"):
                    clip.close();
                    break;
                default:
                    System.out.println("not a valid response");
                    System.out.println("byeee!!!");

            }

        }
    }}