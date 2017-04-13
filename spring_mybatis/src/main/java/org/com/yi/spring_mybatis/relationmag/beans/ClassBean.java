package org.com.yi.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class ClassBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4856480251451552160L;

	private int id;
	private String name;
	private List<StudentBean> list;

	public ClassBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassBean(int id, String name, List<StudentBean> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
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

	public List<StudentBean> getList() {
		return list;
	}

	public void setList(List<StudentBean> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ClassBean [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

}
