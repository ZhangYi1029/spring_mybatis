package org.com.yi.spring_mybatis.test;

import java.util.List;

import javax.annotation.Resource;

import org.com.yi.spring_mybatis.game.beans.GameBean;
import org.com.yi.spring_mybatis.game.dao.IGameBeanDao;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class TestGame {
	@Resource
	private IGameBeanDao gameBeanDaoImpl;

	@Ignore
	public void testGetGameAllByPlayerName() {

		List<GameBean> list = gameBeanDaoImpl.getGameAllByPlayerName("L");
		System.err.println(list);

	}

	@Test
	public void testGetGameWithPlayerByName() {

		GameBean game = gameBeanDaoImpl.getGameWithPlayerByName("LOL");
		System.err.println(game.getGameName());
		System.err.println(game.getId());
		//System.err.println(game.getPlayList());

	}

}
