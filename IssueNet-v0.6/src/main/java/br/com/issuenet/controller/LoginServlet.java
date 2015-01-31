package br.com.issuenet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.issuenet.model.Manager;
import br.com.issuenet.model.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession = request.getSession();
		System.out.println(request.getParameter("email")+" -- "+request.getParameter("senha"));
		Usuario usuario = Manager.recuperarUsuario(request.getParameter("email"), request.getParameter("senha"));
		
		String msg = "";
		String jsp = "";
		if(usuario==null){
			msg = "Usuário ou senha incorretos!";
			request.setAttribute("msgStatus", msg);
			jsp = "mensagem.jsp";
		}else{
			httpSession.setAttribute("usuarioLogado", usuario);
			jsp = "tela_principal.jsp";
		}
		
		
		httpSession.setAttribute("tarefasEmResolucao", usuario.getComportamentoGerenciador().listaTarefasEmResolucao(usuario));
		httpSession.setAttribute("tarefasEmAvaliacao", usuario.getComportamentoGerenciador().listaTarefasEmAvaliacao(usuario));
		httpSession.setAttribute("tarefasAvaliadas", usuario.getComportamentoGerenciador().listaTarefasAvaliadas(usuario));
		httpSession.setAttribute("tarefasFinalizadas", usuario.getComportamentoGerenciador().listaTarefasFinalizadas(usuario));
		
		RequestDispatcher view = request.getRequestDispatcher(jsp);
		view.forward(request, response);
		
	}

}
