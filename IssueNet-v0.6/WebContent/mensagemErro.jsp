<%@include file="header.jsp"%>
<br />
<div class="col-md-offset-4">
	<div class="col-md-6 container-fluid">
		<div class="container-fluid">
			<div class="panel panel-danger">
				<div class="panel-title bg-danger text-primary">Erro !</div>
				<div class="panel-body text-danger text-capitalize">
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