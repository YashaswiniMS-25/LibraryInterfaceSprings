package com.wolken.wolkenapp.DTO;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="library_table")

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@NamedQueries({
@NamedQuery(name = "update", query = "update  LibraryDTO lr set lr.price= :pr where lr.bookname= :bknm"),

@NamedQuery(name = "selectAll", query = "from LibraryDTO lr")})
public class LibraryDTO {
	@Id
	@Column(name="book_id")
	private int bookid;
	@Column(name="book_name")
	private String bookname;
	@Column(name="author_name")
	private String author;
	@Column(name="price")
	private double price;
	
	
	

}
