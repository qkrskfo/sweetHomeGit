package com.itwill05.service.student;

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
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}

	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		Student[] tempStudent = new Student[students.length+1];
		//tempStudent는 로컬객체
		for (int i = 0; i < students.length; i++) {
			tempStudent[i] = students[i];
		}
		tempStudent[tempStudent.length-1] = student;
		this.students = tempStudent;
	}
	
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
	}
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	
	public void calculateRank() {
		for (int i = 0; i < students.length; i++) {
			students[i].setRank();
		}

		for (int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length; i++) {
				if (students[i].getTot() <students[j].getTot()) {
					students[i].increaseRank();
				}
			}
		}
	}

	/*
	 * 3. 전체학생반환
	 */
	
	public Student allStudents() {
		Student studentTot = null;
		for (int i = 0; i < students.length; i++) {
			studentTot = students[i];
		}
		return studentTot;
	}
	
	/*
	 * 4. 번호3번 학생한명 반환  
	 */
	public Student findByNo(int no) {
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==no) {
				findStudent=students[i];
				break;
			}
		}
		return findStudent;
	}
	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char c) {
		Student[] studentAGrade = null;
		int count = 0;
		
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==c) {
				count++;
			}
		}
		
		studentAGrade = new Student[count];
		
		int idx = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==c) {
				studentAGrade[idx++] = students[i];
			}
		}
		return studentAGrade;
	}
	
	/*
	 * 5. 이름으로 학생들 반환
	 */
	public Student[] findByName(String name) {
		Student[] studentName = null;

		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				count++;
			}
		}
		
		studentName = new Student[count];
		
		int idx = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				studentName[idx] = students[i];
				idx++;
			}
		}
		
		return studentName;
	}
	
	
	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	public void sortRankAscend() {
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getRank() >= students[i+1].getRank()) {
					Student tempBox = students[i];
					students[i] = students[i+1];
					students[i+1] = tempBox;
				}
			}
		}
	}
	
	/*
	 * 6. 학생총점으로 오름차순정렬
	 */
	public void sortTotalAscend() {
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getTot() >= students[i+1].getTot()) {
					Student tempBox = students[i];
					students[i] = students[i+1];
					students[i+1] = tempBox;
				}
			}
		}
	}
	
	/*
	 * 6. 학생이름로 오름차순정렬
	 */
	public void sortNameAscend() {
		for (int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length-1; i++) {
				String name1 = students[i].getName();
				String name2 = students[j].getName();
				int unicodeGap1 = name1.compareTo(name2);
				int unicodeGap2 = name2.compareTo(name1);
				if(unicodeGap1 >= unicodeGap2) {
					Student tempBox = students[i];
					students[i] = students[j];
					students[j] = tempBox;
				}
			}
		}
	}
	
	
	
	
	
}
