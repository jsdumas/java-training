package io.jsd.training.java.designpatterns.hf.behavioural.decorator.starbuzz.beverage;

public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
