<%@page import="java.util.Date"%>
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
				T�tulo: <input type="text" name="nomeTarefa" value=""
					maxlength="100" size="40" />
					
				<br><br>				
				Descri��o:<br>
				<textarea rows="5" cols="30" name="descricao"></textarea>
				
				<br><br>
				Mat�ria: <input type="text" name="materia">
				
				<br><br>
				Tutor: <select name="tutor" size="1">
					<option value=""></option>
					<option value="1">Tatiana</option>
				</select>
				
				<br><br>
				<%-- Data da cria��o: <%=new Date().toString() %> --%>
				
				<br><br>
				Data limite para resolu��o: <input type="text" class="date" name="dataLimiteResolucao" /> dd/mm/aaaa
				
				<br><br>
				Data para in�cio da avalia��o: <input type="text" class="date" name="dataInicioAvaliacao" /> dd/mm/aaaa
				
				<br><br>
				Data limite para avalia��o: <input type="text" class="date" name="dataLimiteAvaliacao" /> dd/mm/aaaa
				
				<br><br>
				Status: Incompleta
				
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
