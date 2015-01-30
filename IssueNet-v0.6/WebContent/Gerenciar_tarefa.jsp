<%@include file="header.jsp"%>
<%@include file="navegacao.jsp"%>
<DIV class="container-fluid">
	<div class="bg-primary">
		<form method="post" action="CriarTarefa.do" class="form-horizontal "
			role="form">
			<fieldset>
				<div class="panel panel-primary">
					<div class="panel-heading">
						<H3 class="panel-title">Gerenciar tarefas</H3>
					</div>
				</div>

				<div class="form-group">
					<label for="criterioAvaliacao" class="col-md-3 control-label">Criterio
						de Avalia��o:</label>
					<div class="col-md-6">
						<select class="form-control" id="criterioAvaliacao"
							name="criterioAvaliacao">
							<option value="1">M�dia Ponderada</option>
							<option value="2">M�dia Aritm�tica</option>
						</select>
					</div>
				</div>

				<div class="form-group">
					<label for="inputnome" class="col-md-3 control-label">Nome:
					</label>
					<div class="col-md-6">
						<input type="text" class="form-control" id="inputnome"
							name="nomeTarefa" placeholder="nome" />
					</div>
				</div>

				<div class="form-group">
					<label for="inputnome" class="col-md-3 control-label">Descri��o:
					</label>
					<div class="col-md-6">
						<textarea class="form-control" rows="5" cols="60" name="descricao"></textarea>
						<!-- <textarea class="form-control" id="observacao" name="observacao">Descreva pontos relevantes da apresenta��o do trabalho do grupo.</textarea> -->
						<!-- <input type="text" class="form-control" id="inputnome"
										name="nomeTarefa" placeholder="nome" /> -->

					</div>
				</div>

				<div class="form-group">
					<label for="inputmateria" class="col-md-3 control-label">Materia:
					</label>
					<div class="col-md-6">
						<input type="text" class="form-control" id="inputmateria"
							name="materia" placeholder="materia" />
					</div>
				</div>

				<div class="form-group">
					<label for="inputdatalimite" class="col-md-3 control-label">Data
						limite para resolu��o: </label>
					<div class="col-md-6">
						<input type="date" class="form-control" id="inputdatalimite"
							name="dataLimiteResolucao" placeholder="Data Limite" />
					</div>
				</div>

				<div class="form-group">
					<label for="inputdatainicioavaliacao"
						class="col-md-3 control-label">Data inicio da avalia��o: </label>
					<div class="col-md-6">
						<input type="date" class="form-control"
							id="inputdatainicioavaliacao" name="dataInicioAvaliacao"
							placeholder="Data inicio da avalia��o " />
					</div>
				</div>

				<div class="form-group">
					<label for="inputdatalimiteavaliacao"
						class="col-md-3 control-label">Data limite para avalia��o:
					</label>
					<div class="col-md-6">
						<input type="date" class="form-control"
							id="inputdatalimiteavaliacao" name="dataLimiteAvaliacao"
							placeholder="Data final da avalia��o " />
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-offset-5">
						<button class="btn btn-default btn-sm">Cancelar</button>
						<button type="submit" class="btn btn-success btn-success.focus">Salvar</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<!-- Container -->
</div>
<%@include file="trailer.jsp"%>