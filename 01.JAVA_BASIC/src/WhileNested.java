
public class WhileNested {

	public static void main(String[] args) {

		System.out.println("1.---------------------------------");

		/*
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 ★★★★★
		 */
		
		int i=0;
		while(i < 5) {
		    int j=0;
			while(j < 5) {
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.print("\n");
			i++;
		}
		
		System.out.println();	
		System.out.println("2.---------------------------------");
		/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		 */
		
		i = 0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				if(i==j) {
					System.out.printf("%s","☆");
				}else {
					System.out.printf("%s","★");
				}
				j++;
			}
			System.out.println();
			i++;
		}

		
		
		System.out.println();		
		System.out.println("3.---------------------------------");
		/*
		 ☆☆☆☆☆
		 ★☆☆☆☆
		 ★★☆☆☆
		 ★★★☆☆
		 ★★★★☆
		 */
		
		i = 0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				if(i<=j) {
					System.out.printf("%s","☆");
				} else {
					System.out.printf("%s","★");
				}
				j++;
			}
			System.out.println();
			i++;			
		}

		
		
		System.out.println();
		System.out.println("4.---------------------------------");
		/*
		 ★
		 ★★
		 ★★★
		 ★★★★
		 ★★★★★
		 */
		
		i = 0;
		while(i<5) {
			int j = 0;
			while(j<5) {
				if(i>=j) { // (j < i+1) 도 가능
					System.out.printf("%s","★");
				}
				j++;
			}
			System.out.println();
			i++;
		}	
		
	}

}
