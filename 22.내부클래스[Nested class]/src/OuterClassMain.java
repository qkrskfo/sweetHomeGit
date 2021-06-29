
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 325888;
		oc.outer_member_method();
		
		//그러나 지들끼리 안에서 만들지 이렇게 밖에서 쓰진 않는다
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.inner_member_field = 3434;
	}

}
