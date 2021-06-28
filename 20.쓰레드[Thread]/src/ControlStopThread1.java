
public class ControlStopThread1 extends Thread {

	@Override
	public void run() throws RuntimeException {
		for (int i = 1; i <= 100; i++) {
			System.out.println("down loading... ["+i+"%}");
		}
		System.out.println("ControlStopThread1: JVM return thread end");
	}	
		/*
		<< Unhandled exception type InterruptedException >>
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getMessage());
		}
 		run 메소드에는 runtimeException이 생략되어있지
		interruptedException 을 던지려면 이렇게 해야해.
		*/
		
		
	
	
}
