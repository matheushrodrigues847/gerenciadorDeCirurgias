package br.com.matheus.controller.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.matheus.acao.Acao;



@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
		String nomeDaClasse = "br.com.matheus.acao."+paramAcao;
		
		String retorno = null;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			retorno = acao.executa(request, response);
			
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
		
		String[] tipoDeRetorno = retorno.split(":");
		
		if(tipoDeRetorno[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoDeRetorno[1]);
			rd.forward(request, response);
		
		}else {
			response.sendRedirect(tipoDeRetorno[1]);
		}
		
		
	}

}
