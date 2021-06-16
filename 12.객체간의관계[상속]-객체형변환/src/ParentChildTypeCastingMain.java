
/*
 객체의 형변환
   1. 부모자식관계에있는 클래스들에서만 가능하다.
   	   - 자식타입객체의 주소를 부모타입객체의 주소로 형변환 (주소 변경은 절대 안됨. 타입만 변경됨)
   	   - 부모타입객체의 주소를 자식타입객체의 주소로 형변환 (주소 변경은 절대 안됨. 타입만 변경됨)
   	    :   
   2. 자식객체 타입의 주소를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
       
   3. 부모 객체를 자식클래스타입으로 형변환
       - 원칙적으로는 불가능하지만 강제로 할 수 있음
       - 부모의 탈을 쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		 // child의 method4를 호출하기 위해 이걸 만들어주는거야.
		
	}
}
	

class Child extends Parent{
	public void method3() {
		System.out.println("Child.method3() [Parent.method3]를 child에서 재정의");
	}
	public void method4() {
		System.out.println("Child.method4()");
	}	
	public void method5() {
		System.out.println("Child.method5()");
	}	
	
}
public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("---- Child --> Parent ----");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		
		// 2. 자식객체 타입의 주소를 부모클래스타입으로 형변환
		// 상위캐스팅
		Parent p1 = c1;
		
		p1.method1();
		p1.method2();
		p1.method3(); // p1은 자식객체인 c1을 가르키지만, child의 method4, method5를 가질 수 없어.. 단점.
		// 이걸 극복할 수 있는 방법이 있어.
		
		System.out.println("---- Parent --> Child ----");		
		/*
		3. 부모 객체를 자식클래스타입으로 형변환
	       - 원칙적으로는 불가능하지만 강제로 할 수 있음
	       - 부모의 탈을 쓴 자식객체 는 가능하다.
	     */
		
		Parent p2 = new Parent();
		/*
		 * << complie error >>
		 * Type mismatch: cannot convert from Parent to Child
		 * 
		 * Child c2 = p2;
		 */
		
		/*
		 * 강제형변환 시 컴파일은 가능하나, 실행 시 예외(에러) 발생
		 * java.lang.ClassCastException: Parent cannot be cast to Child
		 * 
		 * Child c2 = (Child) p2;
		 */
		
		/*
		 * 부모의 탈을 쓴 자식 객체는 가능하다.
		 */
		Parent p3 = new Child();
		// 객체 생성할 땐 생성자를 봐. 이 객체는 누구 객체야? child객체야!!
		
		// Child c3 = p3; 는 에러 발생하지만, 아래와 같이 강제 형변환을 해주면 됨.
		Child c3 = (Child)p3;
		
		//재정의
		System.out.println("--- 재정의 ---");
		Parent p4 = new Child();
		p4.method1(); 
		p4.method2();
		p4.method3();
		p4.method4(); // 재정의한 메소드 호출가능
		
		
		
	}

}
