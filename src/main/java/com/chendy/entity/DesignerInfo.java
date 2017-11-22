package com.chendy.entity;

public class DesignerInfo {
	private Integer id;
	private Integer uid;
	private String true_name;
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
	private String serve1;
	private String serve2;
	private String serve3;
	private String price1;
	private String price2;
	private String price3;
	private String style1;
	private String style2;
	private String style3;
	private String introduce;
	private Integer good;
	private Integer collect;
	private Integer appointment;
	private Integer recommend;
	private Integer del;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getTrue_name() {
		return true_name;
	}
	public void setTrue_name(String true_name) {
		this.true_name = true_name;
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
	public String getServe1() {
		return serve1;
	}
	public void setServe1(String serve1) {
		this.serve1 = serve1;
	}
	public String getServe2() {
		return serve2;
	}
	public void setServe2(String serve2) {
		this.serve2 = serve2;
	}
	public String getServe3() {
		return serve3;
	}
	public void setServe3(String serve3) {
		this.serve3 = serve3;
	}
	public String getPrice1() {
		return price1;
	}
	public void setPrice1(String price1) {
		this.price1 = price1;
	}
	public String getPrice2() {
		return price2;
	}
	public void setPrice2(String price2) {
		this.price2 = price2;
	}
	public String getPrice3() {
		return price3;
	}
	public void setPrice3(String price3) {
		this.price3 = price3;
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
	@Override
	public String toString() {
		return "DesignerInfo [id=" + id + ", uid=" + uid + ", true_name=" + true_name + ", userphone=" + userphone
				+ ", email=" + email + ", sex=" + sex + ", years=" + years + ", experience=" + experience
				+ ", province=" + province + ", city=" + city + ", district=" + district + ", realy=" + realy
				+ ", graduation=" + graduation + ", major=" + major + ", special=" + special + ", skill=" + skill
				+ ", serve1=" + serve1 + ", serve2=" + serve2 + ", serve3=" + serve3 + ", price1=" + price1
				+ ", price2=" + price2 + ", price3=" + price3 + ", style1=" + style1 + ", style2=" + style2
				+ ", style3=" + style3 + ", introduce=" + introduce + ", good=" + good + ", collect=" + collect
				+ ", appointment=" + appointment + ", recommend=" + recommend + ", del=" + del + "]";
	}
	public DesignerInfo(Integer id, Integer uid, String true_name, String userphone, String email, Integer sex,
			String years, Integer experience, String province, String city, String district, Integer realy,
			String graduation, String major, String special, String skill, String serve1, String serve2, String serve3,
			String price1, String price2, String price3, String style1, String style2, String style3, String introduce,
			Integer good, Integer collect, Integer appointment, Integer recommend, Integer del) {
		super();
		this.id = id;
		this.uid = uid;
		this.true_name = true_name;
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
		this.serve1 = serve1;
		this.serve2 = serve2;
		this.serve3 = serve3;
		this.price1 = price1;
		this.price2 = price2;
		this.price3 = price3;
		this.style1 = style1;
		this.style2 = style2;
		this.style3 = style3;
		this.introduce = introduce;
		this.good = good;
		this.collect = collect;
		this.appointment = appointment;
		this.recommend = recommend;
		this.del = del;
	}
	public DesignerInfo() {
	}
}
