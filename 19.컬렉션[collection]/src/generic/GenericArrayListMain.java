package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListMain {

	public static void main(String[] args) {

		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 23000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.2);
		Account acc4 = new Account(4444, "YONG", 12000, 0.5);
		Account acc5 = new Account(5555, "SANG", 99000, 0.8);

		// ArrayList<E> 
		// 여기서 <E>는 타입을 받는다는 말.
				
		ArrayList<Account> accountList = new ArrayList<Account>();
		System.out.println("#size: "+accountList.size());
		System.out.println("---- 1. add ----");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		// add 메소드는 add(E e) 라고 되어 있음.
		// 아직 정해지지 않는 것이라는 뜻. element type
		accountList.add(3, new Account(3344, "TTTT", 3000, 0.4));
		// 몇번째 인덱스에, 객체를 넣는다.
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		
		
		System.out.println("---- 2. set ----");
		accountList.set(3, new Account(3335, "UUUU", 7000, 1.2));
		// set은 늘어나지 않음. 변경/수정할 때?
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		
		System.out.println("---- 3. get ----");
		// 특정 인덱스에 있는 객체를 꺼내는 작업
		// get에는 반드시 index를 주게 되어 있어. get(int index)
		Account getAccount = accountList.get(1);
		getAccount.print();
		getAccount = accountList.get(accountList.size()-1);
		getAccount.print();
		
		System.out.println("---- 4. remove ----");
		Account removeAccount = accountList.remove(accountList.size()-1);
		removeAccount.print();
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		
		System.out.println("================business method (업무실행)=================");
		System.out.println("****************1.계좌전체출력******************");
		for (int i = 0; i < accountList.size(); i++) {
			accountList.get(i).print();
			//ArrayListMain이랑 비교했을 때 훨씬 간단해짐.
			/*
			Account tempAccount = accountList.get(i);
			tempAccount.print();
			*/
		}
		
		System.out.println("****************2.계좌번호 \"3333\" 1개 찾기********************");
		System.out.println("****************3.계좌주 이름 KING 여러개 찾기******************");
		System.out.println("****************4.계좌번호 4444 1개 삭제 ***********************");
		System.out.println("****************5. 계좌주 이름 KING 계좌 여러개 삭제 [QUIZ] ****");
		
		System.out.println("-------iteration[전체출력]--------");
		/*
		ArrayListMain.java 에서 했던것
		Iterator accountIterator = accountList.iterator();
		while (accountIterator.hasNext()) {
			Account tempAccount = (Account)accountIterator.next();
			tempAccount.print();
			
		}
		 */

		// 캐스팅 필요없어짐
		Iterator<Account> accountIterator = accountList.iterator();
		while(accountIterator.hasNext()) {
			Account tempAccount = accountIterator.next();
			tempAccount.print();
		}
		
	}

}
