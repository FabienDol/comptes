package com.cgi.model;

public abstract class Compte {

    private int id;
    protected float solde;
    private static int countComptes;

    public Compte() {
        this.setId(++countComptes);
    }

    public void verser(float montant) {
        solde += montant;
        System.out.println("verser : " + montant + "; nouveau solde : " + solde);
    }

    public void retirer(float montant) {
        solde -= montant;
        if (solde < 0) {
            solde = 0;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }
}
