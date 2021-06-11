/*
 관계(비교)연산
     - 형태:  >,<,>=,<=,==,!=
     - 관계연산의 결과값은 논리형 데이타이다(true,false)
	IO 변경
*/

public class OperatorRelational {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		boolean result;
		
		result = a > b;
		System.out.println("10>20 --> "+result); // false
		result = a < b;
		System.out.println("10<20 --> "+result); // true
		result = a >= b;
		System.out.println("10>=20 --> "+result); // false
		result = a <= b;
		System.out.println("10<=20 --> "+result); // true
		result = a == b;
		System.out.println("10==20 --> "+result); // false
		result = a != b;
		System.out.println("10!=20 --> "+result); // true
		
		// 문자도 비교 가능함
		char ca = 'A';
		char cb = 'B';
		char h1 = '가';
		char h2 = '다';
		
		result = ca > cb;
		System.out.println("A>B --> "+result);
		result = ca < cb;
		System.out.println("A<B --> "+result); // true
		result = ca >= cb;
		System.out.println("A>=B --> "+result); // false
		result = ca <= cb;
		System.out.println("A<=B --> "+result); // true
		result = ca == cb;
		System.out.println("A==B --> "+result); // false
		result = ca != cb;
		System.out.println("A!=B --> "+result); // true
		
		result = h1 > h2;
		System.out.println("가>다 --> "+result);
		result = h1 < h2;
		System.out.println("가<다 --> "+result); // true
		result = h1 >= h2;
		System.out.println("가>=다 --> "+result); // false
		result = h1 <= h2;
		System.out.println("가<=다 --> "+result); // true
		result = h1 == h2;
		System.out.println("가==다 --> "+result); // false
		result = h1 != h2;
		System.out.println("가!=다 --> "+result); // true
	
	}

}