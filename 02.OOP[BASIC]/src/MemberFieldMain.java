public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 객체생성후 주소값이반환되고 참조변수가생성된후 반환된 주소값 100이대입 
		 */
		MemberField mf1= new MemberField();
		/*
		 * 객체의 참조변수 mf1의 주소값 100을 사용해서 멤버필드에 데이타 대입
		 * 멤버필드접근방법--> 참조변수(주소).필드이름=값;
		 * 	ex> mf1.member1 = 12;
		 */
		
		/*
		 * 객체의 참조변수 mf1, mf2의 주소값을 사용해서 필드(멤버변수)에 데이터를 대입
		 * 필드(멤버변수) 접근 방법 : 참조변수(주소값을 가진).필드(멤버변수)명=값;
		 *  ex) 100.member1=12;
		 */
		
		mf1.member1=12;
		mf1.member2=89.890;
		mf1.member3='꿈';
		mf1.member4="문자열1";
		
		MemberField mf2= new MemberField();
		mf2.member1=23423;
		mf2.member2=3.1456;
		mf2.member3='휴';
		mf2.member4="스트링";
		/*
		 * 객체의 필드값출력
		 */
		System.out.println("----------mf1(100)---------");
		System.out.println(mf1);
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("----------mf2(200)---------");
		System.out.println(mf2);
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
				
		
	}

}
