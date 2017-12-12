package com.chendy.entity;

import java.util.List;

public class DesignerInfoAll {
	private Integer id;
	private User user;
	private String trueName;
	private String userphone;
	private String email;
	private Integer sex;
	private String years;
	private Integer experience;
	private String province;
	private String city;
	private String district;
	private Integer realy;
	private String graduation;
	private String major;
	private String special;
	private String skill;
	private DesignTypeSelect designTypeSelect1;
	private DesignTypeSelect designTypeSelect2;
	private DesignTypeSelect designTypeSelect3;
	private PriceSelect priceSelect1;
	private PriceSelect priceSelect2;
	private PriceSelect priceSelect3;
	private String style1;
	private String style2;
	private String style3;
	private String introduce;
	private Integer good;
	private Integer collect;
	private Integer appointment;
	private Integer recommend;
	private Integer del;
	private List<DesignInfo> designInfo;

	public List<DesignInfo> getDesignInfo() {
		return designInfo;
	}

	public void setDesignInfo(List<DesignInfo> designInfo) {
		this.designInfo = designInfo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DesignTypeSelect getDesignTypeSelect1() {
		return designTypeSelect1;
	}

	public void setDesignTypeSelect1(DesignTypeSelect designTypeSelect1) {
		this.designTypeSelect1 = designTypeSelect1;
	}

	public DesignTypeSelect getDesignTypeSelect2() {
		return designTypeSelect2;
	}

	public void setDesignTypeSelect2(DesignTypeSelect designTypeSelect2) {
		this.designTypeSelect2 = designTypeSelect2;
	}

	public DesignTypeSelect getDesignTypeSelect3() {
		return designTypeSelect3;
	}

	public void setDesignTypeSelect3(DesignTypeSelect designTypeSelect3) {
		this.designTypeSelect3 = designTypeSelect3;
	}

	public PriceSelect getPriceSelect1() {
		return priceSelect1;
	}

	public void setPriceSelect1(PriceSelect priceSelect1) {
		this.priceSelect1 = priceSelect1;
	}

	public PriceSelect getPriceSelect2() {
		return priceSelect2;
	}

	public void setPriceSelect2(PriceSelect priceSelect2) {
		this.priceSelect2 = priceSelect2;
	}

	public PriceSelect getPriceSelect3() {
		return priceSelect3;
	}

	public void setPriceSelect3(PriceSelect priceSelect3) {
		this.priceSelect3 = priceSelect3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getRealy() {
		return realy;
	}

	public void setRealy(Integer realy) {
		this.realy = realy;
	}

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getStyle1() {
		return style1;
	}

	public void setStyle1(String style1) {
		this.style1 = style1;
	}

	public String getStyle2() {
		return style2;
	}

	public void setStyle2(String style2) {
		this.style2 = style2;
	}

	public String getStyle3() {
		return style3;
	}

	public void setStyle3(String style3) {
		this.style3 = style3;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Integer getGood() {
		return good;
	}

	public void setGood(Integer good) {
		this.good = good;
	}

	public Integer getCollect() {
		return collect;
	}

	public void setCollect(Integer collect) {
		this.collect = collect;
	}

	public Integer getAppointment() {
		return appointment;
	}

	public void setAppointment(Integer appointment) {
		this.appointment = appointment;
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

	public DesignerInfoAll() {
	}


	@Override
	public String toString() {
		return "DesignerInfoAll [id=" + id + ", user=" + user + ", trueName=" + trueName + ", userphone=" + userphone
				+ ", email=" + email + ", sex=" + sex + ", years=" + years + ", experience=" + experience
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", realy=" + realy
				+ ", graduation=" + graduation + ", major=" + major + ", special=" + special + ", skill=" + skill
				+ ", designTypeSelect1=" + designTypeSelect1 + ", designTypeSelect2=" + designTypeSelect2
				+ ", designTypeSelect3=" + designTypeSelect3 + ", priceSelect1=" + priceSelect1 + ", priceSelect2="
				+ priceSelect2 + ", priceSelect3=" + priceSelect3 + ", style1=" + style1 + ", style2=" + style2
				+ ", style3=" + style3 + ", introduce=" + introduce + ", good=" + good + ", collect=" + collect
				+ ", appointment=" + appointment + ", recommend=" + recommend + ", del=" + del + ", designInfo="
				+ designInfo + "]";
	}

	public DesignerInfoAll(Integer id, User user, String trueName, String userphone, String email, Integer sex,
			String years, Integer experience, String province, String city, String district, Integer realy,
			String graduation, String major, String special, String skill, DesignTypeSelect designTypeSelect1,
			DesignTypeSelect designTypeSelect2, DesignTypeSelect designTypeSelect3, PriceSelect priceSelect1,
			PriceSelect priceSelect2, PriceSelect priceSelect3, String style1, String style2, String style3,
			String introduce, Integer good, Integer collect, Integer appointment, Integer recommend, Integer del,
			List<DesignInfo> designInfo) {
		super();
		this.id = id;
		this.user = user;
		this.trueName = trueName;
		this.userphone = userphone;
		this.email = email;
		this.sex = sex;
		this.years = years;
		this.experience = experience;
		this.province = province;
		this.city = city;
		this.district = district;
		this.realy = realy;
		this.graduation = graduation;
		this.major = major;
		this.special = special;
		this.skill = skill;
		this.designTypeSelect1 = designTypeSelect1;
		this.designTypeSelect2 = designTypeSelect2;
		this.designTypeSelect3 = designTypeSelect3;
		this.priceSelect1 = priceSelect1;
		this.priceSelect2 = priceSelect2;
		this.priceSelect3 = priceSelect3;
		this.style1 = style1;
		this.style2 = style2;
		this.style3 = style3;
		this.introduce = introduce;
		this.good = good;
		this.collect = collect;
		this.appointment = appointment;
		this.recommend = recommend;
		this.del = del;
		this.designInfo = designInfo;
	}

}
