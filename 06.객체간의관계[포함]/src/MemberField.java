
public class MemberField {

	// 캡슐화 안함
	/*
	 * 1-1.
	 * 멤버필드는 객체 생성 시 기본값으로 자동 초기화 됨. 
	 */
	public int member1;
	public double member2;    
	public char member3;
	public boolean member4;
	public String member5; // String은 참조형이야. 기본형이 아님.
	
	public int member6;
	public double member7;
	public char member8;
	public boolean member9;
	public String member10; 
	
	/*
	 * 1-2.
	 * 멤버필드는 객체 생성 시 기본값 대신에 초기값을 줄 수 있다.
	 */
	// 멤버필드 선언 시 초기화는 잘 안하는 형식.
	// 일반적으로 생성자를 통한 초기화를 함.
	public int member11=123;
	public double member12=63.9;
	public char member13='힣';
	public boolean member14=true;
	public String member15="스트링15"; 
	
	// 기본생성자 만들기
	public MemberField() {
		//ctrl + space
	}

	// alt shift s + o

	public MemberField(int member1, double member2, char member3, boolean member4, String member5) {
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
	}
	
	
	
}
