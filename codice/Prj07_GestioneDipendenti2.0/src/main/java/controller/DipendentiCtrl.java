package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tutti")
public class DipendentiCtrl extends HttpServlet{

	String[] nanetti = {"pisolo", "brontolo", "dotto", "eolo", "gongolo", "mammolo", "cucciolo"};
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("mi hai chiamato via GET");
		System.out.println("sono la servlet Dipendenti");
		
		resp.setContentType("text/html");
		
		resp.getWriter().append("<h1>sei nella servlet di tutti i dipendenti</h1>");
		resp.getWriter().append("<ul>");
		for (String nano : nanetti) {
			resp.getWriter().append("<li>" + nano  +"</li>");
		}
		resp.getWriter().append("</ul>");
		
		
	}

	
	
	
}
