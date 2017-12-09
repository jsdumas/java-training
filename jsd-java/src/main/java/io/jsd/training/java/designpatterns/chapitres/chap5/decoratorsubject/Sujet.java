﻿package io.jsd.training.java.designpatterns.chapitres.chap5.decoratorsubject;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujet {
    protected List<Observateur> observateurs;

    public Sujet() {
        observateurs = new ArrayList<Observateur>();
    }

    public void ajouteObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    protected void notifie(String attributModifie,
            Object nouvelleValeur) {
        for (Observateur observateur : observateurs) {
            observateur.metsAJour(attributModifie,
                    nouvelleValeur);
        }
    }
}
