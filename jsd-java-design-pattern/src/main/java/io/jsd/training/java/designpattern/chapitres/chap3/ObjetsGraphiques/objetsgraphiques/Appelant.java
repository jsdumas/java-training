﻿package io.jsd.training.java.designpattern.chapitres.chap3.ObjetsGraphiques.objetsgraphiques;public class Appelant {    protected Commande commandes[] = new Commande[10];    protected int position = -1;    public Appelant() {    }    public void setCommande(Commande c) {        if (position < commandes.length - 1) {            position++;            commandes[position] = c;        } else {            for (int i = 0; i < commandes.length - 2; i++)                commandes[i] = commandes[i + 1];            commandes[position] = c;        }    }    public void execute() {        if (position >= 0)            commandes[position].lance();    }}