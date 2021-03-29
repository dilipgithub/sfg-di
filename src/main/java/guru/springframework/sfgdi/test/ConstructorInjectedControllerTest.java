package guru.springframework.sfgdi.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.service.SetterInjectedGreetingService;

public class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new ConstructorInjectedController(new SetterInjectedGreetingService());
		//controller.setGreetingService();
	}

	@Test
	public void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
