
public class ForNested {

	public static void main(String[] args) {

//		/*
//		 ★★★★★
//		 ★★★★★
//		 ★★★★★
//		 ★★★★★
//		 ★★★★★
//		 */
//		
//		System.out.println(" ----- 1번 quiz ------ ");
//		
//		int a = 0;
//		while(a<5) {			
//			int b = 0;
//			while(b<5) {			
//				System.out.print("★");
//				b++;
//			}
//			System.out.print("\n");
//			a++;
//		}
//		
//		System.out.println(" ----- 1번 quiz 끝------ ");
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%s[%d,%d]","★",i,j);
			}
			System.out.print("\n");
		}
		
	}

}
