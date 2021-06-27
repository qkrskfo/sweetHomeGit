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
		
		
		System.out.println("######### --- String, Wrapper --- ###########");
		System.out.println("---- String ----");
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		System.out.println("---- 1. add ----");
		nameList.add("JIM");
		nameList.add(new String("PIM")); // 객체잖아 이렇게 넣는것도 가능
		nameList.add("BIM");
		nameList.add("MIM");
		nameList.add("DIM");
		nameList.add("HIM");
		nameList.add("KIM");
		nameList.add("KIM");
		// ArrayList는 중복을 허용함
		System.out.println("# nameList size: "+nameList.size());
		System.out.println(nameList);
		
		nameList.add(3, "KKK");
		// 3번인덱스에 (4번째겠지) KKK를 넣을게요
		System.out.println("# nameList size: "+nameList.size());
		System.out.println(nameList);
		
		System.out.println("---- 2. remove(int index) ----");
//		nameList.remove(0); // 0번인덱스 지우자
		String removeName = nameList.remove(3);
		System.out.println("remove name: "+removeName);
		System.out.println("# nameList size: "+nameList.size());
		System.out.println(nameList);
		
		System.out.println("---- 2. remove(Object o) ----");
		boolean isRemove = nameList.remove("HIM");
		// equals 메소드를 호출해서 알아서 찾아서 지워줌
		System.out.println(isRemove);
		System.out.println("# nameList size: "+nameList.size());
		System.out.println(nameList);
		
		// KIM 이 두개인데 이건 어떻게 될까??
		// << boolean java.util.ArrayList.remove(Object o) >>
		// Removes the first occurrence of the specified element from this list, if it is present
		nameList.remove("KIM");
		System.out.println("# nameList size: "+nameList.size());
		System.out.println(nameList);
		// 첫번째 나온걸 지운데
		
		
		
		System.out.println("---- Integer (Boxing) ----");
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(new Integer(90));
		scoreList.add(45); // auto Boxing -> up casting 
		// 박싱되서 상위로캐스팅되서 가능
		scoreList.add(50);
		scoreList.add(60);
		scoreList.add(70);
		scoreList.add(80);
		scoreList.add(85);
		scoreList.add(98);
		scoreList.add(72);
		scoreList.add(98);
		
		System.out.println("---- 1. add ----");
		System.out.println(scoreList);
		
		
		System.out.println("---- 2. get ----");
		/*
		int scoreBox = scoreList.get(3);
		System.out.println("scoreList.get(3) --> "+scoreBox);
		*/
		Integer score1Integer = scoreList.get(1); // generic
		int score1 = score1Integer.intValue(); // auto unboxing
		System.out.println("scoreList.get(1) --> "+score1);
		
		int score2 = scoreList.get(3); // generic --> auto unboxing
		System.out.println("socreList.get(3) -->"+score2);
		
		/*
		이렇게 해줘도 됨 
		System.out.println("scoreList.get(1)--> "+scoreList.get(1).intValue());
		 */
		
		System.out.println("---- 3. set ----");
		scoreList.set(3, 100); // 3번인덱스가 100점이였어~
		System.out.println(scoreList);
		
		System.out.println("---- 4. remove (int index) ----");
		scoreList.remove(3); // 3번 인덱스
		System.out.println(scoreList);
		
		System.out.println("---- 4. remove (Object o) ----");
		scoreList.remove(new Integer(90)); // 90점짜리를 지우려면 이렇게 불러야함.
		System.out.println(scoreList);
		
		
		
		
		
	}

}
