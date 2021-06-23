package wrapper;

public class WrapperClassUsefulMethod {

	public static void main(String[] args) {
		System.out.println("int --> String");
		int y = 2147483647;
		String yStr1 = Integer.toString(y);	// 숫자를 넣으면 문자열로 바뀐다
		System.out.println(yStr1);
		
		// 조금 더 쉽게
		// 큰따옴표를 써서 y값을 문자로 바꿔줌
		String yStr2 = y+"";
		System.out.println(yStr2);
		
		String yStr3 = Integer.toBinaryString(y);
		// y값이 이진으로 어떻게 되어있는지 보고 싶은 것
		System.out.println(yStr3);
		
		String yStr4 = Integer.toHexString(y);
		System.out.println(yStr4);
		
		// 외부에서 받는 모든 데이터가 문자열임
		// 문자열을 실제 기본형으로 바꾸는 작업이 자주 있음
		
		System.out.println("String --> int, double, boolean");
		int i1 = Integer.parseInt("506032929");
		System.out.println(i1);
		
		double d1 = Double.parseDouble("3.141592");
		System.out.println(d1); // string을 double로 바꿈
		
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);
		
		/*
		 *   + 연산자의 오버로딩
		 *     - 항이 문자열일 경우 문자를 붙임 concat
		 */
		
		int number = 454354;
		String numberStr1 = number+"";
		
		String numberStr2 = 1+2+3+4+5+"6";
		System.out.println(numberStr2);
		
		System.out.println("--- Character ---");
		Character wc1 = new Character('김');
		Character wc2 = '김';  // auto boxing
		char c1 = wc1.charValue(); // unboxing
		char c2 = wc2; // wc2.charValue()가 자동으로 호출되서 unboxing됨
		
		
		System.out.println("---- String --> char, char[] ----");
		char firstChar = "김경호".charAt(0); // "김경호"의 첫번째 글자 찾는거
		System.out.println(firstChar);
		
		char[] ca = "오늘은 수요일 Wrapper Class를 공부합니다.".toCharArray();
		// 캐릭터 배열로 반환되는것
		System.out.println(ca.toString()); // 주소를 보려면 toString()
		System.out.println(ca);
		System.out.println(ca[0]); //오
		System.out.println(ca[1]); //늘
		System.out.println(ca[2]); //은
		
		
		System.out.println("---- char, char[] --> String ----");
		char c3 = '김';
		String str3 = String.valueOf(c3); // c3를 문자열 김으로 변경한 것
		                                  // '김' --> "김"
		String str4 = c3+""; // 이렇게 해도 됨.
		System.out.println(str3+", "+str4);
		
		//배열 스트링은~
		// 캐릭터 배열이 있는거야
		char[] ca5 = {'김', '은', '희'};
		String str5 = String.valueOf(ca5);
		System.out.println("char[] --> String: "+str5);
		// 이렇게도 할 수 있어. 
		// 근데 new라는 생성자를 써서 굳이 객체를 생성할 필요가 없어.
		String str6 = new String(ca5);
		System.out.println("char[] --> String: "+str6);
		
		String strs = "Hello Java!! $$ %% ^^~!@)^(&][{)}663 김씨~";
		for (int i = 0; i < strs.length(); i++) {
			char tempChar = strs.charAt(i);
			int type = Character.getType(tempChar); // 어떤 타입의 문자인지 알아냄
			System.out.println(tempChar+" type: "+type);
			if(type == Character.UPPERCASE_LETTER) { // 상수로 갖고 있음. uppercase_letter : 대문자
				System.out.println("UPPERCASE_LETTER:" + tempChar);
			}
			if(type == Character.LOWERCASE_LETTER) {
				System.out.println("LOWERCASE_LETTER: "+tempChar);
			}
			if (type == Character.DECIMAL_DIGIT_NUMBER) { // 10진의 숫자 넘버인지
				System.out.println("DECIMAL_DIGIT_NUMBER: "+tempChar);
			}
			if (type == Character.SPACE_SEPARATOR) { // 공백인지
				System.out.println("SPACE_SEPARATOR: "+tempChar);
			}
			if (Character.isWhitespace(tempChar)) { // 유틸리티
				// isSpace : The method isSpace(char) from the type Character is deprecated
				// isWhitespace로 대체해서 사용하래
				System.out.println("Character.isSpaceChar: "+tempChar);
			}
			if (Character.isAlphabetic(tempChar)) { // 유틸리티
				System.out.println("Character.isAlphabetic: "+tempChar);
			}
			
			
			
		}
	}

}
