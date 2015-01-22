	<!-- Configurações de script bootstrap -->
	<script type='text/javascript'
		src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js">
	</script> <script type='text/javascript'
		src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

	<!-- JavaScript jQuery code from Bootply.com editor  --> <script
		type='text/javascript'>
		$(document).ready(function() {

		});
	</script> <script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script',
				'//www.google-analytics.com/analytics.js', 'ga');
		ga('create', 'UA-40413119-1', 'bootply.com');
		ga('send', 'pageview');
	</script> <!-- Verificar como fazer o envio dos campos do formulário para o servlet -->
	<script>
		function enviaForm() {
			var form = document.getElementById("loginFrm");
			alert(document.attributes.getNamedItem("login").nodeValue());
			alert(form.getAttribute("passwd"));
			form.submit();
		}
	</script> <!-- Fim Configurações de script bootstrap -->
</body>
</html>