package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletEdited2
 */
@WebServlet("/ServletEdited2")
public class ServletEdited2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEdited2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("Id");  
        //int Id=Integer.parseInt(sid);  
        String Id=request.getParameter("Id");
        String Issue=request.getParameter("Issue");  
        String Description=request.getParameter("Description");  
       
          
        User e=new User();  
        e.setId(Id);  
        e.setIssue(Issue);  
        e.setdescription(Description);  
        
          
        int status=UserDao.update(e);  
        if(status>=0){  
            response.sendRedirect("Seeservlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close(); 
	}

}
