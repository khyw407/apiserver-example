package com.test.apiserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.apiserver.accounts.Accounts;
import com.test.apiserver.accounts.AccountsRepository;



@SpringBootApplication
public class ApiserverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiserverApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(AccountsRepository userRepository) {
		return args -> {
			userRepository.save(new Accounts("user1", "test1"));
			userRepository.save(new Accounts("user2", "test2"));
			userRepository.save(new Accounts("user3", "test3"));
		};
	}
}
