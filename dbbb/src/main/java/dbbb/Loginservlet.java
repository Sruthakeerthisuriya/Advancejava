package dbbb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IssueDao issuedao;
       
    /**getaWriter
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sruthi ","root","india@123");
			String n=request.getParameter("textname");
			String p=request.getParameter("textPwd");
			
			PreparedStatement ps= con.prepareStatement("select uname from login where uname=? and password=?");
			ps.setString(1,n);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				//System.out.println(rs.getString(1));
//				RequestDispatcher rd=request.getRequestDispatcher("Iss");
//				rd.forward(request, response);
				 List<Map<String, Object>> employeeList=issuedao.getAllEmployee();
				 response.setContentType("text/html");
					PrintWriter pw = response.getWriter();
					response.getWriter().print("<table border='1'>");
					employeeList.forEach(employee -> {
						pw.print("<tr>");
						employee.forEach((k,v) ->{
							pw.print("<td>" + v.toString() + "</td>" );
							
						});
						pw.print("</tr>");
					});
					response.getWriter().print("</table>");
			}else {
				out.print("<font color=red size=18>Login Failed!!<br>");
				out.println("<a href=Login.html>Try AGAIN");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		issuedao=new IssueDao();
	}

}
