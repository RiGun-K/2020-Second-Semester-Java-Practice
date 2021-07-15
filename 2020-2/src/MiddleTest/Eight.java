package MiddleTest;

import javax.swing.*;	// swing 클래스

public class Eight {
	int year;
	int month;
	int day;
	
	Eight() {
		this(27, 01, 24);
	}
	Eight(int a,int b,int c) {
		year = a;
		month = b;
		day = c;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {	// 마우스 우클릭 + source + 게터 앤 섹터 생성
		this.day = day;
	}
	public static void main(String[] args) {
		Eight date = new Eight();
		
		Eight date2 = new Eight(1,5,3);
		System.out.print(date2.toString());
		
	}
	@Override						// 마우스 우클릭 + source + toString 생성
	public String toString() {
		return "Eight [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
}
