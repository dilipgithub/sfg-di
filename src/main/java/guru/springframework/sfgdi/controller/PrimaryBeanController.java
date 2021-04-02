package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class PrimaryBeanController {
	
	private GreetingService  greetingservice;
	
	public PrimaryBeanController(GreetingService greetingservice) {
		super();
		this.greetingservice = greetingservice;
	}


	public String getGreeting(){
		return greetingservice.greet();
	}

}
