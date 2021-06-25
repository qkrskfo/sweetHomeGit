package generic;

public class GenericMain {

	public static void main(String[] args) {

		System.out.println("---- NoGeneric ----"); // nogeneric =  일반화하지 않은
		NoGenericClass noGenericClass = new NoGenericClass();
		noGenericClass.setMember(new String("멤버"));
		noGenericClass.setMember(new Integer(123));
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
		 * 이 작업을 편리하게 해주는게 generic 이래.. 무슨 작업일까 ㅋㅋㅋ
		 */
	}

}
