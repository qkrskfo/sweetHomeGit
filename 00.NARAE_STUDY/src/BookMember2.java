

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

public class BookMember2 {

	private int memberNo;
	private String memName;
	private String memMobile;
	private Book2[] book;
	
	public BookMember2() {

	}

	public BookMember2(int memberNo, String memName, String memMobile) {
		this.memberNo = memberNo;
		this.memName = memName;
		this.memMobile = memMobile;
	}
	
	
	public static void headerPrint() {
		System.out.println("---------------------------------------------");
		System.out.println("회원번호  회원이름   전화번호      대여목록");
		System.out.println("------------------------------------------------"); 
	}
	
	public void print() {
		System.out.printf("%6d \t %5s %10s %s", this.memberNo, this.memName, this.memMobile, "   ");
		for (int i = 0; i < book.length; i++) {
			book[i].print();
			if(i != book.length -1) {
				System.out.printf("%s",", ");
			}
		}
		
	}
	

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemMobile() {
		return memMobile;
	}

	public void setMemMobile(String memMobile) {
		this.memMobile = memMobile;
	}

	public Book2[] getBook() {
		return book;
	}

	public void setBook(Book2[] book) {
		this.book = book;
	}

	
	
	
	
}
