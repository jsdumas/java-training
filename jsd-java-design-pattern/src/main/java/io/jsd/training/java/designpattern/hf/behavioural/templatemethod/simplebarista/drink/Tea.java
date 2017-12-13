package io.jsd.training.java.designpattern.hf.behavioural.templatemethod.simplebarista.drink;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	public void addLemon() {
		System.out.println("Adding Lemon");
	}

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}