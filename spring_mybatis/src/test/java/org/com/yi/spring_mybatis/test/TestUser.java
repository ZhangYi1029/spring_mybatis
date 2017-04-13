package org.com.yi.spring_mybatis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.com.yi.spring_mybatis.usermag.beans.UserBean;
import org.com.yi.spring_mybatis.usermag.service.IUserBeanService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//测试测试测试测试测试测试测试测试
//测试无止尽
//测试测试测试
@RunWith(SpringJUnit4ClassRunner.class) // 启动容器监管
@ContextConfiguration(locations = "classpath*:applicationContext.xml") // 选择配置的文件
public class TestUser {

	@Resource
	private IUserBeanService userBeanServiceImpl;

	@Before
	public void before() {

	}

	@Test
	public void testGetUsersListByNameAndPwd() {

		
		
	}

	@Ignore
	public void testQueryUserByMap() {
		Map map = new HashMap();
		map.put("name", "小");
		map.put("age", 10);

		List<UserBean> list = userBeanServiceImpl.queryUserByMap(map);

		System.err.println(list);

	}

	@Ignore
	public void testBatchFindUser() {

		UserBean user = userBeanServiceImpl.findUserByNameAndPwd("小白", "789456");

		System.err.println(user + "传回来的对象");

	}

	@Ignore
	public void testBatchDeleteUserBean() {
		List<UserBean> list = new ArrayList<UserBean>();
		UserBean userOne = new UserBean();
		userOne.setId(22);
		UserBean userTwo = new UserBean();
		userTwo.setId(25);

		list.add(userOne);
		list.add(userTwo);

		userBeanServiceImpl.batchDeleteUserBean(list);

	}

	@Ignore
	public void testBatchSaveUserBean() {
		List<UserBean> list = new ArrayList<UserBean>();
		UserBean userOne = new UserBean(10, "黄半仙", "8563452", 10);
		try {
			UserBean userTwo = (UserBean) userOne.clone();
			userTwo.setName("小明");
			UserBean userThree = (UserBean) userOne.clone();
			userThree.setName("小红");
			UserBean userFour = (UserBean) userOne.clone();
			userFour.setName("小绿");
			list.add(userOne);
			list.add(userTwo);
			list.add(userThree);
			list.add(userFour);
			int rows = userBeanServiceImpl.batchSaveUserBean(list);
			System.out.println(rows);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Ignore
	public void testSelect() {

		UserBean user = userBeanServiceImpl.findUserById(1);
		System.out.println(user);
	}

	@Ignore
	public void testDelete() {

		userBeanServiceImpl.deleteUserById(1);

	}

	@Ignore
	public void testupdate() {

		userBeanServiceImpl.updateUser(new UserBean(1, "小红", "75612", 24));

	}

	@Ignore
	public void testUser() {

		userBeanServiceImpl.saveUser(new UserBean(0, "黄飞鸿", "789456", 24));

	}
}
