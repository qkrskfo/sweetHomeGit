
public class Account {

	/*
	 * 필드(멤버변수)
	 */
	
	private int no; // 계좌번호
	private String owner; // 예금주명
	private int balance; // 잔고
	private double interest; // 이율
	
	/*
	 * 멤버메소드
	 */
	// 계좌데이터를 set하는 메소드
	public void setAccountData(int no, String owner, int balance, double interest) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.interest = interest;
	}
	
	//입금
	public void deposit(int m) {
		this.balance += m;
	}
	
	//출금
	public void withDraw(int m) {
		this.balance -= m;  // 같은말 this.balance = this.balance-m;
	}
	
	public void headerPrint() {
		System.out.printf("%s %n","-------------------------------------------");
		System.out.printf("%s %3s %5s %5s %n","계좌번호", "예금주", "잔액", "이율");
		System.out.printf("%s %n","-------------------------------------------");		
	}
	
	
	
	public void print() {
		System.out.printf("%d %6s %8d %5.1f %n",this.no, this.owner,this.balance, this.interest);
	}
	
	// getter method
	public int getBalance() {
		return this.balance;
	}
	
	// setter method
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	
	// getter, setter

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getInterest() {
		return interest;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}






