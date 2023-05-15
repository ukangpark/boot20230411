<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<h1>Supplier list에 새로운 공급자가 추가 되었습니다.</h1>

	<table class="table">
		<thead>
			<tr>
				<th>SupplierName</th>
				<th>ContactName</th>
				<th>Address</th>
				<th>City</th>
				<th>PostalCode</th>
				<th>Country</th>
				<th>Phone</th>
			</tr>
		</thead>
		<tbody>
			
				<tr>
					<td>${supplier.name }</td>
					<td>${supplier.contactName }</td>
					<td>${supplier.address }</td>
					<td>${supplier.city }</td>
					<td>${supplier.postalCode }</td>
					<td>${supplier.country }</td>
					<td>${supplier.phone }</td>
				</tr>
			
		</tbody>
	</table>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>