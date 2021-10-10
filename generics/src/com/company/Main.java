package com.company;
public class Main {
    public static void main(String[] args) {

        MyGenericClass <Integer> myint = new MyGenericClass<> (4);
        MyGenericClass <Character> mychar = new MyGenericClass<> ('s');
        MyGenericClass <Double> mydouble = new MyGenericClass<> (3.14);
        MyGenericClass <String> mystring = new MyGenericClass<> ("hello");

        System.out.println(myint.getValue());
        System.out.println(mychar.getValue());
        System.out.println(mystring.getValue());
        System.out.println(mydouble.getValue());
    }
}
