
public class OuterClass2 {
	public int outer_member_field;
	public void outer_member_method1() {
		/******** 외부클래스 작성 **********/
		 /*
		 * 1. AClass, BClass, CInterface를 상속받은 자식 클래스 작성
		 * 2. AClass[methodA], BClass[methodB], CInterface[methodC]의 메소드를 재정의
		 * 3. AClass, BClass, CInterface를 상속받은 자식클래스 객체 생성
		 * 4. 재정의 메소드 호출
		 */
		
		/*
		AClassChild acc = new AClassChild();
		BClassChild bcc = new BClassChild();
		CInterfaceImpl cInterfaceImpl = new CInterfaceImpl();
		*/
		// 위에꺼가 아니라 이렇게도 가능!
		AClass acc = new AClassChild();
		BClass bcc = new BClassChild();
		CInterface cInterfaceImpl = new CInterfaceImpl();
		
		acc.methodA();
		bcc.methodB();
		cInterfaceImpl.methodC();
		
	}
	
	public void outer_member_method2() {
		/******* 내부 클래스 작성 ********/
		 /*
		 * 1. AClass, BClass, CInterface를 상속받은 자식 클래스를 OuterClass2 내부에 작성
		 * 2. AClass[methodA], BClass[methodB], CInterface[methodC]의 메소드를 재정의
		 * 3. AClass, BClass, CInterface를 상속받은 자식클래스 객체 생성
		 * 4. 재정의 메소드 호출
		 */
		
		AClass aClass = new AClassChild2();
		BClass bClass = new BClassChild2();
		CInterface cIntercafe = new CInterfaceImpl2();
		
		aClass.methodA();
		bClass.methodB();
		cIntercafe.methodC();
		
	}
	
	public void outer_member_method3() {
		/**** 익명의 local 내부클래스(anonymous local inner class) 작성 ***/
		 /*
		 * 1. AClass, BClass, CInterface를 상속받은 이름없는 자식 클래스를 
		 *    OuterClass2 내부(outer_member_method3())에 작성
		 * 2. AClass[methodA], BClass[methodB], CInterface[methodC]의 메소드를 재정의
		 * 3. AClass, BClass, CInterface를 상속받은 자식클래스 객체 생성
		 * 4. 재정의 메소드 호출
		 */
		
		AClass aClass = new AClass() {
			// 익명이니까 aclass달러 라고 만들어진다고 함 OuterClass2$1.class
			// AClass를 상속받는 이름없는 클래스의 정의 & 그 객체의 생성
			// 재정의 안하면 호출 불가
			@Override
			public void methodA() {
				System.out.println("AClass를 상속받는 이름없는 클래스에서 AClass.methodA() 재정의");
			}

		};
		
		//BClass는 추상클래스야
		BClass bClass = new BClass() {
			@Override
			public void methodB() {
				System.out.println("BClass를  상속받는 이름없는 클래스에서 BClass.methodB() 재정의");
			}
			/*
			 public void method1() {}
			 */
		};
		
		aClass.methodA();
		bClass.methodB();
		/*
		 aClass.method1(); 
		 bClass.method1(); 호출 불가
		 */
	}
	
	
	/******************내부클래스****************/
	public class AClassChild2 extends AClass {
		@Override
		public void methodA() {
			// AClass의 methodA() 재정의
			System.out.println("AClassChild2에서 AClass.methodA() 재정의");
		}	
	}

	public class BClassChild2 extends BClass {
		@Override
		public void methodB() {
			System.out.println("BClassChild2에서 BClass.methodB() 재정의");
		}
	}
	
	public class CInterfaceImpl2 implements CInterface {
		@Override
		public void methodC() {
			System.out.println("CInterfaceImpl2에서 CInterface.methodC() 재정의");	
		}
	}
	/**********************************/
	
}




