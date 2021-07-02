package byte_stream.object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
		 */
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.ser"));
		// 객체그래프를 직렬화 하는 기능 // FileOutputStream 사용
		// 실제 쓰는 기능은 fileOutputStream이
		// objectOutputStream은 직렬화 기능만
		
		System.out.println("--- String Object Write ---");
		String str1 = new String("객체스트림");
		oos.writeObject(str1);
		
		
		System.out.println("--- Integer Object Write ---");
		Integer wi2 = new Integer(2147483647);
		oos.writeObject(wi2);
		
		System.out.println("--- Account Object Write ---");
		Account account3 = new Account(3434, "KIM", 340000, 0.5);

		oos.writeObject(account3); // NotSerializableException 발생
		// Account.java에 implements Serializable 했더니 정상작동!
		
		/*
		 * 직렬화 객체의 조건
		 *  1. 객체가 반드시 java.io.Serializable interface를 구현해야 함
		 *  2. java.io.Serializable interface는 추상메소드가 존재하지 않는 인터페이스(flag interface)다.  
		 */
		
		System.out.println("--- Account2 Object Write ---");
		Account account4 = new Account(9951, "JOE", 18000, 1.2);
		
		oos.writeObject(account4);
		// writeInt, writeUTF, writeDouble 등의 작업을 이 안에서 다 자동으로 해줌
		// 모두가 다 serialization의 자식이어야해!
		
		oos.flush();
		oos.close();
		
		
		System.out.println("ObjectOutputStream의 writeObject를 사용해 객체를 objects.ser ");
		
	}

}