package io.jsd.training.java.designpattern.creational.builder.meal;


public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}

}
