package org.example.task2;

public class Car implements Drivable {
    private String brand;
    private String model;

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String yearOfProduction;

    @Override
    public void start() {
        System.out.println("The car is moving");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("The car drove " + distance + " kilometres");
    }
}
