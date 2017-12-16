package io.jsd.training.java.designpattern.combining.composite.pattern;

import io.jsd.training.java.designpattern.combining.composite.bird.DuckCall;
import io.jsd.training.java.designpattern.combining.composite.bird.MallardDuck;
import io.jsd.training.java.designpattern.combining.composite.bird.Quackable;
import io.jsd.training.java.designpattern.combining.composite.bird.RedheadDuck;
import io.jsd.training.java.designpattern.combining.composite.bird.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
