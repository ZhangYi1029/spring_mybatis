package org.com.yi.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class WifeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9103854661624243744L;

	private int id;
	private String name;
	private HusbandBean hus;

	public WifeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WifeBean(int id, String name, HusbandBean hus) {
		super();
		this.id = id;
		this.name = name;
		this.hus = hus;
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

	public HusbandBean getHus() {
		return hus;
	}

	public void setHus(HusbandBean hus) {
		this.hus = hus;
	}

	@Override
	public String toString() {
		return "WifeBean [id=" + id + ", name=" + name + ", hus=" + hus + "]";
	}

}
