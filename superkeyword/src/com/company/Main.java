package com.company;

public class Main{
    public static void main(String [] args){

        hero hero1 = new hero("thor",1000,"god of thunder");
        hero hero2 = new hero("winter soldier",100,"super serum with vibranium arm");

        System.out.println(hero1.name);
        System.out.println(hero1.power);
        System.out.println(hero1.age);

        System.out.println(hero2.name);
        System.out.println(hero2.power);
        System.out.println(hero2.age);


    }
    public static class person{
        String name;
        int age;

        person(String name,int age){
            this.name= name;
            this.age = age;
        }
        public String toString(){
            return name+"\n"+age;

        }
    }
    public static class hero extends person{

        String power;

        hero(String name, int age, String power){
            super(name, age);
            this.power = power;

        }
        public String toString(){
            return super.toString()+this.power;
        }
    }
}
