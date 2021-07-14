package basic.driver;

public class StaticBlockClassMain {

	public static void main(String[] args) throws Exception{

		/*
		 * Class loading..
		 * 클래스가 틀에 언제 올라와?
		 *   - 생성자 호출
		 */

		/* 클래스 로딩
		StaticBlockClass sbc = new StaticBlockClass();
			--> 이렇게 로딩하면 의존성이 발생한데.
		System.out.println(".........");
		*/
		
		Class.forName("basic.StaticBlockClass");
		// 이건 스트링 형태임. 
		// StaticBlockClass에 객체를 만들어주면
		// 여기서 이것만 실행시켜도 자동으로 객체가 생성됨
		
		String className = "basic.StaticBlockClass";
		Class.forName(className);
		// 이렇게 하면 의존성을 확실히 줄일 수 있음
		
	}

}
