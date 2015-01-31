<%@include file="header.jsp"%>
<%-- <%@include file="navegacao.jsp"%> --%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%@page import="br.com.issuenet.model.*"%>

	<nav class="navbar ">
		<div class="container">
			<div class="navbar-header">
				<a href="tela_principal.jsp" class="navbar-brand">IssueNet</a>
			</div>
			<ul class="nav navbar-nav">
<!-- 				<li><a href="tela_principal.jsp">HOME</a></li> -->
				<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Gerenciar</a>
					<ul class="dropdown-menu">
						<li><a href="gerenciarUsuario.jsp">Usuário</a></li>
						<li><a href="#">Turma</a></li>
						<li><a href="Gerenciar_tarefa.jsp">Tarefa</a></li>
						<li><a href="#">Grupo de Trabalho</a></li>
					</ul></li>
				<li><a href="#" class="dropdown-toggle" data-toggle="dropdown">Relatórios</a>
					<ul class="dropdown-menu">
						<li><a href="#">Notas</a></li>

					</ul></li>
				<li><a href="#">SAIR</a></li>
			</ul>
		</div>
	</nav>

	<div class="container col-lg-12">
		<div class="col-lg-1"></div>
		<div class="panel panel-info col-lg-5">
			<div class="panel panel-heading">
				<h3>Tarefas Abertas (aguardando resolução)</h3>
			</div>
			<div class="panel panel-body">
				<table
					class="table table-bordered table-striped table-hover table-condensed">
					<tr>
						<th>Id</th>
						<th>Tarefa</th>
						<th>Inicio</th>
						<th>Limite para resolução</th>
						<th>Ação</th>
					</tr>
					<%
						Object objEmResolucao = session.getAttribute("tarefasEmResolucao");
						if (objEmResolucao instanceof List<?>) {
							List<?> tarefas = (List<?>) objEmResolucao;

							for (Iterator<?> iterator = tarefas.iterator(); iterator
									.hasNext();) {

								Tarefa t = (Tarefa) iterator.next();

								DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					%>
					<tr>
						<td><%=t.getIdTarefa()%></td>
						<td><%=t.getNomeTarefa()%></td>
						<td><%=t.getDataCriacao()%></td>
						<td><%=t.getDataLimiteResolucao()%></td>
						<td>
							<form method="post" action="ResolverTarefa.do">
								<input type="hidden" name="id" value="<%=tarefas.indexOf(t)%>" />
								<%-- 								<%
									session.setAttribute("tarefasER", tarefas);
								%> --%>
								<button type="submit" class="btn btn-primary btn-default.active">Resolver</button>
							</form>
						</td>
					</tr>
					<%
						}
						}
					%>

				</table>

			</div>
			<div class="panel panel-footer"></div>

		</div>


		<div class="panel panel-info col-lg-5">
			<div class="panel panel-heading">
				<h3>Tarefas em Avaliação</h3>
			</div>
			<div class="panel panel-body">
				<table
					class="table table-bordered table-striped table-hover table-condensed">
					<tr>
						<th>Id</th>
						<th>Tarefa</th>
						<th>Inicio da avaliação</th>
						<th>Limite para avaliação</th>
						<th>Ação</th>
					</tr>
					<%
						Object objEmAvaliacao = session.getAttribute("tarefasEmAvaliacao");
						if (objEmAvaliacao instanceof List<?>) {
							List<?> tarefas = (List<?>) objEmAvaliacao;

							for (Iterator<?> iterator = tarefas.iterator(); iterator
									.hasNext();) {

								Tarefa t = (Tarefa) iterator.next();

								DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					%>
					<tr>
						<td><%=t.getIdTarefa()%></td>
						<td><%=t.getNomeTarefa()%></td>
						<td><%=t.getDataInicioAvaliacao()%></td>
						<td><%=t.getDataLimiteAvaliacao()%></td>
						<td>
							<form method="post" action="AvaliarTarefa.do">
								<input type="hidden" name="id" value="<%=tarefas.indexOf(t)%>" />
								<%
									session.setAttribute("tarefasEA", tarefas);
								%>
								<button type="submit" class="btn btn-primary btn-default.active">Avaliar</button>
							</form>
						</td>
					</tr>
					<%
						}
						}
					%>

				</table>

			</div>
			<div class="panel panel-footer"></div>

		</div>

	</div>

	<div class="container col-lg-12">
		<div class="col-lg-1"></div>
		<div class="panel panel-info col-lg-5">
			<div class="panel panel-heading">
				<h3>Tarefas Avaliadas</h3>
			</div>
			<div class="panel panel-body">
				<table
					class="table table-bordered table-striped table-hover table-condensed">
					<tr>
						<th>Id</th>
						<th>Tarefa</th>
						<th>Inicio da avaliação</th>
						<th>Limite para avaliação</th>
						<th>Ação</th>
					</tr>
					<%
						Object objAvaliadas = session.getAttribute("tarefasAvaliadas");
						if (objAvaliadas instanceof List<?>) {
							List<?> tarefas = (List<?>) objAvaliadas;

							for (Iterator<?> iterator = tarefas.iterator(); iterator
									.hasNext();) {

								Tarefa t = (Tarefa) iterator.next();

								DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					%>
					<tr>
						<td><%=t.getIdTarefa()%></td>
						<td><%=t.getNomeTarefa()%></td>
						<td><%=t.getDataInicioAvaliacao()%></td>
						<td><%=t.getDataLimiteResolucao()%></td>
						<td>
							<form method="post" action="FinalizarTarefa.do">
								<input type="hidden" name="id" value="<%=tarefas.indexOf(t)%>" />
								<%
									session.setAttribute("tarefasA", tarefas);
								%>
								<button type="submit" class="btn btn-primary btn-default.active">Finalizar</button>
							</form>
						</td>
					</tr>
					<%
						}
						}
					%>

				</table>

			</div>
			<div class="panel panel-footer"></div>

		</div>


		<div class="panel panel-info col-lg-5">
			<div class="panel panel-heading">
				<h3>Tarefas Finalizadas</h3>
			</div>
			<div class="panel panel-body">
				<table
					class="table table-bordered table-striped table-hover table-condensed">
					<tr>
						<th>Id</th>
						<th>Tarefa</th>
						<th>Inicio da avaliação</th>
						<th>Limite para avaliação</th>
						<th>Ação</th>
					</tr>
					<%
						Object objFinalizadas = session.getAttribute("tarefasFinalizadas");
						if (objFinalizadas instanceof List<?>) {
							List<?> tarefas = (List<?>) objFinalizadas;

							for (Iterator<?> iterator = tarefas.iterator(); iterator
									.hasNext();) {

								Tarefa t = (Tarefa) iterator.next();

								DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					%>
					<tr>
						<td><%=t.getIdTarefa()%></td>
						<td><%=t.getNomeTarefa()%></td>
						<td><%=t.getDataInicioAvaliacao()%></td>
						<td><%=t.getDataLimiteAvaliacao()%></td>
						<td>
							<form method="post" action="CalcularNotas.do">
								<input type="hidden" name="id" value="<%=tarefas.indexOf(t)%>" />
								<%
									session.setAttribute("tarefasF", tarefas);
								%>
								<button type="submit" class="btn btn-primary btn-default.active">Calcular
									Notas</button>
							</form>
						</td>
					</tr>
					<%
						}
						}
					%>

				</table>

			</div>
			<div class="panel panel-footer"></div>

		</div>

	</div>

	<%@include file="trailer.jsp"%>