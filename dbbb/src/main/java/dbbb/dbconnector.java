package dbbb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnector {
	
	private final String MYSQL_DB_URL = "jdbc:mysql://localhost:3306/sruthi";
	private final String MYSQL_USERNAME = "root";
	private final String MYSQL_PASSWORD = "india@123";
	private final String MYSQL_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	
	public Connection getDatabaseConnection() throws ClassNotFoundException, SQLException {
		Class.forName(MYSQL_DRIVER_NAME);
		Connection conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
		return conn;
	}
}
