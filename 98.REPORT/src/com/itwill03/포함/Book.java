package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	// 속성
	private int bookNumber; //책번호
	private String bookName; //책제목
	private String bookCate; //책분류
	private String bookDesc; //책설명
	
	
	// 기본생성자
	public Book() {
	
	}
	// alt  shift  s + o
	public Book(int bookNumber, String bookName, String bookCate, String bookDesc) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookCate = bookCate;
		this.bookDesc = bookDesc;
	}
	
	
	// 책정보 출력
	public static void headerPrint() {
		System.out.println("-------------------------------");
		System.out.printf("%s %s %s %s %n","책번호","책이름","책분류","책설명");
		System.out.println("-------------------------------");
	}
	
	public void print() {
		System.out.println(this+"-->"+bookNumber+","+bookName);
	}
	
	// getter, setter
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookCate() {
		return bookCate;
	}
	public void setBookCate(String bookCate) {
		this.bookCate = bookCate;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	
	

	
	
	
}