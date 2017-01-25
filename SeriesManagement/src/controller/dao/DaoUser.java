package controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.CAccessDB;
import model.MUser;

public class DaoUser {

	private CAccessDB db;

	/*
	 * Singelton Pattern
	 */
	private static DaoUser instance;

	private DaoUser() {
		db = CAccessDB.getInstance();
	}

	/*
	 * liefert eine Instance der DaoUser zurück
	 */
	public static DaoUser getInstance() {
		if (instance == null) {
			instance = new DaoUser();
		}
		return instance;
	}

	/*
	 * INSERT, UPDATE, SELECT Methoden
	 */
	public MUser insert(MUser u) throws SQLException {
		boolean connected = false;
		MUser result = null;
		connected = db.connect();

		if (!connected) {
			throw new SQLException("Not connected to DB");
		}

		String sql = "insert into User (`userName`, `password`, `eId`) values ('" + u.getUserName() + "', '"
				+ u.getPassword() + "', " + u.geteId() + ")";

		db.executeUpdate(sql);

		String select = "Select * from user order by uID desc limit 1";

		try {
			ResultSet rs = db.executeQuery(select);
			result = new MUser();
			while (rs.next()) {
				result.setuId(rs.getInt(1));
				result.setUserName(rs.getString(2));
				result.setPassword(rs.getString(3));
				result.seteId(rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close();
		}

		return result;
	}

	/**
	 * Select Methode, welche den Usernamen aus der Datenbank holt
	 */
	public MUser select(MUser unsername) {
		boolean connected = false;
		MUser result = null;
		connected = db.connect();

		return result;
	}
}
