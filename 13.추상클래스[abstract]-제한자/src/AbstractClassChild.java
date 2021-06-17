
public class AbstractClassChild extends AbstractClass {
	
	// 추상클래스는 상속과 재정의를 강제함.
	/*
	 * The type AbstractClassChild must implement the inherited abstract method AbstractClass.method2()
	 */
	
	@Override
	public void method2() {
		System.out.println("AbstractClass의 추상메소드 --> method2를 재정의함(overriding)[구현implement]");
	}



	
}
