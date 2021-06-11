public class Car {

	private int no;
	private String model;
	 
	// 엔진객체
	// 엔진이 카에 포함되어있는 관계
	// 멤버필드에 엔진을 포함시켜야해.
	
	private Engine engine;
	
	public Car() {
	
	}
	
	public Car(int no, String model, Engine engine) {
		this.no = no;
		this.model = model;
		this.engine = engine;
	}

	
	public void print() {
		System.out.print(this.no+"\t"+this.model+"\t");
		this.engine.print();
	}
	
	// 캡슐화를 안하면 의존성이 강해서 안좋아.
	
	
	public Engine getEngine() {
		return this.engine; // this는 남들과 똑같이 생략가능함.
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine; 
	}
	
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
	
	
	
	
}
