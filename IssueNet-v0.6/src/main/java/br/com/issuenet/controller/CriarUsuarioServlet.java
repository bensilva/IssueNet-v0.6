package br.com.issuenet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.issuenet.model.Manager;
import br.com.issuenet.model.NaoPodeGerenciar;
import br.com.issuenet.model.NaoPodeResolverTarefa;
import br.com.issuenet.model.PodeGerenciar;
import br.com.issuenet.model.PodeResolverTarefa;
import br.com.issuenet.model.Usuario;

/**
 * Servlet implementation class CriarUsuarioServlet
 */
@WebServlet("/CriarUsuarioServlet.do")
public class CriarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("matricula"));
		System.out.println(request.getParameter("perfil"));
		System.out.println(request.getParameter("senha"));
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setMatricula(request.getParameter("matricula"));
		usuario.setPerfil(request.getParameter("perfil"));
		usuario.setSenha(request.getParameter("senha"));
		
		if(usuario.getPerfil().equals("Aluno"))
		{
			usuario.setComportamentoGerenciador(new NaoPodeGerenciar());
			usuario.setComportamentoResolvedor(new PodeResolverTarefa());
		}
		else {
			usuario.setComportamentoGerenciador(new PodeGerenciar());
			usuario.setComportamentoResolvedor(new NaoPodeResolverTarefa());
		}
		
		String msg = usuario.getComportamentoGerenciador().salvar(usuario);
		
		request.setAttribute("msgStatus", msg);
		
		RequestDispatcher view = request.getRequestDispatcher("gerenciarUsuario.jsp");
		view.forward(request, response);
	}
}