﻿package io.jsd.training.java.designpatterns.chapitres.chap2.pizzas;
public abstract class Pizza {
    protected String description = "";

    public String afficheDescription() {
        return description;
    }

    public abstract double calculePrix();
}
