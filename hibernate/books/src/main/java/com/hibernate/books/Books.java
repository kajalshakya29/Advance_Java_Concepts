package com.hibernate.books;

public class Books {
	private int isbn;
	private String BookName;
	public Books(int i, String string) {
		
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
}
