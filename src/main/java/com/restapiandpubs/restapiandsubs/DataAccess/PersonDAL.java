package com.restapiandpubs.restapiandsubs.DataAccess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.restapiandpubs.restapiandsubs.Entities.*;

@Repository
public class PersonDAL {

    public static final String HASH_KEY = "Person";
    
    @Autowired
    private RedisTemplate template;
    
    
    public Person save(Person person) {
    	template.opsForHash().put(HASH_KEY,person.getId(),person);
    	
    	return person;
    }
    
    public List<Person> getAll(){
    	return template.opsForHash().values(HASH_KEY);
    
    }
    
    
    public List<Person> getId(int id){
    	return (List<Person>) template.opsForHash().get(HASH_KEY,id);
    	
    }
    
    
  
    
	
    
    
    
}
