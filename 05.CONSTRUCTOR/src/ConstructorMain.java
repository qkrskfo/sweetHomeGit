
public class ConstructorMain {

	public static void main(String[] args) {

		Constructor c1 = new Constructor();
		/*
		 << new Constructor(); >>
		 1. Constructor 클래스로 객체 생성
		 2. 생성자 호출
		 3. 객체 주소 반환
		 */
		
		System.out.println("c1의 객체 주소: "+c1);
		c1.print();
		Constructor c2 = new Constructor();
		System.out.println("c2의 객체 주소: "+c2);
		c2.print();
		Constructor c3 = new Constructor(800,900);
		System.out.println("c3의 객체 주소: "+c3);
		c3.print();
		
		c3.setConstructorData(888, 999);
		c3.print();
		
		System.out.println("---기본 생성자 ---");
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println(dc);
		
	}

}
