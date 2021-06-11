
public class AccountConstructorMain {

	public static void main(String[] args) {

		Account acc1 = new Account(111, "Kim", 89000, 0.5);
		Account acc2 = new Account(222, "Lim", 35000, 0.3);
		Account acc3 = new Account(333, "Qim", 94000, 0.7);
		Account acc4 = new Account(444, "Aim", 105000, 1.3);
		Account acc5 = new Account(555, "Zim", 7000, 0.1);
		Account acc6 = new Account();
		acc6.setAccountData(666, "Bim", 66000, 0.6);
		
		System.out.println("----- 모든 계좌 잔고에 100원 추가-----");
		acc1.deposit(100);
		acc2.deposit(100);
		acc3.deposit(100);
		acc4.deposit(100);
		acc5.deposit(100);
		acc6.deposit(100);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		acc5.print();
		acc6.print();

	}

}
