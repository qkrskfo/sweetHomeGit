package basic.driver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class OracleDriver implements Driver {

	static {
		/*
		 * 1. Driver Class loading 되면
		 *   1) Driver 클래스 객체 생성하고,
		 *   2) DriverManager객체에 등록됨
		 */
		System.out.println("---------- static block start ----------");
		try {
			System.out.println("1. Driver 클래스 객체 생성");
			OracleDriver oracleDriver = new OracleDriver();
			System.out.println("2) DriverManager객체에 등록됨");
			DriverManager.registerDriver(oracleDriver);
			
		} catch (Exception e) {
			
		}
		
		System.out.println("---------- static block end ----------");
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
