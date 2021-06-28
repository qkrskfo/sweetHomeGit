package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollecitonsUtilMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> intList1 =new ArrayList<Integer>(); 
		intList1.add(34);
		intList1.add(45);
		intList1.add(78);
		intList1.add(90);
		intList1.add(23);
		intList1.add(10);
		intList1.add(99);
		intList1.add(20);
		
		System.out.println();
		System.out.println("Arrays : 어레이의 유틸.  어레이를 리스트로!");
		// array를 쉽게 리스트로 만들 수 있는?
		// Arrays 라는 자바 유틸이 있음
		List<Integer> intList2 = Arrays.asList(34, 45, 78, 90, 23, 10, 99, 20);
		List<String> nameList = Arrays.asList("김태희", "이소라", "유재석", "조세호", "김경호");

		List<Account> accountList = Arrays.asList(
				new Account(1111, "BING", 33000, 0.5),
				new Account(2222, "KING", 23000, 0.1),
				new Account(3333, "KING", 89000, 0.2),
				new Account(4444, "YONG", 12000, 0.5),
				new Account(5555, "SANG", 99000, 0.8)
		); // asList는 가변인자. 인자의 개수가 정해져있지 않음.
		// T는 제네릭이지.
		
		
		// 정렬 유틸
		System.out.println(" ---- sort ----");
		// 숫자, 문자, 나의 객체 순으로 정렬.
		System.out.println(intList1); 
		// Integer 인티저 객체가 들어있지
		// comparable이 되어있어 이미. compareTo메소드
		Collections.sort(intList1); // 기본 디폴트는 오름차순
		System.out.println(intList1);
		
		//문자열은 사전순
		System.out.println(nameList);
		Collections.sort(nameList);
		// comparable이 되어있어 이미. compareTo메소드
		System.out.println(nameList);
		
		// account 객체는 어떻게 정렬할까?
		// 객체 정렬을 위해서는 compareTo메소드를 써줘야해.
		// enhanced for문 (no index)
		System.out.println("--- Account Sort ---");
		for(Account tempAccount : accountList) {
			tempAccount.print();
		}
		
		/*
		 * 1. List의 element(원소)는 반드시 Comparable interface를 구현하여야 한다.
		 */
		System.out.println("------------------------");
		Collections.sort(accountList);
		// 이걸 하려면 기준에 대해서 메소드를 구현해줘야된데..
		// Account에 해야함
		// implements Comparable<Account>
		// < > 여기에는 우리가 sorting 하려는걸 넣어야함. 
		// 버블소트를 기억해야 이걸 할 수 있어!
				
		for(Account tempAccount : accountList) {
			tempAccount.print();
		}
		
		System.out.println("--- reverse ---");
		// 기존 배열을 리버스 해주는 것. 내림차순은 아니지만 그렇게 만들어주지.
		Collections.reverse(intList1);
		Collections.reverse(nameList);
		Collections.reverse(accountList);
		System.out.println(intList1);
		System.out.println(nameList);
		System.out.println(accountList);
		
		System.out.println("--- shuffle ---");
		// 랜덤으로 섞어줌
		Collections.shuffle(intList1);
		Collections.shuffle(nameList);
		Collections.shuffle(accountList);
		System.out.println(intList1);
		System.out.println(nameList);
		System.out.println(accountList);
		
	}

}
