package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책 객체참조변수를 회원의 멤버변수에대입
		 */
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		
		// 회원 객체 생성
		BookMember member1 = new BookMember(1111, "박나래", "010-1111-1111");
		BookMember member2 = new BookMember(2222, "김나래", "010-2222-2222");
		BookMember member3 = new BookMember(3333, "조나래", "010-3333-3333");
		BookMember member4 = new BookMember(4444, "최나래", "010-4444-4444");
		
		
		//책 객체 생성
		Book book1 = new Book(39210, "알파벳 abc", "교육", "영어공부");
		Book book2 = new Book(64899, "완벽하지 않은 것들에 대한 사랑", "에세이", "혜민 스님의 따뜻한 응원");
		Book book3 = new Book(73815, "나미야 잡화점의 기적", "소설", "독자를 위로한 고민 상담소");
		Book book4 = new Book(78623, "나의 라임 오렌지나무", "소설", "다섯 살 소년 제제의 이야기");
		//"회원"이 책"들" 대여
		Book[] book = {book1, book2};
		
		// 책 객체 참조변수를 회원의 멤버변수에 대입		
		member1.setBook(book);
		member2.setBook(new Book[] {book2});
		member3.setBook(new Book[] {book3});
		member4.setBook(new Book[] {book4});

		// 회원정보 출력
		BookMember.headerPrint();
		member1.print();
		member2.print();
		member3.print();
		member4.print();
		
		
		
	}
}