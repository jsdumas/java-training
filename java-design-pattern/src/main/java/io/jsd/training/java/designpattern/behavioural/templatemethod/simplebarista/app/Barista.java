package io.jsd.training.java.designpattern.behavioural.templatemethod.simplebarista.app;

import io.jsd.training.java.designpattern.behavioural.templatemethod.simplebarista.drink.Coffee;
import io.jsd.training.java.designpattern.behavioural.templatemethod.simplebarista.drink.Tea;

public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}
