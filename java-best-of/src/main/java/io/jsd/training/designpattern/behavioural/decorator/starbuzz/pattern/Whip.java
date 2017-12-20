package io.jsd.training.designpattern.behavioural.decorator.starbuzz.pattern;

import io.jsd.training.designpattern.behavioural.decorator.starbuzz.beverage.Beverage;
 
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
