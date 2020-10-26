package com.sparta.cars;

public class MainClassCar {
    public static void main(String[] args) {

//        BaseCar baseCar1 = new BaseCar(50);
//        System.out.println(baseCar1.litres);

//        baseCar1.goToCity("Polotsk");
//        baseCar1.goToCity("Vitebsk");

        System.out.println();
        RacingCar racingCar1 = new RacingCar(100, 80);
        racingCar1.goToCity("Leningrad");
//        racingCar1.setLitres(99);
//        System.out.println("Racing car speed is " + racingCar1.getSpeed());
        System.out.println();
        TruckCar truckCar1 = new TruckCar(650, 4500);
        truckCar1.goToCity("Brest");
    }
}
