public class WhileUse {

	public static void main(String[] args) {

		System.out.println("---10회 반복---");
		
		int i = 0;
		while(i<10) {
			System.out.println("반복될 statement : "+i);
			i++;
		}
		
		
		System.out.println("--- 1~10사이의 정수 출력 ---");
		i = 0;
		while(i<10) {
			int no = i+1;
			System.out.print(no+" ");
			i++;
		}
		
		System.out.println(); // 엔터기능을 위해
		System.out.println("--- 1~10 사이의 정수 출력 ---");
		i = 1;
		while(i<=10) {
			System.out.print(i+", ");
			i++;
		}
		
		System.out.println(); // 엔터기능을 위해. 이거 안하면 다음것도 옆으로 나옴ㅋㅋ
		System.out.println("--- 1~10사이의 정수 중 홀수만 출력 ---");
		
		i = 1; // i를 위에서 계속 썼으니까 다시 초기화 시켜야지
		while(i<=10) {
			if(i%2==1) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println("--- 1~10사이의 정수 중 4의 배수만 출력 ---");
		
		i=1;
		while(i<=10) {
			if(i%4==0) {
				System.out.print(i+"  ");
			}
			i++;
		}
		System.out.println();
		System.out.println("--- 1~100사이의 정수출력 ---");
		
		i=1;
		while(i<=100) {
			System.out.print(i+"\t"); // 역슬래쉬t 는 1tap 만큼 떨어뜨려줘 하는것과 같음.
			if(i%10==0) {
				System.out.println();
			}			
			i++;
		}
		
		System.out.println();
		System.out.println("--- 1~100사이의 정수 중 3의 배수이면서 4의 배수인 수 출력 ---");
		i=1;
		while(i<=100) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+"\t");
			}
			i++;
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 * 1 ~ 100 사이의 정수합
		 * 1~100 사이의 홀수합, 짝수합 따로
		 */
		
		i=1;
		int total=0;
		int evenTotal = 0;
		int oddTotal = 0;
		while(i<=100) {
			if(i%2==0) {
				evenTotal += i; 
			}else {
				oddTotal += i; 
			}
			// 전체합
			total+=i; // total = i + total; 
			i++;			
		}
		System.out.println("1~100사이의 짝수합: "+evenTotal);		
		System.out.println("1~100사이의 홀수합: "+oddTotal);
		System.out.println("1~100사이의 정수합: "+total);
		System.out.println();
		
		/*
		 * 문자 출력
		 */
		
		char c1 = 0;
		System.out.print(c1);
		while(c1 < 65535) {
			System.out.print(c1);	
			if(c1%200==0) {
				System.out.print("\n");				
			}
			c1++;
//			if(c1%100==0) {
//				System.out.print("\n");				
//			}
		}
		
		/*
		 * 영문 소문자 출력
		 */
		System.out.println();System.out.println();
		char c2 = 'a';
		while(c2<='z') {
			System.out.print(c2);
			c2++;
		}
		System.out.println();
		
		
		/*
		 * Quiz
		 * 1. 한글출력
		 * 2. 영문대문자
		 * 3. 숫자형문자(0~9)
		 * 
		 */
		System.out.println();
		System.out.println();
		
		System.out.println("한글출력");
		char k1 = '가';
		while(k1<='R') {
			System.out.print(k1);
			if(k1%50==0) {
				System.out.println();
			}
			k1++;
		}
		System.out.println();
		
		System.out.println("영문 대문자 출력");
		char e1 = 'A';
		while(e1<='Z') {
			System.out.print(e1);
			e1++;
		}
		System.out.println();
		
		System.out.println("숫자형 문자 출력");
		char n1 = '0';
		while(n1<='9') {
			System.out.print(n1);
			n1++;
		}
		System.out.println();
		
		
	}

}