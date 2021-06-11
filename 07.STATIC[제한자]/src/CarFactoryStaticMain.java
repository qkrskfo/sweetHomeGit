
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		
		Car.count=0;
		Car car1 = new Car(1, "X6", "black");		
		Car car2 = new Car(2, "Porshe", "yellow");
		Car car3 = new Car(3, "Volvo", "white");
		
		Car.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
		System.out.println();
		System.out.println("차량의 생산대수는 "+Car.count);
		/*
		The static field Car.count should be accessed in a static way
			System.out.println("차량의 생산대수는 "+car1.count);
			System.out.println("차량의 생산대수는 "+car2.count);
		*/
	}

}
