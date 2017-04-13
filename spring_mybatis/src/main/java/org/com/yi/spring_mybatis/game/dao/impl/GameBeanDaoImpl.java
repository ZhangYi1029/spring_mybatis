package org.com.yi.spring_mybatis.game.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.com.yi.spring_mybatis.game.beans.GameBean;
import org.com.yi.spring_mybatis.game.dao.IGameBeanDao;
import org.com.yi.spring_mybatis.game.mapper.GameMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GameBeanDaoImpl implements IGameBeanDao {

	private GameMapper gm;

	public void setSession(SqlSession session) {

		gm = session.getMapper(GameMapper.class);

	}

	public GameBean getGameWithPlayerByName(String playerName) {
		// TODO Auto-generated method stub
		return gm.getGameWithPlayerByName(playerName);
	}

	public List<GameBean> getGameAllByPlayerName(String PlayerName) {
		// TODO Auto-generated method stub
		return gm.getGameAllByPlayerName(PlayerName);
	}

}
