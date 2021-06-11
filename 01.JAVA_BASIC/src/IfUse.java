public class IfUse {

	public static void main(String[] args) {

		/*
		 * 짝수, 홀수 판별 후 출력
		 */
		
		/* System.out.printf();
		%d -> data 1개, %%d -> data 2개(?)
		스트링은 %s
		캐릭터는 %c
		
		println은 한줄 띄우기 new line
		
		printf에서 한줄 엔터 하고싶으면 %n 하면됨.
		*/
		
		int no1 = 88;
		
		if(no1%2==0) {
			// System.out.println("no1은 짝수입니다.");
			System.out.printf("%d은 %s입니다.%n",no1,"짝수");
		}else {
			// System.out.println("no1은 홀수입니다.");
			System.out.printf("%d는 %s입니다.%n",no1,"홀수");
		}
		
		/*
		 * 4의 배수 판별 후 출력
		 */
		
		int no2 = 5684;
		if(no2%4==0) {
			System.out.printf("%d은 %s입니다.%n",no2,"4의 배수");
		}else {
			System.out.printf("%d은 4의 배수아님%n",no2);
		}
		
		/*
		 * 점수의 유효성 체크
		 */
		
		int score = 89;
		if(score>=0&&score<=100) {
			System.out.printf("입력된 점수는 %d점으로, 정상 입력되었습니다. %n",score);
		}else {
			System.out.printf("입력된 점수는 %d이므로, 다시 입력하기 바랍니다. %n",score);
		}
		
		
		/*
		 * 윤년 여부 체크
		 */
		
		int year = 2020;
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.printf("%d년은 윤년입니다.%n",year);
		}else {
			System.out.printf("%d년은 평년입니다.%n",year);
		}
		
		/*
		 * 문자 판단
		 * 1. 한글
		 * 2. 알파벳 대문자 / 소문자
		 * 3. 숫자형태문자 '1'
		 */
		
		char c = '김';
		if(c>='가' && c<='힣') {
			System.out.printf("%c는 한글입니다.%n",c);
		}
		if(c>='A' && c<='Z') {
			System.out.printf("%c는 알파벳 대문자입니다.%n",c);
		}
		if(c>='a' && c<='z') {
			System.out.printf("%c는 알파벳 소문자입니다.%n",c);
		}
		if(c>='0' && c<='9') {
			System.out.printf("%c는 숫자형태의 문자입니다.%n",c);
		}
		
		/* 다음 문자는 아이디의 첫글자입니다.
		이 문자가 아이디의 첫글자로 유효한지 판단 후 출력하세요.
		 - 아이디의 첫글자는 알파벳 대문자 또는 소문자여야 한다.
		*/
		
		char idFirstLette='3';
		if(idFirstLette>='A' && idFirstLette<='Z') {
			System.out.println("아이디의 첫글자로 적합합니다.");
		} else if(idFirstLette>='a' && idFirstLette<='z') {
			System.out.println("아이디의 첫글자로 적합합니다.");
		} else {
			System.out.println("아이디의 첫글자로 적합하지 않습니다.");
		}
		
		char idFirstLetter ='b';
		if(true) {
			System.out.println("아이디의 첫글자로 적합합니다.");
		} else {
			System.out.println("아이디의 첫글자로 적합하지 않습니다.");
		}
		
	}

}