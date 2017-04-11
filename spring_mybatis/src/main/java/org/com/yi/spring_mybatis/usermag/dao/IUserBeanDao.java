package org.com.yi.spring_mybatis.usermag.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.com.yi.spring_mybatis.usermag.beans.UserBean;

public interface IUserBeanDao {
	
	//@Insert("insert into users values(null,#{userName},#{userPwd},#{age})")
	public int addUser(UserBean user);
	
	
	public int updateUser(UserBean user);
	
	//@Select("select * from users where u_id=#{id}")
	public UserBean findUserById(int id);
		
	public int deleteUserById(int id);
	
	public UserBean findUserByNameAndPwd(String name,String pwd);
	
	public int batchSaveUserBean(List<UserBean> list); 
	
	public int batchDeleteUserBean(List<UserBean> user);
	
}
