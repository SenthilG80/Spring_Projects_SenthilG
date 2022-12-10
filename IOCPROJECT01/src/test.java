import java.sql.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.oracleDriver();
		DriverManager.registerDriver(driver);
		Connection con =DriverManager.getConnection(null)
 System.out.println("test.main()");
	}

}
