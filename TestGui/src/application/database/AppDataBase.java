package application.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import application.AppPojo;
import application.setting.database.Database;

public class AppDataBase {

	public static void addOperatingSystem(AppPojo app) {
		Connection con = Database.getConnection();
		try {
			String sql = "INSERT INTO user (username, lakcim, telo) VALUES (?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, app.getUserName());
			preparedStatement.setString(2, app.getLakcim());
			preparedStatement.setString(3, app.getTelo());
			preparedStatement.execute();
		} catch (SQLException ex) {
			System.out.println("Valami baj van a contact hozzáadásakor"+ex);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException ex) {
			}
		}
	}
}
