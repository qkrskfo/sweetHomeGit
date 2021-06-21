
public class FinalFieldMain {

	public static void main(String[] args) {

		FinalField ff1 = new FinalField();
		
//		The final field FinalField.INCENTIVE_RATE cannot be assigned
		// ff1.INCENTIVE_RATE = 0.5;
		// ff1.PORT_NUMBER = 9090;

		ff1.move(FinalField.NORTH);
		ff1.move(FinalField.EAST);
		ff1.move(FinalField.SOUTH);
		ff1.move(FinalField.WEST);
		
	}

}
