package com.CrudExample.Dto;

import org.springframework.stereotype.Component;

@Component
public class StudentDto {
	
	private long id;
	private String name;
	private String city;
	private long mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}
	
	
}
