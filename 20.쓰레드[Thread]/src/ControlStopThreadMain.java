import javax.swing.JOptionPane;

public class ControlStopThreadMain {

	public static void main(String[] args) {
		System.out.println("1. main");
		ControlStopThread1 cst1 = new ControlStopThread1();
		cst1.start();

		System.out.println("2. main");
		
		ControlStopThread2 cst2 = new ControlStopThread2();
		cst2.start();
		
		String inputNo = JOptionPane.showInputDialog("쓰레드를 종료할 방법을 선택하세요 [ 1.stop 2. isPlay 변수변경]");
		// 외부에서 입력되는건 무조건 스트링으로 들어옴!
		
		/*
		 * 메인스레드가 클라이언트 입력을 받기 위해 쓰레드 대기
		 */
		
		int stopNo = Integer.parseInt(inputNo); // 스트링을 인티저로 변경해줘 하는 것
		if(stopNo==1) {
			/*
			 * case 1. 호출한 순간 종료
			 */
			cst2.stop(); // 태생적으로 안전하지 않아서 쓰지 말라고 되어있어. 
			// 어떤 상태인지도 모르면서 그냥 쓰레드를 종료시키면 안돼!
			// The method stop() from the type Thread is deprecated.
		} else if(stopNo==2) {
			/*
			 * case 2. 조건변경으로 종료(isPaly --> false)
			 *         현재 진행중인 작업을 마무리하고 종료
			 */
			cst2.setPlay(false);
		}
		System.out.println("99.main end");
	}
	
}
