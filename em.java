package com.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
 class em {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id ;
	
  private String name;
  
@ManyToMany(mappedBy = "emp")
  private List<Task> tasks;



public List<Task> getTasks() {
	return tasks;
}

public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
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

@Override
public String toString() {
	return "em [id=" + id + ", name=" + name + "]";
}
  
}
