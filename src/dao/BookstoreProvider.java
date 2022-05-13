package dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookstoreProvider {

	private static Connection conn;

	private BookstoreProvider() {}

	public static Connection getInstance() {
		try {
			if (conn == null) {

				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				conn = DriverManager.getConnection(url, user, password);
//			System.out.println("DB connected !!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}