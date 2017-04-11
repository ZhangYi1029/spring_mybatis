package org.com.yi.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.com.yi.spring_mybatis.usermag.beans.UserBean;
import org.com.yi.spring_mybatis.usermag.dao.IUserBeanDao;
import org.com.yi.spring_mybatis.usermag.service.IUserBeanService;
import org.springframework.stereotype.Service;

@Service
public class UserBeanServiceImpl implements IUserBeanService {

	@Resource
	private IUserBeanDao userBeanDaoImpl;

	public int saveUser(UserBean user) {
		// TODO Auto-generated method stub

		return userBeanDaoImpl.addUser(user);
	}

	public int updateUser(UserBean user) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.updateUser(user);
	}

	public UserBean findUserById(int id) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.findUserById(id);

	}

	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.deleteUserById(id);
	}

	public int batchSaveUserBean(List<UserBean> list) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.batchSaveUserBean(list);
	}

	public int batchDeleteUserBean(List<UserBean> list) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.batchDeleteUserBean(list);
	}

	public UserBean findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.findUserByNameAndPwd(name, pwd);
	}

	public List<UserBean> queryUserByMap(Map map) {
		// TODO Auto-generated method stub
		return userBeanDaoImpl.queryUserByMap(map);
	}

}
