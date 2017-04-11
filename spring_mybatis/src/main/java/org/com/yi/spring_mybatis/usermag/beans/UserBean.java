package org.com.yi.spring_mybatis.usermag.beans;

import java.io.Serializable;

public class UserBean implements Serializable ,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2101754425984179137L;
	private int id;
	private String name;
	private String pwd;
	private int age;

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBean(int id, String name, String pwd, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
