package com.io.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class PersonService {

	@Autowired
	private PersonsRepository personsRepository;

	private List<Persons>topics=Arrays.asList(		 
			new Persons("John", "Peter", 20),
			new Persons("joseph", "samael", 21),
			new Persons("francis", "john", 22),
			new Persons("peter", "immaniel", 23),
			new Persons("varsha", "srilakshmi", 24),
			new Persons("mahi", "irfan", 25),
			new Persons("kiran", "kumar", 20),
			new Persons("aravind", "swami", 21),
			new Persons("mahesh", "babu", 22),
			new Persons("prithi", "zintha", 23),
			new Persons("vimal", "kanth", 24),
			new Persons("amit", "irfan", 25));

	public List<Persons>getAllTopics(){
		return personsRepository.save(topics);

	}

/*
	public @ResponseBody List<Persons>
	batchCreate(@RequestBody List<Persons>payments){
		return personsRepository.save(payments);

	}*/
	
	}







