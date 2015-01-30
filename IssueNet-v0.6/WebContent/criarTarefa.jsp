<%@include file="header.jsp"%>
<%@include file="navegacao.jsp"%>
<div class="container-fluid">
	<div class="bg-primary ">
		<form class="form-horizontal" role="form">
			<fieldset>
				<!-- Form Name -->
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">Criar Tarefa</h3>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="nomeTarefa">
						Nome da Tarefa : </label>
					<div class="col-md-6">
						<input id="nomeTarefa" name="nomeTarefa" placeholder=""
							class="form-control input-md" type="text" />
					</div>
				</div>

				<!-- Textarea -->
				<div class="form-group">
					<label class="col-md-3 control-label" for="descricao">Descrição
						: </label>
					<div class="col-md-6">
						<textarea class="form-control" id="descricao" name="descricao">Descreva os dados da tarefa que deseja cadastrar.</textarea>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="materia">Matéria
						: </label>
					<div class="col-md-6">
						<input id="materia" name="materia" placeholder="Matéria"
							class="form-control input-md" type="text">
					</div>
				</div>

				<!-- Select Basic -->
				<div class="form-group">
					<label class="col-md-3 control-label" for="tutor">Tutor : </label>
					<div class="col-md-6">
						<select id="tutor" name="tutor" class="form-control">
							<option value="-">Selecione um tutor</option>
							<option value="1">Option one</option>
							<option value="2">Option two</option>
						</select>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="dataLimiteResolucao">Data
						Limite Resolução : </label>
					<div class="col-md-6">
						<input id="dataLimiteResolucao" name="dataLimiteResolucao"
							placeholder="Informe a data limite da resolução."
							class="form-control input-md" required="required" type="text">
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="dataInicioAvaliacao">Data
						de Inicio da Avaliação : </label>
					<div class="col-md-6">
						<input id="dataInicioAvaliacao" name="dataInicioAvaliacao"
							placeholder="Informe a data de início da resolução"
							class="form-control input-md" required="required" type="text">
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-3 control-label" for="dataLimiteavaliacao">Data
						Limite da Avaliação :</label>
					<div class="col-md-6">
						<input id="dataLimiteavaliacao" name="dataLimiteavaliacao"
							placeholder="Informe a data limite da resolução"
							class="form-control input-md" required="required" type="text">

					</div>
				</div>

				<!-- Button (Double) -->
				<div class="form-group">
					<div class="col-md-offset-5">
						<button id="cancelar" name="cancelar"
							class="btn btn-default btn-sm">Cancelar</button>
						<button id="criar" name="criar" class="btn btn-success btn-success.focus">Criar
							Tarefa</button>
					</div>
				</div>

			</fieldset>
		</form>
	</div>
</div>
<%@include file="trailer.jsp"%>