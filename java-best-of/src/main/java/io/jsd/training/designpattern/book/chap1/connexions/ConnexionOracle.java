﻿package io.jsd.training.designpattern.book.chap1.connexions;
public class ConnexionOracle extends Connexion {
    public ConnexionOracle(String utilisateur,
            String motdepasse) {
        super(utilisateur, motdepasse);
    }

    @Override
    public void getDescription() {
        System.out
                .println("Connecté à Oracle avec le nom d'utilisateur : "
                        + utilisateur);
    }
}
