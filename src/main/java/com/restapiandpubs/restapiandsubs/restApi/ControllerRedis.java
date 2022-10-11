package com.restapiandpubs.restapiandsubs.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapiandpubs.restapiandsubs.DataAccess.PersonDAL;
import com.restapiandpubs.restapiandsubs.Entities.Person;

@RestController
@RequestMapping("api")
public class ControllerRedis {

	@Autowired
	private PersonDAL personDAL;

	public ControllerRedis(PersonDAL personDAL) {
		this.personDAL = personDAL;
	}
	
	
	@GetMapping("/personData")
	public List<Person> getALL(){
		return personDAL.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(Person person) {
		personDAL.save(person);
	}
	
	
	@GetMapping("/personData/{id}")
	
	public Person getById(@PathVariable int id){
		return (Person) personDAL.getId(id);
	}
	
	
	
	
	
}
