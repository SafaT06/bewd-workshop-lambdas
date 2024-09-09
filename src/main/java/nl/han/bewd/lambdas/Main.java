package nl.han.bewd.lambdas;

import nl.han.bewd.lambdas.reis.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Buiten spits met fiets");
//        VervoerStrategy vervoer = new FietsVervoerStrategy();
//        mijnReis.simuleerReis(vervoer);
//
//        System.out.println("Tijdens de spits");
//        mijnReis.setSpits(true);
//        mijnReis.simuleerReis(vervoer);                             // Met fiets
//        mijnReis.simuleerReis(new AutoVervoerStrategy());   // Met auto
//        mijnReis.simuleerReis(new OVVervoerStrategy());     // Met OV
//
//        mijnReis.simuleerReis(isReisTijdensSpits -> {
//            System.out.println("LambdaVervoerStrategy");
//            return isReisTijdensSpits ? 15 : 7;
//        });

        Reis mijnReis = new Reis(true);
//        mijnReis.setSpits(false);
        VervoerStrategy JetVervoer = (isSpits) -> {
            return isSpits ? 10 : 5;
        };
        mijnReis.simuleerReis(JetVervoer);



        // een lambda expressie is een zo korte manier om een functionele interface te implementeren.

        // een functionele interface is een interface met slechts 1 abstracte methode.
    }
}