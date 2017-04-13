package org.com.yi.spring_mybatis.relationmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.com.yi.spring_mybatis.relationmag.beans.HusbandBean;
import org.com.yi.spring_mybatis.relationmag.dao.IHusbandBeanDao;
import org.com.yi.spring_mybatis.relationmag.mapper.HusbandMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HusbandBeanDaoImpl implements IHusbandBeanDao {

	private HusbandMapper hm;

	public void setSession(SqlSession session) {

		hm = session.getMapper(HusbandMapper.class);

	}

	public int marry(HusbandBean hus) {
		// TODO Auto-generated method stub
		return hm.marry(hus);
	}

	public int divorce(HusbandBean hus) {
		// TODO Auto-generated method stub
		return hm.divorce(hus);
	}

}
