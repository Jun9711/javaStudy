package org.java.oop;

import java.util.Date;

public class BoardDto {

	private int no;
	private String title;
	private String memo;
	private Date day;
	
	public void setNo(int no) {
		this.no=no;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setMemo(String memo) {
		this.memo=memo;
	}
	public void setDay(Date day) {
		this.day=day;
	}
	
	public int getNo() {
		return this.no;
	}
	public String getTitle() {
		return this.title;
	}
	public String getMemo() {
		return this.memo;
	}
	public Date getDay() {
		return this.day;
	}
	
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", memo=" + memo + ", day=" + day + "]";
	}
	
	
	
}
