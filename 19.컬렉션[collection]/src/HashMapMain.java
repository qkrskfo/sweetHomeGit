import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {

		HashMap carMap = new HashMap();
		System.out.println("map size: "+carMap.size());
		System.out.println("---- 1. put ----");
		Car c1 = new Car("1111", 12);
		carMap.put("1111", 12);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 20));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		/*
		 * 동일한(equals) 키값은 존재하지 않음
		 * 키객체가 동일(equals)하면 값객체가 바뀐다.
		 */
		carMap.put("3333", new Car("삼삼삼", 15));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		carMap.put("6666", new Car("6666", 21));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		
		System.out.println("---- 2. get ----");
		Car getCar = (Car)carMap.get("3333");
		getCar.print();
		
		
		System.out.println("---- 3. remove ----");
		Car removeCar = (Car)carMap.remove("3333");
		removeCar.print();
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println();
		System.out.println("============ 업무 실행 ============");
		System.out.println("1.전체 차량출력");
//		carMap.keySet().iterator();
	
		System.out.println();
		System.out.println("2.입차");
		carMap.put("3243", new Car("3243", 6));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println();
		System.out.println("3.차량번호 3243번  차한대 정보출력");
		getCar = (Car)carMap.get("3243");
		getCar.print();
		
		System.out.println();
		System.out.println("4.입차시간 10시이후 차량여러대 찾아서 정보출력");
		
		System.out.println();
		System.out.println("5.3243번차량 12시 출차");
		getCar = (Car)carMap.get("3243");
		getCar.setOutTime(12);
		getCar.calculateFee();
		getCar.print();
		// 출차니까 나가야지
		carMap.remove("3243");
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		
	}

}
