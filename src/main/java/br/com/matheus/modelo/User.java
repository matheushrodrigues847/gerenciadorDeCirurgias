package br.com.matheus.modelo;

public class User {
	
	private String login;
	private String senha;
	

	public User(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	@Override
	public boolean equals(Object obj) {
		User usuario = (User) obj;
		
		if(!this.login.equals(usuario.login)|| !this.senha.equals(usuario.senha)) {
			return false;
		}
		return true;
	}
}
