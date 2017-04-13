package org.com.yi.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2911375900114867558L;

	private int id;
	private String name;
	private ClassBean cals;

	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBean(int id, String name, ClassBean cals) {
		super();
		this.id = id;
		this.name = name;
		this.cals = cals;
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

	public ClassBean getCals() {
		return cals;
	}

	public void setCals(ClassBean cals) {
		this.cals = cals;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", cals=" + cals + "]";
	}

}
