package ua.com.smartmultistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing
public class SmartMultistoryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartMultistoryApplication.class, args);
	}
}