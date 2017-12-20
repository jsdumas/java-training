package io.jsd.training.designpattern.combining.ducks.bird;

public class DecoyDuck implements Quackable {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
