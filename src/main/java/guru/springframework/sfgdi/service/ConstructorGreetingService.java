package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String greet() {
		
		return "Hello From Dilip - Constructor";
	}

}
