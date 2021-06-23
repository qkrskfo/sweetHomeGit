package com.itwill05.service.account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {
	

	private Account[] accounts = { 
			new Account(1111, "KIM", 85000, 5.9), 
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), 
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), 
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), 
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };

	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}

	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		int getTotAccountNumber = accounts.length;
		return getTotAccountNumber;
	}

	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	
	
	/*
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		int tot = 0; 
		for (int i = 0; i < accounts.length; i++) {
			tot += accounts[i].getBalance();
		}
		return tot;
	}

	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		Account tempAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				tempAccount = accounts[i];
			}
		}
		return tempAccount;
	}

	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		Account[] findAccounts = null;
		
		/* A. 만족하는 객체의갯수구하기 - 예를들어 3개라면*/
		
		int leng = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				leng++;
			}
		}
		
		/*
		 * B. Account객체배열생성 - findAccounts=new Account[3];
		 */
		findAccounts = new Account[leng];
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int findIdx = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= balance) {
				findAccounts[findIdx++] = accounts[i];
			}
		}
		return findAccounts;
	}
	
	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		Account[] findAccounts = null;
		int leng = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=iyul) {
				leng++;
			}
		}
		
		findAccounts = new Account[leng];
		
		int findIdx = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=iyul) {
				findAccounts[findIdx++] = accounts[i];
			}
		}
		
		return findAccounts;
	}

	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByName(String name) {
		Account[] findAccounts = null;
		int leng = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner()==name) {
				leng++;
			}
		}
		
		findAccounts = new Account[leng];
		
		int findIdx = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner()==name) {
				findAccounts[findIdx++] = accounts[i];
			}
		}
		
		return findAccounts;
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금
	 */
	public Account ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기 2.입금
		 */
		Account findAccount = this.findByNo(no);
		findAccount.deposit(m);
		return findAccount;

	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public Account chulGum(int no, int m) {
		Account findAccount = this.findByNo(no);
		findAccount.withDraw(m);
		return findAccount;
	}

	/*
	 * 10,11 정렬기준  standard --> 1:번호,2:이름,3:잔고,4:이율 
	 *       정렬방법  order    --> 1:오르차순,2:내림차순
	 *             
	 *       조합은 8개가 나오는데 1개의 메소드로 다 할 수 있게..
	 *       if문 쓰면됨. 상수도 쓰래.. case 로 받아봐
	 */
	
	final int NO = 1;
	final int OWNER = 2;
	final int BALANCE = 3;
	final int IYUL = 4;
	final int ASCEND = 1;
	final int DESCEND = 2;
	
	public void sort(int standard, int order) {

		
		switch (standard) {
		case NO:
			if (order == ASCEND) { // 번호 오름차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getNo() >= accounts[i + 1].getNo()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			} else if (order == DESCEND) { // 번호 내림차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getNo() <= accounts[i+1].getNo()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			}
			break;
			
		case OWNER:
			if (order == ASCEND) { // 이름 오름차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						String name1 = accounts[i].getOwner();
						String name2 = accounts[i+1].getOwner();
						int unicodeGap1 = name1.compareTo(name2);
						int unicodeGap2 = name2.compareTo(name1);
						if (unicodeGap1 >= unicodeGap2) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			} else if(order==DESCEND) { // 이름 내림차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						String name1 = accounts[i].getOwner();
						String name2 = accounts[i+1].getOwner();
						int unicodeGap1 = name1.compareTo(name2);
						int unicodeGap2 = name2.compareTo(name1);
						if (unicodeGap1 <= unicodeGap2) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			}
			break;
			
		case BALANCE:
			if (order == ASCEND) { // 잔고 오름차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getBalance() >= accounts[i + 1].getBalance()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			} else if (order == DESCEND) { // 잔고 내림차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getBalance() <= accounts[i + 1].getBalance()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			}
			break;
			
		case IYUL:
			if (order == ASCEND) { // 이율 오름차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getIyul() >= accounts[i + 1].getIyul()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			} else if (order == DESCEND) { // 이율 내림차순
				for (int j = 0; j < accounts.length - 1; j++) {
					for (int i = 0; i < accounts.length - 1; i++) {
						if (accounts[i].getIyul() <= accounts[i + 1].getIyul()) {
							Account tempBox = accounts[i];
							accounts[i] = accounts[i + 1];
							accounts[i + 1] = tempBox;
						}
					}
				}
			}
			
			break;
		}
	}
	
	/*
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	public void updateAccount(Account updateAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo() == updateAccount.getNo()) {
				/*********case1************ 
				 accounts[i].setOwner(updateAccount.getOwner());
				 accounts[i].setBalance(updateAccount.getBalance());
				 accounts[i].setIyul(updateAccount.getIyul());
				 **************************/
				/************ case2 **********/
				accounts[i] = updateAccount;
				break;
			}

		}
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		this.updateAccount(new Account(no, owner, balance, iyul));
	}
	
	
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] 
	 * 	A. 배열에서 Account객체삭제 
	 * 	B. 배열사이즈감소
	 *  C. 삭제한계좌객체반환
	 *  
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) { 
				deleteAccount=accounts[i]; // 삭제 Account객체 주소값 저장
				accounts[i]=null; // 삭제 Index 주소값에 null 저장 (Account객체 삭제)
				break;
			}
		}
		Account[] temp=new Account[accounts.length-1]; // 감소된 배열길이를 가진 배열객체 생성
		int tempIndexNum=0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null) {
				temp[tempIndexNum]=accounts[i];
				tempIndexNum++;
				// if문 조건식 부합 시 옮겨 받는 인덱스가 1씩 증가하면서 데이터주소값 저장(반복)
			}
		}
		accounts=temp;
		return deleteAccount; // 삭제한 계좌 객체 반환
	}
	
}
