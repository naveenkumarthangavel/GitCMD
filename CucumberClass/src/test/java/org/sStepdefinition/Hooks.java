package org.sStepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		
		System.out.println("before sceanrio");

	}
	@After
	 public void afterScenario() {
		System.out.println("after sceanrio");

	}

}
