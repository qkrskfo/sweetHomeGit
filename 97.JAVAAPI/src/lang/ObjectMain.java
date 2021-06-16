package lang;

public class ObjectMain {

	public static void main(String[] args) {

		/*
		Class Object is the root of the class hierarchy. 
		Every class has Object as a superclass. 
		All objects, including arrays, implement the methods of this class.
		*/
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		/*
		toString 메소드
		 
		public String toString()
		Returns a string representation of the object. 
		
		 It is recommended that all subclasses override this method.
		 
		 Returns: a string representation of the object.
		*/

		String str1 = o1.toString();
//		String str2 = o2.toString();
		String str3 = o3.toString();
		
		System.out.println(str1);
		System.out.println("o2-->"+o2);
		System.out.println("o2.toString() -->"+o2.toString());
		System.out.println(str3);
	}

}
