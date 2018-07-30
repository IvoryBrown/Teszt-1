package application.setting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/teszt?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static final String USER = "root";
	static final String PASS = "12345";

	static Connection conn = null;
	static Statement createStatement = null;

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException ex) {
			System.out.println("Valami baj van a connection." +ex);
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		}
		if (conn != null) {
			try {
				createStatement = conn.createStatement();
				return conn;
			} catch (SQLException ex) {
				System.out.println("Valami baj van van a createStatament létrehozásakor.");
				return null;
			}
		}
		return null;
	}
}
