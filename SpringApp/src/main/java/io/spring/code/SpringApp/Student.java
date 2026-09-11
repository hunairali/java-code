package io.spring.code.SpringApp;

import java.beans.JavaBean;

@JavaBean
public class Student {
	
	private int id;
	private String name;
	private String classLevel;
	
	
	
	public Student() {
		super();
	}
	
	
	public Student(int id, String name, String classLevel) {
		super();
		this.id = id;
		this.name = name;
		this.classLevel = classLevel;
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
	public String getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	
	

}
