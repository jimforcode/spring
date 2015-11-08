package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

	@Bean(name = "animal")
	public IAnimal getAnimal() {
		return new Dog();
	}
}