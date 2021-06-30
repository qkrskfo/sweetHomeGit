package char_stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterCopyMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("demian.txt");
		FileWriter fw = new FileWriter("demian_copy.txt");
		
		while(true) {
			int readChar = fr.read();
			if(readChar == -1) break;
			if(readChar =='.') {
				fw.write(readChar);
				fw.write('\n');
			} else if (readChar == '-') {
				fw.write(readChar);
				fw.write("page");
			} else {
				fw.write(readChar);
			}
		
		}
		fr.close();
		fw.flush();
		fw.close();
		
		System.out.println("-------- FileReaderWriterCopy --------");
	}

}
