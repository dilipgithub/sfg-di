package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class SeterInjectedController {
	private GreetingService greetingService;

	@Autowired
	public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting(){
		return greetingService.greet();
	}
	

}
