package com.itwill04.array;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1=new DvdMember(1233, "박나래", "010-3333-5555");
		/*
		 * Dvd들객체생성
		 */
		Dvd dvd1=new Dvd(123,"영화1","전쟁");
		Dvd dvd2=new Dvd(343,"영화2","전쟁");
		Dvd dvd3=new Dvd(566,"영화3","전쟁");
		Dvd dvd4=new Dvd(889,"영화4","전쟁");
		
		/*
		 * 회원이Dvd들을 대여
		 * - Dvd를 3개까지 대여할수있다.
		 * 
		 * Dvd객체배열 참조변수를 회원의 멤버변수에대입
		 */
		
		Dvd[] borrowDvds = {dvd1, dvd2, dvd3};
		
		m1.setDvds(borrowDvds);
		
		/*
		 * 회원정보출력(회원이빌린Dvd들정보출력)
		 */
		DvdMember.headerPrint();
		m1.print();
		
	}

}