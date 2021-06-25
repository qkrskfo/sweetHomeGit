package NaraeExam;


public class StudentService {
	private Student[] students={
			new Student(1,"KIM",89,93,94),
			new Student(2,"HIM",88,77,98),
			new Student(3,"AIM",65,87,99),
			new Student(4,"KIM",75,97,60),
			new Student(5,"XIM",85,98,90),
			new Student(6,"TIM",95,88,77),
			new Student(7,"KIM",99,93,95),
			new Student(8,"LIM",83,80,99),
			new Student(9,"QIM",73,90,80),
			
	};
	/*
	 *  0.전체학생출력
	 */
	
	public void print() {
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}

	/*
	 * 0.학생객체받아서 추가
	 */
	
	public void addStudent(Student student) {
		// 학생 하나가 추가되면 객체 렝스가 하나 늘어나야해
		Student[] tempStudent = new Student[students.length+1];
		
		// 돌아가면서 하나씩 tempStudent 라는 새로운 객체로 이동해
		for (int i = 0; i < students.length; i++) {
			tempStudent[i] = students[i];
		}
		// 추가된 학생객체도 tempStudent 에 추가해야겠지?
		// 인덱스가 몇번인진 모르지만 맨 마지막이잖아
		tempStudent[tempStudent.length-1] = student;
		
		// 다시 우리 원래 객체인 students 에 넣어주자
		this.students = tempStudent;
	}

	
	
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */

	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	


	/*
	 * 3. 전체학생반환
	 */
	

	/*
	 * 4. 번호3번 학생한명 반환  
	 */

	
	/*
	 * 5. 학점A인 학생들 반환
	 */

	
	/*
	 * 5. 이름으로 학생들 반환
	 */

	
	
	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	
	
	/*
	 * 6. 학생총점으로 오름차순정렬
	 */
	
	
	/*
	 * 6. 학생이름로 오름차순정렬
	 */
	
	
	
	
	
	
}
