package org.com.yi.spring_mybatis.game.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.com.yi.spring_mybatis.game.beans.GameBean;

public interface GameMapper {

	public GameBean getGameWithPlayerByName(@Param("playerName")String playerName);
	
	public List<GameBean> getGameAllByPlayerName(@Param("playerName")String PlayerName);
	
}
