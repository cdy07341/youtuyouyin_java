package com.chendy.entity;

public class CitySelect {
	private Integer id;
	private String city;
	private Integer sort;
	private Integer del;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
		return "CitySelect [id=" + id + ", city=" + city + ", sort=" + sort + ", del=" + del + "]";
	}
	public CitySelect(Integer id, String city, Integer sort, Integer del) {
		super();
		this.id = id;
		this.city = city;
		this.sort = sort;
		this.del = del;
	}
	public CitySelect() {
		
	}
	
}
