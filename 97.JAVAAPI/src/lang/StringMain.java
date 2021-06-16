package lang;

public class StringMain {

	public static void main(String[] args) {

		/*
		 * String 객체의 명시적 생성
		 *   - 생성자호출
		 */
		
		String name1 = new String("Kim");
		String name2 = new String("Kim");
		//name1, name2 은 참조변수니 '주소'가 들어감
		
		if(name1 == name2) {
			System.out.println("[name1 == name2] name1과 name2의 주소가 같다");
		} else {
			System.out.println("[name1 != name2] name1과 name2의 주소가 다르다");
		}
		// String 에서는 ==, != 로 비교하면 안됨.
		
		if(name1.equals(name2)) {
			System.out.println("name1의 문자열의 값과 name2의 문자열의 값이 동일하다");
		} else {
			System.out.println("name1의 문자열의 값과 name2의 문자열의 값이 동일하지 않다");
		}
		
		// object에서 정의된 equals는 주소비교였는데,		
		// String에서는(?) equals가 재정의되어 value값의 일치성을 비교하는 것
		
		
		/*
		 * String 객체의 암시적 생성(생성자 호출 안함)
		 *   - ""로 생성
		 */
		
		String name3 = "Kim";
		String name4 = "Kim";
		// 이렇게 만들면 name3과 name4의 주소가 같다.
		// "" 로 만든 String은 재사용된다.
		if(name3 == name4) {
			System.out.println("[name3 == name4] name3과 name4의 주소가 같다");
		} else {
			System.out.println("[name3 != name4] name3과 name4의 주소가 다르다");
		}
		
		
		if("Kim" == name3) {
			System.out.println("[\"Kim\" == name3] \"Kim\"과 name3의 주소가 같다");
		}
		
		// escaping 역슬래쉬 \"
		
		
		
		/*
		 * << String >>
		 * public boolean equals​(Object anObject)
		 *   - String 객체가 멤버로 가지고있는 문자열비교
		 *  
		 * Overrides: 
		 * 		equals in class Object
		 *   - equlas가 String에서는 문자열 비교로 재정의됨.
		 * 
		 */
		
		if(name1.equals(name4)) {
			System.out.println("name1 == name4[equals] 문자열이 동일하다(주소아님)");
		}
		if(name1.equals(name2)) {
			System.out.println("name1 == name2[equals] 문자열이 동일하다(주소아님)");
		}
		if(name1.equals(name3)) {
			System.out.println("name1 == name3[equals] 문자열이 동일하다(주소아님)");
		}
		if(name2.equals(name4)) {
			System.out.println("name2 == name4[equals] 문자열이 동일하다(주소아님)");
		}
		if(name1 == "Kim") {
			System.out.println("name1 == Kim 문자열이 아닌, 주소값을 비교한 것");
		} else {
			System.out.println("name1 == Kim 문자열이 아닌, 주소값을 비교한 것");
		}
		
		
		// 이름으로 정렬
		/*
		 * compareTo 메소드
		 * public int compareTo​(String anotherString)
		 * 
		 * Returns:
		 * the value 0 if the argument string is equal to this string;
		 * a value less than 0 if this string is lexicographically less than the string argument; 
		 * and a value greater than 0 if this string is lexicographically greater than the string argument.
		 */
		
		String irum1 = "홍경호";
		String irum2 = "김경호";
		int unicodeGap = irum1.compareTo(irum2);
		System.out.println("유니코드 차이: "+unicodeGap);
		
		int unicodeGap2 = irum2.compareTo(irum1);
		System.out.println("유니코드 차이: "+unicodeGap2);
		
		// sorting 하고 싶다면
		if(irum1.compareTo(irum2) > 0 ) {
			System.out.println("irum1과 irum2를 교환[오름차순]");
			String temp = irum1;
			irum1 = irum2;
			irum2 = temp;
		}
		System.out.println(irum1);
		System.out.println(irum2);
			
		
		
		
	}

}
