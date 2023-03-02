package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAO {

	Connessione connessione = new Connessione();
	
	Statement statement;//contenitore per istruzioni SQL
	
	ResultSet rs;
	
	public List<Canzone> getCanzoni(){
		
		List<Canzone> temp = new ArrayList<>();
		
		String sql = "SELECT * FROM canzoni";
		
		try {
			statement = connessione.getConn().createStatement();
			
			rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				
				Canzone c = new Canzone();
				
				c.setId(rs.getInt("id"));
				c.setCanzone(rs.getString("canzone"));
				c.setCantanti(rs.getString("cantanti"));
				
				temp.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
}
