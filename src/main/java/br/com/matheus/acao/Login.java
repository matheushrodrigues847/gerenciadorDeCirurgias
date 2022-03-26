package br.com.matheus.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.matheus.modelo.Banco;
import br.com.matheus.modelo.User;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		User usuario = new User(login,senha);
		
		
		Banco banco = new Banco();
		
		if(!banco.confereUsuarioEhSenha(usuario)) {
			return "redirect:entrada?acao=LoginForm";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("usuario", usuario);
		
		
		return "redirect:entrada?acao=ListaCirurgias";
	}

}
