<%@include file="header.jsp"%>

<div class="container-fluid">
	<div class="bg-primary ">
		<form method="post" action="Login.do" class="form-horizontal "
			role="form">
			<fieldset>
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h1 class="page-header" align="center">IssueNet V0.1</h1>
						<H3 class="panel-title">Gerenciador de Tarefas</H3>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="inputEmail">Login
						: </label>
					<div class="col-md-6">
						<input name="email" placeholder="Informe e-mail do usuário"
							class="form-control input-md" type="text">
					</div>
				</div>

				<!-- Password input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="inputSenha">Senha
						: </label>
					<div class="col-md-6">
						<input type="password" name="senha" placeholder="Informe senha"
							class="form-control input-md">
					</div>
				</div>

				<!-- Button (Double) -->
				<div class="form-group">
					<div class="col-md-offset-5">
						<div class=" col-md-7">
							<button type="reset" class="btn btn-default btn-sm">Cancelar</button>
							<button type="submit" class="btn btn-success btn-success.focus">Login</button>
						</div>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
</div>
<%@include file="trailer.jsp"%>