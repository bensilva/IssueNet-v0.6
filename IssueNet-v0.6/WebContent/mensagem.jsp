<%@ page import="java.util.*"%>

<html>
<head>
<%@include file="header.jsp"%>
</head>
<body>
	<h1 align="center">Resultado</h1>
	<p>

		<%=request.getAttribute("msgStatus")%>

		<br></br>
		<%@include file="trailer.jsp"%>
</body>
</html>
