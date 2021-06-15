
public class AcademyMemberArrayOverridingMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "Kim", "ARDUINO");
		students[1] = new AcademyStudent(2, "Jim", "ANDROID");
		students[2] = new AcademyStudent(3, "Lim", "BIGDATA");

		gangsas[0] = new AcademyGangsa(4, "김강사", "OFFICE");
		gangsas[1] = new AcademyGangsa(5, "이강사", "JAVA");

		staffs[0] = new AcademyStaff(6, "HONG", "재무팀");
		staffs[1] = new AcademyStaff(7, "PARK", "홍보부");

		System.out.println("Academy Member 전체 출력");
		System.out.println("Student");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		System.out.println("Gangsa");
		for (int i = 0; i < gangsas.length; i++) {
			gangsas[i].print();
		}
		System.out.println("Staff");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}
	}

}
