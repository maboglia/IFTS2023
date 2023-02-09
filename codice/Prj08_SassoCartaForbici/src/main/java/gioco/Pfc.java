package gioco;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/pfc")
public class Pfc extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("scelta") != null) {
			String sceltaUmano= request.getParameter("scelta");
			String sceltaPc= CartaForbiciSasso.chiediPc();
			String result= CartaForbiciSasso.valuta(sceltaUmano, sceltaPc);
			
			response.getWriter().append(result);
			
			
		}
	}

	
	
}
