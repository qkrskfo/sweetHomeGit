
public class Car {

	// 전체 생산대수도 객체가 다 가질필요없어 -> static으로!
	public static int count; // 차량의 총생산대수
	
	//캡슐화
	private int no; // 차번호
	private String model; // 모델명
	private String color; // 색상
	
	/*
	 private static int count;
	 --> 이렇게 하는 경우 getter, setter에도 static으로 만들어줘야해
	 
	 public static int getCount(){
	 	return count;
	 }
	 public static void setCount(int count){
	 	Car.count = count;
	 } --> this 사용 불가
	 
	 */	
	
	
	// 기본생성자
	/*
	public Car() {

	}
	*/

	// 멤버필드 초기화
	public Car(int no, String model, String color) {
		this.no = no;
		this.model = model;
		this.color = color;
		Car.count++; 
		// 스태틱이라 this.count++ 보다는 클래스 이름으로 하는게 좋아. 
		// 클래스이름은 생략가능하긴해. 같은 클래스라서.
	}
	
	// 헤더프린트는 한번만 찍자나? 객체에 기반한 업무를 하지도 않고.
	// 카 객체가 해야될 일이 아니자나? 모두가 쓸 수 있잖아.
	// 인스턴스가 이걸 갖고 있는게 불필요하잖아.
	// 틀에다 놓고 같이쓰자. = static 
	public static void headerPrint() {
		System.out.println("-----------------");
		System.out.println("번호 \t 모델 \t 색상");
		System.out.println("-----------------");
	}
	
	// 차 객체마다 프린트를 찍어야하는데 static으로 만들면 안되지~!
	public void print() {
		System.out.println(this.no+"\t"+this.model+"\t"+this.color);
	}
	
	// 초기화했으니까, getter, setter 만들자
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
	
	
	
	
}
