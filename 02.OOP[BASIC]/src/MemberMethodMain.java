/*
2.멤버메쏘드 선언()    
 *        접근제한자 리턴타입 메쏘드이름(매개변수){
 *           -매개변수: 나를 호출한 클래스(객체)가 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한 클래스(객체)에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 
 // 클래스파일이랑 메인메소드파일이 같이있옹
// 클래스파일의 public을 지워주고, 기존 MemberMethod 파일을 지우고, 메인메소드 위에 클래스파일 내용을 붙여줌
 */
class MemberMethod {
	public int member1=88;
	public int member2=99;
	
	// 필드는 생성자와 메소드 중괄호{} 블록 내부에서는 선언될 수 없기에 여기에 선언한 것.
	
	// 내가 반환할 타입에 대해 작성하는 것
	// 인티저를 반환할거면 public int method1(){} 로 치면 됨
	// 괄호는 내가 받을 데이터의 양식 같은 것?
	// 괄호를 비워두면 아무것도 안받는다는 것.
	
	public void method1(){
		System.out.println("void method1()실행1");
		System.out.println("void method1()실행2");
		System.out.println();
		/*
		 * - 모든 메쏘드의 마지막에는 항상 실행흐름을
		 *   호출한곳(클래스,객체)으로 반환하여야한다.
		 * - return문을 만나면 호출한곳으로 반환된다.
		 * - return type이 void인경우에는 생략이 가능하다.
		 * - return문이 생략된경우에는 자동return된다.
		 */
		return;
	}
	public void method2() {
		System.out.println("void method2() 실행1");
		System.out.println("void method2() 실행2");
		System.out.println("void method2() 실행3");
		System.out.println();
		return;
	}
	
	public void method3(int count) {
		System.out.println("void method3(int count) 실행");
		int localVar = 1111;
		System.out.println("method3 블록안에서 선언된 변수--> "+localVar);
		for(int i=0; i<count; i++) {
			System.out.println("void method3(int count)실행 파라메타-(매개변수 인자) count값 --> "+count);
		}
		System.out.println();
		return;
	}
	
	public void method4(String msg, int count) {
		System.out.println("void method4(String msg, int count)이 호출됐다");
		System.out.println("String msg--> "+msg);
		System.out.println("int count--> "+count);
		System.out.println();
		for(int i=0; i<count; i++) {
			System.out.println("for문으로 count에 들어온 횟수만큼 호출");
			System.out.println("String msg--> "+msg);
			System.out.println("int count--> "+count);
			System.out.println();
		}
		return;
	}
	
	public void method5(String name, String msg, int count) {
		System.out.println("------void method5(String name, String msg, int count------");
		for(int i = 0; i<count; i++) {
			System.out.printf("%s님 %s%n",name,msg);
			System.out.println();
		}
		return;
	}
	
	
	/*
	 * 멤버변수출력하는기능
	 */
	public void print() {
		/*
		 * this
		 *   - self참조변수
		 *   - print메쏘드를 가지고있는 객체의 주소값
		 */
		System.out.println(this.member1);
		System.out.println(this.member2);
		System.out.println();
	}
}



public class MemberMethodMain {
	public static void main(String[] args) {
		MemberMethod mm=new MemberMethod();
		
		System.out.println(mm.member1);
		System.out.println(mm.member2);
		mm.member1=2147483647;
		mm.member2=-2147483648;
		System.out.println("main stmt1");
		/*
		 * 멤버메쏘드실행(호출)
		 *   - 형식:참조변수.메쏘드이름();
		 *   - mm객체의 method1 메쏘드블록을 실행하기위해
		 *     main실행흐름을 method1블록으로보낸다.
		 */
		mm.method1();
		System.out.println("main stmt2");
		mm.method2();
		System.out.println("main stmt3");
		
		/*
		 MemberMethod 클래스
		 	public void method3(int count){ }
		 * 
		 */
		System.out.println();
		System.out.println("----------매개변수(파라메타,인수)를 사용한 호출---------");
		System.out.println("매개변수 int count는 호출할 때 정의되고 실행됨 ");
		mm.method3(2);
		mm.method3(4);
		System.out.println();
		/*
		 MemberMethod 클래스
		 	public void method4(String msg, int count)
		 */
		
		mm.method4("메세지", 3);
		mm.method4("메시지2", 2);
		
		/*
		 MemberMethod 클래스
		 	void method5(String name, String msg, int count)
		 */
		
		System.out.println();
		System.out.println("----------method5 호출---------");
		mm.method5("박나래","안녕하세요!", 2);
		mm.method5("박여름","식사 하셨어요?", 2);
		
		
		System.out.println("-------mm객체멤버데이타출력------");
		//System.out.println(mm.member1);
		//System.out.println(mm.member2);
		mm.print();
		
		System.out.println("-------mm2 객체멤버데이타출력------");
		MemberMethod mm2 = new MemberMethod();
		mm2.member1 = 1;
		mm2.member2 = 2;
		mm2.print();		
		
		
		return;
	}
}
