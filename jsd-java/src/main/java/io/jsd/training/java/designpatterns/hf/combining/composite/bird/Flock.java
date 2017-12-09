package io.jsd.training.java.designpatterns.hf.combining.composite.bird;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList quackers = new ArrayList();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

	@Override
	public String toString() {
		return "Flock of Quackers";
	}
}