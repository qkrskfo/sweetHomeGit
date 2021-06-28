
public class ControlPriorityLowerUpperMain {
	
	public static void main(String[] args) {
		
		// 메인은 비즈니스 흐름을 담고있다..
		
		System.out.println("1. main thread");
		ControlPriorityLowerThread lt = new ControlPriorityLowerThread();
		ControlPriorityUpperThread ut = new ControlPriorityUpperThread();
		
		/*
		 * priority
		 *   - CPU 점유권을 얻을 수 있는 우선순위
		 *   - 1 ~ 10까지의 우선순위를 가짐
		 */
		
		System.out.println("ControlPriorityLowerThread-->"+lt.getPriority());
		System.out.println("ControlPriorityUpperThread-->"+ut.getPriority());
		// priority의 default 값은 5래.
		
		ut.setPriority(10);
		lt.setPriority(1);
		
		lt.start();
		ut.start();
		
		System.out.println("99.main return");
		
	}
	
}
