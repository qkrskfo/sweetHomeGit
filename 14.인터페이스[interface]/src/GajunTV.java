public class GajunTV implements GajunVolume, GajunOnOff {

	public void operation1() {
		System.out.println("TV.operation1()");
	}
	
	@Override
	public void on() {
		System.out.println("TV.on()");
	}

	@Override
	public void off() {
		System.out.println("TV.off()");
	}

	@Override
	public void up() {
		System.out.println("TV.volumeUp()");
	}

	@Override
	public void down() {
		System.out.println("TV.volumeDown()");
	}

}
