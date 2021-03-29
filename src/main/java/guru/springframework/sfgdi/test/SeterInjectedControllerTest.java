package guru.springframework.sfgdi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SeterInjectedController;
import guru.springframework.sfgdi.service.SetterInjectedGreetingService;

public class SeterInjectedControllerTest {

	SeterInjectedController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new SeterInjectedController();
		controller.setGreetingService(new SetterInjectedGreetingService());
	}

	

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
