
public class CarTestMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.setIpChaData("2233", 10);
		car1.setOutChaData(15);
		car1.calculateFee();
		System.out.println(car1);
		

	}

}
