package br.com.matheus.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.modelo.Banco;
import br.com.matheus.modelo.Cirurgia;

public class NewCirurgia implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String paciente = devolveParametro(request,"paciente");
		String procedimento = devolveParametro(request,"procedimento");
		String medico = devolveParametro(request,"medico");
		
		Banco banco = new Banco();
		
		Cirurgia cirurgia = new Cirurgia(paciente, procedimento, medico);
		banco.adicionar(cirurgia);
		
		
		return "redirect:entrada?acao=ListaCirurgias";
	}
	
	public String devolveParametro(HttpServletRequest request, String nomeDoParametro) {
		return request.getParameter(nomeDoParametro);
	}
}
