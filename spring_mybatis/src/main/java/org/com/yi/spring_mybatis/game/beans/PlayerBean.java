package org.com.yi.spring_mybatis.game.beans;

import java.io.Serializable;
import java.util.List;

public class PlayerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9183271380600594511L;

	private Long id;
	private String playerName;
	private List<GameBean> gameList;

	public PlayerBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerBean(Long id, String playerName, List<GameBean> gameList) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.gameList = gameList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public List<GameBean> getGameList() {
		return gameList;
	}

	public void setGameList(List<GameBean> gameList) {
		this.gameList = gameList;
	}

	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", playerName=" + playerName + ", gameList=" + gameList + "]";
	}

}
