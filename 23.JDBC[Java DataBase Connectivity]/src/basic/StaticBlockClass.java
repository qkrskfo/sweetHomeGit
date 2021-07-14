package basic;

public class StaticBlockClass {

	/* 
	 * << 클래스의 구성요소 >>
	 * 멤버변수(static, instance) 
	 * 멤버메소드(static, instance) 
	 * 생성자
	 * 정적블록
	 */
	
	static {
		System.out.println("클래스 로딩 시 최초로 실행되는 블록");
		System.out.println("초기화, 객체생성 등 가능");
		System.out.println("클래스 로딩 시 실행되어야 하는 코드 기술");
		StaticBlockClass sbc = new StaticBlockClass();
		System.out.println("Static Block Class에서 객체생성: "+sbc);
	}

}
