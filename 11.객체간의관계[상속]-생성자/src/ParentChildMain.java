
class Parent extends Object{

	public int member1;
	public int member2;
	public Parent() {
		/*
		 * 클래스의 생성자 첫번째 라인에서는
		 * 부모클래스의 생성자(디폴트)가 반드시 호출되어야한다.
		 * 생략 시 부모의 디폴트생성자가 자동호출된다.
		 */
		// 기본생성자
		super();
		System.out.println("2.Parent() default 생성자");
	}
	
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
}

class Child extends Parent{
	public int member3;
	public Child() {
		/*
		 * 클래스의 생성자 첫번째 라인에서는
		 * 부모클래스의 생성자(디폴트)가 반드시 호출되어야한다.
		 * 생략 시 부모의 디폴트생성자가 자동호출된다.
		 */
		// 기본생성자
		super();
		System.out.println("3.Child() default 생성자");
	}
	public void method3() {
		System.out.println("Child.method3()");
	}
}

public class ParentChildMain {

	public static void main(String[] args) {

		System.out.println("---------------");
		Child c1 = new Child();
		System.out.println("---------------");
	}

}
