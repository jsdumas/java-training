﻿package io.jsd.training.java.designpatterns.chapitres.chap6.ecartTypeSingleton.ecarttype;

public class Demo {

    public static void main(String[] args) {
        Application appli = new Application();
        ApplicationTest appliTest = new ApplicationTest();

        appli.litDonnees();
        appli.calculeStatistiques(new AlgoEcartType1());
        appli.afficheStatistiques();

        appliTest.traiteDonnees();
        // code masqué
        appliTest.traiteDonnees();
    }

}
