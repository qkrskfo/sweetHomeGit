package char_stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterMain {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("fileWriter.txt");
		fw.write(44456);
		fw.write('A');
		fw.write('김');
		
		for (int i = 0; i < 65536; i++) {
			fw.write(i);
			if(i%100==0) {
				fw.write('\n');
			}
		}
		fw.write('\n');
		fw.write("문자열을 마음대로 쓰세요");
		fw.write("\n");
		
		fw.flush();
		fw.close();
		System.out.println("=== FileWriter.write() ===");
		
		
		FileReader fr = new FileReader("fileWriter.txt");
		int readChar = fr.read();
		System.out.println("1. readChar:"+readChar);
		readChar = fr.read();
		System.out.println("2. readChar:"+readChar);
		
	}

}
