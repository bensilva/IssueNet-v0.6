<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@include file="head.jsp"%>
</head>
<body>

	<h1 align="center">Criar Tarefa</h1>

	<form method="post" action="CriarTarefa.do">

		<p>Preencha os dados da tarefa:</p>

		<table style="width: 500px">
			<tr>
				<td>
				Título: <input type="text" name="titulo" value=""
					maxlength="100" size="40" />
					
				<br><br>
				Prazo: <input type="text" class="date" name="dtPrazo" /> Formatos: dd/mm/aaaa ou aaaa-mm-dd

				<br><br>
				<!--Detalhes: <input type="text" name="detalhes" style="width: 150px; height: 50px" />-->
				
				Detalhes:<br>
				<textarea rows="5" cols="30" name="detalhes"></textarea>
	
				<br><br>
				Urgente: <input type="radio" name="urgente" value="sim" />Sim
					<input type="radio" name="urgente" value="nao" />Não
				

				<br><br>
				Responsável: <select name="responsavel" size="1">
						<option value=""></option>
						<option value="Chaves">Chaves</option>
						<option value="Quico">Quico</option>
						<option value="Chiquinha">Chiquinha</option>
				</select>
				</td>
			</tr>
		</table>
		<br>
		<center>
			<input type="SUBMIT">
		</center>

	</form>
	<br></br>
	<%@include file="foot.jsp"%>
</body>
</html>
