package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanService implements GreetingService{

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello from Dilip - PrimaryBean";
	}

}
