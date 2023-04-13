package controller;

import java.io.IOException;

import database.AlimentoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alimenti")
public class AlimentiMVC extends HttpServlet {
	AlimentoDAO dao;
	public AlimentiMVC() {
		System.out.println("Ho costruito l'oggetto alimentiMVC");
		dao = new AlimentoDAO();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mi hai chiamato via get");
		//per passare dei parametri al jsp uso il metodo setAttribute()
		request.setAttribute("titolo", "il mio sito di alimenti");
		request.setAttribute("categorie", dao.getCategorie());
		if(request.getParameter("cat")!=null) {
			request.setAttribute("listaAlimenti",dao
					    .getAlimentiByCategoria(request.getParameter("cat")) );
		}else {
			request.setAttribute("listaAlimenti",dao.getAlimenti() );
		}
		
		
		
		
		request.getRequestDispatcher("TabellaAlimenti.jsp").forward(request, response);
		
	}
	

	
	
	
	
	
	
}
