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
        super.attack(h);
        setDoubleAttackReady(true);
    }

    @Override
    public int compareTo(Humanoid o) {
        if (this.force < o.force) {
            return -1;
        } else if (this.force > o.force) {
            return 1;
        } else {
            return 0;
        }
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
