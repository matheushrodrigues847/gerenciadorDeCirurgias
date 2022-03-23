package br.com.matheus.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.modelo.Banco;
import br.com.matheus.modelo.Cirurgia;

public class UpdateCirurgia implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paciente = request.getParameter("paciente");
		String procedimento = request.getParameter("procedimento");
		String medico = request.getParameter("medico");
		int idCirurgia = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Cirurgia cirurgia = banco.retornaCirurgiaEspecifica(idCirurgia);
		cirurgia.setPaciente(paciente);
		cirurgia.setProcedimento(procedimento);
		cirurgia.setMedico(medico);
		
		
		
		return "redirect:entrada?acao=ListaCirurgias";
	}

}
