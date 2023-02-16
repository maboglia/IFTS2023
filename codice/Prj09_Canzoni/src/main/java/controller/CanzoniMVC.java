package controller;

import java.io.IOException;

import database.DBCanzoni;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class CanzoniMVC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("elenco", DBCanzoni.getBrani());
		
		req.getRequestDispatcher("canzoniMVC.jsp").forward(req, resp);
	}

	
	
}
