﻿package io.jsd.training.java.designpatterns.chapitres.chap7.chainofresponsibility;

public class Comptable extends Employe {

    public Comptable(Employe employeSuivant) {
        super(employeSuivant);
    }

    @Override
    protected boolean accepteCourrier(Courrier courrier) {
        return (courrier.getCategorie() == Courrier.Categorie.COMPTABLE);
    }

}
