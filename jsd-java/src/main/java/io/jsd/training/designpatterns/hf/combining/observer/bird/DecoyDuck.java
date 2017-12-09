package io.jsd.training.designpatterns.hf.combining.observer.bird;

import io.jsd.training.designpatterns.hf.combining.observer.pattern.Observable;
import io.jsd.training.designpatterns.hf.combining.observer.pattern.Observer;

public class DecoyDuck implements Quackable {
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Decoy Duck";
	}
}
