package io.jsd.training.designpattern.combining.adapter.pattern;

import io.jsd.training.designpattern.combining.adapter.bird.Goose;
import io.jsd.training.designpattern.combining.adapter.bird.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

	@Override
	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
