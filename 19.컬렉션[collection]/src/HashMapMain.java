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
		
		
		
	}

}
