﻿package io.jsd.training.java.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiquesavecannule;public class CommandeFlecheBasZT implements Commande {    protected ZoneTexte recepteur;    protected int taille;    public CommandeFlecheBasZT(ZoneTexte r) {        this.recepteur = r;    }    public void lance() {        taille = recepteur.getTaillePolice();        if (taille > 0)            recepteur.setTaillePolice(taille - 1);    }    public void annule() {        recepteur.setTaillePolice(taille);    }}