package org.com.yi.spring_mybatis.game.beans;

import java.io.Serializable;
import java.util.List;

public class GameBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4573870878271314670L;

	private Long id;
	private String gameName;
	private List<PlayerBean> playList;

	public GameBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameBean(Long id, String gameName, List<PlayerBean> playList) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.playList = playList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public List<PlayerBean> getPlayList() {
		return playList;
	}

	public void setPlayList(List<PlayerBean> playList) {
		this.playList = playList;
	}

	@Override
	public String toString() {
		return "GameBean [id=" + id + ", gameName=" + gameName + ", playList=" + playList + "]";
	}

}
