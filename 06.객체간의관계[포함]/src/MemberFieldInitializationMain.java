
public class MemberFieldInitializationMain {

	public static void main(String[] args) {

		MemberField mf1 = new MemberField(); 
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println(mf1.member5);
		
		System.out.println();
		
		MemberField mf2 = new MemberField(333, 3.14159, '돈', true, "스트링"); 
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		System.out.println(mf2.member5);
		System.out.println(mf2.member6);
		System.out.println(mf2.member7);
		System.out.println(mf2.member8);
		System.out.println(mf2.member9);
		System.out.println(mf2.member10);

		System.out.println();
		
		MemberField mf3 = new MemberField();
		System.out.println(mf3.member11);
		System.out.println(mf3.member12);
		System.out.println(mf3.member13);
		System.out.println(mf3.member14);
		System.out.println(mf3.member15);
		
		
		
	}

}
