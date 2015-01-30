package br.com.issuenet.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.issuenet.model.Tarefa;
import br.com.issuenet.model.Usuario;

@WebServlet("/ResolverTarefaServlet")
public class ResolverTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ResolverTarefaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object obj = request.getSession().getAttribute("tarefasEmResolucao");
		HttpSession httpSession = request.getSession();
		Usuario usuario = (Usuario)httpSession.getAttribute("usuarioLogado");
		if(obj instanceof List<?>){
		
			List<?> tarefas = (List<?>) obj;
			String id = (String)request.getParameter("id");
			Tarefa t = (Tarefa)tarefas.get(Integer.parseInt(id));
			
			t.setStatusAtual(t.getStatusEmAvaliacao());
			t.setDataResolvida(new Date());
			t.setResolvidoPor(usuario);
			
			usuario.getComportamentoResolvedor().resolverTarefa(t);	
			
			httpSession.setAttribute("tarefasEmResolucao", usuario.getComportamentoGerenciador().listaTarefasEmResolucao(usuario));
			httpSession.setAttribute("tarefasEmAvaliacao", usuario.getComportamentoGerenciador().listaTarefasEmAvaliacao(usuario));
			httpSession.setAttribute("tarefasAvaliadas", usuario.getComportamentoGerenciador().listaTarefasAvaliadas(usuario));
			httpSession.setAttribute("tarefasFinalizadas", usuario.getComportamentoGerenciador().listaTarefasFinalizadas(usuario));
			
			RequestDispatcher view = request.getRequestDispatcher("tela_principal.jsp");
			view.forward(request, response);
		}
	}

}
