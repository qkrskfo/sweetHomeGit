package dao.address.fourth;


/*
VO(Value Object), DTO(Data Transfer Object)
  	- 한 개의 주소객체 데이타를 가지고있다.(VO, Value Object)
  	- 한 개의 주소객체 데이타 이동(파라메타, 리턴데이터) 시키기 위한 객체 (DTO)
  	- 특정 테이블과 동일한 속성을 멤버변수로 가지는 객체
 */

public class Address {

	/*
	 * address table column과 대응하는 필드(멤버변수)를 가짐
	 */
	
	private int num;
	private String id;
	private String name;
	private String phone;
	private String address;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int num, String id, String name, String phone, String address) {
		super();
		this.num = num;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// source - generate toString
	@Override
	public String toString() {
		return "Address [num=" + num + ", id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
	
}
