﻿package io.jsd.training.designpatterns.chapitres.chap7.compositevisitor;

abstract public class NoeudOperateur implements Noeud {

    protected Noeud sousNoeudGauche = new NoeudEntier(0);
    protected Noeud sousNoeudDroit = new NoeudEntier(0);

    public NoeudOperateur(Noeud sousNoeudGauche,
            Noeud sousNoeudDroit) {
        super();
        if (sousNoeudGauche != null)
            this.sousNoeudGauche = sousNoeudGauche;
        if (sousNoeudDroit != null)
            this.sousNoeudDroit = sousNoeudDroit;
    }

    @Override
    public void ajouteSousNoeudDroit(Noeud sousNoeud) {
        if (sousNoeud != null)
            sousNoeudDroit = sousNoeud;
    }

    @Override
    public void ajouteSousNoeudGauche(Noeud sousNoeud) {
        if (sousNoeud != null)
            sousNoeudGauche = sousNoeud;
    }

    @Override
    public Noeud getSousNoeudDroit() {
        return sousNoeudDroit;
    }

    @Override
    public Noeud getSousNoeudGauche() {
        return sousNoeudGauche;
    }

    @Override
    public void accepteVisiteurTest(
            VisiteurTest visiteurTest) {
        visiteurTest.visite(this);
    }

}
