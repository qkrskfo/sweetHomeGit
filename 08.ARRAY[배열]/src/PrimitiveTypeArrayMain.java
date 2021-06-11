/*
 배열:  
      - 같은 데이터형을 가진 변수 여러개의 모음타입 
      - 배열변수의 선언형식
           데이타타입[] 이름; 
           배열데이터타입 변수이름;
	  - 사용: 
	       1.배열타입 객체의 생성	
		   2.배열객체멤버들의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다. (배열은 객체다.)
		  2.같은 타입만 정의가 가능하다. 
		  3.길이가 만들 때 고정된다. 		 
 */


public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {

		int intType=0;
		intType = 99;  
		
		int[] intArray;
		intArray = null;
		intArray = new int[5];
				
		intArray[0] = 11;
		intArray[1] = 22;
		intArray[2] = 33;
		intArray[3] = 44;
		intArray[4] = 55;
		
		System.out.println(intArray[0]);
		System.out.println(intArray);
		
		System.out.println("---- for loop ----");
		for(int i = 0; i <intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println();
		System.out.println("배열의 길이는: "+intArray.length);
		System.out.println();
		System.out.println("--- 기본형 1차원 배열 ---");
		
		int[] korArray = new int[10];
		korArray[0] = 77;
		korArray[1] = 91;
		korArray[2] = 83;
		korArray[3] = 60;
		korArray[4] = 87;
		korArray[5] = 99;
		korArray[6] = 100;
		korArray[7] = 79;
		korArray[8] = 93;
		korArray[9] = 51;
		int korTot = 0;
		
		System.out.println("배열의 길이는: "+korArray.length);
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i]; // korTot = korTot + korArray[i]
		}
		System.out.println("우리반 국어 총점수: "+korTot);
		System.out.println("우리반 국어 평균점수: "+korTot/korArray.length);
		
		System.out.println();
		System.out.println("--- char[] ----");
		char[] ca = new char[6];
		ca[0] = 'H';
		ca[1] = 'E';
		ca[2] = 'L';
		ca[3] = 'L';
		ca[4] = 'O';
		ca[5] = '!';

		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("--- String[] ----");
		
		String[] strArray = new String[5];
		strArray[0] = "KIM";
		strArray[1] = "LEE";
		strArray[2] = "PARK";
		strArray[3] = "JANG";
		strArray[4] = "LIM";
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		
	}

}
