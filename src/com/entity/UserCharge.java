package com.entity;

public class UserCharge {
	private String userId;
	private String classId;
	private String chargeDate;
	private String chargeTime;
	private String price;
	private String chargeDays;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public String getChargeDate() {
		return chargeDate;
	}
	public void setChargeDate(String chargeDate) {
		this.chargeDate = chargeDate;
	}
	
	public String getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getChargeDays() {
		return chargeDays;
	}
	public void setChargeDays(String chargeDays) {
		this.chargeDays = chargeDays;
	}

}
