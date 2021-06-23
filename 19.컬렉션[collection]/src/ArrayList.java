
public class ArrayList {
	public static void main(String[] args) {
		System.out.println("--------Object[]-----------");		
		Object[] anyTypeArray = new Object[5];
		System.out.println(anyTypeArray);
		Account acc1 = new Account(1111, "Bing", 33000, 0.5);
		Account acc2 = new Account(1111, "KING", 33000, 0.5);
		Account acc3 = new Account(1111, "KING", 23000, 0.1);
		Account acc4 = new Account(1111, "BING", 89000, 0.2);
		Account acc5 = new Account(1111, "PING", 12000, 0.5);
	
		anyTypeArray[0] = acc1;
		anyTypeArray[1] = acc2;
		anyTypeArray[2] = acc3;
		anyTypeArray[3] = acc4;
		anyTypeArray[4] = acc5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccout = (Account)anyTypeArray[i];
			tempAccout.print();
		}
		
		System.out.println("----------------------------");
		
		ArrayList accountList = new ArrayList();
		
		
	}	
}
