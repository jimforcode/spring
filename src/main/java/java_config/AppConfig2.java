package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

	@Bean(name = "animalcat")
	public IAnimal getAnimal() {
		return new Cat();
	}
}