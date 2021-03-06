package io.jsd.training.udemy.balazs.problems.recursiveproblems.housebuilding;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import io.jsd.training.udemy.balazs.problems.recursiveproblems.Algorithm;
import io.jsd.training.udemy.balazs.problems.recursiveproblems.CalculTime;
import io.jsd.training.udemy.balazs.problems.recursiveproblems.housebuilding.HouseBuilding;

public class HouseBuildingTest {
	
	private final static Algorithm ALGO = new HouseBuilding();
	private static final CalculTime CALCUL_TIME = new CalculTime(ALGO);
	private static final int NUMBER_STAGE_TO_BUILD = 1000 ;
	
	@Test
	public void headRecursionShouldBeSlowerThanTailRecursion(){
		Long headRecursionTime = CALCUL_TIME.calculSlowTime(NUMBER_STAGE_TO_BUILD);
		Long tailRecursionTime = CALCUL_TIME.calculFastTime(NUMBER_STAGE_TO_BUILD);
		assertThat(headRecursionTime , greaterThan(tailRecursionTime));
	}

}
