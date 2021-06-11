
public class AccountConstructorMain2 {

	public static void main(String[] args) {

		Account ac = new Account(1111, "박나래", 50000, 0.2);
		ac.setInterest(0.8);
		ac.headerPrint();
		ac.print();
		
		int receiveBalance = ac.getBalance();
		System.out.println("account의 잔고: "+receiveBalance);
		

	}

}
