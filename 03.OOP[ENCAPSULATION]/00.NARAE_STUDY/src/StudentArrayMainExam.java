public class StudentArrayMainExam {

	public static void main(String[] args) {
		/*
		 * 0.학생배열객체초기화
		 */
		StudentExam[] students = { 
				new StudentExam(1, "KIM", 89, 93, 94), 
				new StudentExam(2, "HIM", 88, 77, 98),
				new StudentExam(3, "AIM", 65, 87, 99), 
				new StudentExam(4, "BIM", 75, 97, 60), 
				new StudentExam(5, "XIM", 85, 98, 90),
				new StudentExam(6, "TIM", 95, 88, 77), 
				new StudentExam(7, "ZIM", 99, 93, 95), 
				new StudentExam(8, "LIM", 83, 80, 99),
				new StudentExam(9, "QIM", 73, 90, 80),
		};
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(); // 모든 학생의 석차 1로 초기화
		}

		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체 학생 총점, 평균, 평점 계산");
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체 학생 총점으로 석차 계산");
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
			if(students[i].getTot() < students[j].getTot()) {
				students[i].calculateRank();
			}
		}
		
		}
		/*
		 * 3. 전체학생출력
		 */
		System.out.println("3. 전체 학생 출력 ");
		StudentExam.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. 번호3번 학생한명 출력
		 */
		System.out.println();
		System.out.println("4. 번호 3번 학생 한 명 출력  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3) {
				StudentExam.headerPrint();
				students[i].print();
				break;
			}
		}

		/*
		 * 5. 학점A인 학생들 출력
		 */
		System.out.println();
		System.out.println("5. 학점 'A'인 학생들 출력");
		StudentExam.headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				students[i].print();
			}
		}


		/*
		 * 6. 학생총점으로 오름차순정렬
		 */
		System.out.println();
		System.out.println("6-1. 학생 총점으로 오름차순 정렬");

		StudentExam.headerPrint();
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getTot() > students[i+1].getTot()) {
						StudentExam temp = students[i+1];
						students[i+1] = students[i];
						students[i] = temp;
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println();
		System.out.println("6-2. 학생 총점으로 내림차순 정렬");

		StudentExam.headerPrint();
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getTot() < students[i+1].getTot()) {
					StudentExam temp = students[i+1];
					students[i+1] = students[i];
					students[i] = temp;
					
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		
		/*
		 * 7. 학생학점순으로 오름차순정렬
		 */
		System.out.println();
		System.out.println("6-3. 학생 학점순으로 오름차순 정렬");
		StudentExam.headerPrint();
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getGrade() > students[i+1].getGrade()) {
					StudentExam temp = students[i+1];
					students[i+1] = students[i];
					students[i] = temp;
					
				}
			}
		}
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}

	}

}