package io.jsd.training.java.algorithms.game.tictactoe.elements;

public class Point {
	final int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}