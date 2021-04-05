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
@WebServlet(urlPatterns = "/add", loadOnStartup=+99)
public class LibraryAddServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		LibraryDTO librarydto=new LibraryDTO();
		String id= req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("bknm");
		String author=req.getParameter("atrnm");
		String price=req.getParameter("price");
		double bkprice=Double.parseDouble(price);
		librarydto.setBookid(id1);
		librarydto.setBookname(name);
		librarydto.setAuthor(author);
		librarydto.setPrice(bkprice);
		LibraryService libraryservice=new LibraryServiceImpl();
		libraryservice.validateAndSave(librarydto);
		PrintWriter printwriter= resp.getWriter();
		printwriter.print("added"+name);
		
		 Logger logger=Logger.getLogger("LibraryAddServlet");
		 logger.info("added successfullly");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
