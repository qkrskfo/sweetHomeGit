package basic.driver;

public class DriverLoadingMain {

	public static void main(String[] args) throws Exception {
		String driverClass1 = "basic.driver.OracleDriver";
		String driverClass2 = "basic.driver.MySqlDriver";
		Class.forName(driverClass1);
		Class.forName(driverClass2);

	}

}
