public class IfTest2 {

	public static void main(String[] args) {

		int x = 21;
		int y = 30;
		
		if (x>y) {
			System.out.println("true --> 21 > 30");
		} else {
			System.out.println("false --> 21 > 30");
		}

		if (x<y) {
			System.out.println("true --> 21 < 30");
		} else {
			System.out.println("false --> 21 < 30");
		}
		
		if(x==y) {
			System.out.println("true --> 21 == 30");
		} else {
			System.out.println("false --> 21 == 30");
		}
		
		if(x!=y) {
			System.out.println("true --> 21 != 30");
		} else {
			System.out.println("false --> 21 != 30");
		}
		
		System.out.println("-----블록 안에 선언된 변수의 범위(scope)-----");
		// 블록 안에서만 유효하지!
		// 지역변수 : 메인블럭 안에서 정의된. 메인블럭이 실행될때만 의미 있는 변수.
		
		
		int kor = 90;
		if(kor>=90) {
			char grade = 'A';
			String msg = "참 잘했어요!!";
			System.out.println("kor="+kor);
			System.out.println("grade="+grade);
			System.out.println("msg="+msg);
		}
		
		System.out.println("kor="+kor);
//		System.out.println("grade="+grade); -> 얘는 if블록에서 정의되고 끝났쟈나~!
//		System.out.println("msg"+msg); -> 얘도!
		
		return; //실행흐름 되돌려줌 - 여기엔 리턴이 생략되어있어~! 자동리턴! 
	} // end main // 실행흐름이 리턴됨. 되돌려줌.

}