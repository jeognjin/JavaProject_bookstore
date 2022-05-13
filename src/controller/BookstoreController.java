package controller;

import java.sql.SQLException;

import dto.Bookstore;
import service.BookstoreService;
import service.BookstoreServiceImpl;

public class BookstoreController {
	
	private static BookstoreService bookstoreService = BookstoreServiceImpl.getInstance();
	
	
	
	//싱글톤
	private static BookstoreController instance;
	
	private BookstoreController() {}
	
	public static BookstoreController getInstance() {
		if(instance == null) {
			instance = new BookstoreController(); 
		}
		return instance;
	}

	//도서등록
	public static int regist(Bookstore bookstore) {
		int result = 0;
		
		try {
			result = bookstoreService.regist(bookstore);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	//도서삭제
	public static int deleteInfo(int bookNo) {
		int result = 0;
		
		try {
			result = bookstoreService.deleteInfo(bookNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	} 
}
