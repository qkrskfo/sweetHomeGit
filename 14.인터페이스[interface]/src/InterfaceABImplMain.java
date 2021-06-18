
/*
 인터페이스
    1. 클래스(인터페이스)가 가진 모든 메쏘드가 추상메쏘드임
    2. 다중상속의 효과를 냄
       (클래스는 불가능하나 인터페이스는 가능하다) -> 부모가 여러개일 수 있다?
   -형식
     * class keyword 대신에 interface 라는 keyword를사용
     * 추상메쏘드앞에 abstract 를 붙히지 않아도 된다.
     ex> public interface Test{
     		public void method1();
     		public void method2();
        }
   - 사용
       1. interface를 상속(implements)받아서
       2. 추상메쏘드를 재정의(구현)한후 사용한다.
       
       ex> public class TestImpl extends Object implements Test{
       			public void method1(){}
     			public void method2(){}
          }
*/


public class InterfaceABImplMain {

	public static void main(String[] args) {

		System.out.println("InterfaceABImpl");
		InterfaceABImpl abImpl = new InterfaceABImpl();
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		
		// object, interfaceA, interfaceB 모두 다 부모니까 이게 가능.
		// object는 클래스, 나머지는 인터페이스니까 다중상속 가능.
		System.out.println("Object");
		Object o = abImpl;
		// 오브젝트 캐스팅은 여기선 의미가 없음. 메소드 호출이 안돼.

		System.out.println("InterfaceA");
		InterfaceA ia = abImpl;
		ia.method1();
		ia.method2();
//		ia.method3(); ia는 method3, method4는 정의되어있지 않잖아. 
		
		System.out.println("InterfaceB");
		InterfaceB ib = abImpl;
		ib.method3();
		ib.method4();
		// ib에는 method1, method2가 없자낭
		
		System.out.println("----------InterfaceA 와 InterfaceB간의 캐스팅---------");
		InterfaceA ia2 = new InterfaceABImpl();
		ia.method1();
		ia.method2();
		InterfaceB ib2 = (InterfaceB)ia2;
		ib2.method3();
		ib2.method4();
	}

}
