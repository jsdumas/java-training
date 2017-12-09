package io.jsd.training.java.designpatterns.hf.behavioural.command.party.pattern;

import io.jsd.training.java.designpatterns.hf.behavioural.command.party.homeappliance.Hottub;

public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
	}
	public void undo() {
		hottub.off();
	}
}
