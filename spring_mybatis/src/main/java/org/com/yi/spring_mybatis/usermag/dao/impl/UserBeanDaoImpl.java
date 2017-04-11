package org.com.yi.spring_mybatis.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.com.yi.spring_mybatis.usermag.beans.UserBean;
import org.com.yi.spring_mybatis.usermag.dao.IUserBeanDao;
import org.com.yi.spring_mybatis.usermag.dao.mapper.UserMapper;
import org.com.yi.spring_mybatis.usermag.utils.SessionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserBeanDaoImpl implements IUserBeanDao {

	private UserMapper um;

	public void setSession(SqlSession session) {

		um = session.getMapper(UserMapper.class);
	}

	public int addUser(UserBean user) {

		return um.addUser(user);
	}

	public int updateUser(UserBean user) {

		return um.updateUser(user);
	}

	public UserBean findUserById(int id) {
		// TODO Auto-generated method stub

		return um.findUserById(id);
	}

	public int deleteUserById(int id) {
		// TODO Auto-generated method stub

		return um.deleteUserById(id);
	}

	public int batchSaveUserBean(List<UserBean> list) {

		return um.batchSaveUserBean(list);
	}

	public int batchDeleteUserBean(List<UserBean> list) {
		// TODO Auto-generated method stub
		System.out.println(10/0);
		return um.batchDeleteUserBean(list);
	}

	public UserBean findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub

		return um.findUserByNameAndPwd(name, pwd);

	}

	public List<UserBean> queryUserByMap(Map map) {
		// TODO Auto-generated method stub

		return um.queryUserByMap(map);
	}

}
