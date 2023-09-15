package treinamento;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/primeiroservlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String campo1 = request.getParameter("nome");
		String campo2 = request.getParameter("email");
		System.out.printf("o valor digitado no campo 1 foi: %s\no valor digitado no campo 2 foi: %s",campo1,campo2);
	
	 
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String campo1 = request.getParameter("nome");
		String campo2 = request.getParameter("email");
		System.out.printf("o valor digitado no campo 1 foi: %s\no valor digitado no campo 2 foi: %s",campo1,campo2);
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<body");
		writer.println("<h1>");
		writer.println("opaaa");
		writer.println("</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}

}
