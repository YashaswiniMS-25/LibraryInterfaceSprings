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
import com.wolken.wolkenapp.SERVICE.LibraryService;
import com.wolken.wolkenapp.SERVICE.LibraryServiceImpl;
@WebServlet(urlPatterns = "/delete")
public class LibraryDeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		LibraryDTO librarydto=new LibraryDTO();
		LibraryService libraryservice=new LibraryServiceImpl();
		String name=req.getParameter("bk");
		librarydto.setBookname(name);
		libraryservice.validateAndDelete(name);
		PrintWriter printwriter = resp.getWriter();
		printwriter.print("deleted successfully");

		resp.setContentType("text/html");
		  printwriter.print("<html><head><title></title></head><body><a href='http://localhost:8080/LibraryHibernate/display?'>goback</a></body></html>");
		 
		  Logger logger=Logger.getLogger("LibraryDeleteServlet");
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
