package lang;

public class StringUseMain {

	public static void main(String[] args) {

		String str1 = "Have a nice day !!!";
		String str2 = "오늘은 목요일, 추상클래스를 공부할거에요!";
		int length1 = str1.length();
		int length2 = str2.length();
		int length3 = "자바가 재미있네요".length();
		String emptyStr = "";
		int length4 = emptyStr.length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		
		String id = null;
//		String id = ""; 아이디가 비어있는지를 체크할 땐 null인지 ""인지 확인
		if(id == null || id.equals("")) {
			System.out.println("아이디를 입력하세요!!");
		}
		
		System.out.println("-------- String.sub ---------");
		System.out.println("Have a nice day!!!".substring(7));
		System.out.println("Have a nice day!!!".substring(7,11));
		// .substring(begin, end)
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println("오늘은 목요일 추상클래스를 공부할거에요.".substring(15));
		System.out.println("오늘은 목요일 추상클래스를 공부할거에요.".substring(8,13));
		
		System.out.println("------ String.charAt(index) -------");
		String userId = "123test#00ABC$%";
		char firstChar = userId.charAt(0);
		System.out.println("'1'-->"+firstChar);
		System.out.println("'1'의 Asciicode값-->"+(int)firstChar);
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			System.out.println(tempChar+"의 Asciicode값: "+(int)tempChar);
		}
		
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			if(tempChar>='a' && tempChar<='z') {
				System.out.println(tempChar+" -> 영문소문자");
			}
			if(tempChar>=48 && tempChar<=57) {
				System.out.println(tempChar + " -> 숫자형문자");
			}
		}
	}

}
