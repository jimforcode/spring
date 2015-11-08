package hello;

import loosely_coupled.OutputHelper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// context = new ClassPathXmlApplicationContext("spring-beans.xml");
		//
		// HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		// obj.printName();
		// context = new ClassPathXmlApplicationContext(
		// new String[] { "Spring-Output.xml" });
		context = new ClassPathXmlApplicationContext("Spring-All-Model.xml");

		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();

	}
}