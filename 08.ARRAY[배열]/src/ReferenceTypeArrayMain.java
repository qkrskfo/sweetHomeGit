
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {

		Account account = new Account(7777, "박나래", 2000000, 1.2);
		// 기본형
		int[] ia = new int[5];
		ia[0] = 55331;
		
		// 참조형배열
		Account[] accArray = new Account[5]; // 멤버변수로 account 타입을 가지는 배열
		accArray[0] = new Account(1111, "kim", 300000, 0.8);
		accArray[1] = new Account(2222, "jim", 890000, 0.7);
		accArray[2] = new Account(3333, "pim", 10000, 0.6);
		accArray[3] = new Account(4444, "bim", 900000, 0.4); 
		accArray[4] = new Account(5555, "rim", 1000000, 0.5); 
	
		Account.headerPrint();
		
		for(int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
	
	}

}
