package byte_stream.object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class AccountArrayListDeSerealizationMain {

	public static void main(String[] args) throws Exception {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accountArrayList.ser"));
		
		List<Account> accountList = (List<Account>)ois.readObject();
		
		System.out.println("accountArrayList.ser --> accountArrayList복원(deSerealization)");
		
		Account.headerPrint();
		for (Account account : accountList) {
			account.print();
		}
		
		ois.close();
		
		
	}
}
