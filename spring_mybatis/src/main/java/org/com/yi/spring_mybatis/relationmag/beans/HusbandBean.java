package org.com.yi.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class HusbandBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4957386414078482727L;

	private int id;
	private String husbandName;
	private WifeBean wife;

	public HusbandBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HusbandBean(int id, String husbandName, WifeBean wife) {
		super();
		this.id = id;
		this.husbandName = husbandName;
		this.wife = wife;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public WifeBean getWife() {
		return wife;
	}

	public void setWife(WifeBean wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "HusbandBean [id=" + id + ", husbandName=" + husbandName + ", wife=" + wife + "]";
	}

}
