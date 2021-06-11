/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌,우측의 항이 논리형 변수(or 리터럴)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false
*/

public class OperatorLogical {

	public static void main(String[] args) {

		boolean b1, b2, b3, b4;
		b1 = true;
		b2 = true;
		b3 = false;
		b4 = false;
		
		boolean result;
		
		/*
		 * 논리합(logical or) ||
		 * 양쪽항이 모두 false여야 false 리턴
		 * 하나라도 true가 있으면 true 리턴됨
		 */
		
		result = b1||b2;
		System.out.println(result); // 둘다 true 니까 true 리턴
		result = b1||b3;
		System.out.println(result); // b1이 true니까 true 리턴 
		result = b3||b4;
		System.out.println(result); // 둘다 false니까 false 리턴
		result = b1||b4;
		System.out.println(result); // b1이 true니까 true 리턴
		
		/*
		 * 논리곱(logical and &&)
		 *  true && true 인 경우에만 true를 리턴
		 */
		
		result = b1 && b2;
		System.out.println(result); // 둘다 true 니까 true 리턴
		result = b1 && b3;
		System.out.println(result); // b1만 true 니까 false 리턴
		
		
		System.out.println("-------------------------------------");
		System.out.println(" ");
		
		int kor = 95;
		int math = 23;
		
		System.out.println("------A대학 : 국어, 영어 중 1과목만 90점 이상이면 합격------");
		boolean isPassA = kor >= 90 || math >= 90; // or니까 하나라도 90점 이상이면 true;
		System.out.println("A대학 합격한거 트루? 응 "+isPassA);
		System.out.println(" ");
		
		System.out.println("------B대학 : 국어, 영어 2과목 모두 90점 이상이면 합격------");
		boolean isPassB = kor >= 90 && math >= 90; // and니까 모두 90점 이상이면 true;
		System.out.println("B대학 합격 여부는 "+isPassB);
		
		System.out.println(" ");
		System.out.println("점수의 유효성 체크(0~100)");
		
		int eng = 98;
		boolean isValid = eng>=0 && eng <=100; // 0~100점 사이니까 2개의 조건 다 만족해야지 &&
		System.out.println("입력된 점수가 유효한가? "+isValid);
		
		if(isValid = eng>=0 && eng <=100) {
			System.out.println("점수가 정상적으로 입력되었습니다.");
		}else {			
			System.out.println("점수 똑바로 입력해");
		}
		
		System.out.println("배수판별=========");
		int number = 32;
		boolean multiple3 = number%3==0;
		boolean multiple4 = number%4==0;
		boolean multipleResult = multiple3 && multiple4;
		System.out.println("3의 배수 여부: "+multiple3);
		System.out.println("4의 배수 여부: "+multiple4);
		System.out.println("3과 4의 공배수 여부: "+multipleResult);
		
		
		/*
		 * quiz 윤년 여부 판단
		 *  - 4의 배수이면서 100의 배수가 아닌 수이거나
		 *  - 400의 배수
		 */
		
		int y = 2021;
		boolean isLeapYear = y%4==0 && y%100!=0 || y%400==0; 
		System.out.println(y+"의 윤년 여부는 "+isLeapYear);
		
		
	}

}