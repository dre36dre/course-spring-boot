package com.andersonfreires.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonfreires.course.entities.User;
import com.andersonfreires.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User u1=new User(null,"Maria Luiza","malu@gmail","966546554","123456");
		User u2=new User(null,"Victor Hugo","hugo@gmail.com","977777","123456");
		
		repository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
