package com.chendy.entity;

public class PrintTypeSelect {
	private Integer id;
	private String name;
	private Integer sort;
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
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "PrintTypeSelect [id=" + id + ", name=" + name + ", sort=" + sort + ", del=" + del + "]";
	}
	public PrintTypeSelect(Integer id, String name, Integer sort, Integer del) {
		super();
		this.id = id;
		this.name = name;
		this.sort = sort;
		this.del = del;
	}
	public PrintTypeSelect() {
	}
	
}
