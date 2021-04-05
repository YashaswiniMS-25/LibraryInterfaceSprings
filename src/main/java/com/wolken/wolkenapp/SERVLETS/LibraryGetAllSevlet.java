package com.wolken.wolkenapp.SERVLETS;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.SERVICE.LibraryService;
import com.wolken.wolkenapp.SERVICE.LibraryServiceImpl;
@WebServlet(urlPatterns = "/display",loadOnStartup = +1)
public class LibraryGetAllSevlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LibraryDTO librarydto=new LibraryDTO();
		  Logger logger=Logger.getLogger("LibraryGetAllSevlet");

		LibraryService libraryservice=new LibraryServiceImpl();
		List<LibraryDTO> books=libraryservice.getAll();
		req.setAttribute("BooksList", books);
		RequestDispatcher dispatcher=req.getRequestDispatcher("getall.jsp");
		dispatcher.forward(req, resp);
		logger.info("get all method");
		books.forEach(System.out::print);
		
		
	}
	

}
