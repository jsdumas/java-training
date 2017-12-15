﻿package io.jsd.training.java.designpattern.book.chap1.interfacesgraphiques;
public class BarreDefilementWindows extends
        BarreDefilement {
    public BarreDefilementWindows(String couleur,
            int hauteur) {
        super(couleur, hauteur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out
                .println("Barre de défilement Windows de couleur : "
                        + couleur
                        + " de hauteur : "
                        + hauteur);
    }

}
