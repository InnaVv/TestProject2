package com.sparta.cars;

public class RacingCar extends BaseCar implements Icar{

    private int speed;

    public RacingCar(int litres, int speed) {
        super(litres);
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void printDrivingMessage(String city) {
        System.out.println("Racing car is driving in " + city + " and speed is " + speed);
    }

    @Override
    public void doSomeJob() {

    }

    @Override
    public void doPrint(String text) {

    }
}
