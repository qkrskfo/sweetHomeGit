
public class CarMemberFieldMain {

	public static void main(String[] args) {

		/*
		 * 1. 차량 입차 1234번 차량 12시
		 */
		
		// 차 객체 주소를 저장할 참조변수선언
		Car car; // 클래스이름 식별자;
		// Car클래스를 사용해서 객체를 생성한 후 car변수에 대입
		car = new Car(); // Car(); 생성자 // car = 는 객체 생성
		
		// car(차 객체) 의 no 라는 이름의 멤버필드(변수)
		car.no="1234";
		car.inTime=12;
		
		/*
		 * 2. 16시에 car차량 출차 1234 차량 출차
		 */
		
		// car(차 객체)의 outTime 멤버필드(변수)에 16 대입
		car.outTime = 16;
		
		// 주차 요금 계산
		// car의 fee 멤버필드(변수)에 계산 후 대입
		car.fee = (car.outTime-car.inTime)*1000;
		
		// 이제는 모든 데이터가 객체 안에 있을거야...
		
		// 영수증 출력
		System.out.println("-----------------------------------");
		System.out.println("차량번호 입차시간 출차시간 주차요금");		
		System.out.println("-----------------------------------");
		System.out.println("  "+car.no+"\t"+"    "+car.inTime+"\t"+"     "+car.outTime+"\t"+"     "+car.fee);
		
		
		
		
		
	}

}
