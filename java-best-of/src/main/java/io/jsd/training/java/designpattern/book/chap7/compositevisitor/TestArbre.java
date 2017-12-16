﻿package io.jsd.training.java.designpattern.book.chap7.compositevisitor;

import org.junit.Test;

public class TestArbre {

    @Test
    public void testArbre() {
        Noeud racine = new GenerateurArbre()
                .genereArbre();
        racine.accepteVisiteurTest(new VisiteurTest());
    }

}
