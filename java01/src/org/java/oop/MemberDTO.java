package org.java.oop;

import java.util.Date;

public class MemberDTO {

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userAddr;
	private String userPhone;
	private Date day;
	
	// setter, getter
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setUserPw(String userPw) {
		this.userPw=userPw;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public void setUserAge(int userAge) {
		this.userAge=userAge;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr=userAddr;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	public void setDay(Date day) {
		this.day=day;
	}
	
	
	
	public String getUserId() {
		return this.userId;
	}
	public String getUserPw() {
		return this.userPw;
	}
	public String getUserName() {
		return this.userName;
	}
	public int getUserAge() {
		return this.userAge;
	}
	public String getUserAddr() {
		return this.userAddr;
	}
	public String getUserPhone() {
		return this.userPhone;
	}
	public Date getDay() {
		return this.day;
	}
	
}
