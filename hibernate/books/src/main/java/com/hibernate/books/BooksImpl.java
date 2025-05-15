package com.hibernate.books;

import java.util.ArrayList;
import java.util.List;

public class BooksImpl implements Book {
   //list is working as db
	private List books;
	public BooksImpl() {
		books = new ArrayList();
		books.add(new Books(1,"Java"));
		books.add(new Books(1,"Python"));
		books.add(new Books(1,"DSA"));
		
	}
	//@Override
	public List getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}
	public Books getBooksByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return (Books) books.get(isbn);
	}
	public void saveBook(Books book) {
		// TODO Auto-generated method stub
		books.add(book);
	}
	public void deleteBook(Books book) {
		// TODO Auto-generated method stub
		books.remove(book);
	}
}
