package com.chendy.entity;

public class Print {
	private Integer id;
	private Integer type;
	private String author;
	private String title;
	private String describle;
	private String coverimg;
	private String content;
	private Integer hot;
	private Integer recommend;
	private Integer dtime;
	private Integer aduit;
	private Integer del;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public String getCoverimg() {
		return coverimg;
	}
	public void setCoverimg(String coverimg) {
		this.coverimg = coverimg;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	public Integer getDtime() {
		return dtime;
	}
	public void setDtime(Integer dtime) {
		this.dtime = dtime;
	}
	public Integer getAduit() {
		return aduit;
	}
	public void setAduit(Integer aduit) {
		this.aduit = aduit;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "Print [id=" + id + ", type=" + type + ", author=" + author + ", title=" + title + ", describle="
				+ describle + ", coverimg=" + coverimg + ", content=" + content + ", hot=" + hot + ", recommend="
				+ recommend + ", dtime=" + dtime + ", aduit=" + aduit + ", del=" + del + "]";
	}
	public Print(Integer id, Integer type, String author, String title, String describle, String coverimg,
			String content, Integer hot, Integer recommend, Integer dtime, Integer aduit, Integer del) {
		super();
		this.id = id;
		this.type = type;
		this.author = author;
		this.title = title;
		this.describle = describle;
		this.coverimg = coverimg;
		this.content = content;
		this.hot = hot;
		this.recommend = recommend;
		this.dtime = dtime;
		this.aduit = aduit;
		this.del = del;
	}
	public Print() {
	}
}
