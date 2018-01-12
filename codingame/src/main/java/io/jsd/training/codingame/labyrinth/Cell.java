package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Set;

import io.jsd.training.codingame.labyrinth.bean.CellType;
import io.jsd.training.codingame.labyrinth.bean.Direction;
import io.jsd.training.codingame.labyrinth.bean.Parent;

public class Cell implements Comparable<Cell> {

	private final Integer id;
	private final int x;
	private final int y;
	private final Set<Edge> neighbours;
	private CellType cellType;
	private double distanceToDestination;
	private double lowestCostPath;
	private Parent parent;

	public Cell(int x, int y, CellType cellType) {
		this.id = Integer.parseInt(String.valueOf(x) + String.valueOf(y));
		this.x = x;
		this.y = y;
		this.cellType = cellType;
		this.neighbours = new HashSet<Edge>();
		this.distanceToDestination = 0;
		this.lowestCostPath = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public CellType getCellType() {
		return cellType;
	}

	public void scanCell(CellType cellType) {
		this.cellType = cellType;
	}

	public Set<Edge> getNeighbours() {
		return neighbours;
	}

	public void setDistanceToDestination(double cost) {
		this.distanceToDestination = cost;
	}

	public double getDistanceToDestination() {
		return distanceToDestination;
	}

	public double getLowerCostPath() {
		return lowestCostPath;
	}

	public void setLowerCostPath(double lowestCostPath) {
		this.lowestCostPath = lowestCostPath;
	}

	public void addNeighbour(Direction direction, Cell neighbour) {
		if (neighbour != null)
			neighbours.add(new Edge(direction, neighbour));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public int compareTo(Cell otherCell) {
		return Double.compare(this.lowestCostPath, otherCell.getLowerCostPath());
	}

	public Integer getId() {
		return id;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Direction getFromParent() {
		return this.parent.getFrom();
	}

	public Cell getCellParent() {
		return this.parent.getCell();
	}

	public Parent getParent() {
		return this.parent;
	}

}