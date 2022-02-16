package com.te.springmvc.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student_Info implements Serializable{

	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String branch;
	
	@Column
	private Integer deptid;
}
