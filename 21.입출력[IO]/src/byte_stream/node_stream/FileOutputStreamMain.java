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
		fos.write(65);
		fos.write(66);
	}

}
