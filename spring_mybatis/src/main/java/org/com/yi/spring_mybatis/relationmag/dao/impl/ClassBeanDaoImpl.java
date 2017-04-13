package org.com.yi.spring_mybatis.relationmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.com.yi.spring_mybatis.relationmag.beans.ClassBean;
import org.com.yi.spring_mybatis.relationmag.dao.IClassBeanDao;
import org.com.yi.spring_mybatis.relationmag.mapper.ClassMapper;
import org.springframework.stereotype.Repository;


@Repository
public class ClassBeanDaoImpl implements IClassBeanDao {

	private ClassMapper cm;

	public void setSession(SqlSession session) {

		cm = session.getMapper(ClassMapper.class);

	}

	public ClassBean getClassByClassId(int id) {
		// TODO Auto-generated method stub
		return cm.getClassByClassId(id);
	}

}
