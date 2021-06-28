
public class CreateCustomThreadMain {
	public static void main(String[] args) {
		
		System.out.println("1. main thread");
		
		/*
		3. Thread 객체를 생성한다.
		4. Thread 객체를통해서 Thread를 시작시킨다.
		 */
		
		CreateCustomThread cct = new CreateCustomThread(); // 쓰레드객체
		cct.setName("MySuperUltraThread"); // 쓰레드 이름 설정
		// 쓰레드 객체를 통해 쓰레드 시작!
		cct.start();
		
		System.out.println("2. main thread return");
		
	}
}
