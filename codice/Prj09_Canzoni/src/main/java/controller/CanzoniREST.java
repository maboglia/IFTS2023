package controller;

import java.io.IOException;

import org.json.JSONArray;

import database.DBCanzoni;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api")
public class CanzoniREST extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		JSONArray array = new JSONArray(DBCanzoni.getBrani());

		resp.setContentType("application/json");
		
		resp.getWriter().append(array.toString());
	}
	
}
