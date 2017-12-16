﻿package io.jsd.training.java.designpattern.book.chap3.billetterie;
public class Billet {
    protected EtatBillet etatBillet;

    public Billet() {
        etatBillet = new BilletReserve(this);
    }

    public void annule() {
        etatBillet.annule();
    }

    public void modifie() {
        etatBillet.modifie();
    }

    public void etatSuivant() {
        etatBillet = etatBillet.etatSuivant();
    }
}
