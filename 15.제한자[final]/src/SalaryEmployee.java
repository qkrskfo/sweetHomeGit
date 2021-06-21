public class SalaryEmployee extends Employee {

	private int annualSalary; //연봉
	
	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public void calculatePay() {
		int pay = this.annualSalary / 12;
		this.setPay(pay);
	}
	
	/*
	<< Cannot override the final method from Employee >>
	public double calculateIncentive() {
		return 0.0;
	}
	*/
	
	public void print() {
		super.print();
		System.out.println(this.annualSalary);
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	

}
