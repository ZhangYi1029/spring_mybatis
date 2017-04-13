package org.com.yi.spring_mybatis.relationmag.dao;

import org.com.yi.spring_mybatis.relationmag.beans.HusbandBean;

public interface IHusbandBeanDao {

	public int marry(HusbandBean hus);
	
	public int divorce(HusbandBean hus);
	
}
