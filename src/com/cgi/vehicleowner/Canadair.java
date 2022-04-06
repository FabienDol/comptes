package com.cgi.vehicleowner;

public class Canadair extends Vehicle implements Flottant, Volant {

    public Canadair(int engine, String brand) {
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
    public void naviguer() {
        System.out.println("Le canadair navigue");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le canadair jète l'ancre");

    }

    @Override
    public void leverAncre() {
        System.out.println("Le canadair lève l'ancre");

    }

    @Override
    public void decoller() {
        System.out.println("Le canadair décolle");

    }

    @Override
    public void atterir() {
        System.out.println("Le canadair attérit");

    }

    @Override
    public void barrelRoll() {
        System.out.println("Le canadair do a barrel roll");

    }

    @Override
    public void crash() {

        System.out.println("Le canadair se crashe");
    }
}
