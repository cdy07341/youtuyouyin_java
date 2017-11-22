package com.chendy.entity;

public class YtyyUser {
	private int uid;
	private String username;
	private String password;
	private int type;
	private String avatar;
	private int register_time;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getRegister_time() {
		return register_time;
	}
	public void setRegister_time(int register_time) {
		this.register_time = register_time;
	}
	public int getLogin_time() {
		return login_time;
	}
	public void setLogin_time(int login_time) {
		this.login_time = login_time;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public int getOnline() {
		return online;
	}
	public void setOnline(int online) {
		this.online = online;
	}
	private int login_time;
	private int del;
	private int online;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "YtyyUser [uid=" + uid + ", username=" + username + ", password=" + password + ", type=" + type
				+ ", avatar=" + avatar + ", register_time=" + register_time + ", login_time=" + login_time + ", del="
				+ del + ", online=" + online + "]";
	}
	public YtyyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public YtyyUser() {
		
	}
}
