package com.itwill05.service.account;

public class AccountServiceReturnMain {
	public static void main(String[] args) {
		
		AccountServiceReturn accountServiceReturn = new AccountServiceReturn();
		
		System.out.println("0.AccountServiceReturn객체야 은행계좌객체 인자로 줄게. 추가해줘");
		accountServiceReturn.addAccount(1000, "JAN", 10000, 1.0);
		accountServiceReturn.addAccount(new Account(2000, "YEO", 89000, 0.4));
		
		System.out.println("1.AccountServiceReturn객체야 은행계좌 총계좌수를 반환해줘");
		int totAccountNumber = accountServiceReturn.getTotAccountNumber();
		
		
		System.out.println("은행 총 계좌 수: "+totAccountNumber);
		
		System.out.println("2.AccountServiceReturn객체야 은행계좌들 전체출력해줘");
		accountServiceReturn.print();
		
		System.out.println("3.AccountServiceReturn객체야 은행계좌들 총잔고를 반환해줘");
		int totBalance = accountServiceReturn.getAccountTotBalance();
		System.out.println("은행 총 잔고: "+totBalance);
		
		System.out.println("4.AccountServiceReturn객체야 계좌번호를인자로 넣어줄께 계좌한개참조변수를 반환해줘");
		Account findAccount = accountServiceReturn.findByNo(1000);
		findAccount.print();
		
		System.out.println("5.AccountServiceReturn객체야 "
			+ "계좌잔고를 인자로줄께 잔고이상인 계좌객체배열 참조변수반환해줘");
		accountServiceReturn.findByBalance(80000);
		
		System.out.println("6.AccountServiceReturn객체야  계좌이율(5.0)을 인자로줄께 이율이상인 계좌객체배열 참조변수 반환해줘");
		accountServiceReturn.findByIyul(5.0);
	
		System.out.println("7.AccountServiceReturn객체야  계좌주이름(AIM)을 인자로줄께 계좌객체배열 참조변수 반환해줘");
		Account[] accounts = accountServiceReturn.findByName("AIM");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("8.AccountServiceReturn객체야 "
				+ "계좌번호(6666번)와 입금할돈(330원)줄께 입금해줘");
		accountServiceReturn.ipGum(6666, 330);
		findAccount = accountServiceReturn.findByNo(6666);
		findAccount.print();
		System.out.println("9.AccountServiceReturn객체야 계좌번호(1111번)와 출금할돈(70원)줄께 출금해줘");
		accountServiceReturn.chulGum(1111, 70);
		findAccount = accountServiceReturn.findByNo(1111);
		findAccount.print();
		System.out.println("10.AccountServiceReturn객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceReturn.sort(accountServiceReturn.BALANCE, accountServiceReturn.ASCEND);
		accountServiceReturn.print();
		
		System.out.println("11.AccountServiceReturn객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceReturn.sort(accountServiceReturn.BALANCE, accountServiceReturn.DESCEND);
		accountServiceReturn.print();
		
		System.out.println("12.AccountService야 계좌객체줄께 이름,잔고,이율 수정(update)해줘");
		System.out.println("13.AccountService야 계좌데이타줄께 이름,잔고,이율 수정(update)해줘");
		System.out.println("14.AccountServiceReturn객체야 계좌번호줄께 계좌삭제한후 삭제한계좌객체반환해줘");
		accountServiceReturn.deleteByNo(1111);
		accountServiceReturn.print(); // 계좌 삭제 후 전체출력 확인
		
	}

}
