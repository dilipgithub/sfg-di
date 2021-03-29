package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SeterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController mycontroller = (MyController)context.getBean("myController");
		String msg = mycontroller.sayHello();
		System.out.println(msg);
		
		System.out.println("========Property============");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
		 msg = propertyInjectedController.getGreeting();
		System.out.println(msg);
		
		System.out.println("========Setter============");
		
		SeterInjectedController seterInjectedController = (SeterInjectedController)context.getBean("seterInjectedController");
		 msg = seterInjectedController.getGreeting();
		System.out.println(msg);
		
		System.out.println("========Constructor============");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)context.getBean("constructorInjectedController");
		 msg = constructorInjectedController.getGreeting();
		System.out.println(msg);

	}

}
