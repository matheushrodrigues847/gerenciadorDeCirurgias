package br.com.matheus.controller.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/entrada")
public class AutorizacaoFilter extends HttpFilter implements Filter {
       
  
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		HttpSession session = request.getSession();
		
		String acao = request.getParameter("acao");
		
		boolean usuarioNaoEstaLogado = session.getAttribute("usuario") == null;
		boolean acaoEhProtegida =  !acao.equals("Login") && !acao.equals("LoginForm");
		
		if(usuarioNaoEstaLogado && acaoEhProtegida) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}

	

}
