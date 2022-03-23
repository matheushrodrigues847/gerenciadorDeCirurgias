package br.com.matheus.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.modelo.Banco;
import br.com.matheus.modelo.Cirurgia;

public class ShowCirurgia implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idCirurgia = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Cirurgia cirurgia = banco.retornaCirurgiaEspecifica(idCirurgia);
		
		request.setAttribute("cirurgia", cirurgia);
		
		return "forward:showCirurgia.jsp";
	}

}
