package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")

		};
		System.out.println("1.AcademyMember 전체출력");		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==1) {
				members[i].print();
				break;
			}
		}
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==2) {
				members[i].print();
				break;
			}
		}
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals("KIM")) {
				members[i].print();
			}
		}
		
		/*
		 * 연산자 --> instanceof
		 *   - 형태 : 참조변수 instanceof 클래스이름
		 *   - 연산결과(반환) : true or false (boolean 데이터)
		 */
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				members[i].print();
			}
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				members[i].print();
			}
		}
		
		
	
		
		
		System.out.println("4.AcademyMember 중에서 자바 반  인 AcademyStudent 들 출력");		
		for (int i = 0; i < members.length; i++) {			
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent)members[i];
				if(tempStudent.getBan().equals("자바")) {
					members[i].print();
				}				
			}
		}
		// 다른 사람들은 이렇게 했네
		// if문이 깊어지지 않기 위해 조건에 &&을 이용하여 넣기
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent && ((AcademyStudent)members[i]).getBan().equals("자바")) {
				members[i].print();
			}
		}
		
		/*
		   1. AcademyMember[]타입의 members[i]가 AcademyStudent의 객체인지 판단
		   2. true라면 AcademyStudent타입 tempBan의 임시객체를 members[i]객체를 AcademyStudent로 다운캐스팅
		     * 다운캐스팅이 되는 이유 : members[i]는 AcademyMember[]타입(부모)객체에 AcademyStudent&AcademyStaff&AcademyGangsa 자동프로모션(업캐스팅)되었기 때문에 다운캐스팅이 가능하다.
		     * 다운캐스팅을 하는 이유 : members[i]는 자식타입이 부모타입으로 자동형변환(자동프로모션)이 됬으므로 부모타입의 기능(멤버)만 사용이가능하기때문에
		     *                          AcademyStudent "자바"반인 객체를 출력하려면 AcademyStudent의 기능(멤버)가 필요하다.
		   3. 다운캐스팅 후 tempBan객체는 AcademyStudent의 객체이므로 기능(멤버) getBan메소드를 사용하여 문자열비교 하고 출력
		   출력 시 잘못한 점 : for구문 실행블록 안에 if구문 실행되기전 AcademyStudent tempBan = (AcademyStudent)members[i];를 작성하여
		                       ClassCastException에러발생 if구문이 발생되기전 다운캐스팅을 하면 members[i]의 AcademyStaff&AcademyGangsa의 자식클래스도 자식클래스로 다운캐스팅을 하게되니까.
		                             
		 */

		
		
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");		
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff)members[i];
				if(tempStaff.getDepart().equals("영업")) {
					members[i].print();
				}
			}
		}
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa)members[i];
				if(tempGangsa.getSubject().equals("자바")) {
					members[i].print();
				}
			}
		}
		
	}

}
