<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>

<html>
<head>
<title>Show Data Page</title>
</head>
<body>
<h1>All Product List</h1>
<hr>
<table border="1">
		<tr><th>Code</th><th>Name</th><th>Price</th></tr>
<jstl:forEach var="product" items="${ info }">
      <tr>
         <td>  ${product.pcode }</td> 
         <td>  ${product.pname } </td>
         <td>  ${product.price } </td>
         <td> <a href="remove?pcode=${product.pcode}">Delete</a></td>
         <td> <a href="update?code=${product.pcode}">Update</a>
      </tr>
</jstl:forEach>
</table>
<hr>
<a href="index.jsp">Go-Home</a>
</body>
</html>