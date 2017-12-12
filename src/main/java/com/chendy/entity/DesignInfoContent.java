package com.chendy.entity;

public class DesignInfoContent {
	private Integer id;
	private Integer designId;
	private String designImgUrl;
	private String DesignImgTitle;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDesignId() {
		return designId;
	}
	public void setDesignId(Integer designId) {
		this.designId = designId;
	}
	public String getDesignImgUrl() {
		return designImgUrl;
	}
	public void setDesignImgUrl(String designImgUrl) {
		this.designImgUrl = designImgUrl;
	}
	public String getDesignImgTitle() {
		return DesignImgTitle;
	}
	public void setDesignImgTitle(String designImgTitle) {
		DesignImgTitle = designImgTitle;
	}
	@Override
	public String toString() {
		return "DesignInfoContent [id=" + id + ", designId=" + designId + ", designImgUrl=" + designImgUrl
				+ ", DesignImgTitle=" + DesignImgTitle + "]";
	}
	public DesignInfoContent(Integer id, Integer designId, String designImgUrl, String designImgTitle) {
		super();
		this.id = id;
		this.designId = designId;
		this.designImgUrl = designImgUrl;
		DesignImgTitle = designImgTitle;
	}
	public DesignInfoContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
