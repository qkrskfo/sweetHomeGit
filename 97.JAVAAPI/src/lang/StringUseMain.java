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
		
		/*
		Quiz: 아이디로 적합한지 판단하세요
		  - 길이가 3 ~ 7 사이여야한다.
		  - 영문, 숫자로만 이루어져있어야 한다.
		  - 첫글자가 숫자여서는 안된다.
		*/
		System.out.println("퀴즈");
		String[] idArray = {"guard", "7up", "test", "dfdj", "my id", "%super%", "아이디", "aaaaaaaaaa", "c"};
		/*
		for (int i = 0; i < idArray.length; i++) {
			if(idArray[i].charAt(0) <= 48 || idArray[i].charAt(0) >= 57) {	
				System.out.println(idArray[i]);
				if(idArray[i].length() >= 3 && idArray[i].length() <=7) {
					System.out.println(idArray[i]);
					char tempChar = idArray[i].charAt(i);
					if(tempChar>='a' && tempChar<='z' && tempChar>=48 && tempChar<=57) {
						System.out.println(idArray[i]);
					}					
				}
			}				
		}
		
		
		for (int i = 0; i < idArray.length; i++) {
			if(idArray[i].charAt(0) <= 48 || idArray[i].charAt(0) >= 57) {	
				if(idArray[i].length() >= 3 && idArray[i].length() <=7) {
					char tempChar = idArray[i].charAt(i);
					if(tempChar>='a' && tempChar<='z' && tempChar>=48 && tempChar<=57) {
						System.out.println(idArray[i]);
					}		
				}
			}
		}
		*/
		
		System.out.println(" --------- 배열형태로 만들어줌 ------------- ");
		System.out.println(" --------- String.split() ------------- ");
		String cardNo = "2345-2222-54444-112234";
		String ssn = "202121-1482398";
		String nameList = "김경호, 신명숙, 이은희, 정봉화, 신명숙";
		String[] cardNoArray = cardNo.split("-");
		String[] ssnArray = ssn.split("-");
		String[] nameArray = nameList.split(",");
		
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(i+"-->"+cardNoArray[i]);
		}
		for (int i = 0; i < ssnArray.length; i++) {
			System.out.println(i+"-->"+ssnArray[i]);
		}
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(i+"-->"+nameArray[i]);
		}
		
		System.out.println("------------String.replace()------");
		String str3 = "우리는 자바를 공부합니다. 자바는 객체지향언어입니다. 자바를 자바라!";
		String result3 = str3.replace('자', '저');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3.replaceFirst("자바", "파이썬"));
		
		System.out.println("--- String.toUppercase, toLowercase ----");
		System.out.println("jaVA".toUpperCase());
		System.out.println("jaVA".toLowerCase());
		
		System.out.println("--- equals, equalsIgnoreCase ---");
		System.out.println("yes".equals("YES"));
		System.out.println("yes".equalsIgnoreCase("Yes"));
		
		System.out.println("--- String.indexOf() ----");
		String fileName = "xxx.gif";
		int dotIndex = fileName.indexOf(".");
		System.out.println(dotIndex);
		String fileNameNoExt = fileName.substring(0,dotIndex);
		String fileExt = fileName.substring(dotIndex+1);
		System.out.println(fileNameNoExt+"   "+fileExt);
		String copyFilename = fileNameNoExt+"-복사본."+fileExt;
		System.out.println(copyFilename);
		
	}

}
