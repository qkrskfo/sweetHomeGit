
public class CarEncapsulationMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.setIpChaData("1244", 12);
		Car car2 = new Car();
		car2.setIpChaData("3342", 14);
		
		// 4시간 후
		car1.setOutChaData(20);
		car2.setOutChaData(20);
		
		car1.calculateFee();
		car2.calculateFee();
		
		car1.headerPrint();
		car1.print();
		car2.print();
		
		/*
		 * car1의 주차요금을 출력
		 */
		int parkingFee = car1.getFee();
		System.out.println();
		System.out.println("car1의 주차요금은 "+parkingFee+"원 입니다.");
		
	}

}
