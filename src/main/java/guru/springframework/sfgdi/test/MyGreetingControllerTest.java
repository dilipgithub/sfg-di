package guru.springframework.sfgdi.test;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.service.SetterInjectedGreetingService;


public class MyGreetingControllerTest {
	
	PropertyInjectedController controller;
	
	@Before
	public void setUp(){
		controller = new PropertyInjectedController();
		controller.greetingService = new SetterInjectedGreetingService();
	}

	@Test
	public void testGetGreetig() {
		System.out.println(controller.getGreeting());
	}

}
