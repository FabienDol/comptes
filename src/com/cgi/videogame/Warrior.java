package com.cgi.videogame;

public class Warrior extends Humanoid{

    private boolean doubleAttackReady = true;

    public Warrior(String name, double health, double force) {
        super(name, health, force);
    }

    public void doubleAttack(Humanoid h) {

        if (this.doubleAttackReady == true) {
            System.out.println("Double attaque déclenchée par " + this.name);
            for (int i = 0; i < 2; i++) {
                h.receiveDamage(this.force *= 0.7);
            }
            setDoubleAttackReady(false);
        } else {
            System.out.println("Impossible d'utiliser doubleAttack 2 fois de suite");
        }

    }

    @Override
    public void attack(Humanoid h) {
        h.receiveDamage(this.force);
        if (h.getHealth() <= 0) {
            h.setHealth(0);
            System.out.println("Attack de " + this.name + " (force : " + this.force + ") : health de " + h.name + " mise à jour : " + h.health);
            System.out.println(h.name + " est mort au champs d'honneur");
        } else {
            System.out.println("Attack de " + this.name + " (force : " + this.force + ") : health de " + h.name + " mise à jour : " + h.health);
        }
        setDoubleAttackReady(true);
    }

    public boolean isDoubleAttackReady() {
        return doubleAttackReady;
    }

    public void setDoubleAttackReady(boolean doubleAttackReady) {
        this.doubleAttackReady = doubleAttackReady;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", doubleAttackReady=" + doubleAttackReady +
                '}';
    }
}
