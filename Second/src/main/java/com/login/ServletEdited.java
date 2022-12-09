package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletEdited
 */
@WebServlet("/Servlet")
public class ServletEdited extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEdited() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Issue List</h1>");  
        String sid=request.getParameter("Id");  
        int Id=Integer.parseInt(sid);  
          
        User e=UserDao.getEmployeeById(Id);  
          
        out.print("<form action='ServletEdited2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td>Id:</td><td><input type='text' name='Id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>Issue:</td><td><input type='text' name='Issue' value='"+e.getIssue()+"'/></td></tr>");  
        out.print("<tr><td>Description:</td><td><input type='text' name='Description' value='"+e.getDescription()+"'/> </td></tr>");  
        
        out.print("<tr><td colspan='2'><input type='submit' value='Resolved '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close(); 
	}

	
	

}
