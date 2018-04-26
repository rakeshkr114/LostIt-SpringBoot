package com.lostit.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	public Long id;
	
	public String name;
	public String description;
	public String currentowner;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(Long id, String name, String description,String currentowner) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.currentowner=currentowner;
	}
	
//	public Item( String name, String description,String currentowner) {
//		super();
//		this.name = name;
//		this.description = description;
//		this.currentowner=currentowner;
//	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getcurrentowner() {
		return currentowner;
	}

	public void setcurrentowner(String currentowner) {
		this.currentowner = currentowner;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
