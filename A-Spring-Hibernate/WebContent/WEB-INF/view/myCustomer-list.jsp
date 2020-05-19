<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath}/resources/css/style.css"

 />

</head>
<body>


	<div id="wrapper">

		<div id="header">
			<h1>My CustomerS List</h1>
		</div>
	</div>

	<div id="container">

		<div id="content">
		
		
		<table>
		
		<tr>
		<th>First Name</th>
		<th>last Name</th>
		<th>Email</th>
		</tr>
		
		
	<c:forEach var="customer"   items="${customers}">
	
	<tr>
	<td>${customer.firstName}</td>
	<td>${customer.lastName}</td>
	<td>${customer.email}</td>
	
	</tr>
	</c:forEach>
		
		
		
		
		</table>
		
		
		
		</div>

	</div>














</body>
</html>