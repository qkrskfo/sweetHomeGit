
public class SyncUpperLowerMain {

	public static void main(String[] args) {

			SyncUpperThread ut = new SyncUpperThread();
			SyncLowerThread lt = new SyncLowerThread();
			
			ut.start();
			lt.start();
			
	}

}
