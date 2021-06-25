package generic;

public class GenericClass<T> {
	// 대부분 <> 안에는 대문자 한글자를 씀 type의 약자 T
	// 여기로 타입이 들어옴. 인티져, 오브젝트.
	// 기본값은 오브젝트.
	// 일반화 시키는 방법
	
	/*
	
	private Object member;

	public Object getMember() {
		return member;
	}

	public void setMember(Object member) {
		this.member = member;
	}
	*/
	
	private T member;
	
	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
	
	

}
