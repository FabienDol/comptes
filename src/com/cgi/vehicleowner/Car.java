package com.cgi.vehicleowner;

public class Car extends Vehicle implements Roulant {

    public Car(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public String start() {
        return "La voiture " + this.brand + " prend la route";
    }

    @Override
    public String stop() {
        return "La voiture " + this.brand + " se gare sur le bas côté";
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void rouler() {
        System.out.println("La voiture roule");
    }
}
