package io.jsd.training.java.framework.spring.ioc.annotations;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {

	public String getDailyWorkout() {
		return "No pain no gain";
	}

	public String getDailyFortune() {
		return "";
	}

}
