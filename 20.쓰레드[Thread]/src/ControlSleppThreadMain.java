
public class ControlSleppThreadMain {
	public static void main(String[] args) throws Exception {
		System.out.println("1. main");
		System.out.println("2. main 쓰레드 3초간 sleep");
		
		Thread.sleep(3000); // 천 밀리세컨드가 1초래
		// exception 발생하니까 던져줘
		
		System.out.println("3. main 쓰레드 3초 후 sleep 깨어난 후 실행");
		
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		System.out.println("4. main 쓰레드 return");
	}
}
