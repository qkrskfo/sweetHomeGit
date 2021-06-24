package com.itwill05.service.car;

public class CarServiceMain {
	public static void main(String[] args) {
		CarService carService=new CarService(65);
		System.out.println("0.CarService객체야 차객체인자로줄께 입차시켜줘");
		int status = carService.ipCha(new Car("2344", 3));
		status = carService.ipCha(new Car("2344", 10));
		status =carService.ipCha(new Car("1662", 4));
		status =carService.ipCha(new Car("8789", 5));
		status =carService.ipCha(new Car("9655", 6));
		status =carService.ipCha(new Car("2436", 7));
		status =carService.ipCha(new Car("5788", 8));
		status =carService.ipCha(new Car("7891", 9));
		status =carService.ipCha(new Car("4567", 10));
		

		
		System.out.println("1.CarService객체야 전체차량출력해줘");
		carService.print();
		System.out.println("2.CarService객체야 전체주차구획수반환해줘");
		// return타입 integer
		int totArea = carService.totalArea();
		System.out.println(totArea);
		
		System.out.println("3.CarService객체야 주차가능주차구획수반환해줘");
		int parkingArea = carService.parkingArea();
		System.out.println(parkingArea);
		
		System.out.println("4.CarService객체야 차량번호(4567번) 인자로줄께  차객체한대 참조변수반환해줘");
		Car ss = carService.findCarNo("4567");
		ss.print();

		System.out.println("5.CarService객체야 입차시간(8시이후) 인자로줄께 차객체배열 참조변수반환해줘");
		Car[] ssz = carService.findByIpCha(8);
		for (int i = 0; i < ssz.length; i++) {
			ssz[i].print();
		}
		
		System.out.println("6.CarService객체야 차량번호(7891번) 출차시간(12시)인자로줄께 출차시켜주고 출차차량참조변수반환해줘");
		Car bye = carService.chulCha("7891", 12);
		bye.print();

	}

}