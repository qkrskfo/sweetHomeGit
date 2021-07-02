package file;

import java.io.File;
import java.io.IOException;
public class FileMain {
	public static void main(String[] args) throws Exception {
		/*
		 파일의 경로
		 
		  현재 경로[기준경로]
		  	eclipse --> D:\eclipse-workspace\NR (21.입출력[IO])
		  상대(relative) 경로
		  	현재경로를 기준으로 경로를 기술
		  절대(absolute) 경로
		  	C:, D: 드라이브를 기준으로 경로를 기술
		 */
		
		String str = "김\"경\"호";
		File file1 = new File("2.png"); // 상대경로
		File file2 = new File("sample/ssdd.txt"); // 상대경로
		File file3 = new File("sample/subSample1/IfTest2.java"); // 상대경로
		File file4 = new File("D:\\eclipse-workspace\\NR\\sample\\캡처.PNG"); // 절대경로
	
		// 역슬래쉬는 컨트롤 문자를 기술할 때 씀
		// 역슬래쉬 뒤에 쓸 수 있는게 정해져있음. \n, \t 등등
		// 파일경로는 걍 슬래쉬로 쓰면 알아서 바꿔줌
		//  --> 파일경로에 역슬래쉬를 쓰고시프면 두번써 \\ 이렇게
		
		// 파일객체가 만들어질때는 해당 파일이 있는지 확인하지 않음
		// 나중에 정보를 꺼낼 때 잉 파일 이상한데? 한데 ㅋㅋㅋ
		
		// 파일을 읽는건 IO로 하는거고!

		System.out.println("------------1.file path------------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("------------2.file absolute path------------");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("------------3.file name------------");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("------------4.file parent------------");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
		
		File dir1 = new File("sample");
		File dir2 = new File("sample/subSample1");
		File dir3 = new File("sample", "subSample1");
		
		System.out.println("------------5.delete file ------------");
		//file 생성, 삭제, 이름변경
		
		File newFile1 = new File("newDir1","newFile1.txt"); // 파일의 위치 : parent, 자식
		File newFile2 = new File("newDir1","newFile2.txt");
		
		// 생성
		System.out.println("newFile1 생성: "+newFile1.createNewFile());
		System.out.println("newFile2 생성: "+newFile2.createNewFile());
		// 윈도우랑 리눅스랑 다른데 자바에서 파일을 만들 수 있으면 안되는거지. 그래서 의존성 가지지 말라고 exception 발생
		
		// 이름변경
		System.out.println("newFile2 이름변경: "+newFile2.renameTo(new File("newDir1","renameNewFile2.txt")));
		
		//삭제
		System.out.println("newFile1 삭제: "+newFile1.delete());
		// deleteOnExit : 있으면 지워줘.
		
		
		
		
		
		
		
		System.out.println("------------6.isDirectory, isFile------------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir1.isFile());
		System.out.println(dir2.isDirectory());
		System.out.println(dir2.isFile());
		
		System.out.println("------------7. 디렉토리안에 파일(디렉토리)의 목록(String[])------------");
		String[] fileNameList = dir1.list();
		for(String fileName : fileNameList) {
			System.out.println("\t"+fileName);
		}
		System.out.println("------------8. 디렉토리안에 파일(디렉토리)의 목록(File[])------------");
		File[] fileList = dir1.listFiles();
		for (File file : fileList) {
			if(file.isDirectory()) {
				System.out.println("\t D:"+file.getName());
				File[] subFileList = file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t\t"+subFile.getName());
				}
			} else if(file.isFile()) {
				System.out.println("\t F:"+file.getName());
			}
		}
		
		System.out.println("------------9. root directory list------------");
		File[] rootDriveFileList = File.listRoots();
		for (File rootFile : rootDriveFileList) {
			System.out.println(rootFile.getPath());
		}
		
		System.out.println("------------ c:\\ file list ------------");
		File[] cDriveFileList = rootDriveFileList[0].listFiles();   // C:/
		for (File cDriveFile : cDriveFileList) {
			System.out.println(cDriveFile.getName());
		}
		
		System.out.println("------------10. directory 생성------------");
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2");
		File newDir3 = new File("sample","subSample3");
		System.out.println("newDir1의 존재여부: "+newDir1.exists());
		System.out.println("newDir1의 생성: "+newDir1.mkdir()); // make directory, 존재하면 안만들어짐
		System.out.println("newDir2의 생성: "+newDir2.mkdir()); 
		System.out.println("newDir3의 생성: "+newDir3.mkdir()); 
		
		System.out.println("------------11. directory 이름 변경------------");
		newDir2.renameTo(new File("renameDir2"));
		
		
		
		System.out.println("------------12. directory 삭제------------");
		System.out.println(newDir3.delete());
		
		
		
		
		
	}
}