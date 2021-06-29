
/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법중의 하나이다.
 *   
 *   -형태 : 부모클래스에 정의된 메쏘드의 이름, 리턴타입, 인자가 동일한 메쏘드를 자식클래스에 정의(재정의)하는것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 *  인터페이스는 implements로 하면 됨
 * 
 */

class OverridingParent{
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");		
	}
}

class OverridingChild extends OverridingParent{
	/*
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");		
	}
	*/
	
	//overriding
	public void method2() {
		System.out.println("OverridingChild에서 재정의된 method2 start--");
		/*
		 * super(self참조변수)
		 *   - this와 같은 self참조변수
		 *   - this와 super는 같은 주소를 가르킴
		 *   - 재정의에 의해 은폐된 메쏘드를 호출할 때 사용
		 */
		super.method2();
//		this.method2(); 무한루프돌아. 자기 자신을 계속 호출하잖아. 
		System.out.println(this.toString()+"==="+super.toString());
		System.out.println("OverridingChild.method2() 2%추가");
		System.out.println("OverridingChild에서 재정의된 method2 end--");
	}
	/*
	 * 재정의하면
	 *   - 상속받은 method2()는 은폐(호출안됨)
	 *   - 자식에서 재정의한 method2()만 호출됨
	 */
	
	public void method3() {
		System.out.println("OverridingChild에서 정의한 method3()");
	}
}

public class OverridingMain {
	public static void main(String[] args) {

		OverridingChild oc = new OverridingChild();
		oc.method1();
		oc.method2();
		oc.method3();
		
	}
}
