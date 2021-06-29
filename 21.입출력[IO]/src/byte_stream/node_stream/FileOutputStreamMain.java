package byte_stream.node_stream;

import java.io.FileOutputStream;

/*
 * << 출력스트림(OutPutstream) 사용방법 >>
 * 1. 데이터 목적지(target, destination) 선정(파일)
 * 2. 출력스트림(OutPutStream) 객체 생성 (FileOutPutStream)
 * 3. 출력스트림(OutPutStream)에 한바이트씩 쏜다(write)
 * 4. 출력스트림(OutPutStream) 닫는다. (close)
 */

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fileOut.dat");
		/*
		 * public abstract void write​(int b) throws IOException
		 * 		Writes the specified byte to this output stream.
		 * 		The general contract for write is that one byte is written to the output stream.
		 * 		The byte to be written is the eight low-order bits of the argument b.
		 * 		The 24 high-order bits of b are ignored.
		 * 		Subclasses of OutputStream must provide an implementation for this method.
		 */
		
		/*
		 * 00000000|00000000|00000000|01000001
		 * --> 마지막 8자리가.
		 */
		
		fos.write(65);
		
		/*
		 * 00000000|00000000|00000000|01000010
		 * * --> 마지막 8자리가.
		 */
		fos.write(66);
		
		/*
		 * 01111111|11111111|11111111|11111111
		 * * --> 마지막 8자리가 fildOut.dat에 들어간다.
		 */
		fos.write(2147483647);
		
		
		/* fos.write(int)에 들어가는 범위
		 * 00000000|00000000|00000000|00000000 --> 0
		 * ~
		 * 00000000|00000000|00000000|11111111 --> 255
		 */
		
		for(int i = 0; i < 256; i++) {
			fos.write(i); //--> 이렇게하면 fileOut.dat은 259바이트가 될거래..
		}
		
		fos.close();
		
		System.out.println("FileOutputStream.write --> fileOut.dat");
		
	}

}
