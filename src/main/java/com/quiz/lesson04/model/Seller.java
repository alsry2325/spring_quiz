package com.quiz.lesson04.model;

import java.util.Date;

public class Seller {

	private int id;
	private String nickname;
	private String profileImageUrl;
	private String temperature;
	private Date createdAt;
	private Date updatedAt;

	public int getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public String getTemperature() {
		return temperature;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
