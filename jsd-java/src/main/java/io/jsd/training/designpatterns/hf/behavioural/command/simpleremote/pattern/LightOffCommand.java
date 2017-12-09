package io.jsd.training.designpatterns.hf.behavioural.command.simpleremote.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.simpleremote.homeappliance.Light;

public class LightOffCommand implements Command {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}
