
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		
		Account account1 = new Account();
		/* 필드를 private으로 바꿨더니 안됨
		account1.no = 1111;
		account1.owner = "박나래";
		account1.balance = 50000;
		account1.interest = 0.2;
		*/
		// 메소드를 통해서는 가능.
		account1.setAccountData(1111, "박나래", 50000, 0.2);
		
		account1.headerPrint();
		account1.print();
		account1.withDraw(1000);
		account1.print();
		account1.deposit(33000);
		account1.print();
//		int account1Balance =account1.balance; 이걸 쓸 수 없음
		int account1Balance = account1.getBalance();
		System.out.println("account1의 잔고조회 : "+ account1Balance);

		
		Account account2 = new Account();
		account2.setAccountData(2222, "이해민", 90000, 0.3);
		account2.deposit(999);
		account2.print();
		// account2의 이율 변경
		// account2.interest = 0.7;
		account2.setInterest(0.7);
		account2.print();
		
		System.out.println("-------------------------------------------");
		System.out.println("모든 계좌 출력");
		account1.headerPrint();
		account1.print();
		account2.print();
		
		System.out.println("account2의 이율: "+account2.getInterest());
		
	}

}
