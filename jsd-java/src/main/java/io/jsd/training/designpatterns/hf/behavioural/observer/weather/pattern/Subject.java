package io.jsd.training.designpatterns.hf.behavioural.observer.weather.pattern;


public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
