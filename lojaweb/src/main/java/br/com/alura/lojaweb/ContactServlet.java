package br.com.alura.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Product;


@WebServlet(urlPatterns= {"/contato"})
public class ContactServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Product product = new Product("Bala de Hortelã", 0.10);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Fale conosco</h2></html>");
		writer.close();
	}

}
