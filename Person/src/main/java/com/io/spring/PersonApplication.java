package com.io.spring;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

@SpringBootApplication
public class PersonApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
	/*	
		List<Persons>list=PersonsRepository.findyByLastName("kumar",
				new PageRequest(0, 14, Direction.ASC, "lastName"));
		list.forEach(System.out::println);*/
		//
		
	}

}

