package com.itwill01.method;
/*
 * 성적처리를 위해 필요한 학생객체를 만들기위한 클래스(틀, 타입)
 */

public class Student {
	/*
	 * << 속성 >>
	 * 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차를 저장할 필드(멤버변수)의 선언
	 */
	
	int no, kor, eng, math, tot, rank;
	double avg;
	String name;
	char grade;
	
	/*
	 * << 기능 >>
	 * 기본 데이터 입력, 총점 계산, 평균 계산, 평점 계산, 출력 
	 */
	
	public void studentData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	public void totalScore() {
		this.tot = this.kor + this.eng + this.math;
	}
	
	public void avgScore() {
		this.avg = this.tot/3;
	}
	
	public void totalGrade() {
		if(this.avg>=90) {
			this.grade = 'A';
		} else if (this.avg>=80) {
			this.grade = 'B';
		} else if (this.avg>=70) {
			this.grade = 'C';
		} else {
			this.grade = 'F';
		}
	}
	
	public void print() {
		System.out.println("---------------------------------------------------");
		System.out.println(" 학번   이름    국어 영어 수학  총점 평균 평점 석차");
		System.out.println("---------------------------------------------------");
		System.out.printf(" %d  %s    %d   %d   %d   %d  %.1f   %c   %d %n",this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);

	}
	
}
