package service;

import java.sql.SQLException;

import dao.BookstoreDao;
import dao.BookstoreDaoImpl;
import dto.Bookstore;

public class BookstoreServiceImpl implements BookstoreService{
	
	private static BookstoreDao dao = BookstoreDaoImpl.getInstance();

	private static BookstoreServiceImpl instance;
	
	private BookstoreServiceImpl() {
	}
	
	public static BookstoreServiceImpl getInstance() {
		if (instance == null) {
			instance = new BookstoreServiceImpl();
		}
		return instance;
	}

	@Override
	public int regist(Bookstore bookstore) throws SQLException {
		return dao.insert(bookstore);
	}

	@Override
	public int deleteInfo(int bookNo) throws SQLException {
		return dao.deleteInfo(bookNo);
	}

}
