package io.pivotal.pivotalservices.tutorials.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@RestController
	public class HelloApi {

		@GetMapping("/hello")
		public String getHello() {
			return null;
		}

	}

}
