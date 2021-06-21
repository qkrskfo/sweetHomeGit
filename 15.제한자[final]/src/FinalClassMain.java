
public class FinalClassMain {

	public static void main(String[] args) {

		FinalClassChild fcc = new FinalClassChild();
		fcc.method1();
		fcc.method2(); // 재정의만 못하지, 상속은 받았으니깐!

	}

}
