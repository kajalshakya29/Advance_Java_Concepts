package com.hibernate.books;

import java.util.List;

public interface Book {
	List getAllBooks();
	Books getBooksByIsbn(int isbn);
	void saveBook(Books book);
	void deleteBook(Books book);
	}
