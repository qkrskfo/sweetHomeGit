
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
		System.out.println(isPlay);
		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		
		int kor = 78;
		boolean isValid = !(kor<0 || kor>100);
		System.out.println(kor + "-->" + isValid);
		/*
		 * 증가 감소 연산자
		 *  ++,-- (리터럴값은 안되고 변수만 됨)
		 *  변수가 있다면 a++, ++a, --a, a++
		 *  4++ < 리터럴값이므로 증가감소연산자를 사용할 수 없다.
		 */
		
		int i = 5;
		int j = 5;
		
		i++;                  //37과38라인은 같은 연산
		//i = i+1;
		j--;
		//j = j-1;
		System.out.println(i);
		System.out.println(j);
		
		i = 5;
		j = 5;
		++i;
		--j;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------- i++, j-- ----------------------");
		i = 5;
		j = 5;
		int ir = i++;  //ir값은 5 i 값은 6이된다 ++이 뒤에 들어갈경우 ir = i부터 연산됨
		int jr = j--;  //jr값은 5 j 값은 4가된다 --이 뒤에 들어갈경우 jr = j부터 연산됨
		System.out.println(ir);
		System.out.println(jr);
		System.out.println("----------- ++i, --j ----------------------");
		i = 5;
		j = 5;
		ir = ++i;
		jr = --j;
		System.out.println(ir);
		System.out.println(jr);
		
		
		
		

	}

}
