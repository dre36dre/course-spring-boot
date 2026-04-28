package com.andersonfreires.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonfreires.course.entities.Order;
import com.andersonfreires.course.entities.User;
import com.andersonfreires.course.repositories.OrderRepository;
import com.andersonfreires.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1=new User(null,"Maria Luiza","malu@gmail","966546554","123456");
		User u2=new User(null,"Victor Hugo","hugo@gmail.com","977777","123456");
		
		Order o1=new Order(null,Instant.parse("2026-04-28T11:07:00Z"),u1);
		Order o2=new Order(null,Instant.parse("2026-04-28T11:10:00Z"),u2);
		Order o3=new Order(null,Instant.parse("2026-04-28T11:11:00Z"),u1);
		
		repository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
