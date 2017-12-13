﻿package io.jsd.training.java.designpattern.chapitres.chap6.systemeFichiersVisitor.systemefichiersvisitor;

public class VisiteurNombreNoeuds implements Visiteur {
    protected long nombreDeNoeuds;

    public long nombreDeNoeuds(Noeud noeud) {
        nombreDeNoeuds = 0;
        noeud.accepte(this);
        return nombreDeNoeuds;
    }

    @Override
    public void visite(Repertoire repertoire) {
        nombreDeNoeuds = nombreDeNoeuds + 1;
    }

    @Override
    public void visite(Fichier fichier) {
        nombreDeNoeuds = nombreDeNoeuds + 1;
    }
}
