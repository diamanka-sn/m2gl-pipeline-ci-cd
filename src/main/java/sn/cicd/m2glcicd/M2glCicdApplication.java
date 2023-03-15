package sn.cicd.m2glcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M2glCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Bienvenue!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(M2glCicdApplication.class, args);
	}

}
