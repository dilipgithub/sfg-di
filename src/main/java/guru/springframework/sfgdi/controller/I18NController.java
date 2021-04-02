package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;


@Controller
public class I18NController {

		private final GreetingService greetingService;

		public I18NController(@Qualifier("i18NService") GreetingService greetingService) {
			super();
			this.greetingService = greetingService;
		}
		
		public String getGreeting(){
			return greetingService.greet();
		}
}
