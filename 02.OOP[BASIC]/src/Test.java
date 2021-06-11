
/*
		 * 1.Test 클래스생성
		 * 		a. 클래스 이름 Test
		 *   	b. Test클래스에 3개의 멤버필드 작성
		 *      c. Test클래스에 3개의 멤버메쏘드 작성
		 *         - 메쏘드안에는 System.out.println("xx메쏘드실행"); 기술 
		 * 2.TestMain 클래스 생성 
		 *      a. TestMain 클래스에 main메쏘드 생성 
		 *      	- Test클래스객체생성
		 *      	- Test객체 멤버필드에0값대입
		 *      	- Test객체 멤버메쏘드호출
		 * 3.객체그림상상하시고 주실행흐름 파악
		 *    (잘안되면 그리그리기)
		 */

// Test클래스 생성, 클래스 이름 Test
public class Test {
	
	// Test 클래스에 3개의 멤버필드 작성
	public int a;
	public int b;
	public int c;
	
	// Test 클래스에 3개의 멤버메쏘드 작성
	public void method1() {
		System.out.println("public void method1() 실행");
	}
	public void method2() {
		System.out.println("public void method2() 실행");
	}
	public void method3() {
		System.out.println("public void method3() 실행");
	}
}
