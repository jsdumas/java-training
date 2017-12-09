package io.jsd.training.designpatterns.hf.behavioural.command.undo.pattern;

import io.jsd.training.designpatterns.hf.behavioural.command.undo.homeappliance.Light;

public class DimmerLightOffCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOffCommand(Light light) {
		this.light = light;
		prevLevel = 100;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.off();
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
