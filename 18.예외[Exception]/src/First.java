import java.io.IOException;

public class First {
	private Second second; // second 객체를 포함시킨 것
	public First() {
		second = new Second(); // second 객체를 호출하려고~
	}
	public void method1() throws IOException {
		System.out.println("\t First.method1() 실행");
		second.method2(); // Unhandled exception type IOException
		System.out.println("\t First.method1() 반환");
		return;
	}
}
