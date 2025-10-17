package com.anurag.springboot_webapp_warfile_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootWebappWarfileTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebappWarfileTwoApplication.class, args);
	}
	
	@RequestMapping("/hii")
	public String hii() {
		return "<h1>wlcome to tomcat! webapp 2</h1>";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to catalina";
	}

}
