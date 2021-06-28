import java.util.Date;

public class ControlSleepThread extends Thread {

	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("ControlSleepThread --> 1초마다 1번씩 출력");
				Date now = new Date();
				System.out.println(now.toLocaleString());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//exception 은 try & catch로 잡거나 throw Exception 으로 던지거나
			
			// thread의 run에는 runtime exception이 생략되어있다...
			
			// exception 은 같거나 더 좁으면 된다.

			// try & catch가 있으면 exception이 발생해도 계속 while문이 돌거야
		
		}
	}

}
