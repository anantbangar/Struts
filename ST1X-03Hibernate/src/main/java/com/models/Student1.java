package com.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.struts.action.ActionForm;

@Entity
public class Student1 extends ActionForm{
	
	@Id
	private int sid;
	private String name;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}
