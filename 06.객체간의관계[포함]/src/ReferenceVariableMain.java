
public class ReferenceVariableMain {

	public static void main(String[] args) {

		System.out.println("---- 값 swap ----");
		int score1 = 90;
		int score2 = 100;
		System.out.println("score1:"+score1);
		System.out.println("score2:"+score2);
		System.out.println();
		
		// 스와핑 swap
		int tempScore = score1;
		System.out.println("tempScore:"+tempScore);
		score1 = score2;
		System.out.println("score1:"+score1);
		System.out.println("score2:"+score2);
		score2 = tempScore;
		System.out.println("score1:"+score1);
		System.out.println("score2:"+score2);
		System.out.println();
		
		System.out.println("---- 주소값 swap ----");
		Member member1 = new Member(1, "이효리");
		Member member2 = new Member(2, "이상순");
		
		member1.print();
		member2.print();
		
		Member tempMember = member1;
		member1 = member2;
		member2 = tempMember;
		
		member1.print();
		member2.print();
		
		System.out.println("---- 주소 비교 ----");
		Member member3 = new Member(1111, "일일일일");
		Member member4 = member3;
		Member member5 = new Member(2222, "이이이이");
		
		member3.print();
		member4.print(); // 객체 하나에 참조가 두개 있는 상황
		
		if(member3 == member4) {
			System.out.println("member3 == member4 주소가 동일함 "+member3+"=="+member4);
		}
		if(member3 != member5) {
			System.out.println("member3 != member5 주소가 다름 "+member3+"!="+member5);
		}

		System.out.println("---- 주소 교환 ----");
		Member m1 = new Member(1000, "김수로");
		Member m2 = new Member(2000, "석주형");
		System.out.println("---- 주소 교환 befor ----");
		m1.print();
		m2.print();
		Member tempMember2 = m1;
		m1 = m2;
		m2 = tempMember2;
		System.out.println("---- 주소 교환 after ----");
		m1.print();
		m2.print();
		
		System.out.println("---- 기본형 변수값 초기화 ----");
		//기본형
		int tot = 0;
		double avg = 0.0;
		boolean isMarried = false;
		
		System.out.println("---- 참조형 변수값 초기화 ----");
		Member m3=null; // 참조변수는 null로 초기화한다.
		
		/*
		 모든 주소값을 초기화할때 null을 쓴다.
		 	null : 객체주소 리터럴(값)
		  		- 주소가 없다는 의미의 주소값.
		  		- 객체 주소값 초기화의 용도로 사용
		 */
		
		//  null 주소사용 시null pointer exception 발생
		if(m3==null) {
			m3 = new Member(3333, "삼삼삼삼");
		}
		m3.print();
	}

}
