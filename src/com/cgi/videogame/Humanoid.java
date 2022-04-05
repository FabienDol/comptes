package com.cgi.videogame;

public abstract class Humanoid {

    protected String name;
    protected double health;
    protected double force;

    public Humanoid(String name, double health, double force) {
        this.name = name;
        this.health = health;
        this.force = force;
    }

    public void attack(Humanoid h) {
        h.receiveDamage(this.force);
        if (h.getHealth() <= 0) {
            h.setHealth(0);
            System.out.println("Attack de " + this.name + " (force : " + this.force + ")");
            System.out.println(h.name + " est mort au champs d'honneur");
        } else {
            System.out.println("Attack de " + this.name + " (force : " + this.force + ")");
        }
    }

    public void receiveDamage(double damage) {
        this.health -= damage;
        System.out.println("receiveDamage de " + damage + " sur " + this.name + " ; health de " + this.name + " mise à jour : " + this.health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                '}';
    }
}
