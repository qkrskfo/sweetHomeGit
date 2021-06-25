package generic;

public class GenericMain {

	public static void main(String[] args) {

		System.out.println("---- NoGeneric ----"); 
		// nogeneric =  일반화하지 않은
		
		
		NoGenericClass noGenericClass = new NoGenericClass();
		// noGenericClass.setMember(new String("멤버"));
		// noGenericClass.setMember(new Integer(123));
		
		
		/*
		 * noGenericClass.setMember에는 어떤 값이 들어갈까?
		 * Object member는 참조변수로 들어가겠찌?
		 * 
		 * 그럼 
		 * noGenericClass.setMember(123);
		 * 123이 왜 들어가는거야..?
		 * 
		 * Object member로 들어간건 아니야.
		 * 거기엔 참조변수가 들어가겠지.
		 * 
		 * 123은 boxing 된다. integer로. 그 다음에 상위로 캐스팅됨
		 * noGenericClass.setMember(new Integer(123));
		 * 
		 * Object member 자리에 아무거나 다 들어가
		 * 이 작업을 쉽게 하는게 generic 이래..
		 */

		
		// noGenericClass.setMember(new Car());	
		/*
		 Object member에는 최종적으로 Car만 들어가긴 하지만
		 모든 자바 객체를 멤버로 셋팅할 수 있다는 것.
		 */
		
		
		noGenericClass.setMember(new Account(1111, "FIRST", 10000, 1.0));
		Account getAccount = (Account)noGenericClass.getMember();
		// Account 객체를 넣었으나 뺄때는 캐스팅 해야해
		getAccount.print();
		
		System.out.println("---- Generic ----");
//		GenericClass genericClass = new GenericClass();
		// <> 이걸 안넣으면 기본 디폴트로 object가 들어감
//		GenericClass<Object> genericClass = new GenericClass<Object>();
		GenericClass<Account> genericClass = new GenericClass<Account>();
		genericClass.setMember(new Account(1111, "First", 10000, 1.0));
		getAccount = genericClass.getMember();
		getAccount.print();
		// 이렇게 하면 캐스팅이 필요없징!
		// 클래스의 타입이 정해지지 않은채로
		// 클래스 사용이 확장되겠지
		// GenericClass인데 Account를 인자로 줄게!
		// 그럼 GenericClass 의 T로 들어가서 Account가 되는것임.
		
		GenericClass<Car> genericClass2 = new GenericClass<Car>();
		// Car도 되지!
		genericClass2.setMember(new Car("1234", 10, 0, 0));
		Car getCar = genericClass2.getMember();
		getCar.print();

		/*
		GenericClass genericClass3 = new GenericClass();
		genericClass3.getClass();
		이렇게하면 Object가 들어감
		*/
		
		
		
	}

}
