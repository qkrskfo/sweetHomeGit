public abstract class Employee {

	private int no;
	private String name;
	private int pay;
	
	public Employee() {	
	}
			
    public Employee(int no, String name) {
		this.no = no;
		this.name = name;
	}

    /*
     * 급여 계산 메소드
     *    - 실제 구현 작업 불가능
     *    - 자식객체에서 반드시 재정의해야하는 메소드
     *    - 재정의 강제(규칙, specification)
     */
	public abstract void calculatePay();
	// 모든 자식객체가 재정의해야하는 규칙이구나~
	
	
	public void print() {
		System.out.print(no+"\t"+name+"\t"+pay+"\t");
	}

	// getter, setter
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
