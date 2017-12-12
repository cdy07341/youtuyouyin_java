package com.chendy.entity;


public class User {
	private Integer uid;
	private String username;
	private String password;
	private Integer type;
	private String avatar;
	private Integer register_time;
	private Integer login_time;
	private Integer del;
	private Integer online;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getRegister_time() {
		return register_time;
	}
	public void setRegister_time(Integer register_time) {
		this.register_time = register_time;
	}
	public Integer getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Integer login_time) {
		this.login_time = login_time;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	public Integer getOnline() {
		return online;
	}
	public void setOnline(Integer online) {
		this.online = online;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", type=" + type + ", avatar="
				+ avatar + ", register_time=" + register_time + ", login_time=" + login_time + ", del=" + del
				+ ", online=" + online + "]";
	}
	public User(Integer uid, String username, String password, Integer type, String avatar, Integer register_time,
			Integer login_time, Integer del, Integer online) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.type = type;
		this.avatar = avatar;
		this.register_time = register_time;
		this.login_time = login_time;
		this.del = del;
		this.online = online;
	}
	public User() {
		
	}
}
