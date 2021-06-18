/*
  - 난 절대로 자식클래스타입을 사용 안할래요
  - 난 부모타입[GajunVolume, GajunOnOff]만 사용할래요
  - 그래야 가전제품 검사프로그램을 한번 만들어서 변경없이 계속 사용할 수 있으니까요
    (유지보수, 확장성)
  - 유지보수 시 많이 바꾸지 않아도 된다.
*/


public class GajunGumsa {

	private GajunOnOff[] gajuns;
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	public void gajunGumsa() {
		for (int i = 0; i < gajuns.length; i++) {
			gajuns[i].on();
			GajunVolume tempGajun = (GajunVolume)gajuns[i];
			tempGajun.up();
			tempGajun.down();
			gajuns[i].off();
			System.out.println("------검사 끝-----");
		}
	}
}
