package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	<<기능>>
	  회원정보출력 
	 */
	
	private int memberNo;
	private String memberName;
	private String memberMobile;
	
	private Book book;

	public BookMember() {
	
	}
	
	public BookMember(int memberNo, String membername, String memberMobile, Book book) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberMobile = memberMobile;
		this.book = book;
	}
	
	public static void headerPrint() {
		System.out.println("-------------------------------");
		System.out.printf("%s %s %s %s %n","회원번호","회원이름","전화번호","빌린책");
		System.out.println("-------------------------------");
	}
	
	public void print() {
		System.out.printf("%d %s %s %s %n", this.memberNo, this.memberName, this.memberMobile, this.book);
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
	
	
}