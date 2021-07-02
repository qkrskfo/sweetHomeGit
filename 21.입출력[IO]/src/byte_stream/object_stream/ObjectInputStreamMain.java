package byte_stream.object_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamMain {
	public static void main(String[] args) throws Exception {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.ser"));
		
		System.out.println("objects.ser --> String");
		String readStr = (String)ois.readObject(); //무슨 타입인지 모르니 직접 캐스팅 해야함
		System.out.println(readStr);
		
		System.out.println("objects.ser --> Integer");
		Integer readInt = (Integer)ois.readObject();
		System.out.println(readInt);
		
		System.out.println("objects.ser --> Account");
		Account readAccount3 = (Account)ois.readObject();
		readAccount3.print();
		
		System.out.println("objects.ser --> Account");
		Account readAccount4 = (Account)ois.readObject();
		readAccount4.print();
		
		ois.close();
		
	}
}
