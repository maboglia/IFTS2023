package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

/**
 * Servlet implementation class GestionaleController
 */
@WebServlet("/router")
public class GestionaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Dipendente> dipendenti = new ArrayList<>();
	
    public GestionaleController() {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		dipendenti.add(new Fattorino("pippo", "pippo"));
		dipendenti.add(new Impiegato("pippa", "pippa"));
		dipendenti.add(new Dirigente("pippu", "pippu"));
		
		
		
		response
			.getWriter()
			.append(dipendenti.toString());
	}

}
