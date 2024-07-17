<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Details</title>
</head>
<body>
<h1>Product Details</h1>
<hr>
<table border="1">
<tr>
<td> product code </td>  <td>  ${ info.pcode } </td>
</tr><tr>
<td> Product name </td> <td>   ${ info.pname}</td>
</tr><tr>
<td> price   </td>    <td>  ${info.price }</td>
</tr><tr>
<td> discount  </td>   <td> ${ info.discount}</td>
</tr>
</table>
<hr>
<a href="index.jsp">Go-Hone</a>
</body>
</html>