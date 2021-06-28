/*
type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding(재정의) 한다.
		메소드원형:public void run()
	3. Thread 객체를 생성한다. --> 메인에서
	4. Thread 객체를통해서 Thread를 시작시킨다. --> 메인에서
*/

public class CreateCustomThread extends Thread {

	@Override
	public void run() { // VM이 RUN메소드를 호출
		// 새로운 쓰레드로 시작되는 메소드
		System.out.println("가. "+Thread.currentThread().getName()+" 쓰레드 실행");
		System.out.println("나. "+Thread.currentThread().getName()+" 쓰레드 반환");
		return; // VM한테 반환됨
		// 각각의 쓰레드는 연관이 없다.
		// 메인이 죽든말든 CCT 쓰레드는 돈다
		// CCT쓰레드가 죽든말든 메인쓰레드는 돈다
	}
	
}
