package NaraeExam;


public class Exam01 {

	private Account[] accounts;
	public Exam01() {
		accounts = new Account[9];
		accounts[0] = new Account(1111, "KIM", 89000, 1.3);
		accounts[1] = new Account(2222, "AIM", 45000, 2.7);
		accounts[2] = new Account(3333, "FIM", 89000, 4.7);
		accounts[3] = new Account(4444, "XIM", 34000, 6.7);
		accounts[4] = new Account(5555, "hIM", 78000, 3.7);
		accounts[5] = new Account(6666, "KIM", 89000, 5.7);
		accounts[6] = new Account(7777, "KIM", 89000, 4.7);
		accounts[7] = new Account(8888, "qIM", 91000, 1.7);
		accounts[8] = new Account(9999, "mIM", 12000, 0.7);
	}
	
	/*
	 * 0-1.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		Account[] tempAccounts = new Account[accounts.length+1];
		// tempAccounts는 로컬객체. 
		
		for (int i = 0; i < accounts.length; i++) {
			tempAccounts[i] = accounts[i];
		}
		tempAccounts[tempAccounts.length-1] = newAccount;
		// tempAccounts 마지막에 newAccount를 넣어줘.
		// length는 10인데 배열 마지막 인덱스 넘버는 9잖아.
		
		this.accounts = tempAccounts;
		// accounts배열로 다시 옮기기.
		
	}
	
	/*
	 * 0-2. 계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		this.addAccount(newAccount); // 0-1번 addAccount 메소드 이용하기!
	}
	
	
	
	
	
}
