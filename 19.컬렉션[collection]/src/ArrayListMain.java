import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		
		System.out.println("------------Object[]----------------");
		Object[] anyTypeArray=new Object[5];
		System.out.println(anyTypeArray);
		Account acc1=new Account(1111, "BING",33000,0.5);
		Account acc2=new Account(2222, "KING",23000,0.1);
		Account acc3=new Account(3333, "KING",89000,0.2);
		Account acc4=new Account(4444, "YONG",12000,0.5);
		Account acc5=new Account(5555, "SANG",99000,0.8);
		
		anyTypeArray[0]=acc1;
		anyTypeArray[1]=acc2;
		anyTypeArray[2]=acc3;
		anyTypeArray[3]=acc4;
		anyTypeArray[4]=acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount=(Account)anyTypeArray[i];
			tempAccount.print();
		}
		
		System.out.println("-----------------------------------------");
		ArrayList accountList=new ArrayList();
		System.out.println("# arrayList의 size:"+accountList.size());
		System.out.println("********** 1.add *************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		
		System.out.println("# arrayList의 size: "+accountList.size());
		System.out.println(">>"+accountList);
		accountList.add(3, new Account(3334, "KIMM",9000, 0.9));
		// add 메소드 - index 3번이니까 4번째에 내용 추가!
		System.out.println(">>"+accountList);
		System.out.println("# arrayList의 size: "+accountList.size());
		// ArrayList 사이즈가 6이 됐어
		
		System.out.println("*********** 2.set *************");
		// 특정 인덱스에 있는걸 대치시키는 것. 수정!
		accountList.set(3, new Account(3337, "PARK", 8888, 8.8));
		// set 메소드 - index 3번이니까 4번째에 있는 것 내용 수정!
		System.out.println(">>"+accountList);
		System.out.println("# arrayList의 size:"+accountList.size());
		// ArrayList 사이즈는 여전히 6이야.
		
		
		System.out.println("*********** 3.get *************");
		// 특정 인덱스에 있는 걸 참조받고자 하는 것. 찾아준다.
		accountList.get(1); // 1번꺼 줘봐~
		// Object 타입이면 반환을 object로 반환함
		Account getAccount =(Account)accountList.get(1); //인덱스 1번이니까 2번째꺼!
		// 제네릭이라는걸로 진행할거야.
		getAccount.print();
		getAccount =(Account)accountList.get(accountList.size()-1); // 맨 마지막꺼 하나 줘봐~
		getAccount.print();
		
		
		
		System.out.println("************ 4.remove *************");
		// accountList.remove(3); 3번인덱스꺼를 지워줘.
		Account removeAccount = (Account)accountList.remove(3);
		removeAccount.print();
		System.out.println(accountList);
		System.out.println("# arrayList의 size: "+accountList.size());
		
		
		
		System.out.println("================business method (업무실행)=================");
		System.out.println("****************1.계좌전체출력******************");
		for(int i=0;i<accountList.size();i++) {
			// accountList.get(i); 로 쓰면 오브젝트로 반환하기 때문에
			// 아래껄로 수정.
			Account tempAccount=(Account)accountList.get(i);
			System.out.println(tempAccount); // tempAccount.print(); 이렇게 쓰는 것도 가능
		}
		
		System.out.println("****************2.계좌번호 \"3333\" 1개 찾기********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i); // 제네릭 등장
			if(tempAccount.getNo() == 3333) {
				tempAccount.print();
				break; // 1개 찾기니까 브레이크!
			}
		} 
		
		System.out.println("****************3.계좌주 이름 KING 여러개 찾기******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
		}
		
		System.out.println("****************4.계좌번호 4444 1개 삭제 ***********************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 4444) {
				Account removeAcc = (Account)accountList.remove(i);
				System.out.println("# remove size: "+accountList.size());
				removeAcc.print();
				break;
			}
		}
		
		
		System.out.println("****************5. 계좌주 이름 KING 계좌 여러개 삭제 [QUIZ] ****");
		System.out.println("****************삭제 확인을 위해 계좌전체출력******************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
		}
		// 돌면서 1개를 삭제하면 사이즈가 줄어버릴거아냐?
		// king이 날라가면 인덱스를 조정해야하는 이슈가 있지!
		
		
		System.out.println("****************삭제******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account removeAcc = (Account)accountList.remove(i);
				System.out.println("remove account:"+removeAcc);
				// removeAcc.print();
				i--;
			}
		}
		System.out.println("# remove size: "+accountList.size());
		System.out.println("****************삭제 확인을 위해 계좌전체출력2******************");
		System.out.println("# remain size: "+accountList.size());
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println();
		System.out.println();
		System.out.println("-------iteration[전체출력]--------");
		Iterator accountIterator = accountList.iterator();
		while (accountIterator.hasNext()) {
			Account tempAccount = (Account)accountIterator.next();
			tempAccount.print();
			
		}
		
		
		
		
	}
}
