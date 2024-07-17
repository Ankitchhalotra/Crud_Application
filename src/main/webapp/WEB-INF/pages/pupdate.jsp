<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<title>Update Product Details</title>
</head>
<body>

<sf:form action="saveChange" modelAttribute="product">
Product Code <sf:input path="pcode"/><br>
Product Name <sf:input path="pname"/><br>
Product Price <sf:input path="price"/>
<br> 
<input type="submit" value="Update">
</sf:form>

</body>
</html>