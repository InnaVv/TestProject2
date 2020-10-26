package com.sparta.cars;

public abstract class BaseCar {

    protected int doors = 4;
    protected int currentSpeed;
    protected int litres;//0

    public BaseCar(int litres) {
        this.litres = litres;
    }

    public void goToCity(String city) {
        printDrivingMessage(city);
        litres -= city.length();
        System.out.println("Total litres left " + litres);
    }

    public abstract void printDrivingMessage(String city);

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }
}
