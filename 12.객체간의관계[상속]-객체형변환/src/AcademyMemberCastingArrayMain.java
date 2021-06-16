
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {

		AcademyMember[] members = new AcademyMember[7];
		members[0] = new AcademyStudent(1, "KIM", "LINUX");
		members[1] = new AcademyStudent(2, "KANG", "OFFICE");
		members[2] = new AcademyStudent(3, "SHIM", "JAVA");
		members[3] = new AcademyGangsa(4, "LIM", "HTML");
		members[4] = new AcademyGangsa(5, "JANG", "CSS");
		members[5] = new AcademyStaff(6, "CHOI", "SALES");
		members[6] = new AcademyStaff(7, "PARK", "DEVELOPMENT");

		/*
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "ARDUINO"),
				new AcademyStudent(2, "JIM", "ANDROID"),
				new AcademyStudent(3, "LIM", "IOS"),
				new AcademyGangsa(4, "김강사", "웹디자인"),
				new AcademyGangsa(5,"정강사","오피스"),
				new AcademyStaff(6, "HONG", "총무부"),
				new AcademyStaff(7, "SIM", "홍보부")
		};
		*/
		
		
		System.out.println("--- AcademyMember 전체 출력 ---");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}

		
		System.out.println("--- instanceof ---");
		/*
		 * 연산자 --> instanceof
		 *   - 형태 : 참조변수 instanceof 클래스이름
		 *   - 연산결과(반환) : true or false (boolean 데이터)
		 */
		
		AcademyMember am = new AcademyStudent(1, "김", "자바");
		boolean isStudent = am instanceof AcademyStudent;
		if(isStudent) {
			System.out.println("학생객체--> "+am);
			AcademyStudent tempStudent = (AcademyStudent)am; // 다시 캐스팅
			System.out.println("학생반:"+tempStudent.getBan());
		}
		
		System.out.println("------------AcademyMember 중에서 AcademyStudent 객체만 출력-------------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();	
			}			
		}
		
		System.out.println("------------AcademyMember 중에서 AcademyStudent 객체의 반을 출력------------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();	
				AcademyStudent tempStudent = (AcademyStudent)members[i];
				System.out.println(" >>> 학생의 반:"+tempStudent.getBan());
			}			
		}
		
				
	}

}
