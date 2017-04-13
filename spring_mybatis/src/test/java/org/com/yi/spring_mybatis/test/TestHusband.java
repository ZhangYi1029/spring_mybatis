package org.com.yi.spring_mybatis.test;

import javax.annotation.Resource;

import org.com.yi.spring_mybatis.relationmag.beans.HusbandBean;
import org.com.yi.spring_mybatis.relationmag.beans.WifeBean;
import org.com.yi.spring_mybatis.relationmag.dao.IHusbandBeanDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class TestHusband {
	
	@Resource
	private IHusbandBeanDao husbandBeanDaoImpl;
	
	
	@Test
	public void testHusbandMarry(){
		
		
		HusbandBean hus =new HusbandBean(0,"吴奇隆",new WifeBean(0,"刘诗诗",null));
		int i =husbandBeanDaoImpl.marry(hus);
		 
	}
	
	
}
