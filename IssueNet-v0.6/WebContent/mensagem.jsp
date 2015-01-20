<%@ page import="java.util.*"%>

<html>
<head>
<%@include file="head.jsp"%>
</head>
<body>
	<h1 align="center">Resultado</h1>
	<p>

		<%=request.getAttribute("msgStatus")%>

		<br></br>
		<%@include file="foot.jsp"%>
</body>
</html>
