package com.sparta.cars;

public class TruckCar extends BaseCar {

    private int weight;

    public TruckCar(int litres, int weight) {
        super(litres);
        this.weight=weight;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void printDrivingMessage(String city) {
        System.out.println("Truck is driving in " + city + ". Truck weight is " + weight);
    }
}
