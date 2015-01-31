<%@include file="header.jsp"%>
<%@include file="navegacao.jsp"%>
<div class="container-fluid">
	<div class="bg-primary">
		<form method="post" action="CriarUsuario.do" class="form-horizontal "
			role="form">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<H3 class="panel-title">Gerenciar Usuário</H3>
				</div>
				<%
					if (request.getAttribute("msgStatus") != null) {
						String msg = (String) request.getAttribute("msgStatus");
						if (msg.contains("sucesso")) {
				%>
				<%@ include file="mensagemSucesso.jsp"%>
				<%
					} else {
				%>
				<%@ include file="mensagemErro.jsp"%>
				<%
					}
					}
				%>

				<div class="panel-body bg-primary">
					<fieldset>
						<div class="form-group">
							<label for="nome" class="col-md-3 control-label">Nome: </label>
							<div class="col-md-6">
								<input type="text" class="form-control" id="nome" name="nome"
									placeholder="Nome" />
							</div>
						</div>
					</fieldset>

					<fieldset>
						<div class="form-group">
							<label for="matricula" class="col-md-3 control-label">Matrícula
								: </label>
							<div class="col-md-6">
								<input type="text" class="form-control" id="matricula"
									name="matricula" placeholder="Matrícula" />
							</div>
						</div>
					</fieldset>

					<fieldset>
						<div class="form-group">
							<label for="email" class="col-md-3 control-label">E-Mail
								: </label>
							<div class="col-md-6">
								<input type="text" class="form-control" id="email" name="email"
									placeholder="E-Mail" />
							</div>
						</div>
					</fieldset>

					<fieldset>
						<div class="form-group">
							<label for="senha" class="col-md-3 control-label">Senha :
							</label>
							<div class="col-md-6">
								<input type="password" class="form-control" id="senha"
									name="senha" placeholder="Senha" />
							</div>
						</div>
					</fieldset>

					<fieldset>
						<div class="form-group">
							<label for="perfil" class="col-md-3 control-label">Perfil:</label>
							<div class="col-md-6">
								<select class="form-control" name="perfil" id="perfil">
									<option value="null" selected="selected">Selecione um
										valor</option>
									<option value="Professor">Professor</option>
									<option value="Aluno">Aluno</option>
								</select>
							</div>
						</div>
					</fieldset>

					<fieldset>
						<div class="form-group">
							<div class="col-md-offset-5">
								<button type="reset" class="btn btn-default btn-sm">Cancelar</button>
								<button type="submit" class="btn btn-success btn-success.focus">Salvar</button>
							</div>
						</div>
					</fieldset>


				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="trailer.jsp"%>