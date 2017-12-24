package io.jsd.training.codingame.labyrinth;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CellTypeTest {
	
	@Test
	public void whenCellTypeKeyIsUnknownThenReturnNull() {
		MatcherAssert.assertThat(CellType.getCellTypeByKey("unknown key"), Matchers.nullValue());
	}

}
