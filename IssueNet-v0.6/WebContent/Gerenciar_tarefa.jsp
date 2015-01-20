<%@include file="header.jsp"%>

<body>

	<!--Início Login Modal-->
	<div class="jumbotron  bg-primary ">
		<DIV class=" col-lg-10 ">
			<DIV class="container">
				<form method="post" action="CriarTarefa.do" class="form-horizontal " role="form">
					<fieldset>
						<div class="panel panel-primary">
							<div class="panel-heading">
								<H3 class="panel-title">Gerenciar tarefas</H3>
							</div>
		                      
                            
							<div class="form-group">
								<label for="sel1" class="col-lg-3 control-label">Tipo de Tarefa:</label>
								<div class="col-lg-6">
									<select class="form-control" id="sel1">
										<option>Hibernate</option>
										<option>JSF</option>
										<option>CSS/Bootstrap</option>
									</select>
								</div>
							</div>
							
							<div class="form-group">

								<label for="inputnome" class="col-lg-2 control-label">Nome:
								</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="inputnome" name="nomeTarefa"
										placeholder="nome" />

								</div>
							</div>

							<div class="form-group">

								<label for="inputnome" class="col-lg-2 control-label">Descrição:
								</label>
								<div class="col-lg-9">
									<textarea rows="5" cols="30" name="descricao"></textarea>
									<!-- <input type="text" class="form-control" id="inputnome"
										name="nomeTarefa" placeholder="nome" /> -->

								</div>
							</div>

							<div class="form-group">

								<label for="inputmateria" class="col-lg-2 control-label">Materia:
								</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="inputmateria" name="materia"
										placeholder="materia" />
								</div>
							</div>

							<div class="form-group">

								<label for="inputdatalimite" class="col-lg-3 control-label">Data
									limite para resolução: </label>
								<div class="col-lg-4">
									<input type="date" class="form-control" id="inputdatalimite" name="dataLimiteResolucao"
										placeholder="Data Limite" />
								</div>
							</div>

							<div class="form-group">

								<label for="inputdatainicioavaliacao"
									class="col-lg-3 control-label">Data inicio da
									avaliação: </label>
								<div class="col-lg-4">
									<input type="date" class="form-control"
										id="inputdatainicioavaliacao" name="dataInicioAvaliacao"
										placeholder="Data inicio da avaliação " />

								</div>
							</div>
							
							<div class="form-group">

								<label for="inputdatalimiteavaliacao"
									class="col-lg-3 control-label">Data limite para avaliação:
								</label>
								<div class="col-lg-4">
									<input type="date" class="form-control"
										id="inputdatalimiteavaliacao" name="dataLimiteAvaliacao"
										placeholder="Data final da avaliação " />

								</div>
							</div>



							<div class="form-group form-group-sm">
							<div class="col-lg-10 col-lg-offset-2">
								<button class="btn btn-default btn-sm">Cancelar</button>
								<button type="submit" class="btn btn-primary btn-default.active">Salvar</button>
							</div>
						</div>
						
						
						
					</fieldset>
				</form>
			</DIV><!-- Container -->
		</DIV> <!-- Modal-Dialog -->
	</div>

	<%@include file="trailer.jsp"%>