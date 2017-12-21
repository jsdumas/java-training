﻿package io.jsd.training.designpattern.book.chap3.SystemeFichiers.systemefichierscompositejavaiterator;
public abstract class Element implements
        Iterable<Element> {

    protected String nom;

    public String getNom() {
        return nom;
    }

    public abstract void ajouteElement(Element element);

    public abstract void afficheInformations();

}