package com.itwill05.service.car;

public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService=new CarService(65);
		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		carService.ipCha(new Car("2344", 3));
		carService.ipCha(new Car("1662", 4));
		carService.ipCha(new Car("8789", 5));
		carService.ipCha(new Car("9655", 6));
		carService.ipCha(new Car("2436", 7));
		carService.ipCha(new Car("5788", 8));
		carService.ipCha(new Car("1790", 9));
		carService.ipCha(new Car("4589", 10));
		
		boolean isSuccess = carService.ipCha(new Car("2344", 10));
		if(!isSuccess) {
			System.out.println("만차이거나 차량번호가 중복됩니다");
		}
		
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		// return타입 integer
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		System.out.println("4.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		System.out.println("5.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		System.out.println("6.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜주고 출차차량참조변수반환해줘");
		
	}

}