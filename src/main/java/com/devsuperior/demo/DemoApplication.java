package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODE = " + passwordEncoder.encode("123456"));

		//COMO QUE O SISTEMA FAZ A COMPARAÇÃO DAS SENHAS
		boolean result = passwordEncoder.matches("123456", "$2a$10$CSEXOgNTjk9t1OoHG4y/yuSCQdoI/mDwVQWOJfQ8VDcdr8z/jbpSS");

		System.out.println("RESULTADO = " + result);
	}
}
