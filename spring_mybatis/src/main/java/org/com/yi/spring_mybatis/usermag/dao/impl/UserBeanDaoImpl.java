package org.com.yi.spring_mybatis.usermag.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.com.yi.spring_mybatis.usermag.beans.UserBean;
import org.com.yi.spring_mybatis.usermag.dao.IUserBeanDao;
import org.com.yi.spring_mybatis.usermag.dao.mapper.UserMapper;
import org.com.yi.spring_mybatis.usermag.utils.SessionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class UserBeanDaoImpl implements IUserBeanDao {

	private UserMapper um;

	private SqlSession session;

	// public void setUm(UserMapper um) {
	// this.um = um;
	// }

	public void setSession(SqlSession session) {
		this.session = session;
	}

	public int addUser(UserBean user) {
		// TODO Auto-generated method stub
		um = session.getMapper(UserMapper.class);

		int result = um.addUser(user);
		
		return result;
	}

	public int updateUser(UserBean user) {
		// TODO Auto-generated method stub

		um = session.getMapper(UserMapper.class);// 取得接口的实例

		int rows = 0;

		rows = um.updateUser(user);

		return rows;
	}

	public UserBean findUserById(int id) {
		// TODO Auto-generated method stub

		um = session.getMapper(UserMapper.class);// 取得接口的实例

		UserBean user = null;

		user = um.findUserById(id);

		return user;
	}

	public int deleteUserById(int id) {
		// TODO Auto-generated method stub

		um = session.getMapper(UserMapper.class);// 取得接口的实例

		int rows = 0;

		rows = um.deleteUserById(id);

		return rows;
	}

	public int batchSaveUserBean(List<UserBean> list) {

		um = session.getMapper(UserMapper.class);// 取得接口的实例

		int rows = 0;

		rows = um.batchSaveUserBean(list);

		return rows;
	}

	public int batchDeleteUserBean(List<UserBean> list) {
		// TODO Auto-generated method stub

		um = session.getMapper(UserMapper.class);// 取得接口的实例

		int rows = 0;

		rows = um.batchDeleteUserBean(list);

		return rows;
	}

	public UserBean findUserByNameAndPwd(String name, String pwd) {
		// TODO Auto-generated method stub
		um =session.getMapper(UserMapper.class);
		
		UserBean user =null;
		user= um.findUserByNameAndPwd(name, pwd);
		
		return user;
	}

}
