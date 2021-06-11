
public class StaticMain {

	public static void main(String[] args) {

		System.out.println("--- static member access ---");
		
		/*
		 * 정적 멤버 접근
		 *  - 클래스이름.정적멤버이름
		 *  - Stitic.static_field
		 */ 
		
		System.out.println("1.Static.static_field: "+Static.static_field);
		Static.static_field=909090;
		System.out.println("2.Static.static_field: "+Static.static_field);		
		Static.static_method();
		// static은 객체 생성 없이도 바로 사용 가능.
		// 클래스 로딩이 끝나면 바로 사용 가능함.
		// 그래서 스태틱은 언제 쓰는건데?
		
		
		Static instance1 = new Static();
		System.out.println("--- instance1 member access --- 주소 : "+instance1);
		System.out.println(instance1.instance_field);
		instance1.instance_field=777;
		System.out.println(instance1.instance_field);
		instance1.instance_method();
		
		
		Static instance2 = new Static();
		System.out.println("--- instance2 member access --- 주소 : "+instance2);
		System.out.println(instance2.instance_field);
		instance2.instance_field=333;
		System.out.println(instance2.instance_field);
		instance2.instance_method();
		
		System.out.println("--- 객체주소를 사용해서 static 멤버에 접근 ---");
		// The static field Static.static_field should be accessed in a static way
		instance1.static_field=112;
		instance1.static_method();
		System.out.println(Static.static_field);
		System.out.println("instance1.static_field"+instance1.static_field);
		System.out.println("instance2.static_field"+instance2.static_field);
		
		
	}

}
