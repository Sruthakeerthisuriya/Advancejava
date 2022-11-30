package dbbb;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueDao extends dbconnector {
	
	private final static String EMP_ID = "EMP_ID";
	private final static String USER_NAME = "USER_NAME";
	private final static String DESCRIPTION = "DESCRIPTION";
	private final static String STATUS = "STATUS";
	
	
	private final String SELECT_ALL_EMLOYEES_QRY = "SELECT * FROM ISSUE";

	public List<Map<String, Object>> getAllEmployee() throws ClassNotFoundException, SQLException {
		Connection conn = getDatabaseConnection();
		PreparedStatement pStmt = conn.prepareStatement(SELECT_ALL_EMLOYEES_QRY);
		ResultSet rs = pStmt.executeQuery();
		
		List<Map<String, Object>> employeeList = new ArrayList<Map<String, Object>>();
		while (rs.next()) {
			Map<String, Object> emp = new HashMap<String, Object>();
			emp.put("EMP_ID", rs.getInt(EMP_ID));
			emp.put("USER_NAME", rs.getString(USER_NAME));
			emp.put("DESCRIPTION", rs.getString(DESCRIPTION));
			
			emp.put("STATUS", rs.getString(STATUS));
			employeeList.add(emp);
		}
		return employeeList;
	}
}
