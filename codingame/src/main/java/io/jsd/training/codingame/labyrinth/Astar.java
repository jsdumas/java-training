package io.jsd.training.codingame.labyrinth;

import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Astar {

	private final Cell originCell;
	private final Cell destinationCell;
	private final Set<CellType> cellsToAvoid;

	public Astar(Cell currentCell, Cell destination, Set<CellType> cellsToAvoid) {
		this.originCell = currentCell;
		this.destinationCell = destination;
		this.cellsToAvoid = cellsToAvoid;
		setShortestPath();
	}

	private void setShortestPath() {
		Set<Cell> exploredCells = new HashSet<Cell>();
		PriorityQueue<Cell> unexploredCellsQueue = new PriorityQueue<Cell>();
		originCell.setgScore(0);
		unexploredCellsQueue.add(originCell);
		boolean found = false;
		while (!unexploredCellsQueue.isEmpty() && !found) {
			Cell currentCell = unexploredCellsQueue.poll();
			exploredCells.add(currentCell);
			if (currentCell.equals(destinationCell)) {
				found = true;
			}
			Map<Direction, Cell> neighboursMap = currentCell.getNeighboursMap();
			for (Map.Entry<Direction, Cell> entry : neighboursMap.entrySet()) {
				Direction directionTo = entry.getKey();
				Cell neighbourCell = entry.getValue();
				if (neighbourCell == null
						|| (cellsToAvoid.contains(neighbourCell.getCellType()) && neighbourCell != destinationCell)) {
					continue;
				}
				double cost = 10;
				double tempGScore = currentCell.getgScore() + cost;
				double tempFScore = tempGScore + heuristic(neighbourCell, destinationCell);
				if (exploredCells.contains(neighbourCell) && (tempFScore >= neighbourCell.getfScore())) {
					continue;
				} else if (!unexploredCellsQueue.contains(neighbourCell) || (tempFScore < neighbourCell.getfScore())) {
					Parent shortestPath = new Parent(directionTo, currentCell);
					neighbourCell.setParent(shortestPath);
					neighbourCell.setgScore(tempGScore);
					neighbourCell.setfScore(tempFScore);
					if (unexploredCellsQueue.contains(neighbourCell)) {
						unexploredCellsQueue.remove(neighbourCell);
					}
					unexploredCellsQueue.add(neighbourCell);
				}
			}
		}
	}

	public ShortestPath getShortestPath(boolean isPathToUnknownCell) {
		ShortestPath shortestPath = new ShortestPath();
		if (destinationCell.getParent() == null) {
			return shortestPath;
		}
		for (Cell currentCell = destinationCell; currentCell != originCell; currentCell = currentCell.getCellParent()) {
			if (currentCell == destinationCell && isPathToUnknownCell)
				continue;
			shortestPath.add(currentCell.getFromParent());
		}
		return shortestPath;
	}

	// Manhattan heuristic/distance !!!
	public double heuristic(Cell neighbourCell, Cell destination) {
		return Math.abs(neighbourCell.getX() - destination.getX()) + Math.abs(destination.getY() - destination.getY());
	}

}
