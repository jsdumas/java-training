﻿package io.jsd.training.java.designpattern.book.chap2.pizzas;
public class PizzaFourreeFromage extends Pizza {
    public PizzaFourreeFromage() {
        description = "Pizza à pâte fourrée au fromage";
    }

    @Override
    public double calculePrix() {
        return 5.99;
    }
}
