package com.lostit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LostItApplication implements CommandLineRunner {
//
	public static void main(String[] args) {
		SpringApplication.run(LostItApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("done");
	}
	
	
}
