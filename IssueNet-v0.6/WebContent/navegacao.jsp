<%@include file="header.jsp"%>


<div class="navbar navbar-default">
	<div class="navbar-header">
		<a class="navbar-brand" href="tela_principal.jsp">IssueNet v1.0</a>
	</div>
	<div class="navbar-collapse collapse navbar-responsive-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Active</a></li>
			<li><a href="#">Link</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown">Gerenciar <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="gerenciarTarefa.jsp">Tarefa</a></li>
					<li><a href="#">Usuario</a></li>
					<li><a href="#">Grupo de Trabalho</a></li>
					<li><a href="#">Turma</a></li>
					<li class="divider"></li>
					<li class="dropdown-header">Dropdown header</li>
					<li><a href="#">Separated link</a></li>
					<li><a href="#">One more separated link</a></li>
				</ul></li>
		</ul>
		<form class="navbar-form navbar-left">
			<input class="form-control col-lg-8" placeholder="Search" type="text">
		</form>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#">Link</a></li>
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown">Dropdown <b class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="#">Action</a></li>
					<li><a href="#">Another action</a></li>
					<li><a href="#">Something else here</a></li>
					<li class="divider"></li>
					<li><a href="#">Separated link</a></li>
				</ul></li>
		</ul>
	</div>
</div>



<%@include file="trailer.jsp"%>