
import java.io.IOException;
import java.net.Socket;

public class Second {
	
	/*
	 * 이 메소드를 호출하는 경우에는 throws IOException 발생가능성이 있음을 알려주는 기능
	 */
	public void method2() throws IOException, RuntimeException {
		System.out.println("\t\t Second.method2() 실행");
		
		
		/************* case1******************/
		 /* 
		 * 1. JVM이 예외상황을 감지하고 예외객체(NullPointerException)생성
		 * 2. JVM은 생성한 예외객체를 반환 방향으로 던진다. (throw)
		 * 3. 실행중인 thread는 실행을 멈추고 호출한 곳(반환방향)으로 이동한다.
		 * 4. JVM은 던져진 예외객체의 메시지를 출력한 후 쓰레드 종료(Shut down)
		 */
		
		/*
		String str = null;
		int length = str.length();
		System.out.println("length: "+length);
		 */
		
		/************* case2 (RunTimeException)******************/
		/* 
		 * 1. 내가 예외객체생성
		 * 2. 내가 예외객체를 던진다.
		 * 3. 실행중인 쓰레드는 실행을 멈추고 호출한 곳(반환방향)으로 이동한다.
		 * 4. JVM은 던져진 예외 객체의 메시지를 출력한 후 쓰레드 종료(Shut down)
		
		
		NullPointerException ex = new NullPointerException("내가만든예외객체");
		boolean b = true;
		if(b) {
			throw ex; // throw하면 이후 코드가 실행되지 않음.	
		}
		*/
		
		/************* case3 (비 RunTimeException)******************/
		/*
		IOException ex = new IOException("비RunTimeException");
		boolean b = true;
		if(b) {
			throw ex;
		}
		*/
		
		Socket socket = new Socket("www.navor.com", 80);
		socket.getInputStream();
		
		
		System.out.println("\t\t Second.method2() 반환");
		return;
	}
}
