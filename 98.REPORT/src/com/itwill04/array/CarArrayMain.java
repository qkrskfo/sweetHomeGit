package com.itwill04.array;
/*
 * 주차관리프로그램
 */
public class CarArrayMain {

	public static void main(String[] args) {
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		
		System.out.println();
		System.out.println("2.전체주차구획수: ");
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null)
				count++;
		}
		System.out.println(" - 주차된 구획수: "+count);
		System.out.println(" - 총 주차 구획수: "+carArray.length);
		
		
		System.out.println();
		System.out.print("3.주차가능주차구획수: ");
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 * 2.빈자리찾아서대입 // null을 찾아내서 넣어줘야지
		 */
		
				
		// 1대 입차
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i] = new Car("9024",14);
				break;
			}
		}
		
		/* 2대 입차.... 까진 대충해도.. 여러대 입차 너무 어려워요 ㅠ_ㅠ
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i] = new Car("9024",14);
				i++;
				if(carArray[i]==null) {
					carArray[i] = new Car("8888", 16);
					break;
				} else {
					i++;
				}				
			}			
		}
		*/
		
		System.out.print("9024 입차확인 - 주차가능주차구획수: ");
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("9024 입차확인 - 전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		
		
		System.out.println();
		System.out.println("5.차량번호 7789번  차한대 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals("7789")) {
				carArray[i].print();
				break;
			}
		}
		
		System.out.println();
		System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=10) {
				carArray[i].print();
			}
		}
		
		System.out.println();
		System.out.println("7.2389번차량 12시 출차");
		/*
		 * 1. 2389번차량찾기
		 * 2. 출차
		 * 3. 영수증출력
		 * 4. 주차에서 차량삭제
		 */
		
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getNo().equals("2389")) {
				carArray[i].setOutTime(12);
				carArray[i].calculateFee();
				carArray[i].print();
				carArray[i] = null;
				break;
			}
		}
		System.out.println();
		System.out.print("출차확인 - 주차가능주차구획수: ");
		count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("2389 출차확인 - 전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		
	}

}