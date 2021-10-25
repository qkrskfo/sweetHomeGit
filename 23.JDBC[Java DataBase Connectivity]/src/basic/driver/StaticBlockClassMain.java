package basic.driver;

public class StaticBlockClassMain {

	public static void main(String[] args) throws Exception {
		/*
		 * Class loading
		 *   - 생성자호출
		 *   - Class.forName("class name");
		 */
		/*
		StaticBlockClass sbc = new StaticBlockClass();
		*/
		String className = "basic.StaticBlockClass";
		Class.forName(className);

	}

}
