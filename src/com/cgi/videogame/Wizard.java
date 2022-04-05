package com.cgi.videogame;

public class Wizard extends Humanoid{

    private int mana;
    private int intelligence;
    private boolean shield = false;
    private int hitsOnShield;

    public Wizard(String name, double health, double force, int mana, int intelligence) {
        super(name, health, force);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void spellCast(Humanoid h) {
        h.receiveDamage(this.force + this.intelligence);
        if (h.getHealth() <= 0) {
            h.setHealth(0);
            System.out.println("Attack de " + this.name + " (force : " + this.force + ")");
            System.out.println(h.name + " est mort au champs d'honneur");
        } else {
            System.out.println("Attack de " + this.name + " (force : " + this.force + ")");
        }
    }

    public void activateShield() {
        this.mana -= 3;
        this.hitsOnShield = 0;
        shield = true;
        System.out.println("Bouclier activé par " + this.name + " ; reste " + this.mana + " points de mana");
    }

    @Override
    public void attack(Humanoid h) {
        super.attack(h);
        this.addMana(1);
        if (shield) {
            this.hitsOnShield++;
            if (hitsOnShield >= 4) {
                shield = false;
            }
        }
    }

    @Override
    public void receiveDamage(double damage) {
        if (this.shield) {
            this.health -= damage - ( damage * 20 / 100);
            System.out.println("Bouclier de " + this.name + " réduit les dommages");
            System.out.println("receiveDamage de " + (damage - ( damage * 20 / 100)) + " sur " + this.name + " ; health de " + this.name + " mise à jour : " + this.health);
        } else {
            super.receiveDamage(damage);
        }
    }

    public void addMana(int mana) {
        this.mana += mana;
    }

    public int getMana() {
        return mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int getHitsOnShield() {
        return hitsOnShield;
    }

    public void setHitsOnShield(int hitsOnShield) {
        this.hitsOnShield = hitsOnShield;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                ", shield=" + shield +
                ", hitsOnShield=" + hitsOnShield +
                '}';
    }
}
