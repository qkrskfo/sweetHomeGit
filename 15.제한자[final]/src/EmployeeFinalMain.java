
public class EmployeeFinalMain {

	public static void main(String[] args) {

		Employee[] emps = {
				new SalaryEmployee(1, "KIM", 30000000),
				new SalaryEmployee(2, "JIM", 28000000),
				new SalaryEmployee(3, "LIM", 10000000),
				new PartTimeWorker(4, "MIN", 100, 20000),
				new PartTimeWorker(5, "NIM", 100, 8000)	
		};
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].calculatePay();
			System.out.println("--------"+emps[i].getName()+"님의 급여명세표------");
			emps[i].print();
			double incentive = emps[i].calculateIncentive();
			System.out.println("\t인센티브:"+incentive);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("사원 인센티브율: "+Employee.INCENTIVE_RATE);

	}

}
