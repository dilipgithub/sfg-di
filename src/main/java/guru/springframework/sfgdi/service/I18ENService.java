package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NService")
public class I18ENService implements GreetingService{

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "DILIP IN ENGLISH";
	}

}
