package com.wolken.wolkenapp.SERVICE;

import java.util.List;

import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Exception.libexception;

public interface LibraryService {
	public void validateAndSave(LibraryDTO librarydto);
	public void validateAndUpdate(String bookname, double price) ;
	public void validateAndDelete(String bookname);
	public List<LibraryDTO> getAll();

}
