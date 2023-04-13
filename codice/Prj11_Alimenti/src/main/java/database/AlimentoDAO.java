package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Alimento;

public class AlimentoDAO {
	
	Connessione connessione = new Connessione();
	Statement statement;//serve per scrivere le istruzioni al DB
	ResultSet rs;// serve per immagazinare i risultati provenienti dal DB
	
	
	public ArrayList<Alimento> getAlimenti(){
		String query = "select * from alimenti";
		ArrayList<Alimento> scatola = new ArrayList<>();
		try {
			statement = connessione.getConn().createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				
				Alimento a = new Alimento();
				a.setProdotto(rs.getString("prodotto"));
				a.setCategoria(rs.getString("categoria"));
				a.setId(rs.getInt("id"));
				a.setEnergia(rs.getInt("energia"));
				a.setProteine(rs.getDouble("proteine"));
				a.setLipidi(rs.getDouble("lipidi"));
				a.setCarboidrati(rs.getDouble("carboidrati"));
				scatola.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scatola;
		
	}
	
	
	public ArrayList<Alimento> getAlimentiByCategoria(String categoria){
		String query = "select * from alimenti where categoria like '%"+categoria+"%'";
		ArrayList<Alimento> scatola = new ArrayList<>();
		try {
			statement = connessione.getConn().createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				
				Alimento a = new Alimento();
				a.setProdotto(rs.getString("prodotto"));
				a.setCategoria(rs.getString("categoria"));
				a.setId(rs.getInt("id"));
				a.setEnergia(rs.getInt("energia"));
				a.setProteine(rs.getDouble("proteine"));
				a.setLipidi(rs.getDouble("lipidi"));
				a.setCarboidrati(rs.getDouble("carboidrati"));
				scatola.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scatola;
		
		
	}
	public ArrayList<String> getCategorie(){
		String query = "SELECT DISTINCT(categoria) FROM `alimenti` order by categoria";
		ArrayList<String> scatola = new ArrayList<>();
		try {
			statement = connessione.getConn().createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				scatola.add(rs.getString("categoria"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scatola;
		
	}
	
}
