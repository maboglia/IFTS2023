package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3306/ifts";
	
	private final String USER = "ifts";
	private final String PASS = "Ifts2023!";
	
	private Connection conn;
	
	public Connection getConn() {
		
		if (conn == null)
			connetti();
		
		return conn;
	}
	
	
	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("sei connesso");
		} catch (SQLException e) {
			System.err.println("Non sei connesso: " + e.getMessage());
		}
	}
	
	private void disconnetti() {
		
	}
	
	
}
