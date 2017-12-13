﻿package io.jsd.training.java.designpattern.chapitres.chap5.compositevisitorstrategy;

public class Strategie1 implements
        StrategieVisiteur<Integer> {

    protected int compte = 0;

    @Override
    public void gere(Fichier fichier) {
        compte++;
    }

    @Override
    public void gere(Repertoire repertoire) {
        compte++;
    }

    @Override
    public Integer getResultat() {
        return compte;
    }

}
