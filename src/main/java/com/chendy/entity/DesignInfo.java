package com.chendy.entity;

import java.util.List;

public class DesignInfo {
	private Integer id;
	private Integer designerId;
	private Integer designType;
	private Integer designPrice;
	private Integer designIndustry;
	private String period;
	private String designTitle;
	private String designDescribe;
	private Integer designGood;
	private Integer designCollect;
	private Integer dtime;
	private Integer audit;
	private Integer recommend;
	private Integer del;
	private List<DesignInfoContent> designInfoContent;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDesignerId() {
		return designerId;
	}
	public void setDesignerId(Integer designerId) {
		this.designerId = designerId;
	}
	public Integer getDesignType() {
		return designType;
	}
	public void setDesignType(Integer designType) {
		this.designType = designType;
	}
	public Integer getDesignPrice() {
		return designPrice;
	}
	public void setDesignPrice(Integer designPrice) {
		this.designPrice = designPrice;
	}
	public Integer getDesignIndustry() {
		return designIndustry;
	}
	public void setDesignIndustry(Integer designIndustry) {
		this.designIndustry = designIndustry;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getDesignTitle() {
		return designTitle;
	}
	public void setDesignTitle(String designTitle) {
		this.designTitle = designTitle;
	}
	public String getDesignDescribe() {
		return designDescribe;
	}
	public void setDesignDescribe(String designDescribe) {
		this.designDescribe = designDescribe;
	}
	public Integer getDesignGood() {
		return designGood;
	}
	public void setDesignGood(Integer designGood) {
		this.designGood = designGood;
	}
	public Integer getDesignCollect() {
		return designCollect;
	}
	public void setDesignCollect(Integer designCollect) {
		this.designCollect = designCollect;
	}
	public Integer getDtime() {
		return dtime;
	}
	public void setDtime(Integer dtime) {
		this.dtime = dtime;
	}
	public Integer getAudit() {
		return audit;
	}
	public void setAudit(Integer audit) {
		this.audit = audit;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}
	public List<DesignInfoContent> getDesignInfoContent() {
		return designInfoContent;
	}
	public void setDesignInfoContent(List<DesignInfoContent> designInfoContent) {
		this.designInfoContent = designInfoContent;
	}
	@Override
	public String toString() {
		return "DesignInfo [id=" + id + ", designerId=" + designerId + ", designType=" + designType + ", designPrice="
				+ designPrice + ", designIndustry=" + designIndustry + ", period=" + period + ", designTitle="
				+ designTitle + ", designDescribe=" + designDescribe + ", designGood=" + designGood + ", designCollect="
				+ designCollect + ", dtime=" + dtime + ", audit=" + audit + ", recommend=" + recommend + ", del=" + del
				+ ", designInfoContent=" + designInfoContent + "]";
	}
	public DesignInfo(Integer id, Integer designerId, Integer designType, Integer designPrice, Integer designIndustry,
			String period, String designTitle, String designDescribe, Integer designGood, Integer designCollect,
			Integer dtime, Integer audit, Integer recommend, Integer del, List<DesignInfoContent> designInfoContent) {
		super();
		this.id = id;
		this.designerId = designerId;
		this.designType = designType;
		this.designPrice = designPrice;
		this.designIndustry = designIndustry;
		this.period = period;
		this.designTitle = designTitle;
		this.designDescribe = designDescribe;
		this.designGood = designGood;
		this.designCollect = designCollect;
		this.dtime = dtime;
		this.audit = audit;
		this.recommend = recommend;
		this.del = del;
		this.designInfoContent = designInfoContent;
	}
	public DesignInfo() {
	}
	
	
}
