

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

public class Book2 {
	
	private int bookNo;
	private String bookTitle;
	private String bookCate;
	private String bookDesc;
	
	public Book2() {

	}

	public Book2(int bookNo, String bookTitle, String bookCate, String bookDesc) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookCate = bookCate;
		this.bookDesc = bookDesc;
	}

	
	public static void headerPrint() {
		System.out.println("------------------------------------");
		System.out.println("책번호 \t 책제목 \t 책분류 \t 책설명");
		System.out.println("------------------------------------");
	}
	
	public void print() {
		System.out.printf("%d %s %s %s", this.bookNo, this.bookTitle, this.bookCate, this.bookDesc);
	}
	
	
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
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
