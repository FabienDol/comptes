package com.cgi.videogame;

public class Berserker extends Humanoid {

    private int rage;

    public Berserker(String name, double health, double force, int rage) {
        super(name, health, force);
        this.rage = rage;
    }

    public void useRage(Humanoid h) {
        this.rage -= 8;
        System.out.println("points de rage après useRage() : " + this.getRage());
        this.force *= 1.5;
        System.out.println("points de force après useRage() : " + this.getForce());
    }

    @Override
    public void receiveDamage(double damage) {
        this.health -= damage;
        addRage();
        System.out.println("receiveDamage de " + damage + " sur " + this.name + " ; health : " + this.health + " ; points de rage : " + this.rage);
    }

    public void addRage() {
        this.rage += 3;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        return "Berserker{" +
                "rage=" + rage +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                '}';
    }
}
