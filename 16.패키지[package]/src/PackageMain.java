/*
      package 
      1. 관련있는(업무) 클래스의 모음(패키지)
      2. 패키지의 이름은 계층적으로 큰범위부터 작은범위로 구성  
      3. 클래스의 완전한 이름은 패키지를 포함한 이름이다.
      4. 이름 충돌을 피하기위해서 
     ex> package samson.sds.chongmu;
	     public class Chongmu1{
		 
		 }
       
	  4.compile 방법 
			>javac -d . XXX.java  	
*/

public class PackageMain {

	public static void main(String[] args) {
		
		//클래스의 풀네임
		com.itwill.shop.admin.Member am1 = new com.itwill.shop.admin.Member(); 
		System.out.println(am1);
		
		com.itwill.shop.admin.MemberService ams1 = new com.itwill.shop.admin.MemberService();
		System.out.println(ams1);
		
		com.itwill.shop.member.Member m1 = new com.itwill.shop.member.Member();
		System.out.println(m1);
		com.itwill.shop.member.MemberService ms1 = new com.itwill.shop.member.MemberService();
		System.out.println(ms1);
		
		com.itwill.shop.order.Order o1 = new com.itwill.shop.order.Order();
		System.out.println(o1);
		com.itwill.shop.order.OrderService os1 = new com.itwill.shop.order.OrderService();
		System.out.println(os1);
		
		com.itwill.shop.ShopService ss1 = new com.itwill.shop.ShopService();
		System.out.println(ss1);
	}

}
