package org.com.yi.spring_mybatis.game.dao;

import java.util.List;

import org.com.yi.spring_mybatis.game.beans.GameBean;

public interface IGameBeanDao {

	
	public GameBean getGameWithPlayerByName(String playerName);

	
	public List<GameBean> getGameAllByPlayerName(String PlayerName);
	

}
