package service;

import java.sql.SQLException;

import dto.Bookstore;

public interface BookstoreService {

	int regist(Bookstore bookstore) throws SQLException;

	int deleteInfo(int bookNo) throws SQLException;

}
