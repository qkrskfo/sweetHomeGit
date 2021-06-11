import java.util.Scanner;

public class NaraeExam01 {

	public static void main(String[] args) {
		
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		
		int code1, code2;
		String name1, name2;
		int kor1, kor2, eng1, eng2, math1, math2, sum1, sum2, rank1, rank2;
		double avg1, avg2;
		char grade1, grade2;
		
				
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		code1 = 1;
		name1 = "김경호";
		code2 = 2;
		name2 = "박나래";
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		
		// 점수 입력받기 위한 스캐너
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.println("첫번째 학생의 정보-- 학번: "+code1+"이름: "+name1);
		System.out.print("국어 점수를 입력하세요: ");
		kor1 = consoleInput.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng1 = consoleInput.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math1 = consoleInput.nextInt();
		
		if(kor1<0 || kor1>100 || eng1<0 || eng1>100 || math1<0 || math1>100) {
			System.out.println("점수가 유효하지 않습니다. 정상 점수 범위: 0 ~ 100점");
			return;
		}
		
		System.out.println("두번째 학생의 정보-- 학번: "+code2+"이름: "+name2);	
		System.out.print("국어 점수를 입력하세요: ");
		kor2 = consoleInput.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng2 = consoleInput.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math2 = consoleInput.nextInt();
		
		if(kor2<0 || kor2>100 || eng2<0 || eng2>100 || math2<0 || math2>100) {
			System.out.println("점수가 유효하지 않습니다. 정상 점수 범위: 0 ~ 100점");
			return;
		}
				
		
				
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		sum1 = kor1 + eng1 + math1;
		avg1 = sum1 / 3.0;
		System.out.println(avg1);
		avg1 = avg1 * 100;
		System.out.println(avg1);
		int i1 = (int)avg1;
		System.out.println(i1);
		avg1 = i1/10;
		System.out.println(avg1);
		avg1 = avg1/10;
		System.out.println(avg1);
		
//		sum2 = kor2 + eng2 + math2;
//		avg2 = sum2 / 3.0;
//		avg2 = avg2 * 100 / 10 / 10;
//		System.out.println(avg2);
//		
		
		
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

	}

}