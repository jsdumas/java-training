﻿package io.jsd.training.java.designpatterns.chapitres.chap4.factoryMethodClasseGenerique.factorymethodclassegenerique;

public class ContenuTexte implements Contenu {

	protected String texte;
	
	@Override
	public void encode(String texte) {
		this.texte = texte;
	}

	@Override
	public void affiche() {
		System.out.println(texte);
	}

}
