package com.chendy.entity;

public class PriceSelect {
	private Integer id;
	
	private String value;
	
	private Integer del;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	@Override
	public String toString() {
		return "PriceSelect [id=" + id + ", value=" + value + ", del=" + del + "]";
	}

	public PriceSelect(Integer id, String value, Integer del) {
		super();
		this.id = id;
		this.value = value;
		this.del = del;
	}

	public PriceSelect() {
		
	}
}
