import com.cgi.model.*;
import com.cgi.vehicleowner.Boat;
import com.cgi.vehicleowner.Car;
import com.cgi.vehicleowner.Owner;
import com.cgi.vehicleowner.Plane;
import com.cgi.videogame.Berserker;
import com.cgi.videogame.Humanoid;
import com.cgi.videogame.Warrior;
import com.cgi.videogame.Wizard;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        comptes();
        videoGame();
        vehicles();

    }

    public static void comptes() {

        CompteSimple compteS1 = new CompteSimple(2000, 200);
        CompteSimple compteS2 = new CompteSimple(1000,3000);
        CompteSimple compteS3 = new CompteSimple(500,0);

        compteS1.verser(50);
        try {
            compteS1.retirer(3000);
        } catch (DecouvertException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(compteS1);

        compteS2.verser(1000);
        try {
            compteS2.retirer(2000);
        } catch (DecouvertException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(compteS2);

        compteS3.verser(100);
        try {
            compteS3.retirer(200);
        } catch (DecouvertException e) {
            System.out.println(e.getMessage());
        }
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
        System.out.println("*******************************************\n\n\n*******************************************");

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

        //comparaison des humanoides par force
        ArrayList<Humanoid> humanoides = new ArrayList<>();
        humanoides.add(wiz1);
        humanoides.add(wiz2);
        humanoides.add(war1);
        humanoides.add(war2);

        System.out.println("avant Collections.sort()");
        System.out.println(humanoides);
        Collections.sort(humanoides);
        System.out.println("apr??s Collections.sort()");
        System.out.println(humanoides);


    }

    public static void vehicles() {

        System.out.println("*******************************************\n\n\n*******************************************");

        Car c1 = new Car(5, "Renault");
        Plane p1 = new Plane(20, "Cessna");
        Plane p2 = new Plane(40, "Cessna");
        Boat b1 = new Boat(30, "Riva");
        Owner o1 = new Owner("o1");
        o1.getVehicleArrayList().add(c1);
        o1.getVehicleArrayList().add(p1);
        o1.getVehicleArrayList().add(b1);
        o1.getVehicleArrayList().add(p2);

        System.out.println(c1.start());
        System.out.println(p1.start());
        System.out.println(b1.start());

        System.out.println(p1.displayEngine());
        System.out.println(b1.stop());

        System.out.println("Nombre de Cessna dans le garage : " + o1.countByBrand("Cessna"));
        System.out.println(o1.getVehicleArrayList());
        Boat b2 = new Boat(50, "HH");
        o1.add(b2);
        System.out.println(o1.getVehicleArrayList());

        o1.startAllVehicles();

        System.out.println("\n*******************************************\n");

        b2.leverAncre();
        b2.naviguer();
        b2.jeterAncre();

        p2.decoller();
        p2.barrelRoll();
        p2.crash();

    }

}
