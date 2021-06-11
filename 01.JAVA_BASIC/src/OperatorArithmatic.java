// 산술연산자 클래스

public class OperatorArithmatic { 

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int result = 0;
		double dResult = 0.0;
		
		result = a + b;
		System.out.println("a+b --> "+result);
		
		result = a - b;
		System.out.println("a-b --> "+result);
		
		result = a * b;
		System.out.println("a*b --> "+result);
		
		result = a / b;
		System.out.println("1. a/b --> "+result); // 나머지없이 0만 나옴.
		
		dResult = a / b;
		System.out.println("2. a/b --> "+dResult); // 얘는 왜 또 여전히 0.0이냐;;
		
		// 처음부터 더블로 바꿔서 계산해줘야 소수점까지 제대로 나옴.
		// 한개만 바꿔도 됨
		dResult = (double)a / b;
		System.out.println("3. (double)a/b --> "+dResult);
		
		// 나머지 구하기
		result = a % b;
		System.out.println("a%b --> "+result);
		
		int year = 2021;
		result = year%4; // 결과값이 0,1,2,3 중에 하나
		System.out.println(year+"%4 --> "+result);
		
		result = year % 100; // 결과값이 0 ~ 99 중에 하나
		System.out.println(year+"%100 --> "+result);
		
		// 윤년을 구해라
		result = year % 400; // 결과값 0 ~ 399 중에 하나
		System.out.println(year+"%400 --> "+result);
		
		int no = 16;
		result = no % 4;
		System.out.println("result 값은 "+result+"입니다. result의 값이 0이면 4의 배수입니다.");
		
		/*
		 * 문자연산
		 */
	
		System.out.println("==========문 자 연 산 ==========");
		char ca ='A'; // 얘는 인코딩테이블을 참고해서 A가 나오고
		char cz = 'Z';
		result = ca; // 얘는 int니깐 인코딩테이블을 참고하지않음. 아스키코드가 나옴. A의 아스키코드 = 65;
		System.out.println(ca);
		System.out.println("A의 십진수, 아스키 코드는 "+result);
		result = cz;
		System.out.println(cz);
		System.out.println("Z의 십진수, 아스키 코드는 "+result);
		result = ca + 1; 
		System.out.println("A+1은 "+result); // 66
		// Type mismatch: cannot convert from int to char
		// char cb = result;
		char cresult = (char)result;
		System.out.println("A+1을 문자로 바꾸면 "+cresult);
		result = ca + ca;
		System.out.println("A+Z는 "+result);
		
		// 알파벳 개수 구하기
		int numOfAlphabet = cz - ca + 1;
		System.out.println("알파벳의 개수는 "+numOfAlphabet); // 26개
		
		int numOfHangul = '힣'-'가'+1;
		System.out.println("한글의 개수는 "+numOfHangul); // 11,172개
		
		char ch1 = '가'+1;
		System.out.println("가 + 1 --> "+ch1);
		
		char ch2 = '가'+11171;
		System.out.println("가 + 11,171 --> "+ch2);
		
		int numOfAlphabet2 = cz - ca+1;
		System.out.println(numOfAlphabet2);
		
		char c='A';
		System.out.println(c);
		c='A'+1;
		System.out.println(c);
		c='A'+2;
		System.out.println(c);
		c='A'+3;
		System.out.println(c);
		
		int numOfHangul2 = '힣'-'가'+1;
		System.out.println(numOfHangul2);
		
		
		/*
		 * 비트 연산
		 *   - 빠르다는 장점
		 *   - << , >>
		 *   
		 *    int d = 1;       ==> 00000000|00000000|00000000|00000001 
		 *    result = d << 1; ==> 00000000|00000000|00000000|00000010
		 *    result = d << 2; ==> 00000000|00000000|00000000|00000100
		 *    result = d << 3; ==> 00000000|00000000|00000000|00001000
		 *    result = d << 4; ==> 00000000|00000000|00000000|00010000
		 *    
		 *     d를 좌측으로 1비트 땡겨
		 *    00000000|00000000|00000000|00000001 = 2
		 */
		
		// int d = 1;
		int d = 0b00000000000000000000000000000001; // 1
		System.out.println(d);
		
		// 좌측으로 1비트씩 밀때마다 2곱하기가 되는 것.
		result = d << 1; // 비트를 좌측으로 1비트 밀어 // 2
		System.out.println(result);
		result = d << 2; // 비트를 좌측으로 1비트 밀어 // 4
		System.out.println(result);
		result = d << 3; // 비트를 좌측으로 1비트 밀어 // 8
		System.out.println(result);
		result = d << 4; // 비트를 좌측으로 1비트 밀어  // 16
		System.out.println(result);
		
		int d1 = 0b00000000000000000000000000000010; // 2
		int d2 = 0b00000000000000000000000000000100; // 4
		int d3 = 0b00000000000000000000000000001000; // 8
		int d4 = 0b00000000000000000000000000010000; // 16
		System.out.println(d1); 
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		
		
		// 우측으로 1비트씩 밀면 2나누기가 되는 것.
		
		/*		
		 * 		int d = 128;     ==> 00000000|00000000|00000000|10000000 
		 * 		result = d >> 1; ==> 00000000|00000000|00000000|01000000
		 * 		result = d >> 2; ==> 00000000|00000000|00000000|00100000
		 *		result = d >> 3; ==> 00000000|00000000|00000000|00010000
		 *		result = d >> 4; ==> 00000000|00000000|00000000|00001000		 * 
		 */
		
		d = 128;
		result = d >> 1;
		System.out.println(result); // 64
		result = d >> 2;
		System.out.println(result); // 32
		result = d >> 3;
		System.out.println(result); // 16
		result = d >> 4;
		System.out.println(result); // 8
		
		

	}

}