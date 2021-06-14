package lang;

public class MathMain {

	public static void main(String[] args) {

		/*
		Math 클래스
		   - 수학함수를 가지고있는클래스
		   - 모든 메쏘드 static 이다.
		   - 객체생성이 불가능
		      (생성자 접근제한자 private)
		The constructor Math() is not visible 
		Math math=new Math();
		 */
		
		double r = Math.abs(-4494.569);
		System.out.println(r);
		System.out.println(Math.max(34, 100));
		System.out.println(Math.min(34, 100));
		System.out.println(Math.round(33.456)); //반올림함수. 소수점 안나옴
		System.out.println(Math.round(33.456*10)/10.0); //반올림함수. 소수점 안나옴
		System.out.println(Math.sqrt(2)); //square root 제곱근 어떤 수 x를 제곱하여 a가 되었을 때의 x값
		System.out.println(Math.sin(90)); // 한 각에 대한 사인값 반환. 직각 삼각형에서 대변의 길이를 사변으로 나누어준 것
		System.out.println(Math.sin(3.1415926/2)); 
		System.out.println(Math.PI);
		System.out.println();
		System.out.println("-----Math.random()-----");
		System.out.println("로또를 만들어서 대박을 내보자");
		/*
		 * public static double random()
		 */
		System.out.println(Math.random());
		System.out.println("1~10사이의 정수 랜덤 생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println("1~45사이의 정수 랜덤 생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);

		
	}
}
