package com.wolken.wolkenapp.SERVLETS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Exception.libexception;
//import com.wolken.wolkenapp.Exception.libexception;
import com.wolken.wolkenapp.SERVICE.LibraryService;
import com.wolken.wolkenapp.SERVICE.LibraryServiceImpl;
@WebServlet(urlPatterns = "/update",loadOnStartup=+99)
public class LibraryUpdateServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LibraryDTO librarydto=new LibraryDTO();
		String name=req.getParameter("bknm");
		String price=req.getParameter("pr");
		double pri=Double.parseDouble(price);
		LibraryService libraryservice=new LibraryServiceImpl();
	     libraryservice.validateAndUpdate(name, pri);
		PrintWriter printwriter = resp.getWriter();
		printwriter.print("updated successfully");
		resp.setContentType("text/html");
		
		

		printwriter.print("<html><head><title></title> </head><body><a href='http://localhost:8080/LibraryHibernate/display?'>goback</a></body</html>");
		
		  Logger logger=Logger.getLogger("LibraryUpdateServlet");
		  
			  logger.info("updated successfully");
		  
		  
	}

}
