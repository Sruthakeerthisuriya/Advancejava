package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.LoginBean;
import com.login.LoginDao;


@WebServlet("/Sruthi")


public class Sruthi extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Sruthi() {
        super();
    
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
	    String password = request.getParameter("password");
	 
	    LoginBean loginBean = new LoginBean();
	 
	    loginBean.setUserName(userName);
	    loginBean.setPassword(password);
	 
	    LoginDao loginDao = new LoginDao();
	 
	    try
	    {
	        String userValidate = loginDao.authenticateUser(loginBean);
	 
	        if(userValidate.equals("Admin_Role"))
	        {
	        	
	            System.out.println("Admin Home Page");
	 
	            HttpSession session = request.getSession(); //Creating a session
	            session.setAttribute("Admin", userName); //setting session attribute
	            request.setAttribute("userName", userName);
	 
	            request.getRequestDispatcher("/Admin.html").forward(request, response);
	        }
	      
	        else if(userValidate.equals("User_Role"))
	        {
	            System.out.println("User Home Page");
	 
	            HttpSession session = request.getSession();
	            session.setMaxInactiveInterval(10*60);
	            session.setAttribute("User", userName);
	            request.setAttribute("userName", userName);
	 
	            request.getRequestDispatcher("/User.html").forward(request, response);
	        }
	        else
	        {
	            System.out.println("Error message = "+userValidate);
	            request.setAttribute("errMessage", userValidate);
	 
	            request.getRequestDispatcher("/Login.html").forward(request, response);
	        }
	    }
	    catch (IOException e1)
	    {
	        e1.printStackTrace();
	    }
	    catch (Exception e2)
	    {
	        e2.printStackTrace();
	    }
	}
	

}
