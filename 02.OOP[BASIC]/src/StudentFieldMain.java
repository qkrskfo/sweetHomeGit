
public class StudentFieldMain {

	public static void main(String[] args) {

		/*
		 * 학생 2명 객체 생성
		 */
		
		Student student1 = new Student();
		Student student2 = new Student();


		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		student1.no = 1001;
		student1.name = "홍길동";
		student1.kor = 94;
		student1.eng = 73;
		student1.math = 89;
		
		student2.no = 1002;
		student2.name = "박나래";
		student2.kor = 87;
		student2.eng = 94;
		student2.math = 99;
		
				
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		
		
		student1.tot = student1.kor+student1.eng+student1.math;
		student1.avg = student1.tot/3;
		if(student1.avg>=90) {
			student1.grade = 'A';
		} else if (student1.avg>=80) {
			student1.grade = 'B';
		} else if (student1.avg>=70) {
			student1.grade = 'C';
		} else {
			student1.grade = 'F';
		}
		
		
		student2.tot = student2.kor+student2.eng+student2.math;
		student2.avg = student2.tot/3;
		if(student2.avg>=90) {
			student2.grade = 'A';
		} else if (student2.avg>=80) {
			student2.grade = 'B';
		} else if (student2.avg>=70) {
			student2.grade = 'C';
		} else {
			student2.grade = 'F';
		}
		
		/*
		 * 학생데이타출력2명
		 */
		
		System.out.println("---------------------------------------------------");
		System.out.println(" 학번   이름    국어 영어 수학  총점 평균 평점 석차");
		System.out.println("---------------------------------------------------");
		System.out.printf(" %d  %s    %d   %d   %d   %d  %.1f   %c   %d %n",student1.no,student1.name,student1.kor,student1.eng,student1.math,student1.tot,student1.avg,student1.grade,student1.rank);
		System.out.printf(" %d  %s    %d   %d   %d   %d  %.1f   %c   %d",student2.no,student2.name,student2.kor,student2.eng,student2.math,student2.tot,student2.avg,student2.grade,student2.rank);
	}

}
