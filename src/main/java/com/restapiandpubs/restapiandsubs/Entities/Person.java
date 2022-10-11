package com.restapiandpubs.restapiandsubs.Entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RedisHash("Person")
public class Person  implements Serializable{

	@Id
	private int id;
	private String name;
	private String lnmae;
	private String phone;
	
	
	public Person(int id, String name, String lnmae, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.lnmae = lnmae;
		this.phone = phone;
	}
	
	public Person() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLnmae() {
		return lnmae;
	}
	public void setLnmae(String lnmae) {
		this.lnmae = lnmae;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

