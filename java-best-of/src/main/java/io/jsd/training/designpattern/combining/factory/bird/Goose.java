package io.jsd.training.designpattern.combining.factory.bird;

public class Goose {
	public void honk() {
		System.out.println("Honk");
	}

	@Override
	public String toString() {
		return "Goose";
	}
}
