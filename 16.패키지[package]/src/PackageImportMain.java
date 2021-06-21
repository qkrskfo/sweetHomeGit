
import com.itwill.shop.ShopService;
import com.itwill.shop.admin.Member;
import com.itwill.shop.admin.MemberService;
/* 줄임말이 같은건 들어갈 수 없음. 하나는 풀네임으로 들어가야해.
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
 */

import com.itwill.shop.order.*;
/*
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderService;
 */

public class PackageImportMain {
	
	public static void main(String[] args) {
		
		Member am1 = new Member();
		System.out.println(am1);
		MemberService ams1 = new MemberService();
		System.out.println(ams1);
		
		Member m1 = new Member();
		System.out.println(m1);
		MemberService ms1 = new MemberService();
		System.out.println(ms1);
		
		
		Order o1 = new Order();
		System.out.println(o1);
		OrderService os1 = new OrderService();
		System.out.println(os1);
		
		ShopService ss1 = new ShopService();
		System.out.println(ss1);
	}

}
