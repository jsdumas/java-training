package io.jsd.training.java.designpattern.behavioural.command.simpleremote.pattern;

import io.jsd.training.java.designpattern.behavioural.command.simpleremote.homeappliance.Light;

public class LightOnCommand implements Command {
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
