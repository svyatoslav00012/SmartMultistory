package ua.com.smartmultistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
//@EnableJpaAuditing
public class SmartMultistoryApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartMultistoryApplication.class, args);
	}

	private static String e(String s) {
		return new BCryptPasswordEncoder().encode("admin");
	}

}