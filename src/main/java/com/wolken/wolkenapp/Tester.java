package com.wolken.wolkenapp;

import com.wolken.wolkenapp.DAO.LibraryDAO;
import com.wolken.wolkenapp.DAO.LibraryDAOImpl;
import com.wolken.wolkenapp.Exception.libexception;

public class Tester {
	public static void main(String[] args) {
		
		
		libexception exce= new libexception();
		System.out.println(exce);
		
		LibraryDAO libdao= new LibraryDAOImpl();
		
		
	}

}
