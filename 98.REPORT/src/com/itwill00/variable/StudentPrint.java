package com.itwill00.variable;
public class StudentPrint {

	public static void main(String[] args) {

		String num1, num2, num3;
		String name1, name2, name3;
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int totalScore1, totalScore2, totalScore3;
		int rank1, rank2, rank3;
		double avg1, avg2, avg3;
		char grade1, grade2, grade3; 
	
		// 1번학생
		num1 = "1";
		name1 = "KIM";
		kor1 = 34;
		eng1 = 45;
		math1 = 67;
		totalScore1 = 200;
		avg1 = 68.2;
		grade1 = 'C';
		rank1 = 0;
		
		// 2번학생
		num2 = "2";
		name2 = "KIM";
		kor2 = 34;
		eng2 = 45;
		math2 = 67;
		totalScore2 = 200;
		avg2 = 68.2;
		grade2 = 'C';
		rank2 = 0;
		
		// 3번학생
		num3 = "3";
		name3 = "KIM";
		kor3 = 34;
		eng3 = 45;
		math3 = 67;
		totalScore3 = 200;
		avg3 = 68.2;
		grade3 = 'C';
		rank3 = 0;
				
		System.out.println("---------------학생 성적 출력--------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("----------------------------------------------");
		System.out.println(" "+num1+"   "+name1+"  "+kor1+"   "+eng1+"   "+math1+"  "+totalScore1+"  "+avg1+"  "+grade1+"    "+rank1);
		System.out.println(" "+num2+"   "+name2+"  "+kor2+"   "+eng2+"   "+math2+"  "+totalScore2+"  "+avg2+"  "+grade2+"    "+rank2);
		System.out.println(" "+num3+"   "+name3+"  "+kor3+"   "+eng3+"   "+math3+"  "+totalScore3+"  "+avg3+"  "+grade3+"    "+rank3);

	}

}