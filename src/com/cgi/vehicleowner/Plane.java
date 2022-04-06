package com.cgi.vehicleowner;

public class Plane extends Vehicle implements Volant {

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

    public void fly() {
        System.out.println("L'avion vole dans les airs");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void decoller() {
        System.out.println("L'avion décolle");
    }

    @Override
    public void atterir() {
        System.out.println("L'avion attérit");

    }

    @Override
    public void barrelRoll() {
        System.out.println("L'avion do a barrel roll");

    }

    @Override
    public void crash() {
        System.out.println("L'avion se crashe");
    }
}
