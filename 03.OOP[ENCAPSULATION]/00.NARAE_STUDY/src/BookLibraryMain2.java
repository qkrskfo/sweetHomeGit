

/*
 * 회원객체생성
 */
/*
 * 책객체생성
 */

/*
 * 회원이 책들 대여
 * 
 * 책객체참조변수를 회원의 멤버변수에대입
 */
/*
 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
 */

public class BookLibraryMain2 {

	public static void main(String[] args) {

		//회원객체생성
		BookMember2 mem1 = new BookMember2(7777, "박나래", "010-2222-3433");
		
		//책 객체 생성
		Book2 b1 = new Book2(214545, "책제목1", "소설", "베스트셀러");
		Book2 b2 = new Book2(405032, "책제목2", "에세이", "추천도서");
		
		//회원이 책들 대여
		Book2[] borroBook = {b1, b2};
		
		//책 객체 참조변수를 회원의 멤버변수에 대입
		mem1.setBook(borroBook);
		
		// 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		BookMember2.headerPrint();
		mem1.print();

		

		
		

	}

}
