﻿package io.jsd.training.java.designpatterns.chapitres.chap3.expression;import java.util.*;public class NoeudValeur implements Noeud {    protected int valeur;    public int getValeur() {        return valeur;    }    public NoeudValeur(int valeur) {        super();        this.valeur = valeur;    }    public void accepteVisiteur(VisiteurExpression v) {        v.visite(this);    }    public void ajouteNoeud(Noeud noeud) {    }    public List<Noeud> getEnfants() {        return null;    }}