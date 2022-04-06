package com.cgi.vehicleowner;

public class Amphibious extends Vehicle implements Roulant, Flottant {

    public Amphibious(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public String start() {
        return null;
    }

    @Override
    public String stop() {
        return null;
    }

    @Override
    public void rouler() {
        System.out.println("L'amphibie roule");
    }

    @Override
    public void naviguer() {
        System.out.println("L'amphibie navigue");
    }

    @Override
    public void jeterAncre() {
        System.out.println("L'amphibie jète l'ancre");
    }

    @Override
    public void leverAncre() {
        System.out.println("L'amphibie lève l'ancre");
    }
}
