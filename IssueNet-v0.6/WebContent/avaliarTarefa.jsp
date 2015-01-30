<%@include file="header.jsp"%>
<%@include file="navegacao.jsp" %>
<div class="container-fluid">
	<div class="container-fluid">
		<div class="bg-primary ">
			<form class="form-horizontal" role="form">
				<fieldset>
					<!-- Form Name -->
					<div class="panel panel-primary">
						<div class="panel-heading">
							<h3 class="panel-title">Avaliação de Tarefa</h3>
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-3 control-label" for="tituloQuestao">Questão
							:</label>
						<div class="col-md-6">
							<input id="tituloQuestao" name="tituloQuestao" placeholder=""
								class="form-control input-md" type="text" contenteditable="false" />
						</div>
					</div>

					<!-- Multiple Radios (inline) -->
					<div class="form-group">
						<label class="col-md-3 control-label" for="conceito">Conceito
							: </label>
						<div class="col-md-6">
							<label class="radio-inline" for="conceito-0"> <input
								name="conceito" id="conceito-0" value="1" checked="checked"
								type="radio"> Ruim
							</label> <label class="radio-inline" for="conceito-1"> <input
								name="conceito" id="conceito-1" value="2" type="radio">
								Regular
							</label> <label class="radio-inline" for="conceito-2"> <input
								name="conceito" id="conceito-2" value="3" type="radio">
								Bom
							</label> <label class="radio-inline" for="conceito-3"> <input
								name="conceito" id="conceito-3" value="4" type="radio">
								Muito Bom
							</label> <label class="radio-inline" for="conceito-4"> <input
								name="conceito" id="conceito-4" value="5" type="radio">
								Ótimo
							</label>
						</div>
					</div>

					<!-- Textarea -->
					<div class="form-group">
						<label class="col-md-3 control-label" for="observacao">Observaçao
							: </label>
						<div class="col-md-6">
							<textarea class="form-control" id="observacao" name="observacao">Descreva pontos relevantes da apresentação do trabalho do grupo.</textarea>
						</div>
					</div>

					<!-- Button (Double) -->
					<div class="form-group">
						<label class="col-md-5 control-label" for="avaliar"></label>
						<div class="col-md-6">
							<button id="cancelar" name="cancelar" class="btn btn-default btn-sm">Cancelar</button>
							<button id="avaliar" name="avaliar" class="btn btn-success btn-success.focus">Avaliar</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>

<%@include file="trailer.jsp"%>