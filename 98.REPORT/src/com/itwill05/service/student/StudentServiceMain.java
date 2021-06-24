package com.itwill05.service.student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 0. 객체로 학생 추가
		 */
		System.out.println("0. 학생 추가");
		studentService.addStudent(new Student(10, "BIM", 60, 70, 80));
		
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calculateRank();
		
		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3. 전체학생반환 ");
		studentService.allStudents();
		
		/*
		 * 3-2. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();
		
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4. 번호3번 학생한명 반환  ");
		studentService.findByNo(3);
		
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		studentService.findByGrade('A');
		/*
		Student[] studentsA = studentService.findByGrade('A');
		for(int i = 0; i < studentsA.length; i++) {
			studentsA[i].print();
		}
		*/
		
		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5. 이름KIM 인 학생들 반환");
		studentService.findByName("KIM");
		/*
		Student[] studentKim = studentService.findByName("KIM");
		for (int i = 0; i < studentKim.length; i++) {
			studentKim[i].print();
		}
		*/
		
		
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sortRankAscend();
		
		/*
		 * #### 전체학생출력 ####
		 */
		System.out.println();
		System.out.println();
		System.out.println("전체학생출력 ");
		studentService.print();

	}

}