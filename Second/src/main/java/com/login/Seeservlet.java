package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Viewservlet
 */
@WebServlet("/Seeservlet")
public class Seeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Seeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	    
	        out.println("<h1>Issue List</h1>");  
	          
	        List<User> list=UserDao.getAllEmployees();  
	          
	        out.print("<table border='1' width='100%'");  
	        out.print("<tr><th>Id</th><th>Issue</th><th>Description</th> <th>Edit</th><th>Delete</th></tr>");  
	        for(User e:list){  
	         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getIssue()+"</td><td>"+e.getDescription()+"</td><td><a href='Servlet?Id="+e.getId()+"'>Edit</a></td>  <td><a href='ServletDeleted?id="+e.getId()+"'>Delete</a></td></tr>");  
	        }  
	        out.print("</table>");  
	        
	        out.println("<br><br><a href='Login.html'>Logout</a>");
	        out.close();
	        
	}

	
	

}
