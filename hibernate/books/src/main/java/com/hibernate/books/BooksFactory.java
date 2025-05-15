package com.hibernate.books;

public class BooksFactory {
	public static Book getInstance() {
		return new BooksImpl();
		
	}
}
