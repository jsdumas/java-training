﻿package io.jsd.training.designpattern.book.chap1.interfacesgraphiques;
public class MenuWindows extends Menu {
    public MenuWindows(String couleur, int largeur) {
        super(couleur, largeur);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Menu Windows de couleur : "
                + couleur + " de largeur : " + largeur);
    }

}
