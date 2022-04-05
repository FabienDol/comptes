import com.cgi.model.Compte;
import com.cgi.model.CompteEpargne;
import com.cgi.model.ComptePayant;
import com.cgi.model.CompteSimple;
import com.cgi.videogame.Berserker;
import com.cgi.videogame.Warrior;
import com.cgi.videogame.Wizard;

public class Main {
    public static void main(String[] args) {

        comptes();
        videoGame();

    }

    public static void comptes() {

        CompteSimple compteS1 = new CompteSimple(2000, 200);
        CompteSimple compteS2 = new CompteSimple(1000,3000);
        CompteSimple compteS3 = new CompteSimple(500,0);

        compteS1.verser(50);
        compteS1.retirer(20);
        System.out.println(compteS1);

        compteS2.verser(1000);
        compteS2.retirer(2000);
        System.out.println(compteS2);

        compteS3.verser(100);
        compteS3.retirer(200);
        System.out.println(compteS3);


        ComptePayant compteP1 = new ComptePayant(3000);
        compteP1.verser(50);
        compteP1.retirer(20);
        System.out.println(compteP1);

        CompteEpargne compteE1 = new CompteEpargne(1000, 0.75f);
        compteE1.verser(50);
        compteE1.calculInterets();
        System.out.println(compteE1);

    }

    public static void videoGame() {
        System.out.println("*******************************************\n\n\n\n*******************************************");

        Berserker b1 = new Berserker("b1", 50, 10, 5);
        System.out.println(b1);
        Berserker b2 = new Berserker("b2", 30, 8, 2);
        System.out.println(b2);

        Warrior war1 = new Warrior("w1", 100, 30);
        System.out.println(war1);
        Warrior war2 = new Warrior("w2", 200, 80);
        System.out.println(war2);

        b1.attack(b2);
        war2.attack(b1);
        war1.doubleAttack(war2);
        war1.doubleAttack(war2);
        war1.attack(b2);
        war1.doubleAttack(war2);

        Wizard wiz1 = new Wizard("wiz1", 50, 10, 80, 30);
        System.out.println(wiz1);
        Wizard wiz2 = new Wizard("wiz2", 100, 5, 3, 5);
        System.out.println(wiz2);

        wiz1.attack(b1);
        wiz1.activateShield();
        b2.attack(wiz1);
        wiz2.spellCast(wiz1);

    }

}
