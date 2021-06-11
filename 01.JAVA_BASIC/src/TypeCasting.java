public class TypeCasting {

	public static void main(String[] args) {

		/* 형변환--> 숫자형데이타간에만 가능
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
       */

		
		// 자동형변환
		int i1 = 56;
		long l1 = i1;
		System.out.println(l1);
		
		double d1 = i1;
		System.out.println(d1);
		
		char c1 = '박';
		int i2 = c1;
		System.out.println(i2);
		
		// 자동 형변환 안됨. 강제 타입 변환 casting
		double avgd = 85.665;
		int avgi = (int)avgd;
		System.out.println("나는"+avgd);
		System.out.println(avgi);
		
		/*
		 * 연산시의 형변환
		 *   - 연산항들중에 가장 큰 타입으로 모든 항이 형변환된다(promotion)
		 *   
		 */
		
		int ii = 100;
		char cc = 'A';
		long ll = 45;
		double dd = 45.26;
		
		long lResult = ii+cc+ll;
		double dResult = ii+cc+ll+dd;
		
		
		/*
		 * double avgd = 85.665;
		 * 
		 * quiz.
		 * 1. 소수점이하 첫째자리를 남겨두고 casting -> 85.6
		 * 2. 소수점이하 둘째자리에서 반올림 ->85.7 
		 * 
		 * System.out.println(String.format("%.2f", pie)); //결과 : 3.14
		 *
		 * 연산식 형변환 먼저 해야될걸?~
		 * Math.round() 소수점 첫자리에서 반올림한 값을 반환
		 * System.out.println(Math.round(pie*100)/100.0); //결과 : 3.14
		 * 
		 */
		System.out.println(String.format("%.1f", avgd)); // 85.7
		System.out.println(Math.round(avgd*10)/10.0); // 85.7
		System.out.println(Math.floor(avgd*10)/10.0); // 85.6
		
		/*
		 * double avgd = 85.665;
		 * 
		 * quiz.
		 * 1. 소수점이하 첫째자리를 남겨두고 casting -> 85.6
		 * 2. 소수점이하 둘째자리에서 반올림 ->85.7 
		 * 
		 * System.out.println(String.format("%.2f", pie)); //결과 : 3.14
		 *
		 * System.out.println(Math.round(avgd*10)/10.0); // 85.7
		 * System.out.println(Math.floor(avgd*10)/10.0); // 85.6
		 * 
		 * 85.665 --> 8566.5 --> 8566 --> 8566+5 --> 8571 --> 857.1 --> 857 --> 85.7 
		 * 
		 */
		
		double dd1 = 85.665;
		double dresult = dd1 * 100;
		System.out.println("1. "+dresult);
		int ii1 = (int)dresult;
		System.out.println("2. "+ii1);
		dresult = ii1 + 5;
		System.out.println("3. "+dresult);
		dresult = dresult / 10;
		System.out.println("4. "+dresult);
		ii1 = (int)dresult;
		System.out.println("5. "+ii1);
		dresult = (double)ii1/10;
		System.out.println("6. "+dresult);
		
		double ad = 85.665;
		System.out.println(ad);
		ad = ad * 100;
		System.out.println(ad);
		int ai = (int)ad;
		System.out.println(ai);
		ai = ai + 5;
		System.out.println(ai);
		ad = ai / 10;
		System.out.println(ad);
		ad = ad / 10;
		System.out.println(ad);
		
		
	}

}