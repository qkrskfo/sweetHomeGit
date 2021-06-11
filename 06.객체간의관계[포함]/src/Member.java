
public class Member {

	private int no;
	private String name;
	
	//기본생성자 
	public Member() {
		
	}
		
	// alt + shift + s + o
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void print() {
		System.out.println(this+"-->"+no+","+name);
	}
	
	public void method(int a) {
		int tot = 7;
		System.out.println("local variable a: "+a);
		int b = a + 4;
		System.out.println("local variable b: "+b);
	} // tot, a, b 는 모두 로컬변수. 메소드 안에 선언됐잖아.
	
	
	// getter, setter 만들기
	// alt + shift + s + r
	
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
	
	
	
}
