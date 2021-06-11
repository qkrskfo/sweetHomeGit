public class IfNested {

	public static void main(String[] args) {

		System.out.println(56496/3);
		int kor = -56;
		char hakjum = ' '; // 공백도 스페이스 한번만 써야함. 두번쓰면 에러야!
		
		if(kor<0 || kor>100) {
			System.out.println("점수를 정상적으로 입력하세요");
			return;
		}
		
		if(kor>=90) {
			hakjum = 'A';
		} else {
			if(kor>=80) {
				hakjum = 'B';
			} else {
				if(kor>=70) {
					hakjum='C';
				} else {
					if(kor >=60) {
						hakjum = 'D';
					} else {						
							hakjum = 'F';						
					}
				}
			}
		}		
		
		System.out.printf("1. 학점은 %c입니다. %n",hakjum);

		
		hakjum = ' ';
		
		if(kor>=90) {
			hakjum = 'A';
		}else if(kor>=80) {
			hakjum = 'B';
		}else if(kor>=70) {
			hakjum='C';
		}else if(kor>=60) {
			hakjum = 'D';
		}else {
			hakjum = 'F';
		}
		
		System.out.printf("2. 학점은 %c입니다. %n",hakjum);
		
		
		/*
		 * Quiz : 각 학점별로 메시지 출력
		 * A(98점 이상) : 최우수
		 * A : 우수
		 * B : 선방
		 * C : 으이그~~
		 * D : 재수강
		 * F : ㅠㅠ
		 */
		
		int score = 30;
		char quizGrade = ' ';
		
		if(score>=98) {
			quizGrade = 'A';
			System.out.printf("학점: %c 최우수",quizGrade);
		} else if(score>=90) {
			quizGrade = 'A';
			System.out.printf("학점: %c 우수",quizGrade);
		} else if(score>=80) {
			quizGrade = 'B';
			System.out.printf("학점: %c 선방",quizGrade);
		} else if(score>=70) {
			quizGrade = 'C';
			System.out.printf("학점: %c 으이그~~",quizGrade);
		} else if(score>=60) {
			quizGrade = 'D';
			System.out.printf("학점: %c 재수강",quizGrade);
		} else {
			quizGrade = 'F';
			System.out.printf("학점: %c ㅠㅠ",quizGrade);
		}
	}

}