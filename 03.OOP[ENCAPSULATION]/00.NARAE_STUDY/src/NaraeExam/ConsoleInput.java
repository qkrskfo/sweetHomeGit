package NaraeExam;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요: ");
		int kor = console.nextInt();
		
		System.out.println("영어점수를 입력하세요: ");
		int eng = console.nextInt();
		
		System.out.println("수학점수를 입력하세요: ");
		int math = console.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3;
		
		System.out.println("당신이 입력한 점수의 합계는 "+total+"점 입니다.");
		System.out.println("당신의 평균 점수는 "+avg+"점 입니다.");

		// print 로 받으면 옆에서 입력받고
		// println 으로 받으면 한줄 밑에서 입력받게됨.
		
	}

}
