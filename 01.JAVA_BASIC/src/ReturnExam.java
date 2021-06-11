public class ReturnExam {

	public static void main(String[] args) {

		int eng = -45;
		if(eng < 0 || eng > 100) {
			System.out.println("점수는 0~100사이의 정수여야합니다.");
			return;
		} 
		System.out.println("당신의 학점은 A+입니다.");
		return;
	}

}