package io.jsd.training.designpattern.behavioural.command.simpleremote.pattern;

import io.jsd.training.designpattern.behavioural.command.simpleremote.homeappliance.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
