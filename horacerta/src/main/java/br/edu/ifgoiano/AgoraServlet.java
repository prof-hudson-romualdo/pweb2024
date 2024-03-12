package br.edu.ifgoiano;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agora")
public class AgoraServlet extends HttpServlet{
	
	private static final long serialVersionUID = -4512355925305510242L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {		
		//Processamento de backend (poderia ser um cálculo elaborado, a consulta ao banco de dados, etc)
		Date data = new Date();
		
		//Armazenar valores necessários para a JSP
		req.setAttribute("dataHora", data);
		
		//Retornar para a página dataHoraCerta.jsp que está no mesmo contexto (projeto)
		req.getRequestDispatcher("dataHoraCerta.jsp")
			.forward(req, resp); //O redirecionamento está incluindo os objetos Request e Response
	}
}

