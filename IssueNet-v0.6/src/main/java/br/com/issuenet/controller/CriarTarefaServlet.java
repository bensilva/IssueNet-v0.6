package br.com.issuenet.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.issuenet.model.Manager;
import br.com.issuenet.model.Tarefa;
import br.com.issuenet.model.Usuario;

@WebServlet("/CriarTarefaServlet")
public class CriarTarefaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CriarTarefaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tarefa tarefa = new Tarefa();
		Usuario tutor = (Usuario)request.getSession().getAttribute("usuarioLogado");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//tutor.setIdUsuario(Integer.parseInt(request.getParameter("tutor")));
		
		tarefa.setNomeTarefa(request.getParameter("nomeTarefa"));
		tarefa.setDescricao(request.getParameter("descricao"));
		tarefa.setMateria(request.getParameter("materia"));
		tarefa.setTutor(tutor);
		tarefa.setDataCriacao(new Date());
		try {
			tarefa.setDataLimiteResolucao(df.parse(request.getParameter("dataLimiteResolucao")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			tarefa.setDataInicioAvaliacao(df.parse(request.getParameter("dataInicioAvaliacao")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			tarefa.setDataLimiteAvaliacao(df.parse(request.getParameter("dataLimiteAvaliacao")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String msg = Manager.salvarTarefa(tarefa);
		
		request.setAttribute("msgStatus", msg);

		RequestDispatcher view = 	request.getRequestDispatcher("tarefaCriada.jsp");
		view.forward(request, response);	
	}

}
