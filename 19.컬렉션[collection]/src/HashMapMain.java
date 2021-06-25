import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {

		HashMap carMap=new HashMap();
		System.out.println("map size:"+carMap.size());
		
		System.out.println("--------------1.put---------------");
		Car c1=new Car("1111", 12);
		carMap.put("1111", c1);
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 20));
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		/*
		 * 동일한(equals)키값은 존재하지않음
		 * 키객체가 동일하면(equals) 값객체가 바뀐다.
		 */
		carMap.put(new String("3333"), new Car("삼삼삼",23));
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("----------2.get------------");
		Car getCar = (Car)carMap.get("3333");
		getCar.print();
		System.out.println("----------3.remove------------");
		Car removeCar=(Car)carMap.remove("3333");
		removeCar.print();
		System.out.println("map size:"+carMap.size());
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("1.전체 차량출력????");
		Car.headerPrint();
		// map은 이터레이터 메소드가 없음.
		Iterator keyIter = carMap.keySet().iterator();
		while (keyIter.hasNext()) { // next가 없을떄까지 뽑아요
			String key = (String)keyIter.next();
			Car tempCar = (Car)carMap.get(key); // 오브젝트로 받아..
			tempCar.print();
		}
		
	
		System.out.println("2.입차");
		carMap.put("3243", new Car("3243", 6));
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		
		System.out.println("3.차량번호 3243번  차한대 정보출력");
		getCar=(Car)carMap.get("3243");
		getCar.print();
		
		System.out.println("4.입차시간 15시이후 차량여러대 찾아서 정보출력??????");
		// key값이 아닌이상 검색할 수 밖에 없어.
		Iterator keyIter2 = carMap.keySet().iterator();
		// 이터레이션 하는거야. 이터레이션 하는 방법임 위에 문장이.
		while(keyIter2.hasNext()) {
			String key = (String)keyIter2.next();
			Car tempCar = (Car)carMap.get(key);
			if(tempCar.getInTime()>=15) {
				tempCar.print();
			}
		}
		
		
		System.out.println("5.3243번차량 12시 출차");
		getCar=(Car)carMap.get("3243");
		getCar.setOutTime(12);
		getCar.calculateFee();
		getCar.print();
		// 출차니까 나가야지
		carMap.remove("3243");
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		
		
		System.out.println("####################iteration[전체출력]######################");
		Set keySet = carMap.keySet();
		System.out.println(keySet);
		Iterator keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = (String) keyIterator.next();
			System.out.println("ket-->"+key);
			Car tempCar=(Car)carMap.get(key);
			tempCar.print();
		}
	}

}
