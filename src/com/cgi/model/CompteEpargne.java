package com.cgi.model;

public class CompteEpargne extends Compte{

    private float taux;

    public CompteEpargne(float taux) {
        super();
        this.taux = taux;
    }

    public void calculInterets() {
        solde += (solde * this.taux) / 100;
        System.out.println("solde après intérets : " + solde);
    }

}
