package com.itwill05.service.car;

public class CarService2 {
	
	private Car[] carArray;
	
	public CarService2() {
		carArray=new Car[30]; // 디폴트로하면 30개
	}
	public CarService2(int count) {
		carArray=new Car[count]; // 숫자를 넣으면 넣은만큼 생성되게 한 것.
	}
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public void ipCha(Car car) {
		//boolean isSuccess = false;
		/*
		 * 1.주차구역 확보(주차장 만차인지 체크)
		 * 2.차량번호 중복체크
		 */
		
		/*
		Car[] tempCar = new Car[carArray.length];
		for (int i = 0; i < carArray.length; i++) {
			tempCar[i] = carArray[i];
			if(tempCar[i]==null) {
					tempCar[i] = car;
					break;
			}
		}
		this.carArray = tempCar;
		
		int count = 0;
		
		Car[] tempCar = new Car[carArray.length];
		for (int i = 0; i < carArray.length; i++) {
			tempCar[i] = carArray[i];
			if(tempCar[i]==null) {
				if(carArray[i]!=null && !carArray[i].getNo().equals(car.getNo())) {
					tempCar[i] = car;
					break;
				} else {
					isSuccess = false;
				}
			}
		}
		this.carArray = tempCar;
		*/
		/*
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i] == null) {
				if(carArray[i]!=null && !carArray[i].getNo().equals(car.getNo())) {
					carArray[i] = car;
					isSuccess = true;
					break;
				} else {
					isSuccess = false;
				}
			}
		}
		*/

	}
	
	/*
	1. 전체차량출력
	*/
	public void print(){
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
	}
	/*
	2. 주차구획수반환
	*/
	public int totalArea() {
		int total = 0;
		total = carArray.length;
		return total;
	}
	
	/*
	3. 주차가능주차구획수반환
	*/
	public int parkingArea() {
		int area = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				area++;
			}
		}
		return area;
	}
	
	/*
	4. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	*/
	public Car findCarNo(String noStr) {
		Car findCar = null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(noStr)) {
				findCar = carArray[i];
				break;
			}
		}
		return findCar;
	}
	
	
	
	/*
	5. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	*/
	
	public Car[] findByIpCha(int ipChaTime) {
		Car[] findIpChaTime = null;
		
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getInTime()==ipChaTime) {
				count++;
			}
		}
		
		findIpChaTime = new Car[count];
		
		int idx = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getInTime()==ipChaTime) {
				findIpChaTime[idx] = carArray[i];
				idx++;
			}
		}
		
		return findIpChaTime;
	}
	
	
	/*
	6. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	*/
	/*
	public void chulCha(String noStr, int chulChaTime) {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(noStr)) {
				carArray[i].setOutTime(chulChaTime);
				carArray[i].calculateFee();
				carArray[i] = null;
				break;
			}
		}
	}
	*/
	public Car chulCha(String noStr, int chulChaTime) {
		Car carChulCha = null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo().equals(noStr)) {
				carArray[i].setOutTime(chulChaTime);
				carArray[i].calculateFee();
				carChulCha = carArray[i];
				carArray[i] = null;
				break;
			}
		}
		Car[] tempBox = new Car[carArray.length-1];
		int tempIdx = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				tempBox[tempIdx] = carArray[i];
				tempIdx++;
			}
		}
		carArray = tempBox;
		return carChulCha;
	}

	
}
