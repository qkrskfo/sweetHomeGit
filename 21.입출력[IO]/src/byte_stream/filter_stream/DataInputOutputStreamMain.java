package byte_stream.filter_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamMain {

	public static void main(String[] args) throws Exception {

		/*
		 *  자바의 기본데이터를 출력 스트림에 쉽게 쓸 수 있도록 하는 필터 클래스
		 */
		
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat"));
		FileOutputStream fos = new FileOutputStream("dataOut.dat");
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
		
		fos.write(intData>>24); // 24비트를 민다
		fos.write(intData>>16); // 16비트를 민다
		fos.write(intData>>8); // 8비트를 민다
		fos.write(intData);
		
		
	}

}
