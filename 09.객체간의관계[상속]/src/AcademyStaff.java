
public class AcademyStaff extends AcademyMember {

	public String depart;
	public AcademyStaff() {

	}
	public AcademyStaff(int no, String name,String depart) {
		this.no = no;
		this.name = name;
		this.depart = depart;
	}
	
	public void staffPrint() {
		this.print();
		System.out.println(depart);
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
	
	
}
