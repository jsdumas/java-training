package io.jsd.training.designpattern.combined.djview.app;

import io.jsd.training.designpattern.combined.djview.pattern.controller.BeatController;
import io.jsd.training.designpattern.combined.djview.pattern.controller.ControllerInterface;
import io.jsd.training.designpattern.combined.djview.pattern.model.BeatModel;
import io.jsd.training.designpattern.combined.djview.pattern.model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
