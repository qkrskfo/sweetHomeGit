/*
		변수의선언
          - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		  - 형태:
		        데이타타입 이름;
		         ex> int number;
		  - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$)
			   - 키워드 사용금지
*/
public class VariableDeclare {
	public static void main(String[] args) {
		int score1;//변수의선언
		score1 = 78;//변수에값대입
		System.out.println(score1);//변수의값출력
		score1 = 99;//변수의 값대입
		System.out.println(score1);//변수의값출력
		
		int score2 = 5657;
		System.out.println(score2);
		
		int _number=333;
		int $number=444;
		int 번호=555;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		/*
		int 7number;
		int my score;
		int my-score;
		*/
		int kor,eng,math;
		kor=89;
		eng=90;
		math=93;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		/*
		<<Duplicate local variable kor>>
		int kor;
		*/
		/*
		<<history cannot be resolved to a variable>>
		history=88;
		*/
		
		/*
		 * 변수선언
		 *  데이타타입 이름(식별자);
		 */
		String name;
		name = "김경호";
		System.out.println(name);
		
		
	}

}