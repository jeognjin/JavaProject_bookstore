package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Bookstore;

public class BookstoreDaoImpl implements BookstoreDao{

	private static Connection conn = BookstoreProvider.getInstance();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private static BookstoreDaoImpl instance;
	
	private BookstoreDaoImpl() {
	}
	
	public static BookstoreDao getInstance() {
		if(instance == null) {
			instance = new BookstoreDaoImpl();
		}
		return instance;
	}

	@Override
	public int insert(Bookstore bookstore) throws SQLException {
		String sql = "insert into book values(?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bookstore.getBookNo());
		pstmt.setInt(2, bookstore.getPrice());
		pstmt.setString(3, bookstore.getTitle());
		pstmt.setString(4, bookstore.getPublisher_name());
		return pstmt.executeUpdate();
	}

	@Override
	public int deleteInfo(int bookNo) throws SQLException {
		String sql = "delete from book where bookno = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bookNo);
		return pstmt.executeUpdate();
	}

}
