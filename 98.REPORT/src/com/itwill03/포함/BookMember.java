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
	
	private Book[] book;

	public BookMember() {
	
	}
	
	public BookMember(int memberNo, String memberName, String memberMobile) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.memberMobile = memberMobile;
	}
	
	public static void headerPrint() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("%s %s %13s %17s %n","회원번호","회원이름","전화번호","빌린책");
		System.out.println("----------------------------------------------------------------------------");
	}
	
	public void print() {
		System.out.printf("%d \t %s \t %s \t", this.memberNo, this.memberName, this.memberMobile);
		for (int i = 0; i < book.length; i++) {
			System.out.printf(book[i].getBookName());
			if(i != book.length-1) {
				System.out.printf("%s",", ");
			}
		}
		System.out.println("");
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

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
 		this.book = book;
	}

	
	
	
}