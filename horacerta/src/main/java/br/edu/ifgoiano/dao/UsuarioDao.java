package br.edu.ifgoiano.dao;

public class UsuarioDao {

	public String obterNomeDoUsuarioPeloEmail(final String email) {
		if(email.contains("hudson")) {
			return "Hudson de Paula Romualdo";
		}
		return "Brad Pitt";
	}
}
