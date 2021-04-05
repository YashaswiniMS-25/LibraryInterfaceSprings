<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;background-image: url('library.jpg');background-repeat:no-repeat;
  background-attachment:fixed;  
  background-size: cover;
  text-align:center; padding-top: 20%;margin-left: auto;
  margin-right: auto;">
	<table style="text-align:center;margin-left: auto;
  margin-right: auto;">

		<th>Book id</th>
		<th>bookName</th>
		<th>Author name</th>
		<th>Price</th>
		<th>Editcolumn</th>
		<th>delete column</th>

		<c:forEach items="${BooksList}" var="book">
			<tr>
				<td>${book.getBookid()}</td>
				
				<td>${book.getBookname()}</td>
				<td>${book.getAuthor()}</td>
				<td>${book.getPrice()}</td>
				<td><a href="update.jsp">edit</a></td>
				<td><a href="delete.jsp">delete</a></td>
			</tr>
		</c:forEach>




	</table>

</body>
</html>