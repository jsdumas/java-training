﻿package io.jsd.training.designpattern.book.chap1.interfacesgraphiques;
public class FabriqueComposantWindows implements
        FabriqueComposant {
    public Bouton creeBouton(String couleur, int largeur,
            int hauteur) {
        return new BoutonWindows(couleur, largeur,
                hauteur);
    }

    public Menu creeMenu(String couleur, int largeur) {
        return new MenuWindows(couleur, largeur);
    }

    public BarreDefilement creeBarreDefilement(
            String couleur, int hauteur) {
        return new BarreDefilementWindows(couleur,
                hauteur);
    }
}
