package com.models;

import org.apache.struts.action.ActionForm;

public class Student extends ActionForm{
	
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
