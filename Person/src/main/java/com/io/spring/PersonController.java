package com.io.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/postPersonsData",method=RequestMethod.POST)
	public List<Persons>topics(){
		return personService.getAllTopics();
		
	}
/*	@RequestMapping(value="/postBody",method=RequestMethod.POST)
	public @ResponseBody List<Persons>
	batchCreate(@RequestBody List<Persons>payments){
		return personService.batchCreate(payments);
	 }		*/
}
	
