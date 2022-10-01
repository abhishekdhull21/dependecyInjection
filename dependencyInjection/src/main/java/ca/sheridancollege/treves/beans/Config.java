package ca.sheridancollege.treves.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ca.sheridancollege.treves.Volume;

@Configuration
public class Config {
	@Bean(name = "volume")
	Volume volumeBean() {
		return new Volume();
	}

	@Bean(name = "message")
	Message messageBean() {
		return new Message();

	}

	@Bean(name = "student")
	Student studentBean() {
		return new Student("Akshay Sangwan", "991656863");

	}
}
