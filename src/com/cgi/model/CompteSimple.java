package com.cgi.model;

public class CompteSimple extends Compte{

    private float decouvert;


    public CompteSimple(float decouvert) {
        super();
        System.out.println("id : " + this.getId());
        this.setDecouvert(decouvert);
    }

    @Override
    public void retirer(float montant){
        float ancienSolde = solde;
        solde -= montant;

        if (solde < 0 && (solde >= 0 - this.decouvert)) {
            System.out.println("Vous utilisez votre découvert autorisé qui est de " + this.decouvert);
            System.out.println("retirer " + montant + "; solde : " + solde);
        } else if (solde < (0 - this.decouvert)) {
            System.out.println("Vous vouliez retirer " + montant);
            System.out.println("Vous avez dépassé votre découvert autorisé qui est de " + this.decouvert);
            solde = ancienSolde;
            System.out.println("solde : " + solde);
        } else {
            System.out.println("retirer " + montant + "; solde : " + solde);
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }
}
