
public class EmployeeAbstractMain {

	public static void main(String[] args) {

		SalaryEmployee emp1 = new SalaryEmployee(1, "KIM", 30000000);
		PartTimeWorker emp2 = new PartTimeWorker(2, "Lim", 100, 20000);
		
		emp1.calculatePay();
		emp2.calculatePay();
		emp1.print();
		emp2.print();

		Employee e1 = emp1;
		Employee e2 = emp2;
		
		Employee[] emps = new Employee[5];
		emps[0] = emp1;
		emps[1] = emp2;
		emps[2] = new SalaryEmployee(3, "Park", 50000000);
		emps[3] = new PartTimeWorker(4, "Jang", 120, 15000);
		emps[4] = new SalaryEmployee(5, "KIM", 20000000);
		
		System.out.println();
		for (int i = 0; i < emps.length; i++) {
			if(emps[i] instanceof SalaryEmployee) {
				emps[i].calculatePay();
				System.out.println("---"+emps[i].getName()+"님 급여명세표 ---");
				emps[i].print();
				System.out.println("--------------------");
				System.out.println();
				System.out.println();
			}
		}
	}

}
