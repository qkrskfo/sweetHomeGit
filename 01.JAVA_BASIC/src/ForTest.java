
public class ForTest {

	public static void main(String[] args) {

		System.out.println("---------while----------");
		
		int k = 0;
		while(k<10) {
			System.out.println("k="+k);
			k++;
		}
		System.out.println();
		
		System.out.println("---------for--i 증가--------");
		
//		for(①변수초기화, ②비교조건설정, ④증가)
//			③실행
//			--> 1-2-3-4-2-3-4-2-3-4 순으로
//		    --> 일을 하고 난 다음에 증가시킴
		for(int i=0; i<10; i++) {
			System.out.println("i="+i);
		}
		System.out.println();
		System.out.println("---------for--i 감소--------");
		for(int i=10; i>0; i--) {
			System.out.println("i="+i);
		}
		System.out.println();
		System.out.println(">> 짝수 출력[1~10]");
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");	
			}			
		}
		System.out.println();
		System.out.println(">> 홀수 출력[1~10] continue");
	
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				continue; // 현재 실행문 이후 블록을 더이상 실행하지 않고 다음번 블록을 실행
			} 
			System.out.print(i+" ");			
		}
		
		System.out.println();
		System.out.println(">> 4의 배수 출력[1~10] continue");	
		for(int i=1; i<=100; i++) {
			if(i%4!=0) {
				continue; // 현재 실행문 이후 블록을 더이상 실행하지 않고 다음번 블록을 실행
			} 
			System.out.print(i+" ");			
		}
		
				
		System.out.println();
		System.out.println(">> 3, 4의 공배수[1~100]");
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println(">> 3, 4의 최소 공배수[1~100]");
		// 첫번째 조건이 만족하면 그만돌리고 탈출해야되자나
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
				break; //현재 실행문 이후 블록을 더이상 실행하지 않고 반복루프를 종료한다
			} 
		}
		
		System.out.println();
		System.out.println(">> 홀수, 짝수의 합[1~100]");
		int total = 0;
		int oddTotal = 0;
		int evenTotal = 0;
		for(int i = 1; i<=100; i++) {
			total += i;
			if(i%2==0) {
				oddTotal += i;
			} else {
				evenTotal +=i;
			}
		}
		System.out.println("전체합"+total);
		System.out.println("홀수합"+oddTotal);
		System.out.println("짝수합"+evenTotal);
		
		
		System.out.println("--- 문자 출력 ---");
		for(char c='a'; c<='z'; c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
		}
		System.out.println();
		
	}

}
