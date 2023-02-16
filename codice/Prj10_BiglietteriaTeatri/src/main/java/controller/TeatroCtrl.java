package controller;

import java.io.IOException;

import database.DBTeatri;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/teatri")
public class TeatroCtrl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//aggiungo alla richiesta un nuovo attributo: un ArrayList di Teatro
		request.setAttribute("elenco", DBTeatri.getTeatri());
		
		//smisto la richiesta alla vista JSP 
		request.getRequestDispatcher("listaTeatri.jsp").forward(request, response);
	
	}
	
}
