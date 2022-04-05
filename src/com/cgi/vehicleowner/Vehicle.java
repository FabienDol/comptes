package com.cgi.vehicleowner;

public abstract class Vehicle {

    private int engine;
    protected String brand;

    public Vehicle(int engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public final String displayEngine() {
        return "Le véhicule " + this.brand + " a une puissance de " + this.engine;
    }

    public abstract String start();

    public abstract String stop();

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", brand='" + brand + '\'' +
                '}';
    }
}
