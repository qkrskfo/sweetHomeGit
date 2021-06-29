
public class SyncLowerThread extends Thread {
	private Object monitorObject;
	
	public SyncLowerThread(Object moniObject) {
		this.monitorObject = monitorObject;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\n--> Lower Thread 동기화블록 실행전");
			/************동기화코드****************/
			
			// 객체가 들어가야함
			// 동기화객체가 동일해야 동기화가 됨.
			synchronized (monitorObject) {
				System.out.println("a");
				System.out.println("b");
				System.out.println("c");
				System.out.println("d");
				System.out.println("e");
				System.out.println("f");
				System.out.println("g");
				System.out.println("h");
				System.out.println("i");
				System.out.println("j");
				System.out.println("k");
				System.out.println("l");
				System.out.println("m");
				System.out.println("n");
				System.out.println("o");
				System.out.println("p");
				System.out.println("q");
				System.out.println("r");
				System.out.println("s");
				System.out.println("t");
				System.out.println("u");
				System.out.println("v");
				System.out.println("w");
				System.out.println("x");
				System.out.println("y");
				System.out.println("z");
			}
			/************동기화코드****************/
			System.out.println("\n--> Lower Thread 동기화블록 실행후");
		}
	}
}
