package dao;

import java.sql.SQLException;

import dto.Bookstore;

public interface BookstoreDao {

	public int insert(Bookstore bookstore) throws SQLException;

	public int deleteInfo(int bookNo) throws SQLException;

	public int updateInfo(Bookstore bookstore) throws SQLException;

}
