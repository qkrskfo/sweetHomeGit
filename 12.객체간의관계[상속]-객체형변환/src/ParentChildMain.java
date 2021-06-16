
public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("--- Child ---");
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		
		/*
		 * 자식객체를 부모클래스타입으로 형변환
		 *   - 자동으로이루어진다 (묵시적)
		 *   Child c = new Child();
		 *   Parent p = c;
		 */
		System.out.println("--- Child --> Parent ---");
		Parent p = c;
		p.method1();
		p.method2();
		p.method3();
		p.method4();
//		p.method5(); 는 parent에 없으니까 안됨!
	}

}
