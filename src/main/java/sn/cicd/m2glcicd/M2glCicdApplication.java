package sn.cicd.m2glcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
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

// 	echo "# m2gl-pipeline-ci-cd" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/diamanka-sn/m2gl-pipeline-ci-cd.git
// git push -u origin main
}
