﻿package io.jsd.training.java.designpatterns.chapitres.chap3.ObjetsGraphiques.objetsgraphiques;public class InterfaceGraphique {    public static void main(String[] args) {        FormeGraphique forme = new FormeGraphique(0, 3);        ZoneTexte texte = new ZoneTexte();        Commande formeHaut = new CommandeFlecheHautFG(                forme);        Commande texteBas = new CommandeFlecheBasZT(texte);        Appelant appelant = new Appelant();        appelant.setCommande(formeHaut);        appelant.execute();        appelant.setCommande(texteBas);        appelant.execute();        System.out                .println("la position verticale de la forme graphique est: "                        + forme.getY());        System.out                .println("la taille de la police du texte est: "                        + texte.getTaillePolice());    }}