package com.company;

public class Main {

    public static void main(String[] args) {

        car car = new car("r8", 2020, "audi");

        car.setyear(2022);

        System.out.println(car.getyear());


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
    public String getModel() {
        return model;
    }

    public String getcompany() {
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
        this.year = year; }
}
