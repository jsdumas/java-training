﻿package io.jsd.training.designpatterns.chapitres.chap3.venteenligne;
public class Utilisateur {

    public static void main(String[] args) {
        Mediateur mediateur = new Mediateur();
        mediateur.getAccueil().lance();
    }
}
