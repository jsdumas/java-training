﻿package io.jsd.training.java.designpatterns.chapitres.chap1.voyages;
import java.util.*;

public abstract class Voyage<T extends PartieVoyage> {
    protected List<T> composition;

    public void setComposition(List<T> c) {
        composition = c;
    }

    public abstract void affiche();
}
