package dbbb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		final String dbUrl = "jdbc:mysql://localhost:3306/sruthi";
		final String username = "root";
		final String password = "india@123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dbUrl, username, password);
			
			//Statement stmt = conn.createStatement();
			
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM USER");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
//			
//			System.out.println("----------------------------");
//			rs.beforeFirst();
//			while (rs.next()) {
//				System.out.println(rs.getString("username") + " " + rs.getString("password") );
//			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}