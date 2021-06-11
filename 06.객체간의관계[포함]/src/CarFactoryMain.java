
public class CarFactoryMain {

	public static void main(String[] args) {
/*
		Engine x6engine = new Engine();
		x6engine.type = "A";
		x6engine.cc = 5000;
		
		Car car1 = new Car();
		car1.no = 1;
		car1.model = "X6";
		
			
		car1.engine = x6engine; // x6engine 객체를 포함하는 car1.engine
		// x6engine은 더이상 사용하지 않고 car1.engine 으로 핸들링하게됨.
		
*/
		
		Engine sm7Engine = new Engine("C", 3000);
		
		Car sm7Car = new Car();
		sm7Car.setNo(1);
		sm7Car.setModel("SM7");
		sm7Car.setEngine(sm7Engine);
		sm7Car.print();
		

	}

}
