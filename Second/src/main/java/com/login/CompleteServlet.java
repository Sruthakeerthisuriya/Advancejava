package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CompleteServlet
 */
@WebServlet("/CompleteServlet")
public class CompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        String Id=request.getParameter("Id");  
        String Issue=request.getParameter("Issue");  
        String Description=request.getParameter("Description");  
        
          
        User e=new User(); 
        e.setId(Id);
        e.setIssue(Issue); 
        e.setdescription(Description);
       
       
          
        int status=UserDao.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("User.html").include(request, response);  
            out.println("<a href='User.html'>Add New Issue</a>"); 
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();
	}

}
