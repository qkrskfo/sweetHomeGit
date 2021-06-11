public class IfTest1 {

	public static void main(String[] args) {

		System.out.println("☆stmt1");
		
		boolean condition = true;
		
		// condition값이 위에 false니까, if문은 실행되지 않겠지?!
		// if문은 true일때만 실행되잖아.
		if(condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		} // end if
		
		System.out.println("☆stmt5");
	
		if (condition) {
			System.out.println("stmt6");
			System.out.println("stmt7");
		} else {
			System.out.println("stmt8");
			System.out.println("stmt9");
		}
		
		System.out.println("stmt☆10");
		
		if(condition)
			System.out.println("stmt11");
		
		System.out.println("stmt☆12");
		
		if(condition)
			System.out.println("if - stmt13");
		else
			System.out.println("else - stmt14");
		System.out.println("stmt☆15");
		
	} // end main

} // end class