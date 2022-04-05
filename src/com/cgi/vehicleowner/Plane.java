package com.cgi.vehicleowner;

public class Plane extends Vehicle {

    public Plane(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public String start() {
        return "L'avion " + this.brand + " décolle";
    }

    @Override
    public String stop() {
        return "L'avion " + this.brand + " attérit";
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
