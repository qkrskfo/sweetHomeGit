
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("-----------차량 입차 / 출차-----------");
		Car car1 = new Car("5466", 7);
		
		car1.setOutTime(12);
		car1.calculateFee();
		car1.headerPrint();
		car1.print();
		
		Car car2 = new Car();
		car2.setIpChaData("7663", 10);
		car2.setOutChaData(14);		
		car2.calculateFee();
		car2.print();

		System.out.println();
		System.out.println("-----------오늘 주차장 이용현황 출력-----------");
		Car carA = new Car("2469", 2, 6, 4000);
		Car carB = new Car("3487", 8, 13, 7000);
		Car carC = new Car("9866", 9, 19, 10000);
		Car carD = new Car("7513", 7, 12, 5000);
		Car carE = new Car("3485", 13, 21, 8000);

		carA.headerPrint();
		carA.print();
		carB.print();
		carC.print();
		carD.print();
		carE.print();
	}

}
