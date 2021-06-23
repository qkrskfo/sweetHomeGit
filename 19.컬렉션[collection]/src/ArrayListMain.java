import java.util.ArrayList;

// 선생님이 하신것
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
		accountList.add(3,new Account(3334, "KIMM",9000, 0.9));
		System.out.println(">>"+accountList);
		System.out.println("# arrayList의 size: "+accountList.size());
		
		
		System.out.println("*********** 2.set *************");
		// 특정 인덱스에 있는걸 대치시키는 것.
		accountList.set(3, new Account(3337, "PARK", 8888, 8.8));
		System.out.println(accountList);
		System.out.println("# size:"+accountList.size());
		
		
		
		System.out.println("*********** 3.get *************");
		// 특정 인덱스에 있는 걸 참조받고자 하는 것. 찾아준다.
		accountList.get(1); // 1번꺼 줘봐~
		// Object 타입이면 반환을 object로 반환함
		Account getAccount =(Account)accountList.get(1);
		// 제네릭이라는걸로 진행할거야.
		getAccount.print();
		getAccount =(Account)accountList.get(accountList.size()-1);
		getAccount.print();
		
		
		
		System.out.println("************ 4.remove *************");
		// 몇번째 인덱스꺼를 지워줘.
		accountList.remove(3);
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
			System.out.println(tempAccount);
		}
		
		
	}

}
