package com.itwill01.method;

public class StudentMethodMain {

	public static void main(String[] args) {

		/*
		 * 학생객체생성(3명)
		 */
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		
		/*
		 * 학생객체 기본데이터 입력 메소드 호출(3명)
		 *  - 번호, 이름, 국어, 영어, 수학
		 */
		
		student1.studentData(1001, "박나래", 91, 94, 98);
		student2.studentData(1002, "석주형", 83, 87, 90);
		student3.studentData(1003, "홍길동", 80, 73, 85);
		
		/*
		 * 학생 총점계산 메소드 호출(3명)
		 * 학생 평균계산 메소드 호출(3명)
		 * 학생 평점계산 메소드 호출(3명)
		 */
		
		student1.totalScore();
		student2.totalScore();
		student3.totalScore();
		
		student1.avgScore();
		student2.avgScore();
		student3.avgScore();
		
		student1.totalGrade();
		student2.totalGrade();
		student3.totalGrade();
		
		/*
		 * 학생데이터 출력 메소드 호출(3명)
		 */
		
		student1.print();
		student2.print();
		student3.print();
	}

}
