package com.cgi.model;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple(float solde, float decouvert) {
        super(solde);
        System.out.println("id : " + this.getId());
        this.setDecouvert(decouvert);
    }

    @Override
    public void retirer(float montant) throws DecouvertException {
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
            throw new DecouvertException("Le découvert autorisé est dépassé");
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

    @Override
    public String toString() {
        return "CompteSimple{" +
                "solde=" + solde +
                ", decouvert=" + decouvert +
                '}';
    }
}
