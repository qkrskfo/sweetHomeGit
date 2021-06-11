/*
 * class 선언
 *  - 형식
 *       접근제한자  class  클래스이름{
 *       	- 접근제한자:public,protected,없는거
 *       
 *       } 
 *       ex> public class Car{
 *           }
 *           
 *  - 구성요소
 *     1.멤버변수선언(속성)
 *        접근제한자(public,proected,없는거,private) 타입 indentifier;
 *        ex> public String carName;
 *        
 *     2.멤버메쏘드 선언(행위)    
 *        접근제한자 리턴타입 메쏘드이름(인자){
 *           -인자: 나를 호출한놈이 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한놈에게 줄 데이타타입 
 *                     void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
public class Car {
	/*
	클래스의 구성요소
	   1. 필드(멤버변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 멤버메쏘드[기능](차객체가 가지고있는 기능)
	*/
	
	//1.필드(멤버변수)(속성)
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	/*
	 * 생성자
	 */
	public Car() {
		
	}
	
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}


	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}

	// 2. 멤버메쏘드[기능](차객체가 가지고있는 기능)

	/*
	 * 입차데이터(번호, 입차시간) 셋팅
	 */
	public void setIpChaData(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;		
	}
	
	/*
	 * 출차데이터(출차시간) 셋팅
	 */
	public void setOutChaData(int outTime) {
		this.outTime = outTime;
		return;
	}
	
		
	/*
	 * 요금 계산
	 */
	public void calculateFee(){
		this.fee=(this.outTime-this.inTime)*1000;
	}

	/*
	 * 차량정보출력
	 *  - 셀프참조변수, this
	 */
	// 헤더출력
	public void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s %n","차량번호", "입차시간", "출차시간", "주차요금");		
		System.out.println("-----------------------------------");
	}
	// 정보출력
	public void print() {
		System.out.printf("%7s %7d %9d %8d %n",this.no,this.inTime,this.outTime,this.fee);
	}


	//	setter
	public void setNo(String no) {
		this.no = no;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	// getter
	
	public String getNo() {
		return no;
	}

	public int getInTime() {
		return inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public int getFee() {
		return fee;
	}

	
	
	
	
	
	
	
	
	
	
}