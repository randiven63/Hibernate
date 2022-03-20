package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.entities.Book;

public interface BookService {

	String getBookCount();

	String getBookById(int i);

	Book[] getAllBooks();

	Book[] getAuthorBooks(String string);

	Book[] getBookByTitle(String string);

	Book[] getBooksInPriceRange(int i, int j);

}
