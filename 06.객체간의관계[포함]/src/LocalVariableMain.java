
public class LocalVariableMain {

	public static void main(String[] args) {

		/*
		 * 지역변수(local variable)
		 *   - 메쏘드 블록 안에서 선언된 변수(매개변수)
		 * 필드(멤버변수)
		 *   - 인스턴스필드, 인스턴스변수
		 *   - 클래스 블록 안에 선언된 변수
		 */
		
		int a = 9;
		int b = 10;
		int t = a;
		a = b;
		b = t;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

		int tot;
		/*
		tot = tot + 1; 
		
		The local variable tot may not have been initialized 경고~ 초기화안된듯~ 
		로컬변수는 초기화하지 않으면 사용할 수 없다.
		
		System.out.println("local variable tot:"+tot);
				
		boolean condition = true;
		if(condition) {
			tot = 0;
		}
		
		System.out.println("local variable tot:"+tot);
		*/
		
		// Member m; 이건 안됨.
		// Member m = null; 이건 컴파일러는 된다고 하는데 실행 시 문제 발생.
		// 아래처럼 null로 했다가 if문까지 쓰면 가능
		Member m = null;
		
		if(m==null) {
			m = new Member(8787, "박나래");
		}
		m.print();
		m.method(11);
		
		

		
		
	}

}
