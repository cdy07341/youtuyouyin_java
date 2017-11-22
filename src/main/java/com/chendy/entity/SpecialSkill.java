package com.chendy.entity;

public class SpecialSkill {
	private Integer id;
	
	private String name;
	
	private Integer del;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "SpecialSkill [id=" + id + ", name=" + name + ", del=" + del + "]";
	}

	public SpecialSkill(Integer id, String name, Integer del) {
		super();
		this.id = id;
		this.name = name;
		this.del = del;
	}

	public SpecialSkill() {
	}
}
