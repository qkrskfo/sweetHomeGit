public class Switchuse {

	public static void main(String[] args) {

		/*
		 * 짝수, 홀수 판별
		 */

		int number = 23;
		switch(number%2) {
		case 0:
			System.out.printf("%d는 짝수입니다.%n",number);
			break;
		case 1:
			System.out.printf("%d는 홀수입니다.%n",number);
			break;
		}
		
		
		/*
		 * 4의 배수 판별
		 */
		
		int number2 = 400;
		switch(number2%4) {
		case 0:
			System.out.printf("%d는 4의 배수입니다.%n",number2);
			break;
		default:
			System.out.printf("%d는 4의 배수가 아닙니다.%n",number2);
			break;
		}
		
		/*
		 * 문자 비교
		 * A : left
		 * D : right
		 * W : up
		 * Z : down
		 * S : rotate
		 */
		
		char direction = 'Z';
		
		switch (direction) {
		case 'A':
			System.out.println("<<<left");
			break;
		case 'D':
			System.out.println("right>>>");
			break;
		case 'W':
			System.out.println("up↑↑↑");
			break;
		case 'Z':
			System.out.println("down↓↓↓");
			break;
		case 'S':
			System.out.println("rotate◎◎◎");
			break;
		default:
			System.out.println("nothingXXX");
			break;
		}
		
		
	}

}