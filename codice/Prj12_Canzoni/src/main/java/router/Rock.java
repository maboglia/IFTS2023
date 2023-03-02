package router;

import java.io.IOException;
import java.io.PrintWriter;

import dal.CanzoneDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Canzone;

@WebServlet("/rock")
public class Rock extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		CanzoneDAO cd = new CanzoneDAO();
		
		for (Canzone c : cd.getCanzoni()) {
		
			out.println(c);
		
		}
	
	}
	
}
