package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String HOST = "jdbc:mysql://localhost:3306/ifts" ;
    private final String USER = "root";
    private final String PW = "";
    
    private Connection conn;
    
    private void connetti() {
    	try {
			this.conn = DriverManager.getConnection(HOST, USER, PW);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public Connection getConn() {
		if (this.conn == null) {
			connetti();
		}
		return conn;
	}
	
	private void disconnetti () {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
    
    
}
