/*
		 * 2.TestMain 클래스 생성 
		 *      a. TestMain 클래스에 main메쏘드 생성 
		 *      	- Test클래스객체생성
		 *      	- Test객체 멤버필드에 값대입
		 *      	- Test객체 멤버메쏘드호출
		 * 3.객체그림상상하시고 주실행흐름 파악
		 *    (잘안되면 그리그리기)
*/

// TestMain 클래스 생성
public class TestMain {
	
	// TestMain 클래스에 main메쏘드 생성
	public static void main(String[] args) {
		
		// Test클래스 객체 생성
		Test test = new Test();

		// Test 객체 멤버필드에 값 대입
		test.a=10;
		test.b=100;
		test.c=1000;
		
		// 메소드 호출
		test.method1();
		test.method2();
		test.method3();
	}

}
