package com.cgi.model;

public class CompteEpargne extends Compte{

    private float taux;

    public CompteEpargne(float solde, float taux) {
        super(solde);
        this.setTaux(taux);
    }

    public void calculInterets() {
        solde += (solde * this.taux) / 100;
        System.out.println("solde après intérets : " + solde);
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "solde=" + solde +
                ", taux=" + taux +
                '}';
    }
}
