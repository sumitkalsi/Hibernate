package com.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String task;
	
	@ManyToMany
	  private List<em> emp;
	public List<em> getEmp() {
		return emp;
	}
	public void setEmp(List<em> emp) {
		this.emp = emp;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int tid, String task) {
		super();
		this.tid = tid;
		this.task = task;
	}
	
	
	
}
