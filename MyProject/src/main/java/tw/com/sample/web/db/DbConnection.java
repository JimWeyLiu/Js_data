package tw.com.sample.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	/*
	 * 常數 連接資料庫的四個主要參數
	 * 
	 * 
	 */
	// 資料庫連接Driver
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	// 資料庫的連接位址
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/emp?serverTimezone=GMT%2B8&useSSL=false";
	// 資料庫的連接"帳號"進行驗證
	private final String JDBC_USERNAME = "root";
	// 資料庫的連接"密碼"進行驗證
	private final String JDBC_PASSWORD = "password123";

	// 建立db connection
	private Connection conn;

	// 私有化建構子
	private DbConnection() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 靜態方法，回傳this本身
	public static DbConnection getDB() {
		return new DbConnection();

	}

	// 資料庫連接類別
	public Connection getConnection() {

		try {
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	// 方法多載
	// Connection 進行資料庫的連接與帳號、密碼驗證
	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 進行SQL語法傳送
	public void close(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 進行SQL語法傳送
	public void close(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 存取回傳的資料
	public void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
