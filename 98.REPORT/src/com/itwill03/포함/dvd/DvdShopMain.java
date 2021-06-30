package com.itwill03.포함.dvd;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		
		/*
		 * Dvd객체생성
		 */
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */         
		
		// 회원 객체 생성
		DvdMember member1 = new DvdMember(1111, "박나래", "010-111-1111");
		DvdMember member2 = new DvdMember(2222, "홍나래", "010-222-2222");
		DvdMember member3 = new DvdMember(3333, "석나래", "010-333-3333");
		
		// DVD 객체 생성
		Dvd dvd1 = new Dvd(45767, "재밌는 자바공부", "교육");
		Dvd dvd2 = new Dvd(78347, "짱구는 못말려", "애니");
		Dvd dvd3 = new Dvd(29952, "분노의질주7", "액션");
		
		// Dvd객체참조변수를 회원의 멤버변수에대입
		member1.setDvd(dvd1);
		member2.setDvd(dvd2);
		member3.setDvd(dvd3);
		
		// 회원정보 출력
		DvdMember.headerPrint();
		member1.print();
		member2.print();
		member3.print();
		
				
	}

}