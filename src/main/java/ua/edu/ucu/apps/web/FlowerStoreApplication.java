package ua.edu.ucu.apps.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

	@GetMapping("/flowers")
	public List<Flower> hello(){
		return new ArrayList<Flower>();
	}

	@GetMapping("/test")
	public String customTest(){
		return "That's test text.";
	}
}
