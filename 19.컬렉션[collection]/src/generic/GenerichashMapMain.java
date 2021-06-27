package generic;

import java.util.HashMap;
import java.util.Iterator;

public class GenerichashMapMain {

	public static void main(String[] args) {

		HashMap<String, Car> carMap = new HashMap<String, Car>(); 
		// Key 랑 Value의 약자
		
		System.out.println("#map size: "+carMap.size());
		System.out.println("-------- 1. put --------");
		carMap.put("1111", new Car("1111", 12));
		carMap.put("2222", new Car("2222", 10));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 20));
		
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		
		carMap.put("3333", new Car("삼삼삼삼", 16));
		
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("-------- 2. get --------");
		Car getCar = carMap.get("3333");
		getCar.print();
		getCar = carMap.get("4444");
		getCar.print();
		getCar = carMap.get("9999");
		// key가 존재하지 않으면 null 이됨
		if(getCar!=null) {
			getCar.print();
		}
		
		System.out.println("-------- 3. remove --------");
		Car removeCar = carMap.remove("3333");
		removeCar.print();
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("1.전체 차량출력????");
		Iterator<String> keyIterator = carMap.keySet().iterator(); 
		// key가 string이니까 String 으로 받는것
		Car.headerPrint();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Car tempCar = carMap.get(key);
			tempCar.print();
		}
		System.out.println("2. 입차");
		Car c1 = new Car("2389", 3);
		carMap.put(c1.getNo(), c1);
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("3.차량번호 2389번  차한대 정보출력");
		Car infoCar = carMap.get("2389");
		infoCar.print();
		
		System.out.println("4.입차시간 15시이후 차량여러대 찾아서 정보출력??????");
		Iterator<String> keyIterator2 = carMap.keySet().iterator();
		while(keyIterator2.hasNext()) {
			String key = keyIterator2.next();
			Car tempCar = carMap.get(key);
			if(tempCar.getInTime()>=15) {
				tempCar.print();
			}
		}
		
		System.out.println("5.2389번차량 12시 출차");
		Car outCar = carMap.get("2389");
		outCar.setOutTime(12);
		outCar.calculateFee();
		Car.headerPrint();
		outCar.print();
		carMap.remove("2389");
		
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println(" ### Iteration 전체출력 ###");
		Iterator<String> keyIterator3 = carMap.keySet().iterator();
		while (keyIterator3.hasNext()) {
			String key = (String) keyIterator3.next();
			carMap.get(key).print();
		}
	}

}
