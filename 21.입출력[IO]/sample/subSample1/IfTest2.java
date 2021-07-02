
public class IfTest2 {

	public static void main(String[] args) {
		int x = 21;
		int y = 30;

		if (x > y) {
			System.out.println("true -->  21 > 30");
		} else {
			System.out.println("false -->  21 > 30");
		}
		if (x < y) {
			System.out.println("true --> 21 < 30");
		} else {
			System.out.println("false --> 21 < 30");
		}
		if (x == y) {
			System.out.println("true --> 21==31");
		}
		if (x != y) {
			System.out.println("true --> 21 != 30");
		}
		System.out.println("------------블록안에서 선언된 변수의 범위(scope)--------------");
		int kor = 90; //로컬변수 : 메소드블록내에 선언된 변수 
		if(kor >= 90) {
			char grade = 'A';
			String msg = "참 잘했어요!!!";
			System.out.println("kor = " + kor);
			System.out.println("grade = " + grade);
			System.out.println("msg = " + msg);

		}
		System.out.println("kor = " + kor); 
		//System.out.println("grade = " + grade); grade변수를 쓸수없는이유는 if블록내에 없기때문이다.
		//System.out.println("msg = " + msg); 위와 동일한데 에러는 : msg cannot be resolved to a variable
		
		
		
		
		
		//main 메소드 블록이 끝나기전에 return; 이 생략되어있음(실행흐름이 리턴)
	} //end main   <실행흐름이 리턴된다(되돌려줌)

}
