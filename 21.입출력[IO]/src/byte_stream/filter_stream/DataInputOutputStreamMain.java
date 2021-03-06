package byte_stream.filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception {

		/*
		 *  자바의 기본데이터를 출력 스트림에 쉽게 쓸 수 있도록 하는 필터 클래스
		 */
		
		FileOutputStream fos = new FileOutputStream("dataOut.dat"); 
			// 이렇게 하니까 dataOut.dat 이라는 파일이 생기넹
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat")); // 얘는 필터스트림
		
		
		int intData = 2147483647;
		/*
		 * 01111111|11111111|11111111|11111111
		 *    (1)      (2)      (3)      (4)
		 * --> 24비트를 밀면
		 * 00000000|00000000|00000000|01111111 
		 *                               (1)
		 * --> 16비트를 밀면  
		 * 00000000|00000000|01111111|11111111
		 *                      (1)      (2) 
		 * --> 8비트를 밀면 
		 * 00000000|01111111|11111111|11111111
		 *             (1)      (2)     (3)
		 */
		
		/*
		fos.write(intData>>24); // 24비트를 민다
		fos.write(intData>>16); // 16비트를 민다
		fos.write(intData>>8); // 8비트를 민다
		fos.write(intData);
		*/
		
		dos.writeInt(intData); // fos.write에서 수동으로 밀었던게 여기는 자동으로 되는?
		dos.writeByte(127);
		dos.writeBoolean(true);
		dos.writeDouble(3.141592);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바입출력을 공부합니다.");
		dos.close();
		
		System.out.println("DataOutputStream.wirteXXX()--> dataOut.dat에 써주는 것");
		
		System.out.println("------------------");
		System.out.println("DataInputStream.readXXX() <-- dataOut.dat");
		DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
		// write한 순서대로 읽지 않으면 안읽어지고 깨짐.
		int readInt = dis.readInt();
		System.out.println("int:"+readInt);
		System.out.println("byte:"+dis.readByte());
		System.out.println("boolean:"+dis.readBoolean());
		System.out.println("double:"+dis.readDouble());
		System.out.println("char:"+dis.readChar());
		System.out.println("String:"+dis.readUTF());
		dis.close();
	}

}
