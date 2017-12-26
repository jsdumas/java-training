package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.COMMAND_ROOM;
import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class GetCommandRoomTest extends GameSetUp{
	
	
	@Test
	public void whenKirkGetCommandRoomThenHeSuccessFirstPartOfMission() {
		kirkSituation.newPosition(new Cell(99,99, COMMAND_ROOM));
		Mission mission = new GetInCommandRoom(kirk);
		assertThat(mission.isMissionSuccessed(), is(true));
	}
	
	@Test
	public void whenKirkIsNotONCommandRoomCellThenHeDoesNotSuccessSecondPartOfMission() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
		Mission mission = new GetInCommandRoom (kirk);
		assertThat(mission.isMissionSuccessed(), is(false));
	}
	
}
