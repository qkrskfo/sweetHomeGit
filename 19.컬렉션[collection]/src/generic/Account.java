package generic;
public class Account implements Comparable<Account>{
	/*
	 * 멤버필드
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	/*
	 * 생성자
	 */
	/**
	 * 기본값으로 초기화된계좌객체생성
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 매개변수값으로 최기화된계좌객체생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public Account(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	
	/*
	 * 멤버메쏘드
	 */
	//계좌데이타를 set하는메쏘드

	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	//입금
	public void deposit(int m) {
		this.balance += m;
	}

	//출금
	public void withDraw(int m) {
		//this.balance-=m;
		this.balance = this.balance - m;
	}

	public static void headerPrint() {
		System.out.printf("%s%n", "---------------------------");
		System.out.printf("%s %5s %4s %4s%n", "번호", "이름", "잔고", "이율");
		System.out.printf("%s%n", "---------------------------");
	}

	public void print() {
		System.out.printf("%d %6s %8d %5.1f %n", this.no, this.owner, this.balance, this.iyul);
	}
	
	//toString 재정의 : source -> 
	@Override
	public String toString() {
		return "("+no+" "+owner+ " "+balance+" "+iyul+")";
	}

	//getter method
	public int getBalance() {
		return this.balance;
	}
	
	//setter method
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

	//getter,setter
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

	public double getIyul() {
		return iyul;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	/*
	@Override
	public int compareTo(Account o) {
		return 0;
	}
	*/
	// Account o 현재 어카운트와 다음 어카운트를 비교하는 것
	
	
	/* 잔고 오름차순 */
	@Override
	public int compareTo(Account nextAccount) {
		if(this.balance > nextAccount.getBalance()) {
			// 바꾸라고 하려면 양수를 리턴해주면됨
			// 바꾸기 싫으면 0이나 음수를 리턴해주면 됨
			return 1;
		} else {
			return -1;
		}
//		return 0; // 얘는 중요하지 않아
	}

	
	/* 이름 오름차순
	@Override
	public int compareTo(Account nextAccount) {
		if(this.owner.compareTo(nextAccount.getOwner()) > 0) {
			// 바꾸라고 하려면 양수를 리턴해주면됨
			// 바꾸기 싫으면 0이나 음수를 리턴해주면 됨
			return 1;
		} else {
			return -1;
		}
	}
	
	같으면~ 하는건 else if로 해서 잔고순으로 한번 더 하게 하던가.
	*/
}