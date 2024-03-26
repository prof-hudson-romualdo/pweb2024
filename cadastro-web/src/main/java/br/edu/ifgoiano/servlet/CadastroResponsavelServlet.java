package br.edu.ifgoiano.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroResponsavel")
public class CadastroResponsavelServlet extends HttpServlet {

	private static final long serialVersionUID = 837627547376000518L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String responsavel = req.getParameter("responsavel");
		String aluno = req.getParameter("aluno");
		String telefone = req.getParameter("telefone");
		
		if(responsavel.trim().equals("") || aluno.trim().isEmpty() || telefone.trim().isEmpty()) {
			req.setAttribute("mostrarAlertaDeObrigatoriedade", Boolean.TRUE);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
		}
	}
}
