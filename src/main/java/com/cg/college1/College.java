package com.cg.college1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	private int id;
	private String name;
	private String location;
	public College (){
		super();
	}
	public College(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Id
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
}
