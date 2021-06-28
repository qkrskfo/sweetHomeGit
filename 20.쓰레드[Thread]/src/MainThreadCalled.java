
public class MainThreadCalled {

	// MainThreadCalled 메인쓰레드가 호출하는 객체다 이런 의미
	
	public void main_thread_called_method() {
		
		System.out.println("\t A."+Thread.currentThread().getName()+" 쓰레드 실행");
		
		System.out.println("\t B."+Thread.currentThread().getName()+" 쓰레드 반환");
		
		return;
		
	}
	
}
