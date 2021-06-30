package com.itwill04.array.account;

public class AccountArrayMain {

	public static void main(String[] args) {

		System.out.println("--- 참조형 객체의 초기화 ---");
		
		Account acc1 = new Account(1111, "KIM", 30000, 2.7);
		
		Account[] accounts = {
				acc1,
				new Account(2222, "PARK", 162000, 3.8),
				new Account(3333, "LIM", 34000, 2.2),
				new Account(4444, "LEE", 7000, 2.3),
				new Account(5555, "JANG", 1300, 0.9),
				new Account(6666, "JOE", 22000, 0.5),
				new Account(7777, "KOO", 3000, 0.3),
				new Account(8888, "HAM", 2700, 0.1),
				new Account(9999, "CHOI", 4000, 0.7)				
		};
		
		System.out.println("1. 은행 총 계좌 수: " +accounts.length);
		
		System.out.println("2. 은행 계좌 전체 출력");
		Account.headerPrint();
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.print("3. 은행 계좌들 총 잔고");
		int totBalance = 0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">> " + totBalance);
		
		/*
		 * 계좌번호 중복 안됨 
		 */
		
		System.out.println("4. 은행 계좌들 중에 계좌번호 3333번계좌 한개 찾아서 출력");
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}		
		
		System.out.println("5. 은행 계좌들 중에 계좌잔고 5,000원 이상인 VIP계좌 여러개 찾아서 출력");
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=5000) {
				accounts[i].print();				
			}
		}
		
		System.out.println("6. 은행 계좌들 중에서 이자율 2.0이상인 계좌 여러개 찾아서 출력");
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getInterest()>=2.0) {
				accounts[i].print();				
			}
		}
		
		System.out.println("7. 6666번 계좌 3000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].deposit(3000);
				accounts[i].print();
				
			}
		}
		
		System.out.println("8. 9999번 계좌 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==9999) {
				accounts[i].print();
				accounts[i].deposit(-3000);
				accounts[i].print();				
			}
		}
		
		System.out.println("9. 계좌잔고 순으로 내림차순 정렬");
		for (int j = 0; j < accounts.length -1; j++) {
			for (int i = 0; i < accounts.length -1; i++) {
				if(accounts[i].getBalance() < accounts[i+1].getBalance()) {				
					Account tempAccount = accounts[i+1];
					accounts[i+1] = accounts[i];
					accounts[i] = tempAccount;				
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("10. 계좌번호순으로 오름(내림)차순 정렬 ");
		for (int j = 0; j < accounts.length; j++) {
			for (int i = 0; i < accounts.length-1; i++) {
				if(accounts[i].getNo() > accounts[i+1].getNo()) {
					Account tempNo = accounts[i];
					accounts[i] = accounts[i+1];
					accounts[i+1] = tempNo;				
				}
			}	
		}
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("Quiz. 예금주 이름순으로 오름(내림)차순 정렬 ");
		for (int i = 0; i < accounts.length-1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < accounts.length-1; j++) {				
				if(accounts[j].getOwner().compareTo(accounts[j+1].getOwner()) > 0) {
					Account tempBox = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempBox;
				}
			}
			if(!isSwap) {
				break;
			}
		}
		
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		
		System.out.println("11. 5555 계좌 이율을 3.6%로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo() == 5555) {
				accounts[i].print();
				accounts[i].setInterest(3.6);
				accounts[i].print();
				break;
			}			
		}		
		
		System.out.println("12. VIP 계좌 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance() >= 5000) {
				accounts[i].deposit(50);
				accounts[i].print();				
			}
		}
		
	}		

		
}


