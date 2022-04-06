package com.cgi.vehicleowner;

public class Boat extends Vehicle implements Flottant {

    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public String start() {
        return "Le bateau " + this.brand + " lève l'ancre";
    }

    @Override
    public String stop() {
        return "Le bateau " + this.brand + " jète son ancre";
    }

    public void sail() {
        System.out.println("Le bateau navigue sur les flots");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void naviguer() {
        System.out.println("Le bateau navigue");
    }

    @Override
    public void jeterAncre() {
        System.out.println("Le bateau jète l'ancre");

    }

    @Override
    public void leverAncre() {
        System.out.println("Le bateau lève l'ancre");

    }
}
