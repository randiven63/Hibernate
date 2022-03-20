package tnsif.c2tc.m07.Service;

import tnsif.c2tc.m07.dao.BookDao;
import tnsif.c2tc.m07.dao.BookDaoImpl;
import tnsif.c2tc.m07.entities.Book;

public class BookServiceImpl implements BookService{
	BookDao bd;
	public BookServiceImpl()
	{
		bd=new BookDaoImpl();	
	}
	@Override
	public String getBookCount() {
		return null;
		
	}

	@Override
	public String getBookById(int i) {
		return null;
	}

	@Override
	public Book[] getAllBooks() {
		return null;
	
	}

	@Override
	public Book[] getAuthorBooks(String string) {
		return null;

	}

	@Override
	public Book[] getBookByTitle(String string) {
		return null;
	}

	@Override
	public Book[] getBooksInPriceRange(int i, int j) {
		return null;
	}

}
