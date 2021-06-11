
public class CalculatorStaticMain {

	public static void main(String[] args) {
		
		/*
		Calculator calculator=new Calculator();
				  
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(45435,34);
		System.out.println(result);
		 */ // Calculator를 private로 막아놔서 위에껀 못씀. 아래로만 쓸 수 있음
		
		System.out.println("----- static method ----");
		System.out.println(Calculator.add(23,34));
		System.out.println(Calculator.sub(23,34));
		System.out.println(Calculator.mul(23,34));
		System.out.println(Calculator.div(23,34));
		
	}

}
