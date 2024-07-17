<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<body>
	<h3>Error-Page</h3>
	<hr>
		<h3>Data-Binding-Failed</h3>
		<fr:errors path="info.pcode" /><br>
		<fr:errors path="info.pname"/><br>
		<fr:errors path="info.price"/><br>	
		<fr:errors path="file.pic"/>	
	<hr>
	<a href="addProduct">Try-Again</a><br>
	<a href="index.jsp">Home</a>
</body>
</html>