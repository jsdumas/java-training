package io.jsd.training.springframework.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	public String getFortune() {
		return "rest";
	}

}
