package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiaConnessione {

	private final String URL = "jdbc:mysql://localhost:3306/ifts";//ifts
	private final String USER = "ifts"; //root
	private final String PASS = "Ifts2023!";//vuoto ""
	
	private Connection conn;
	
	public Connection getConn() {
		if(this.conn==null) {
			connetti();
		} 
		
		return conn;
	}
	
	public void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Sei connesso, tutto ok!!!!!!!!!!!!!");
			
		} catch (SQLException e) {
			System.err.println("OPS!! la connessione non è andata a buon fine");
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public void disconnetti() {
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
