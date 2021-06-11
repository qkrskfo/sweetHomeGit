public class StudentScorePrint{
	public static void main(String[] args){
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
				
		
		int studentNum1, studentNum2; 
		String name1, name2; 
		int kor1, kor2; 
		int eng1, eng2; 
		int math1, math2; 
		int scoreTotal1, scoreTotal2; 
		double avg1, avg2; 
		char grade1, grade2; 
		int rank1, rank2; 
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		studentNum1 = 1;
		name1 = "김경호";
		kor1 = 95;
		eng1 = 82;
		math1 = 88;
		
		studentNum2 = 2;
		name2 = "박나래";
		kor2 = 96;
		eng2 = 93;
		math2 = 83;
				
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if(kor1<0 || kor1>100 || eng1<0 || eng1>100 || math1<0 || math1>100) {
			System.out.println("학생1의 점수가 유효하지 않습니다. 정상 점수 범위:0~100");
			return;
		} 
		
		if(kor2<0 || kor2>100 || eng2<0 || eng2>100 || math2<0 || math2>100) {
			System.out.println("학생2의 점수가 유효하지 않습니다. 정상 점수 범위:0~100");
			return;
		}
		
		  
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		
		scoreTotal1 = kor1 + eng1 + math1; // 265
		avg1 = scoreTotal1/3.0; // 88.33333
		grade1 = ' ';
		if(scoreTotal1>=(3*90)) {
			grade1 = 'A';
		} else if (scoreTotal1>=(3*80)) {
			grade1 = 'B';
		} else if (scoreTotal1>=(3*70)) {
			grade1 = 'C';
		} else if (scoreTotal1>=(3*60)) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}
		rank1 = 0;
		
		scoreTotal2 = kor2 + eng2 + math2; // 272
		avg2 = scoreTotal2/3.0; // 90.66666
		grade2 = ' ';
		if(scoreTotal2>=(3*90)) {
			grade2 = 'A';
		} else if (scoreTotal2>=(3*80)) {
			grade2 = 'B';
		} else if (scoreTotal2>=(3*70)) {
			grade2 = 'C';
		} else if (scoreTotal2>=(3*60)) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
		rank2 = 0;
		
		
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 2째자리수에서 반올림하세요(%f)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		
		
		// 평균 소수점 반올림
		avg1 = avg1 * 100; // 8833.3333
		int ia1 = (int)avg1; // 8833
		avg1 = ia1/10; // 883
		avg1 = avg1/10; // 88.3

		avg2 = avg2 * 100; // 9066.66666
		int ia2 = (int)avg2; // 9066
		avg2 = ia2/10; // 906.0
		avg2 = avg2/10; // 90.6

		// 출력
		System.out.println("---------------학생 성적 출력--------------------");
		System.out.println(" 학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("----------------------------------------------");
		System.out.println(" "+studentNum1+"   "+name1+"  "+kor1+"   "+eng1+"   "+math1+"  "+scoreTotal1+"  "+avg1+"  "+grade1+"    "+rank1);
		System.out.println(" "+studentNum2+"   "+name2+"  "+kor2+"   "+eng2+"   "+math2+"  "+scoreTotal2+"  "+avg2+"  "+grade2+"    "+rank2);
		
//		System.out.printf(" %d  %s  %d  %d  %d  %d  %5.1f  %c  %d  %n",studentNum1,name1,kor1,eng1,math1,scoreTotal1,avg1,grade1,rank1);
//		System.out.printf(" %d  %s  %d  %d  %d  %d  %5.1f  %c  %d  %n",studentNum2,name2,kor2,eng2,math2,scoreTotal2,avg2,grade2,rank2);
		

		
	}
}