package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CAccessDB {

	private static final String url = "jdbc:mysql://localhost/seriesmanagement";
	private static final String user = "kingRod";
	private static final String passwort = "csc";
	private Connection connection;
	private boolean connected;

	private static CAccessDB instance;

	public static CAccessDB getInstance() {
		if (instance == null) {
			instance = new CAccessDB();
		}
		return instance;
	}

	private CAccessDB() {
		super();
	}

	public boolean connect() {
		connected = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, passwort);
			connected = true;
		} catch (ClassNotFoundException e1) {
			connected = false;
			System.out.println(e1.getMessage());
		} catch (SQLException e) {
			connected = false;
			System.out.println(e.getMessage());
		}
		return connected;
	}

	public ResultSet executeQuery(String query) throws SQLException {
		if (connected) {
			Statement stmt = connection.createStatement();
			System.out.println("Datenbankverbindug erfolgreich");
			return stmt.executeQuery(query);
		} else {
			throw new SQLException("Database not connected");
		}
	}

	public int executeUpdate(String query) throws SQLException {
		if (connected) {
			Statement stmt = connection.createStatement();
			return stmt.executeUpdate(query);
		} else {
			throw new SQLException("Database not connected");
		}
	}

	public boolean close() {
		connected = true;
		try {
			connection.close();
			connected = false;
		} catch (SQLException e) {
			connected = false;
		}
		return connected;
	}

	public boolean isConnected() {
		return connected;
	}

}
