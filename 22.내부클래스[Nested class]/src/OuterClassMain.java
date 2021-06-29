
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 325888;
		oc.outer_member_method();
		OuterClass.InnerClass ic = oc.new InnerClass();

	}

}
