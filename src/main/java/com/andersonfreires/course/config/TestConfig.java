package com.andersonfreires.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andersonfreires.course.entities.Category;
import com.andersonfreires.course.entities.Order;
import com.andersonfreires.course.entities.User;
import com.andersonfreires.course.entities.enums.OrderStatus;
import com.andersonfreires.course.repositories.CategoryRepository;
import com.andersonfreires.course.repositories.OrderRepository;
import com.andersonfreires.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1=new Category(null,"Eletronics");
		Category cat2=new Category(null,"Books");
		Category cat3=new Category(null,"Computers");
		
		
		
		User u1=new User(null,"Maria Luiza","malu@gmail","966546554","123456");
		User u2=new User(null,"Victor Hugo","hugo@gmail.com","977777","123456");
		
		Order o1=new Order(null,Instant.parse("2026-04-28T11:07:00Z"), OrderStatus.PAID, u1);
		Order o2=new Order(null,Instant.parse("2026-04-28T11:10:00Z"), OrderStatus.WAITING_PAYMENT , u2);
		Order o3=new Order(null,Instant.parse("2026-04-28T11:11:00Z"),OrderStatus.WAITING_PAYMENT  ,u1);
		
		repository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
	}
	
	
}
