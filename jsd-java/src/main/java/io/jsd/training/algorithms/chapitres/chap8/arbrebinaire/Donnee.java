package io.jsd.training.algorithms.chapitres.chap8.arbrebinaire;

public class Donnee {
	public int clef;
	public String valeur;

	public Donnee(int clef, String valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return clef + " " + valeur;
	}
}
