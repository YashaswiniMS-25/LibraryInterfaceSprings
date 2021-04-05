package com.wolken.wolkenapp.SERVICE;

import java.util.List;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.DAO.LibraryDAO;
import com.wolken.wolkenapp.DAO.LibraryDAOImpl;
import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Exception.libexception;

public class LibraryServiceImpl implements LibraryService{
	LibraryDAO librarydao=new LibraryDAOImpl();
	  Logger logger=Logger.getLogger("LibraryServiceImpl");

	@Override
	public void validateAndSave(LibraryDTO librarydto) {
		// TODO Auto-generated method stub
		try {
			if(librarydto!=null) {
				librarydao.save(librarydto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			logger.error("exception");
		}
		
		
	}

	@Override
	public void validateAndUpdate(String bookname, double price) {
		// TODO Auto-generated method stub
		
		try {
			if(price>0) {
			try {
				librarydao.updatePriceByBookName(bookname,price);
				}catch(libexception e) {
					e.printStackTrace();
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			logger.error("exception");
		}
		
	}

	@Override
	public void validateAndDelete(String bookname) {
		// TODO Auto-generated method stub
		try {
			if(bookname!=null) {
				librarydao.delete(bookname);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			logger.error("Exception");
		}
		
	}

	@Override
	public List<LibraryDTO> getAll() {
		// TODO Auto-generated method stub
		return librarydao.getAll();
	}
	

}
