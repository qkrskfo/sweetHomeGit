
public class SyncUpperThread extends Thread {
	private Object monitorObject;
	
	public SyncUpperThread(Object monitoObject) {
		this.monitorObject = monitorObject;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("\n--> Upper Thread 동기화블록 실행전");
			/************동기화코드****************/
			synchronized (monitorObject) {
				System.out.println("A");
				System.out.println("B");
				System.out.println("C");
				System.out.println("D");
				System.out.println("E");
				System.out.println("F");
				System.out.println("G");
				System.out.println("H");
				System.out.println("I");
				System.out.println("J");
				System.out.println("K");
				System.out.println("L");
				System.out.println("M");
				System.out.println("N");
				System.out.println("O");
				System.out.println("P");
				System.out.println("Q");
				System.out.println("R");
				System.out.println("S");
				System.out.println("T");
				System.out.println("U");
				System.out.println("V");
				System.out.println("W");
				System.out.println("X");
				System.out.println("Y");
				System.out.println("Z");
			}
			/************동기화코드****************/
			System.out.println("\n--> Upper Thread 동기화블록 실행 후");
		}
	}
}
