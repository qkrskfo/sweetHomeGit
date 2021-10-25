package basic.driver;

public class StaticBlockClass {
	/*<< 클래스의 구성요소 >>
	 * 멤버변수(static,instance)
	 * 멤버메쏘드(static,instance)
	 * 생성자
	 * 정적블록
	 */
	static {
		System.out.println("클래스로딩시 최초로실행되는 블록(초기화)");
		System.out.println("클래스로딩시 실행되야되는 코드기술");
		StaticBlockClass sbc = new StaticBlockClass();
		System.out.println("static block에서객체생성:" + sbc);
	}

}
