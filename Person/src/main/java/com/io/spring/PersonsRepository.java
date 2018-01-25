package com.io.spring;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonsRepository extends MongoRepository<Persons, String> {
/*
	static List<Persons> findByLastName(String lastName, PageRequest pageRequest) {
		return null;
	}

	static List<Persons> findyByLastName(String lastName, PageRequest pageRequest) {
		return PersonsRepository.findByLastName(lastName,pageRequest);
	}*/


		
	}


