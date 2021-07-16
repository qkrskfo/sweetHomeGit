import java.sql.Connection;
import java.sql.DriverManager;

public class NaraeNote {

	public static void main(String[] args) {

/*
		 
타입변환 type casting
자동 타입 변환 promotion
 - 짤라도 데이터 손실이 발생하지 않을때
강제 타입 변환 casting
하나의 행에서 alt키를 누르고 down arrow 하면 행이 변경됨
*메인 메소드의 메카니즘?
메인블럭을 찾음(메인블럭을 실행하기 위해서) ==> 호출이라고 함.
-> 메인 실행흐름(메인스레드, 주 thred) 만듦 
-> 끝까지 가면 JVM으로 리턴.
* 코드정렬 / 들여쓰기
ctrl + shift + F
/* System.out.printf();
%d -> data 1개, %%d -> data 2개(?)
스트링은 %s
캐릭터는 %c
		
println은 한줄 띄우기 new line
		
printf에서 한줄 엔터 하고싶으면 %n 하면됨.
printf --> 포메터?
		
	int no1 = 88;
		
	if(no1%2==0) {
		// System.out.println("no1은 짝수입니다.");
		System.out.printf("%d은 %s입니다.%n",no1,"짝수");
	}else {
		// System.out.println("no1은 홀수입니다.");
		System.out.printf("%d는 %s입니다.%n",no1,"홀수");
	}
블록의 뎁스가 너무 깊지않은게 좋음.
->가독성이 떨어짐
refactor -> rename : 클래스파일 이름, 클래스명 모두 다 바꿀 수 있음 쉽게!!★
scanner 입력하고 ctrl + 스페이스바 ==> scanner / java.util. 하면됨.
import java.util.Scanner;
	Scanner console = new Scanner(System.in);
	console.nextInt(); // int eng = console.nextInt();
		// print 로 받으면 옆에서 입력받고
		// println 으로 받으면 한줄 밑에서 입력받게됨.
역슬래쉬t 는 1tap 만큼 떨어뜨려줘 하는것과 같음.
역슬래쉬n 은 엔터와 동일한 기능
for문에서는 i를 사용하고 for 블럭 밖에선 i가 영향을 받지 않는데
while은 while문에서 바뀐대로 i값이 변하니까 계속 초기화 하는 것.
i = i+1; 과 i+=1 이 같은말인 것처럼
total = total + i; 는 total +=i 와 같음
total+=i; // total = i + total;
i+=1 >> +연산 후에 대입하겠다는 뜻
210602 취업특강
%d -> %2d 하면 2자리를 확보한 채 우측정렬됨
%d -> %-10d 하면 좌측에 10자리를 확보한 채 좌측정렬됨.
%5.2f -> 전체자리 5자리수 중 소수점 둘째자리!

0603
클래스는
객체를 찍어내는 틀이면서
데이터의 타입이라는 의미도 가짐


0604
포매터!

sysoutf 템플릿 등록
window - preferences - java - editor - templates


클래스파일이랑 메인메소드파일이 같이 있는거 - 02.OOP[BASIC] - MemberMethodMain.java


dos > java MemberMethodMain 을 실행하면 VM이 만들어지고, 메소드영역(클래스가 적재되는 영역)과 힙영역(객체생성영역)이 생기고.. 
VM이 메인메소드를 찾아.
그러고 관련 있는 모든 클래스파일이 메소드영역에 올라가.
메인 메소드를 찾으면 실행흐름을 준비하고, 메인 메소드를 호출해!


0607
메쏘드 일때만 쓰레드를 그린다.

멤버변수는 class 안에 선언된다.
메인메소드 안에 선언된 변수는 멤버변수가 아님.
멤버변수는 파란글씨로 나옴.

0608
필드는 private으로 하고, 메소드로 사용해야하는 이유
 1) 유지보수가 용이함
 2) 같은 소스를 계속 반복해서 사용해야하는 번거로움을 줄일 수 있음
 3) 재사용성을 높임
 * 메소드는 한가지 기능만 있어야 함
 * 
 * 객체가 구분되려면 필드(멤버변수)가 필요하다.

0609
멤버메소드는 아무런 데이터도 갖고있지 않음
코드 자체만 있음.
멤버메소드 안에서 선언된 변수는 잠깐 만들어졌다가 반환될 때 없어짐.

0610
객체의 확장, 
객체는 독립적인 단위
객체(업무):실제이루어지고있는 업무(주차장)에서 보여지고 구체화되어있는 사물(차)    
객체(프로그램):실제이루어지고있는 업무(주차장)에서 보여지고 구체화되어있는 사물을 메모리의 데이타로 표현한것(차의데이타)
객체간의 관계(포함) - 멤버필드가 참조형이여야 함
왜 캡슐화를 하는지 한번 더!
자기 일은 스스로 하자!!
멤버변수는 private, 메소드로 오픈!


0614

IS A 관계?
vip회원도 일반회원과 같은 속성을 갖고 있어. 더 많은 행위를 갖고 있을 뿐이야!

선택적 상속도 불가능함.


0615
protected 다른놈은 사용 불가.
상속받은 애가 getter, setter없이도 쓸 수 있게 허용한 것.

0616
형변환 연산자는 소괄호로!

실행 시 발생하는 오류를 exception 예외 라고 함.

유지보수때문에 부모를 참조해서 쓰는 것.
자식을 참조하면 의존성이 높아짐.
유지보수가 용이하려면 상속, 재정의, 상위캐스팅

instanceof 는 객체타입을 확인하는데 사용하는 연산자.
부모객체인지 자식객체인지 확인하는데 쓴다.
true, false로 나옴
--> 12번 객체형변환에서 예제 확인 가능
객체 + instanceof + 클래스


0617
추상클래스는 상속과 재정의를 강제함.
모든메소드가 추상클래스(바디가 없는)인게 인터페이스. 완전추상메소드.

이탤릭으로 나오면 추상클래스


0618
추상메소드는 시그니처가 있따...?

인터페이스는 바디가 구현되지 않음.

인터페이스 안에 있는 메소드에는 바디가 없어야돼? 정의가 어긋나?
추상클래스는 5개 메소드가 있따
5개가 추상메소드로 구현되있고 5개는 concrate메소드일때
추상메소드는 스택이 있따고?? 구현된게 없으니까?? 안들려 ㅠㅠ

인터페이스와 추상과 상속의 이점과 같음
 
인터페이스 끼리는 상속받을 수 있다.

0621
추상메소드는 재정의를 강제함

0623
wrapper는 스트링과 비슷함 
래퍼 클래스(Wrapper class) --> 97.JAVAAPI에 있음
프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있습니다.
예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.
이때에는 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.

이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.
래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.
이러한 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공됩니다.

예제
Integer num = new Integer(17); // 박싱
int n = num.intValue();        // 언박싱
System.out.println(n);

Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
char c = ch;        // char c = ch.charValue();           : 오토언박싱
System.out.println(c);



System.out.println("Object[]");
		Object[] scoreArray = new Object[4];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 99;
		// scoreArray[0] 이건 오브젝트 타입이야

컬렉션 프레임워크!

객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
인터페이스를 구현한 클래스를 자바 유틸리티 패키지로 제공
이를 총칭해서 컬렉션 프레임워크라고 함!

라이브러리가 뭐에요?
프레임이 뭐에요?
사용방법을 정의한 인터페이스 - specification

컬렉션 - List 계열, Set 계열로 나눠짐
List, Set 인터페이스는 공통 규칙이 있어서 collection 인터페이스를 상속받음
Map 인터페이스는 구조상의 차이로 인해 별도로 정의됨.
List - Vector, ArrayList, LinkedList, Stack, Queue
Set - HashSet, TreeSet
Map - HashMap, TreeMap, Hashtable, Properties

재사용 가능한 인터페이스와 클래스들의 집합 = 라이브러리



List는 순서가 있으며 중복을 허용하는 특징의 데이터 구조
 - 배열도 순서가 있잖아. 순서가 있으니까 정렬을 할 수 있는거고.
 - 중복 허용 = 같은 객체가 두번 들어갈 수 있다는 것.
 - 배열과 가장 유사함
 - 인덱스가 존재함.

ArrayList는 object 타입.


Set은 순서가 없으며 중복을 허용하지 않는 특징의 데이터 구조
 - 
hashSet을 많이 씀

ListCollection은 

SetCollection은 집합. 보따리. 순서에 상관없고 중복이 허용되지 않음.


0624
map과 arrayList를 같이 쓴다...
map 안에 map을 넣고 그 안에 arrayList를 넣고..

이터레이션 iteration 반복
Iterator를 호출
 - 자기가 
 
 
 // 일반화하지 않은 no generic
 
 0625
 to string 재정의
 generic > account.java에 있음 
 
 hashset은 인터페이스의 구현클래스다
 hashset은 객체들을 순서없이 저장하고
 동일한 객체는 중복 저장하지 않습니다.
 hashset이 판단하는 동일한 객체란
 꼭 같은 인스턴스를 뜻하진 않습니다.
 hashset은 객체를 저장하기 전에 먼저 객체의 해시코드(주소) 메소드를 호출합니다.
 메소드를 호출해서 해시코드를 얻어내고,
 이미 저장되어있는 해시코드와 비교합니다.
 만약 동일한 해시코드가 있다면(중복 인지) 
 다시 equals 메소드로 두 객체를 비교합니다.
 비교해서 true가 나오면 동일한 객체로 판단합니다. 
 
 
 
enhanced for문 index없이도 찍을 수 있음.
	 index가 필요없는 전체출력인 경우엔 이게 더 좋겠지!
for (Account tempAccount : accountList) {
	tempAccount.print();
}



 0628
스트링은 재정의 안됨
final이야
 
 제일 
 중요한건 스레드의 동기화
 
 예를 들어 이미지를 랜더링할 때 그릴 시간을 줄 떄
 쓰레드를 슬립시킨다
 
 thread의 run에는 runtime exception이 생략되어있다...
 
 Nested class
 Inner class 
 중첩클래스, 클래스 안에 클래스
 
 
 0630
 이미지파일을 reader, writer 로 복사하면 안되지
 
 byte로 옮기는게 가장 빠르긴 해.
 
 
 
 	0701
	프린터스트림은 반드시 노드스트림이 있어야함 
	
	맨처음에 갯수 쓰고 어카운트 몇개
	
	
	시리얼라이제이션 serialization -직렬화 포맷을 변경시키는 것
	마셜링 marshalling
	
	스트림이나 피일로부터 자바 객체를 만들어내는거 언마셜링
	
	
	object_stream 쪽은 강사님 파일 다운받자
	
	
	역슬래쉬는 컨트롤 문자를 기술할 때 씀
	역슬래쉬 뒤에 쓸 수 있는게 정해져있음. \n, \t 등등
	파일경로는 걍 슬래쉬로 쓰면 알아서 바꿔줌
		--> 파일경로에 역슬래쉬를 쓰고시프면 두번써 \\ 이렇게
		
	파일객체가 만들어질때는 해당 파일이 있는지 확인하지 않음
	나중에 정보를 꺼낼 때 잉 파일 이상한데? 한데 ㅋㅋㅋ
	
 
 0716
 DAO ADDRESS에서
 파라메타가 없더라도 PreparedStatement를 쓰도록!
 
 
 
 
 
 
 
DB 접속 정보
String driverClass= "oracle.jdbc.OracleDriver";
String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
String user = "javadeveloper2";
String password = "javadeveloper2";

		
Class.forName(driverClass);
Connection con = DriverManager.getConnection(url, user, password);
		
--> 이걸 계속쓰니까 클래스로 만든데! (JDBC - dao - fourth)

DAO 안에 sql도 따로 모아놓는 작업....을 해야한데.
 

rs의 커서 위치는?
before first 가
 EOF
 
after last에 가있데..
 
 
 
*/
		


	}

}
