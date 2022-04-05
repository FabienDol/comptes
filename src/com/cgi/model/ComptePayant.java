package com.cgi.model;

public class ComptePayant extends Compte{

    public ComptePayant() {
        super();
        System.out.println("id : " + this.getId());
    }

    @Override
    public void verser(float montant) {
        solde += montant -1;
        System.out.println("verser : " + montant + "; nouveau solde : " + solde);
    }

    @Override
    public void retirer(float montant) {
        solde -= montant +1;
        if (solde < 0) {
            solde = 0;
        }
        System.out.println("retirer : " + montant + "; nouveau solde : " + solde);
    }

    @Override
    public String toString() {
        return "ComptePayant{" +
                "solde=" + solde +
                '}';
    }
}
