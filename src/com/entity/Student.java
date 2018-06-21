package com.entity;

public class Student {
	private String userId;
	private String classId;
	private String joinDate;
	private String studentNumber;
	private String payedStart;
	private String payedEnd;
	
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
	
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getPayedStart() {
		return payedStart;
	}
	public void setPayedStart(String payedStart) {
		this.payedStart = payedStart;
	}
	
	public String getPayedEnd() {
		return payedEnd;
	}
	public void setPayedEnd(String payedEnd) {
		this.payedEnd = payedEnd;
	}

}
