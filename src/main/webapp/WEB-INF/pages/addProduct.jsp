<%@taglib uri="http://www.springframework.org/tags/form" prefix="fr" %>
<html>
<head>
<title>Add Product</title>
</head>
<body>
<h1>Enter product Details</h1>
<hr> 
 <form action="addProduct" method="post" enctype="multipart/form-data">
  Product Code  <input type="text" name="pcode" placeholder="Enter Product Code" required><br>
  <fr:errors path="info.pcode"/><br>
  
  Product Name  <input type="text" name="pname" placeholder="Enter Product Name" required><br>
  <fr:errors path="info.pname"/><br>
  
  Product Price <input type="text"  name="price" placeholder="Enter Product price" required><br>
  <fr:errors path="info.price"/><br>
  
  Select Image <input type="file" name="photo"><br>
  <fr:errors path="file.pic"/>
  <br> 
  <input type="submit" value="Add-Product">
 </form>
</body>
</html>