package com.te.demo.compartor;

import java.io.Serializable;

public class Employee implements Serializable{

	private Integer id;
	
	private String name;
	
	public Employee() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
