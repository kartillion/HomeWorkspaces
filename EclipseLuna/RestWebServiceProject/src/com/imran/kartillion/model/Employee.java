package com.imran.kartillion.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Employee {

	private Integer id;
	private String name;
	
	public Employee() {
		super();		
	}
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
