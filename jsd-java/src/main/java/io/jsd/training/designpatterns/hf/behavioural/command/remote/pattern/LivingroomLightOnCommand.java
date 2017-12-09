package io.jsd.training.designpatterns.hf.behavioural.command.remote.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.remote.homeappliance.Light;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
