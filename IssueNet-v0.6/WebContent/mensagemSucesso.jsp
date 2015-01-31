<%@include file="header.jsp"%>
<br />
<div class="col-md-offset-4">
	<div class="col-md-6 container-fluid">
		<div class="container-fluid">
			<div class="panel panel-success">
				<div class="panel-title bg-success text-primary">Sucesso !</div>
				<div class="panel-body text-success text-capitalize">
					<div class="panel-body">
						<%=request.getAttribute("msgStatus")%>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	<br />
	<%@include file="trailer.jsp"%>