﻿package io.jsd.training.java.designpatterns.chapitres.chap3.expression;public class NoeudMoins extends NoeudOperateur {    public void accepteVisiteur(VisiteurExpression v) {        v.visite(this);    }}