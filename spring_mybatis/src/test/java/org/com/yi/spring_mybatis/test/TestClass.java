package org.com.yi.spring_mybatis.test;

import javax.annotation.Resource;

import org.com.yi.spring_mybatis.relationmag.beans.ClassBean;
import org.com.yi.spring_mybatis.relationmag.dao.IClassBeanDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class TestClass {

	
	
	@Resource
	private IClassBeanDao classBeanDaoImpl;

	
	@Test
	public void testClass() {

		ClassBean clas = classBeanDaoImpl.getClassByClassId(1);

		System.err.println(clas.getName());
		
		System.err.println(clas.getList());

	}

}
