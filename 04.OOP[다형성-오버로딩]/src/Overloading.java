
public class Overloading {

	/*
	오버로딩(다중정의)
	  1. 자바 다형성구현기법 중의하나이다.
	  2. 정의: 같은메쏘드 이름으로 여러개를 정의하는방법
	           - 규칙: 
	               * 메쏘드의 이름이 같아야한다.
	               * 메쏘드의 매개변수(인자)의 숫자가 다르거나
	               * 메쏘드의 매개변수(인자)의 타입이 다르거나
	               * 메쏘드의 매개변수의 갯수, 타입의 조합이 달라야한다.
	               * 메쏘드의 리턴타입,접근지정자는 상관없다.

	*/
	
	public void method(int i) {
		System.out.println("public void method(int i)");
	}
	public void method(String i) {
		System.out.println("public void method(String i)");
	}
	
	public void method(int j, int k) {
		System.out.println("public void method(int j, int k)");
	}
	public void method(double a, double b) {
		System.out.println("public void method(double a, double b)");
	}

}
