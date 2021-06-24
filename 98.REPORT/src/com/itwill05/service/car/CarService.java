package com.itwill05.service.car;

public class CarService {
	
	private Car[] carArray;
	
	public CarService() {
		carArray=new Car[30]; // 디폴트로하면 30개
	}
	public CarService(int count) {
		carArray=new Car[count]; // 숫자를 넣으면 넣은만큼 생성되게 한 것.
	}
	
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/

	public int ipCha(Car car) {

		int status = 0;
		/*
		 * 1.주차구역 확보(주차장 만차인지 체크) 
		 * 2.차량번호 중복체크 
		 * 3. 입차
		 */

		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				status = 1;

				if (carArray[i].getNo() == car.getNo()) {
					status = 2;
					break;
				}
				
			} else {
				status = 3;
				carArray[i] = car;
				break;
			}
		}
		return status;
	}
	
//	public int ipCha(Car car) {
//
//        int status = 0;
//        int duptime = -1;
//        Car tempcar = new Car();
//        /*
//         * 1.주차구역 확보(주차장 만차인지 체크)
//         * 2.차량번호 중복체크
//         */
//        // 효율에 대해서 따져보자~
//        // 자리 있으면 그 놈 바로 집어넣으면 되는데 왜 끝까지 돌게해?
//        // 차번호를 확인해서 같으면 중복이 이미 있어요! 바로 종료
//        // 끝까지 돌았음에도 자리가 없다 => 종료
//        // 다양한 변수 활용해서 자세한 정보 주기 tempcar 활용
//        for (int i = 0; i < carArray.length; i++) {
//        	tempcar = car;
//        	
//            if(carArray[i] == null) {
//                status = 3;
//                break;
//            } else if(carArray[i].getNo()==car.getNo()) {
//                status = 2;
//                duptime = carArray[i].getInTime();
//                break;
//            } else {
//                status = 1;
//            }
//        }
//
//        switch (status) {
//        case 1:
//            System.out.println("주차장이 만차입니다.");
//            break;
//        case 2:
//            System.out.println("'"+tempcar.getNo()+"'의 차량이 이미 "+ duptime +"시에 입차하였기 때문에 주차할 수 없습니다.");
//            break;
//        case 3:
//            for (int i = 0; i < carArray.length; i++) {
//                if(carArray[i] == null) {
//                	System.out.println("'"+tempcar.getNo()+"' 차량이 정상적으로 "+tempcar.getInTime() +"시에 입차 성공하였습니다.");
//                    carArray[i] = car;
//                    break;
//                }
//            }
//        }
//
//        return status;
//
//    }
	
	
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
			if(carArray[i]!=null && carArray[i].getNo().equals(noStr)) {
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
			if(carArray[i]!=null && carArray[i].getInTime() > ipChaTime) {
				count++;
			}
		}
		
		findIpChaTime = new Car[count];
		
		int idx = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime() > ipChaTime) {
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
			if(carArray[i]!=null && carArray[i].getNo().equals(noStr)) {
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
