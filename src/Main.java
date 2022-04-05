import com.cgi.model.Compte;
import com.cgi.model.CompteEpargne;
import com.cgi.model.ComptePayant;
import com.cgi.model.CompteSimple;

public class Main {
    public static void main(String[] args) {

        CompteSimple compteS1 = new CompteSimple(200);
        CompteSimple compteS2 = new CompteSimple(3000);
        CompteSimple compteS3 = new CompteSimple(0);

        compteS1.verser(50);
        compteS1.retirer(20);
        System.out.println(compteS1);

        compteS2.verser(1000);
        compteS2.retirer(2000);
        System.out.println(compteS2);

        compteS3.verser(100);
        compteS3.retirer(200);
        System.out.println(compteS3);


        ComptePayant compteP1 = new ComptePayant();
        compteP1.verser(50);
        compteP1.retirer(20);
        System.out.println(compteP1);

        CompteEpargne compteE1 = new CompteEpargne(0.75f);
        compteE1.verser(50);
        compteE1.calculInterets();
        System.out.println(compteE1);

    }
}
