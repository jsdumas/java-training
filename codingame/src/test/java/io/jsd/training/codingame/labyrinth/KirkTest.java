package io.jsd.training.codingame.labyrinth;

import static io.jsd.training.codingame.labyrinth.CellType.START_CELL;
import static io.jsd.training.codingame.labyrinth.Direction.DOWN;
import static io.jsd.training.codingame.labyrinth.Direction.LEFT;
import static io.jsd.training.codingame.labyrinth.Direction.RIGHT;
import static io.jsd.training.codingame.labyrinth.Direction.UP;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class KirkTest extends GameSetUp{
	
	@Before
	public void setUp() {
		kirkSituation.newPosition(new Cell(0,0, START_CELL));
	}

	@Test
	public void whenKirkMoveLeftThenitShouldPrintLeft() {
		MatcherAssert.assertThat(kirk.mouve(LEFT), equalTo(LEFT));
	}
	
	@Test
	public void whenKirkMoveUpThenitShouldPrintUp() {
		MatcherAssert.assertThat(kirk.mouve(UP), equalTo(UP));
	}
	
	@Test
	public void whenKirkMoveRightThenitShouldPrintRight() {
		MatcherAssert.assertThat(kirk.mouve(RIGHT), equalTo(RIGHT));
	}
	
	@Test
	public void whenKirkMoveDownThenitShouldPrintDown() {
		assertThat(kirk.mouve(DOWN), equalTo(DOWN));
	}
	
	@Test
	public void whenKirkIsOnXEqual0ThenHisXPositionIs0() {
		assertThat(kirk.getX(), equalTo(0));
	}
	
	@Test
	public void whenKirkIsOnYEqual0ThenHisYPositionIs0() {
		assertThat(kirk.getY(), equalTo(0));
	}
	
	@Test
	public void whenKirkStartThenHisJetPackEnergyIs1200() {
		assertThat(kirk.getJetPackEnergy(), equalTo(1200));
	}
	
	@Test
	public void whenKirkMouve1200TimesThenHisJetPackHasNoMoreEnergy() {
		assertThat(kirk.getJetPackEnergy(), equalTo(1200));
		for(int i=0; i<1200; i++) {
			kirk.mouve(UP);
		}
		assertThat(kirk.getJetPackEnergy(), equalTo(0));
	}
	
	@Test
	public void WhenKirkStartToPlayThenHisFirstMissionIsToGetToCommandRoom() {
		assertThat(kirk.getMission() instanceof SearchAndGetCommandRoom, is(true));
	}
	
	@Test
	public void WhenKirkFinishFirstMissionThenHisSecondMissionIsToGetBackToStartCell() {
		kirk.firstMissionFinished();
		assertThat(kirk.getMission() instanceof GoBackToStartCell, is(true));
	}
	
}
