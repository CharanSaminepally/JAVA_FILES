package com.company;

public class Main {

    public static void main(String[] args) {

        car car1 = new car("a4", 2020, "audi");
        car car2 = new car("i8",2015,"bmw");

        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getcompany());
        System.out.println(car1.getmodel());
        System.out.println(car1.getyear());
        System.out.println();
        System.out.println(car2.getcompany());
        System.out.println(car2.getmodel());
        System.out.println(car2.getyear());




    }

}
class car {


    private String model;
    private int year;
    private String company;

    car(String model, int year, String company) {

        this.setyear(year);
        this.setcompany(company);
        this.setmodel(model);
    }
    //getter model code
    public String getmodel() {
        return model;
    }

    public  String getcompany() {
        return company;
    }
    public int getyear() {
        return year;
    }
    //setter model code
    public void setmodel(String model){
        this.model = model;
    }
    public void setcompany(String company) {
        this.company = company;
    }
    public void setyear(int year){
        this.year = year;
    }

    public void copy(car x){

        this.setmodel(x.getmodel());
        this.setyear(x.getyear());
        this.setcompany(x.getcompany());
    }
}
