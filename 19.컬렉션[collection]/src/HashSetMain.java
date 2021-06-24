import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet accountSet = new HashSet();
		System.out.println("# set Size : "+accountSet.size());
		
		Account acc1=new Account(1111, "BING",33000,0.5);
		Account acc2=new Account(2222, "KING",23000,0.1);
		Account acc3=new Account(3333, "KING",89000,0.2);
		Account acc4=new Account(4444, "YONG",12000,0.5);
		Account acc5=new Account(5555, "SANG",99000,0.8);
		
		System.out.println("1. add");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		
		System.out.println("# set Size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("-- add[같은객체] --");
		
		/*
		 * equals 메소드를 사용해서 중복체크를 한다.
		 */
		
		boolean isAdd = accountSet.add(acc2);
		System.out.println("isAdd:"+isAdd);
		isAdd = accountSet.add(acc3);
		System.out.println("isAdd:"+isAdd);
		
		System.out.println("# set Size : "+accountSet.size());
		System.out.println(accountSet);
		
		
		System.out.println("2. remove");
		boolean isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		System.out.println("# set Size : "+accountSet.size());
		System.out.println(accountSet);
		isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		System.out.println("# set Size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("iteration[전체출력]");
		Iterator accountIter = accountSet.iterator();
		// 기존 보따리에 있는 account를 끄집어낼 수 있도록 객체에 담아서 주는 참조변수
		// set은 꺼낼수 없는 구조이기 때문에 반복할 수 있도록 iterator가 재배치해서 주는 것
		System.out.println(accountIter);
		//이터레이터로 뭘 할 수 있냐면
		while(accountIter.hasNext()) {
			// 0번째 1번째 하는 인덱스가 없으니까 해즈넥스트를 쓰는 것. 옆에 이써?
			// 넥스트가 존재하면 true 없으면 false
			// 옆에 있따면
			Account tempAccount = (Account)accountIter.next(); // next가 없을때까지
			tempAccount.print();
		}
		System.out.println(accountIter.hasNext()); // false 니까 더이상 뽑으면 x
//		accountIter.next();  << java.util.NoSuchElementException >> 옆에 없는데 호출하면 익셉션 발생  
		
		
	}

}
