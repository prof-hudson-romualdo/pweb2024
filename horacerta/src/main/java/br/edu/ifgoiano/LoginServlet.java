package br.edu.ifgoiano;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.dao.UsuarioDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDao usuarioDao = new UsuarioDao();
		
		request.setAttribute("usuario", usuarioDao.obterNomeDoUsuarioPeloEmail(request.getParameter("email")));
		
		RequestDispatcher despachadorDeRequisicao = request.getRequestDispatcher("logouComSucesso.jsp");
		despachadorDeRequisicao.forward(request, response);
	}

}