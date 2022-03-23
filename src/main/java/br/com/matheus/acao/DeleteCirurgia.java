package br.com.matheus.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.modelo.Banco;

public class DeleteCirurgia implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		int idCirurgia = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		banco.deletarCirurgia(idCirurgia);
		
		return "redirect:entrada?acao=ListaCirurgias";
	}

}
