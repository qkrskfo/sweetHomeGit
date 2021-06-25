package generic;

import java.util.HashSet;
import java.util.Iterator;

public class GenericHashSetMain {

	public static void main(String[] args) {
		
		HashSet<Account> accountSet = new HashSet<Account>();
		
		System.out.println("#set size: "+accountSet.size());
		
		Account acc1=new Account(1111, "BING",33000,0.5);
		Account acc2=new Account(2222, "KING",23000,0.1);
		Account acc3=new Account(3333, "KING",89000,0.2);
		Account acc4=new Account(4444, "YONG",12000,0.5);
		Account acc5=new Account(5555, "SANG",99000,0.8);
		
		System.out.println("---- 1. add ----");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("---- 1-2. add [같은객체(주소나 값이)] ----");
		
		boolean isAdd = accountSet.add(acc2);
		System.out.println(isAdd);
		isAdd = accountSet.add(acc3);
		System.out.println(isAdd);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("---- 2. remove ----");
		boolean isRemove = accountSet.remove(acc1);
		System.out.println("is Remove:"+isRemove);
		System.out.println("#set size: "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("Iteration 출력");
		Iterator<Account> accountIterator = accountSet.iterator();
		while (accountIterator.hasNext()) {
			Account account = accountIterator.next();
			account.print();
		}
		
		
	}
}
