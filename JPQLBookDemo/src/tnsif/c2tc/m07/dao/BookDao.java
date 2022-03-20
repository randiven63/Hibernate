package tnsif.c2tc.m07.dao;

import tnsif.c2tc.m07.entities.Book;

public interface BookDao {

	String getBookCount();

	String getBookByID(int i);

	Book[] getAllBooks();

	Book[] getAuthorBooks(String string);

	Book[] getBookByTitle();

	Book[] getBooksInPriceRange(int i, int j);

}
