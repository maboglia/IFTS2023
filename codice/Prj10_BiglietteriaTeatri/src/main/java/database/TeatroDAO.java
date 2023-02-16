package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Teatro;

public class TeatroDAO {

	MiaConnessione mc = new MiaConnessione();
	
	Statement stat;
	ResultSet rs;
	
	//CRUD : CREATE
	public void addTeatro(Teatro t) {
		try {
			this.stat = mc.getConn().createStatement();
			//insert into teatri (nome, posti) values ('colosseo', 150 );
			this.stat.execute("insert into teatri (nome, posti) values ('"+t.getNome()+"', "+t.getnPosti()+" )");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//CRUD: READ - RETRIEVE
	public ArrayList<Teatro> getAll(){
		ArrayList<Teatro> temp = new ArrayList<>();
		
		return temp;
	}//fine del metodo
	public static void main(String[] args) {
		TeatroDAO td = new TeatroDAO();
		Teatro t = new Teatro(100, "Teatro nuovissimissimoimo", 2000);
		td.addTeatro(t);
	}
}//fine della classe
