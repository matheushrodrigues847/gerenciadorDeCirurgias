package br.com.matheus.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.modelo.Banco;
import br.com.matheus.modelo.Cirurgia;



public class ListaCirurgias implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		List<Cirurgia> cirurgias = banco.listar();
		
		
		request.setAttribute("cirurgias", cirurgias);
		
		return "forward:listaCirurgias.jsp";
	}

}
