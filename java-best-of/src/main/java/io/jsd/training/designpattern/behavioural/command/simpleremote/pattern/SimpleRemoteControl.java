package io.jsd.training.designpattern.behavioural.command.simpleremote.pattern;

//
// This is the invoker
// 
public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
