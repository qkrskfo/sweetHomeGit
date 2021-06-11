/*
		 단항연산자
		     - 증가,감소연산자
			   ex> i++ , i-- , ++i , --i 
             - 자기자신의값을 정수 1만큼 증가시키거나 감소시키는 연산자
*/

public class OperatorUnary {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int ar = -a;
		int br = +b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean isPlay = false;
		System.out.println(isPlay);
		isPlay = !isPlay;
		// 단항 연산자 앞에 not 연산자 느낌표(!) 를 하면, 트루는 펄스로, 펄스는 트루가됨.
		System.out.println(isPlay);
		
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);

		int kor = 78;
		boolean isValid = !(kor<0 || kor>100); // 느낌표를 넣어 반전시키기!
		System.out.println("국어점수: "+kor+"점 유효성 체크 >> "+isValid);
		
		/*
		 * 증가, 감소 연산자
		 *  ++ , --
		 *  (변수만 가능)
		 *   a++, ++a, a--, --a
		 *   
		 */
		
		int i = 5;
		int j = 5;
		i++; // i = i + 1;
		j--; // j = j - 1;
		
		System.out.println(i);
		System.out.println(j);
		
		i = 5;
		j = 5;
		
		++i;
		--j;
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------------------------------");
		
		i = 5;
		j = 5;

		// 대입연산자를 썼을 때 증감연산자보다 대입이 먼저 진행됨.
		int ir = i++;
		int jr = j--;
		
		System.out.println(ir);
		System.out.println(jr);
		System.out.println(i);
		System.out.println(j);
		
System.out.println("----------------------------------");
		
		i = 5;
		j = 5;

		// 대입연산자를 썼을 때 증감연산자보다 대입이 먼저 진행됨.
		// 대입을 먼저!!
		
		ir = ++i;
		jr = --j;
		
		System.out.println(ir);
		System.out.println(jr);
		System.out.println(i);
		System.out.println(j);
		
		
		
	}

}