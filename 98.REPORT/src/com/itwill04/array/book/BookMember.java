package com.itwill04.array.book;

import java.util.Iterator;

public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book[] books;
	
	public BookMember() {
		
	}
		
	
	public BookMember(int no, String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public static void headerPrint() {
		System.out.println("회원번호 회원이름    전화번호       대여목록");
		System.out.println("-------------------------------------------------------------------");
	}
	
	public void print() {
		for (int i = 0; i < books.length; i++) {
			System.out.print("   "+no+"\t  "+name+"   "+phoneNumber+"    ");
			books[i].print();
		}
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}
	

	
	
}
