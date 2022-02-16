package com.te.crudmvc.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student implements Serializable{

	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	
}
