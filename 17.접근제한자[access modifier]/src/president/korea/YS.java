package president.korea;

import president.america.Biden;
// 같은 패키지 내에서는 import필요없음. YS와 DJ는 import 필요x

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	
	protected void method2() {
		System.out.println("YS.method2()");
	}

	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	
	
	public void access() {
		/**************YS님과 같은 패키지인 경우***************/
		DJ dj = new DJ();
		dj.member1 = 1;
		dj.member2 = 2;
		dj.member3 = 3;
		// dj.member4는 private이라 접근x
		dj.method1();
		dj.method2();
		dj.method3();
		// dj.method4는 private이라 접근x
		
		/**************YS님과 다른 패키지인 경우***************/
		Biden biden = new Biden(); //객체 생성은 되네
		biden.member1 = 1; // public만 접근 가능		
		biden.method1(); //public만 접근 가능
		
		// 아무것도없는 int member3 은 같은 패키지가 되면 접근 가능
		// protected는 상속받으면 접근 가능
		
		
	}
}
