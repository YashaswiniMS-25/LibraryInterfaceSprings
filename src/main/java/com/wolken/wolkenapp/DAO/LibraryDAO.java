package com.wolken.wolkenapp.DAO;

import java.util.List;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Exception.libexception;

public interface LibraryDAO {

	public void save(LibraryDTO librarydto);

	public void updatePriceByBookName(String bookname,double price) throws libexception ;

	public void delete(String bookname);

	public List<LibraryDTO> getAll();

}
